package main

import "fmt"

type Point struct {
	x, y int
}

func main() {
	fmt.Printf("code = %d %% %x %% %o %% %b & date = %s & value = %f \n", 123, 123, 123, 123, "2023-12-31", 12.3456789)

	str := fmt.Sprintf("code = %d %% %x %% %o %% %b & date = %s & value = %f \n", 123, 123, 123, 123, "2023-12-31", 12.3456789)
	fmt.Print(str)

	point := Point{1, 2}
	fmt.Printf("point=%v\n", point)
	fmt.Printf("point=%+v\n", point)
	fmt.Printf("point=%#v\n", point)
}
