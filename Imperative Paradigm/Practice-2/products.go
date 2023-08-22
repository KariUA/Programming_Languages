package main

import (
	"fmt"
	"sort"
)

// Estructura de datos para almacenar productos
type producto struct {
	nombre   string
	cantidad int
	precio   int
}

// Slice de productos para almacenar la lista de productos
type listaProductos []producto

// Variable que puede contener una colección (slice) de elementos producto.
var lProductos listaProductos

// Constante
const existenciaMinima int = 10 //la existencia mínima es el número mínimo debajo de el cual se deben tomar eventuales desiciones

// Metodo asociado a la estructura listaProductos
func (l *listaProductos) agregarProducto(nombre string, cantidad int, precio int) {

	p, err := l.buscarProducto(nombre)

	if err != 0 {
		fmt.Println("El producto no existe, se agregará")
		*l = append(*l, producto{nombre: nombre, cantidad: cantidad, precio: precio})
	} else {
		fmt.Println("El producto ya existe, se actualizará")
		// Se actualiza la cantidad y el precio
		p.cantidad += cantidad
		p.precio = precio
	}
}

func (l *listaProductos) agregarProductos(productos ...producto) {
	for _, p := range productos {
		l.agregarProducto(p.nombre, p.cantidad, p.precio)
	}
}

func (l *listaProductos) buscarProducto(nombre string) (*producto, int) {
	var err = -1
	var p *producto = nil
	for i := 0; i < len(*l); i++ {
		if (*l)[i].nombre == nombre {
			p = &(*l)[i]
			err = 0
			break // Importante: Salir del bucle una vez encontrado el producto
		}
	}
	return p, err
}

func (l *listaProductos) venderProducto(nombre string, cantidad int) {
	p, err := l.buscarProducto(nombre)

	if err != 0 {
		fmt.Println("El producto no existe en la lista.")
		return
	}

	if p.cantidad >= cantidad {
		p.cantidad -= cantidad

		if p.cantidad <= existenciaMinima {
			fmt.Printf("El producto '%s' ha alcanzado la existencia mínima. Se eliminará de la lista.\n", nombre)
			l.eliminarProducto(nombre)
		}

		fmt.Printf("Venta de %d unidades de '%s' realizada correctamente.\n", cantidad, nombre)
	} else {
		fmt.Println("No hay suficiente cantidad de producto para vender.")
	}

}

func (l *listaProductos) eliminarProducto(nombre string) {
	index := -1

	for i, p := range *l {
		if p.nombre == nombre {
			index = i
			break
		}
	}

	if index != -1 {
		// Eliminar el producto de la lista
		*l = append((*l)[:index], (*l)[index+1:]...)
		fmt.Printf("Producto '%s' eliminado correctamente.\n", nombre)
	}
}

func (l *listaProductos) modificarPrecio(nombre string, nuevoPrecio int) {
	p, err := l.buscarProducto(nombre)

	if err != 0 {
		fmt.Println("El producto no existe en la lista.")
		return
	}

	p.precio = nuevoPrecio
	fmt.Printf("Precio del producto '%s' modificado correctamente.\n", nombre)
}

func llenarDatos() {
	lProductos.agregarProducto("arroz", 15, 2500)
	lProductos.agregarProducto("frijoles", 4, 2000)
	lProductos.agregarProducto("leche", 8, 1200)
	lProductos.agregarProducto("café", 12, 4500)

}

func (l *listaProductos) listarProductosMinimos() listaProductos {
	// debe retornar una nueva lista con productos con existencia mínima
	productosMinimos := make(listaProductos, 0)

	for _, p := range *l {
		if p.cantidad <= existenciaMinima {
			productosMinimos = append(productosMinimos, p)
		}
	}

	return productosMinimos
}

func (l *listaProductos) aumentarInventarioDeMinimos(listaMinimos listaProductos) {
	for _, prod := range listaMinimos {
		if prod.cantidad < existenciaMinima {
			// Simulación de compra: se añade la diferencia entre el mínimo y el inventario actual
			compra := existenciaMinima - prod.cantidad

			producto, err := l.buscarProducto(prod.nombre)
			if err == 0 {
				(*producto).cantidad += compra
				fmt.Printf("Se compraron %d unidades de %s\n", compra, prod.nombre)
			}
		}
	}
}

func (l *listaProductos) ordenarPor(elemento string) {

	switch elemento {
	case "nombre":
		sort.SliceStable(*l, func(i, j int) bool {
			return (*l)[i].nombre < (*l)[j].nombre
		})
	case "cantidad":
		sort.SliceStable(*l, func(i, j int) bool {
			return (*l)[i].cantidad < (*l)[j].cantidad
		})
	case "precio":
		sort.SliceStable(*l, func(i, j int) bool {
			return (*l)[i].precio < (*l)[j].precio
		})
	default:
		fmt.Println("Elemento de ordenamiento no válido.")
	}
}

func main() {

	llenarDatos()

	fmt.Println("\nInvetario inicial:")
	fmt.Println(lProductos)

	/*
		// Agregar nuevos productos
		lProductos.agregarProducto("pan", 20, 1500)
		fmt.Println("Lista de productos después de agregar un producto:")
		fmt.Println(lProductos)

		// Vender productos
		lProductos.venderProducto("arroz", 5)
		fmt.Println("Lista de productos después de vender 5 unidades de arroz:")
		fmt.Println(lProductos)

		// Modificar precio
		lProductos.modificarPrecio("leche", 1300)
		fmt.Println("Lista de productos después de modificar el precio de leche:")
		fmt.Println(lProductos)

		// Eliminar producto
		lProductos.eliminarProducto("frijoles")
		fmt.Println("\nLista de productos después de eliminar frijoles:")
		fmt.Println(lProductos)

	*/

	// Listar productos mínimos
	productosMinimos := lProductos.listarProductosMinimos()
	fmt.Println("\nProductos con existencia mínima: ")
	fmt.Println(productosMinimos)

	// Aumentar inventario de productos mínimos
	lProductos.aumentarInventarioDeMinimos(productosMinimos)
	fmt.Println("Lista de productos después de aumentar inventario de mínimos:")
	fmt.Println(lProductos)

	fmt.Println("\nOrdenando productos...\n")

	// Ordenar por nombre
	lProductos.ordenarPor("nombre")
	fmt.Println("Lista de productos ordenada por nombre:")
	fmt.Println(lProductos)

	// Ordenar por cantidad
	lProductos.ordenarPor("cantidad")
	fmt.Println("Lista de productos ordenada por cantidad:")
	fmt.Println(lProductos)

	// Ordenar por precio
	lProductos.ordenarPor("precio")
	fmt.Println("Lista de productos ordenada por precio:")
	fmt.Println(lProductos)

}
