package main

import "fmt"

var pow = []int{1, 2, 4, 8, 16, 32, 64, 128}

var alpha = map[string]string {
	"a": "A",
	"b": "B",
}

func main() {
	for k, v := range pow {
		fmt.Printf("2^%d = %d\n", k, v)
	}

	for k, v := range alpha {
		fmt.Printf("%s : %s", k, v)
	}
}
