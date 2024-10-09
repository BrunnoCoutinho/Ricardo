package main

import (
	"fmt"
	"sync"
)

type Banco struct {
	Nome string
}

var instance *Banco

var once sync.Once

func GetBanco() *Banco {
	once.Do(func() {
		instance = &Banco{Nome: "Banco de Dados Exemplo"}
	})
	return instance
}

func main() {
	banco1 := GetBanco()
	fmt.Println("Banco 1:", banco1.Nome)

	banco2 := GetBanco()
	fmt.Println("Banco 2:", banco2.Nome)

	fmt.Println("As instâncias são iguais:", banco1 == banco2)
}
