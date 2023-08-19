package main

import "fmt"

func main() {
	m := map[string]int{
		"a": 1,
		"b": 2,
	}
	fmt.Println(m)

	mm := make(map[int]int, 10)
	fmt.Println(mm)

	println(m["a"])
	println(m["c"])

	m["b"] = 9
	fmt.Println(m)

	println(len(m))

	for k, v := range m {
		fmt.Printf("key=%s, value=%d\n", k, v)
	}

	delete(m, "a")
	fmt.Println(m)
}
