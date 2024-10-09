package main

import "fmt"

type Carro struct {
    marca  string
    modelo string
    ano    int
}
func main() {
    carro1 := Carro{"Ferrari", "F40", 1987}
    carro2 := Carro{"Mazda", "Rx 7", 1978}
    carro3 := Carro{"Nissan", "350z", 2001}
   
    fmt.Println(carro1)
    fmt.Println(carro2)
    fmt.Println(carro3)
}