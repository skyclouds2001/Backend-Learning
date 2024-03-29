package main

import (
	"bufio"
	"context"
	"encoding/binary"
	"errors"
	"fmt"
	"io"
	"log"
	"net"
)

const socks5Ver = 0x05
const cmdBind = 0x01
const aTypeIPV4 = 0x01
const aTypeHost = 0x03
const aTypeIpv6 = 0x04

func main() {
	server, err := net.Listen("tcp", "127.0.0.1:1080")
	if err != nil {
		panic(err)
	}

	for {
		client, err := server.Accept()
		if err != nil {
			log.Printf("Accept failed %v", err)
			continue
		}
		go process(client)
	}
}

func process(conn net.Conn) {
	defer conn.Close()

	reader := bufio.NewReader(conn)

	err := auth(reader, conn)
	if err != nil {
		log.Printf("client %v auth failed: %v", conn.RemoteAddr(), err)
		return
	}

	err = connect(reader, conn)
	if err != nil {
		log.Printf("client %v connect failed: %v", conn.RemoteAddr(), err)
		return
	}
}

func auth(reader *bufio.Reader, conn net.Conn) (err error) {
	ver, err := reader.ReadByte()
	if err != nil {
		return fmt.Errorf("read ver failed: %w", err)
	}
	if ver != socks5Ver {
		return fmt.Errorf("not supported ver: %v", ver)
	}

	methodSize, err := reader.ReadByte()
	if err != nil {
		return fmt.Errorf("read methodSize failed: %w", err)
	}

	method := make([]byte, methodSize)
	_, err = io.ReadFull(reader, method)
	if err != nil {
		return fmt.Errorf("read method failed: %w", err)
	}
	log.Println("ver", ver, "method", method)

	_, err = conn.Write([]byte{socks5Ver, 0x00})
	if err != nil {
		return fmt.Errorf("write failed: %w", err)
	}

	return nil
}

func connect(reader *bufio.Reader, conn net.Conn) (err error) {
	buf := make([]byte, 4)

	_, err = io.ReadFull(reader, buf)
	if err != nil {
		return fmt.Errorf("read header failed: %w", err)
	}

	ver, cmd, aType := buf[0], buf[1], buf[3]
	if ver != socks5Ver {
		return fmt.Errorf("not supported ver: %v", ver)
	}
	if cmd != cmdBind {
		return fmt.Errorf("not supported cmd: %v", ver)
	}

	addr := ""

	switch aType {
	case aTypeIPV4:
		_, err = io.ReadFull(reader, buf)
		if err != nil {
			return fmt.Errorf("read aType failed: %w", err)
		}
		addr = fmt.Sprintf("%d.%d.%d.%d", buf[0], buf[1], buf[2], buf[3])
	case aTypeHost:
		hostSize, err := reader.ReadByte()
		if err != nil {
			return fmt.Errorf("read hostSize failed: %w", err)
		}
		host := make([]byte, hostSize)
		_, err = io.ReadFull(reader, host)
		if err != nil {
			return fmt.Errorf("read host failed: %w", err)
		}
		addr = string(host)
	case aTypeIpv6:
		return errors.New("Ipv6: not supported yet")
	default:
		return errors.New("Invalid aType")
	}

	_, err = io.ReadFull(reader, buf[:2])
	if err != nil {
		return fmt.Errorf("read port failed: %w", err)
	}
	port := binary.BigEndian.Uint16(buf[:2])

	dest, err := net.Dial("tcp", fmt.Sprintf("%v:%v", addr, port))
	if err != nil {
		return fmt.Errorf("dial dst failed: %w", err)
	}

	defer dest.Close()

	log.Println("dial", addr, port)

	_, err = conn.Write([]byte{0x05, 0x00, 0x00, 0x01, 0, 0, 0, 0, 0, 0})
	if err != nil {
		return fmt.Errorf("write failed: %w", err)
	}

	ctx, cancel := context.WithCancel(context.Background())

	defer cancel()

	go func() {
		_, _ = io.Copy(dest, reader)
		cancel()
	}()
	go func() {
		_, _ = io.Copy(conn, dest)
		cancel()
	}()

	<-ctx.Done()

	return nil
}
