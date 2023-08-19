package main

import "fmt"

func main() {
	var ptr *int
	println(ptr)

	var n = 10
	ptr = &n
	println(ptr)
	println(*ptr)

	ptr = nil
	println(ptr)

	var arr = [3]int{1, 2, 3}
	var p [3]*int
	for i := 0; i < 3; i++ {
		p[i] = &arr[i]
		fmt.Printf("arr[%d] = %d\n", i, *p[i])
	}

	var pp **int
	println(pp)

	ptr = &n
	pp = &ptr
	println(pp)
	println(*pp)
	println(**pp)
}
