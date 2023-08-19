package main

func main() {
	a := 2
	
	switch a {
	case 1:
		println("one")
	case 2, 3:
		println("two or three")
	default:
		println("unknown")
	}

	switch {
	case a < 0:
		println("negative")
	case a == 0:
		println("positive")
	case a > 0:
		println("positive")
	default:
		println("unknown")
	}
}
