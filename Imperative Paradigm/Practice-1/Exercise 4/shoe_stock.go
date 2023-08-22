package main

import "fmt"

type Shoe struct {
	Brand string
	Price int
	Size  int
}

type InventoryItem struct {
	Shoe  *Shoe
	Stock int
}

type Inventory []InventoryItem

var mainInventory Inventory

func (inv *Inventory) addShoe(shoe *Shoe, stock int) {
	if shoe.Size < 34 || shoe.Size > 44 {
		fmt.Println("ATTENTION: The size is not valid,shoe not added")
		return
	}
	*inv = append(*inv, InventoryItem{Shoe: shoe, Stock: stock}) // Se agrega el nuevo calzado al inventario
}

func (inv *Inventory) searchShoe(brand string, size int) *InventoryItem {
	for _, v := range *inv {
		if v.Shoe.Brand == brand && v.Shoe.Size == size {
			return &v
		}
	}
	return nil
}

func (inv *Inventory) sellShoe(brand string, size int) {
	item := inv.searchShoe(brand, size) // Se busca el calzado a comprar en el inventario
	if item != nil {
		item.Stock-- // Se reduce el stock del calzado
		fmt.Println("\nThe shoe was sold successfully")
	} else {
		fmt.Println("\nATTENTION: The shoe is not in stock")
	}
}

func loadStock() {
	mainInventory.addShoe(&Shoe{Brand: "Fila", Price: 10000, Size: 33}, 6)
	mainInventory.addShoe(&Shoe{Brand: "Puma", Price: 20000, Size: 34}, 4)
	mainInventory.addShoe(&Shoe{Brand: "Reebok", Price: 30000, Size: 35}, 2)
	mainInventory.addShoe(&Shoe{Brand: "Converse", Price: 40000, Size: 36}, 8)
	mainInventory.addShoe(&Shoe{Brand: "Nike", Price: 50000, Size: 37}, 6)
	mainInventory.addShoe(&Shoe{Brand: "Adidas", Price: 60000, Size: 38}, 4)
	mainInventory.addShoe(&Shoe{Brand: "Puma", Price: 70000, Size: 39}, 2)
	mainInventory.addShoe(&Shoe{Brand: "Nike", Price: 10000, Size: 40}, 3)
	mainInventory.addShoe(&Shoe{Brand: "Adidas", Price: 20000, Size: 42}, 10)
	mainInventory.addShoe(&Shoe{Brand: "Puma", Price: 30000, Size: 44}, 7)
	mainInventory.addShoe(&Shoe{Brand: "Reebok", Price: 40000, Size: 46}, 5)
	mainInventory.addShoe(&Shoe{Brand: "Converse", Price: 50000, Size: 48}, 9)

}

func main() {

	//Se carga el inventario
	loadStock()

	//Se agrega un nuevo calzado
	mainInventory.addShoe(&Shoe{Brand: "Tennis Funky", Price: 10000, Size: 44}, 6)
	mainInventory.addShoe(&Shoe{Brand: "Tennis Funky", Price: 100, Size: 46}, 2)

	//Se vende un calzado
	mainInventory.sellShoe("Fila", 33)
	mainInventory.sellShoe("Tennis Funky", 44)

	fmt.Println("\nShoe Inventory:")
	for _, item := range mainInventory {
		fmt.Printf("Brand: %s, Price: %d, Size: %d, Stock: %d\n",
			item.Shoe.Brand, item.Shoe.Price, item.Shoe.Size, item.Stock)
	}
}
