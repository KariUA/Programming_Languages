package main

import "fmt"

func createFigure(numStars int) {

	if numStars%2 == 0 { // Se verifica que el numero de estrellas sea impar
		fmt.Println("ATTENTION: The figure must have a positive odd number of stars.")
		return
	}

	for i := 0; i < numStars; i++ { // Parte superior de la figura
		for j := 0; j < numStars-i-1; j++ { // Se imprimen los espacios
			fmt.Print(" ")
		}
		for j := 0; j < 2*i+1; j++ { // Se imprimen los asteriscos
			fmt.Print("*")
		}
		fmt.Println() // Se imprime un salto de linea para pasar a la siguiente fila

	}
	for i := numStars - 2; i >= 0; i-- { // Parte inferior de la figura
		for j := 0; j < numStars-i-1; j++ {
			fmt.Print(" ")
		}
		for j := 0; j < 2*i+1; j++ {
			fmt.Print("*")
		}
		fmt.Println()

	}
}

func main() {
	sizeFigure := 5
	createFigure(sizeFigure)
}
