package main

import (
	"fmt"
	"time"
)

func main() {
	now := time.Now()
	fmt.Println(now)
	fmt.Println(now.Unix())

	t := time.Date(2022, 4, 5, 23, 23, 45, 0, time.UTC)
	fmt.Println(t)
	fmt.Println(t.Year(), t.Month(), t.Day(), t.Hour(), t.Minute(), t.Second())

	fmt.Println(t.Format("2012-05-06 12:45:23"))

	tt, err := time.Parse("2012-05-06 12:45:23", "2012-05-16 12:45:23")
	if err != nil {
		panic(err)
	}
	fmt.Println(tt == t)

	diff := tt.Sub(t)
	fmt.Println(diff)
	fmt.Println(diff.Hours(), diff.Minutes(), diff.Seconds())
}
