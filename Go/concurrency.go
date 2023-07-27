package main

import (
	"fmt"
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
	go sum([]int{1, 2, 3}, ch)
	go sum([]int{7, 8, 9}, ch)
	x, y := <-ch, <-ch
	println(x, y, x+y)
}
