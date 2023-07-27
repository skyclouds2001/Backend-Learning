package main

type Base interface {
	getId() int
}

type Book struct {
	id int
}

func (b Book) getId() int {
	return b.id
}

func main() {
	var book Base = new(Book)
	println(book.getId())

	var b = book.(*Book)
	b.id = 10
	println(book.getId())
}
