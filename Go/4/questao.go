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

func somAnimal(animal Animal) {
	fmt.Println(animal.Som())
}

func main() {

	cachorro := Cachorro{}
	vaca := Vaca{}

	somAnimal(cachorro)
	somAnimal(vaca)
}
