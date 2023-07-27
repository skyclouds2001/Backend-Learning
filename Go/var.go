package main

var (
	num int
	str string
)

func main() {
	println(str, num)

	var b bool

	println(b)

	const n = 3

	println(n)

	var c = 'c'

	println(c)

	var s = "ssss"

	println(s)

	bb, nn, cc, ss := b, n, c, s

	println(bb, nn, cc, ss)

	var arr = [5]int{1, 2, 3, 4, 5}
	var a = [...]int{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

	println(arr)
	println(a)

	var p *int
	p = nil
	println(p)
}
