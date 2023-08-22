package main

import "fmt"

func rotateList(list *[]string, num int, dir int) {

	if dir != 0 && dir != 1 {
		fmt.Println("ATTENTION: Wrong direction")
		return
	} else if dir == 0 {
		if num > 0 {
			// Se rota a la izquierda
			for i := 0; i < num; i++ {
				*list = append(*list, (*list)[0]) // Se agrega el primer elemento al final
				*list = (*list)[1:]               // Se elimina el primer elemento
				fmt.Println("\tRotations:", i+1, " ", *list)
			}
		} else {
			// Se rota a la derecha
			for i := 0; i > num; i-- {
				*list = append(*list, (*list)[len(*list)-1]) // Se agrega el ultimo elemento al final
				*list = (*list)[:len(*list)-1]               // Se elimina el ultimo elemento
				fmt.Println("\tRotations:", i+1, " ", *list)
			}
		}
	} else if dir == 1 {
		if num > 0 {
			// Se rota a la derecha
			for i := 0; i < num; i++ {
				*list = append([]string{(*list)[len(*list)-1]}, *list...)
				*list = (*list)[:len(*list)-1]
				fmt.Println("Rotations: ", i+1, " ", *list)
			}
		} else {
			// Se rota a la izquierda
			for i := 0; i > num; i-- {
				*list = append(*list, (*list)[0])
				*list = (*list)[1:]
				fmt.Println("Rotations: ", i+1, " ", *list)
			}
		}
	}
}

func main() {
	originalList := []string{"a", "b", "c", "d", "e", "f", "g", "h"}
	numRotations := 3
	direction := 0 // 0 = left, 1 = right

	fmt.Println("Original list:", originalList, "\nTotal Rotations:", numRotations, "\nDirection:", direction)
	rotateList(&originalList, numRotations, direction)
	fmt.Println("Final list: ", originalList)
}
