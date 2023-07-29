package main

import (
	"bufio"
	"fmt"
	"math/rand"
	"os"
	"strconv"
	"strings"
	"time"
)

var max = 100

func main() {
	rand.Seed(time.Now().UnixNano())
	num := rand.Intn(max)
	
	for {
		fmt.Print("Please input guess number: ")
		reader := bufio.NewReader(os.Stdin)
		input, err := reader.ReadString('\n')
		if err != nil {
			fmt.Println("Read input failed!")
			continue
		}

		guess, err := strconv.Atoi(strings.Trim(input, "\r\n"))
		if err != nil {
			fmt.Println("Invalid input!")
			continue
		}

		if guess > num {
			fmt.Println("Bigger!")
		} else if guess < num {
			fmt.Println("Smaller!")
		} else {
			fmt.Println("Correct!")
			break
		}
	}
}
