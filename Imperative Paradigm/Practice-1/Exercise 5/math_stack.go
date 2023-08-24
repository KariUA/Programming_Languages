package main

import "fmt"

/*
5)	Implemente un programa que, utilizando pilas creadas a base de slices, realice un evaluador
de expresiones matemáticas expresadas en notación infija. Se debe probar el programa a partir de
al menos 3 expresiones con diferentes características dadas por el programador (el main tendrá tres
llamadas al evaluador con 3 expresiones diferentes)

Como ejemplos de expresiones y de evaluación se adjuntan las siguientes figuras. De ser necesario se
puede ahondar más en las expresiones en infijo y en el algoritmo de evaluación utilizando pilas.
*/

// Pila creada a base de slices
type Stack struct {
	items []int
}

// Agregar un elemento a la pila
func (s *Stack) Push(i int) {
	s.items = append(s.items, i)
}

// Obtener el elemento superior de la pila sin eliminarlo
func (s *Stack) Peek() int {
	return s.items[len(s.items)-1]
}

// Eliminar un elemento de la pila
func (s *Stack) Pop() int {
	item := s.items[len(s.items)-1]
	s.items = s.items[:len(s.items)-1]
	return item
}

// Verificar si la pila está vacía
func (s *Stack) IsEmpty() bool {
	return len(s.items) == 0
}

// Evaluador de expresiones matemáticas expresadas en notación infija
func evaluador(expresion string) int {

	// Creación de la pila
	pila := Stack{}

	// Recorrido de la expresión

	for _, caracter := range expresion {

		// Si el caracter es un número, se agrega a la pila
		if caracter >= '0' && caracter <= '9' {
			pila.Push(int(caracter - '0'))
		} else if caracter == '+' { // Si el caracter es un operador, se realiza la operación correspondiente
			operando1 := pila.Pop()
			operando2 := pila.Pop()
			pila.Push(operando1 + operando2)
		} else if caracter == '*' {
			operando1 := pila.Pop()
			operando2 := pila.Pop()
			pila.Push(operando1 * operando2)
		} else if caracter == '-' {
			operando1 := pila.Pop()
			operando2 := pila.Pop()
			pila.Push(operando1 - operando2)
		} else if caracter == '/' {
			operando1 := pila.Pop()
			operando2 := pila.Pop()
			pila.Push(operando1 / operando2)
		}
	}

	// Se retorna el resultado de la expresión
	return pila.Pop()
}

func main() {

	// Se evalúan las expresiones
	fmt.Println("La expresion 12+ se evalua como:", evaluador("12+"))
	fmt.Println("La expresion 64* se evalua como:", evaluador("64*"))
	fmt.Println("La expresion 34- se evalua como:", evaluador("34-"))
	fmt.Println("La expresion 48/ se evalua como:", evaluador("48/"))
	fmt.Println("La expresion 456*+ se evalua como:", evaluador("456*+"))
	fmt.Println("La expresion 78+32+/ se evalua como:", evaluador("78+32+/"))
	fmt.Println("La expresion 41/82+34- se evalua como:", evaluador("93/82+34-*"))

}
