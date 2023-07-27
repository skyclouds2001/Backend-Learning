package main

import "fmt"

type book struct {
	id    int
	title string
}

func (b book) toString() string {
	return fmt.Sprintf("id=%d title=\"%s\"", b.id, b.title)
}

func main() {
	b0 := book{0, "test 0"}
	b1 := book{
		id:    1,
		title: "test 1",
	}

	fmt.Println(b0)
	fmt.Println(b1)

	fmt.Println(b0.title)
	fmt.Println(b1.title)

	p0 := &b0

	fmt.Println(&p0)
	fmt.Println(p0.title)

	fmt.Println(p0.toString())
}
