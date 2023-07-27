package main

import "fmt"

func main() {
	var arr = [5]int{1, 2, 3, 4, 5}
	var a = [...]int{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
	var aa = [5]int{0: 2, 4: 5}

	fmt.Println(arr)
	fmt.Println(a)
	fmt.Println(aa)
	println(aa[0], aa[1])
}
