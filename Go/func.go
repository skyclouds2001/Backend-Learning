package main

func max(n1, n2 int) int {
	var res int

	if n1 > n2 {
		res = n1
	} else {
		res = n2
	}

	return res
}

func swap(a, b string) (string, string) {
	return b, a
}

func Swap(a *int, b *int) {
	t := *a
	*a = *b
	*b = t
}

func create() func() int {
	i := 0

	next := func() int {
		i += 1
		return i
	}

	return next
}

func factorial(n uint64) uint64 {
	if n > 0 {
		return n * factorial(n-1)
	} else {
		return 1
	}
}

func fibonacci(n int) int {
	if n < 2 {
		return n
	} else {
		return fibonacci(n-1) + fibonacci(n-2)
	}
}

func main() {
	println(max(3, 4))
	println(max(5, 4))

	println(swap("1", "2"))
	a, b := 12, 23
	Swap(&a, &b)
	println(a, b)

	next := create()
	println(next())
	println(next())
	println(next())
	println(next())
	println(next())

	println(factorial(10))
	println(fibonacci(10))
}
