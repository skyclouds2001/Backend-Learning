package main

import (
	"fmt"
	"sync"
	"time"
)

func print(s string) {
	for i := 0; i < 5; i++ {
		time.Sleep(100 * time.Millisecond)
		fmt.Println(s)
	}
}

func sum(s []int, c chan int) {
	sum := 0

	for _, v := range s {
		sum += v
	}

	c <- sum
}

func main() {
	go print("a")
	go print("b")
	print("c")

	ch := make(chan int, 2)

	defer close(ch)

	go sum([]int{1, 2, 3}, ch)
	go sum([]int{7, 8, 9}, ch)

	x, y := <-ch, <-ch

	println(x, y, x+y)

	src := make(chan int)
	dest := make(chan int, 3)

	go func() {
		defer close(src)
		for i := 0; i < 10; i++ {
			src <- i
		}
	}()

	go func() {
		defer close(dest)
		for i := range src {
			dest <- i * i
		}
	}()

	for i := range dest {
		println(i)
	}

	k := 0
	for i := 0; i < 5; i++ {
		go func() {
			for i := 0; i < 1000; i++ {
				k++
			}
		}()
	}
	time.Sleep(time.Second)
	println("add without lock", k)

	j := 0
	var lock sync.Mutex
	for i := 0; i < 5; i++ {
		go func() {
			for i := 0; i < 1000; i++ {
				lock.Lock()
				j++
				lock.Unlock()
			}
		}()
	}
	time.Sleep(time.Second)
	println("add with lock", j)

	var wg sync.WaitGroup
	wg.Add(5)
	for i := 0; i < 5; i++ {
		go func (j int)  {
			defer wg.Done()
			println(j)
		}(i)
	}
	wg.Wait()
}
