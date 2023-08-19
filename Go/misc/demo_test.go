package main

import (
	"github.com/stretchr/testify/assert"
	"os"
	"testing"
)

func TestDemo(t *testing.T) {
	output := 1 + 1
	expectOutput := 2
	assert.Equal(t, output, expectOutput)
}

func TestMain(m *testing.M) {
	code := m.Run()

	os.Exit(code)
}
