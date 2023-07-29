package main

import (
	"errors"
	"fmt"
)

type book struct {
	id    int
	title string
}

func (b book) toString() string {
	return fmt.Sprintf("id=%d title=\"%s\"", b.id, b.title)
}

func (b *book) toPrimate() error {
	return errors.New(fmt.Sprintf("[ERROR]: %d %s", b.id, b.title))
}

func main() {
	b0 := book{0, "test 0"}
	b1 := book{
		id:    1,
		title: "test 1",
	}
	b2 := book{
		title: "test 2",
	}

	fmt.Println(b0)
	fmt.Println(b1)
	fmt.Println(b2)

	fmt.Println(b0.title)
	fmt.Println(b1.title)
	fmt.Println(b2.title)

	fmt.Println(b0.toString())
	fmt.Println(b1.toString())
	fmt.Println(b2.toString())

	fmt.Println(b0.toPrimate())
	fmt.Println(b1.toPrimate())
	fmt.Println(b2.toPrimate())

	fmt.Println(getId(b0))
	fmt.Println(getTitle(&b0))
	fmt.Println(getId(b1))
	fmt.Println(getTitle(&b1))
	fmt.Println(getId(b2))
	fmt.Println(getTitle(&b2))

	p0 := &b0

	fmt.Println(&p0)
	fmt.Println(p0.title)

	fmt.Println(p0.toString())
}

func getId(book book) int {
	return book.id
}

func getTitle(book *book) string {
	return book.title
}
