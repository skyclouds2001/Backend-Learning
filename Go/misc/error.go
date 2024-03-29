package main

import (
	"errors"
	"math"
)

func sqrt(f float64) (float64, error) {
	if f < 0 {
		return 0, errors.New("invalid param")
	} else {
		return math.Sqrt(f), nil
	}
}

func main() {
	result, error := sqrt(-1)
	println(result, error)
	
	if (error != nil) {
		println("SUCCESS")
	} else {
		println("ERROR")
	}

	res, err := sqrt(1)
	println(res, err)
	
	if (err != nil) {
		println("SUCCESS")
	} else {
		println("ERROR")
	}
}
