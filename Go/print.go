package main

import "fmt"

func main() {
	fmt.Printf("code = %d %% %x %% %o %% %b & date = %s & value = %f \n", 123, 123, 123, 123, "2023-12-31", 12.3456789)

	var str = fmt.Sprintf("code = %d %% %x %% %o %% %b & date = %s & value = %f \n", 123, 123, 123, 123, "2023-12-31", 12.3456789)
	fmt.Print(str)
}
