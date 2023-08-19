package main

import "fmt"

func main() {
	s0 := make([]int, 10, 100)
	s1 := []int{1, 2, 3, 4, 5}

	fmt.Println(s0)
	fmt.Println(s1)

	s2 := s1[2:3]
	s3 := s1[3:]
	s4 := s1[:3]
	fmt.Println(s2)
	fmt.Println(s3)
	fmt.Println(s4)

	println(len(s0))
	println(cap(s0))

	s5 := append(s1, 10)
	fmt.Println(s5)

	copy(s0, s1)
	fmt.Println(s0)
}
