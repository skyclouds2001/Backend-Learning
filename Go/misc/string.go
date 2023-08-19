package main

import (
	"fmt"
	"strings"
)

func main() {
	s := "hello"

	fmt.Println(strings.Contains(s, "l"))
	fmt.Println(strings.Count(s, "l"))
	fmt.Println(strings.HasPrefix(s, "h"))
	fmt.Println(strings.HasSuffix(s, "o"))
	fmt.Println(strings.Index(s, "l"))
	fmt.Println(strings.Join([]string{"h", "e", "l", "l", "o"}, "-"))
	fmt.Println(strings.Repeat(s, 2))
	fmt.Println(strings.Replace(s, "h", "H", -1))
	fmt.Println(strings.Split("a-b-c", "-"))
	fmt.Println(strings.ToLower(s))
	fmt.Println(strings.ToUpper(s))
	fmt.Println(len(s))
}
