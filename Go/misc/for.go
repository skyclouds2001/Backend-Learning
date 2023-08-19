package main

func main() {
	for i := 0; i < 10; i++ {
		println(i)
	}

	i := 0
	for i < 10 {
		println(i)
		i++
	}

	for {
		println("loop")
		break
	}
	
	for n := 0; n < 5; n++ {
		if n % 2 == 1 {
			continue
		}
		println(n)
	}
}
