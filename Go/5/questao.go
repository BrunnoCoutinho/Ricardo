package main

import "fmt"

type Animal interface {
	Som() string
}

type Cachorro struct{}

func (c Cachorro) Som() string {
	return "Au Au"
}

type Vaca struct{}

func (g Vaca) Som() string {
	return "Muuh"
}

func sonsAnimais(animais []Animal) {
	for _, animal := range animais {
		fmt.Println(animal.Som())
	}
}

func main() {
	animais := []Animal{
		Cachorro{},
		Vaca{},
		Cachorro{},
		Vaca{},
	}

	sonsAnimais(animais)
}
