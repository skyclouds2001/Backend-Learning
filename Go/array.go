package main

import "fmt"

func printArray(arr [5]int) {
	for i := 0; i < len(arr); i++ {
		fmt.Printf("arr[%d] = %d\n", i, arr[i])
	}
}

func main() {
	var arr = [5]int{1, 2, 3, 4, 5}
	fmt.Println(arr)
	println(arr[0], arr[1])
	arr[0] = 9
	println(arr)

	var a = [...]int{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
	fmt.Println(a)
	println(a[0], a[1])

	var aa = [5]int{0: 2, 4: 5}
	fmt.Println(aa)
	println(aa[0], aa[1])

	var aaa = [3][3]int{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	}
	fmt.Println(aaa)
	println(aaa[0][0], aaa[1][1], aaa[2][2])

	printArray(arr)
}
