package main

import "fmt"

type Calcular struct{}

func (c Calcular) SomarDois(num1, num2 float64) float64 {
	return num1 + num2
}

func (c Calcular) SomarTres(num1, num2, num3 float64) float64 {
	return num1 + num2 + num3
}

func main() {
	calculadora := Calcular{}


	resultadoDois := calculadora.SomarDois(34, 920)
	fmt.Printf("Resultado da soma com dois numeros: %.2f\n", resultadoDois)

	resultadoTres := calculadora.SomarTres(120, 30, 160)
	fmt.Printf("Resultado da soma com três números: %.2f\n", resultadoTres)
}
