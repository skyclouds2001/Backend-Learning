package main

import (
	"encoding/json"
	"fmt"
)

type User struct {
	Name string
	Age int
	Languages []string `json:"languages"`
}

func main() {
	u := User{Name: "x", Age: 6, Languages: []string{"JavaScript", "TypeSScript"}}

	buf, err := json.Marshal(u)
	if err != nil {
		panic(err)
	}
	fmt.Println(buf)
	fmt.Println(string(buf))

	var b User
	err = json.Unmarshal(buf, &b)
	if err != nil {
		panic(err)
	}
	fmt.Printf("%#v\n", b)
}
