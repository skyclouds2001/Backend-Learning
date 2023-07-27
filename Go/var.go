package main

import "strconv"

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

	var n1 int64 = 10
	var n2 = float64(n1)
	println(n1, n2)

	println(strconv.Atoi("1"))
	println(strconv.Itoa(1))
	println(strconv.ParseFloat("3.14", 64))
	println(strconv.FormatFloat(3.1415926, 'f', 2, 64))

	var i interface{} = "Hello, World"
	str, ok := i.(string)
	println(str, ok)
}
