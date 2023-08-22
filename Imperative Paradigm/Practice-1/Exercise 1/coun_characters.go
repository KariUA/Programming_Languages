package main

import "fmt"

//TEXT TO BE ANALYZED

/* "Amid the tranquil afternoon, the graceful dance of feline forms enchants, as whiskers twitch\n" +
	"and eyes gleam with mystery. Each playful pounce and gentle purr holds a symphony of tales,\n" +
	"weaving a tapestry of companionship that warms even the coldest of nights."

 	"The purring of cats\r\nfills the heart with joy."
*/

func main() {

	text := "Amid the tranquil afternoon, the graceful dance of feline forms enchants, as whiskers twitch\n" +
		"and eyes gleam with mystery. Each playful pounce and gentle purr holds a symphony of tales,\n" +
		"weaving a tapestry of companionship that warms even the coldest of nights."

	characterCount := 0
	wordCount := 0
	linesCount := 1
	longestWord := len(text)
	inWord := true

	for i := 0; i < longestWord; i++ {

		//Verifica que sea un caracter
		if string(text[i]) != "\n" && string(text[i]) != "\r" && string(text[i]) != " " {
			characterCount++
		}
		//Verificar si es una palabra
		if string(text[i]) == " " || string(text[i]) == "\n" {
			if inWord {
				wordCount++
				inWord = false
			}
		} else {
			inWord = true
		}

		//Verificar si es una linea nueva
		if string(text[i]) == "\n" {
			linesCount++
		}

	}
	// Verifica si la ultima palabra no tiene espacio al final
	if inWord {
		wordCount++
	}

	fmt.Println(
		text,
		"\nThe number of characters is: ", characterCount,
		"\nThe number of words is: ", wordCount,
		"\nThe number of lines is: ", linesCount)
}
