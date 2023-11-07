package Exercise2;

/**
 * La clase Libro representa un libro con propiedades como código, título, autor y disponibilidad.
 * @author Karina Urbina 
 */
public class Book {

    private int code;
    private String title;
    private String author;
    private boolean available;

    public Book(int code, String title, String author) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    /**
     * La función getCode() devuelve el valor de la variable de código.
     * 
     * @return Se está devolviendo la variable de código.
     */
    public int getCode() {
        return code;
    }

    /**
     * La función getTitle() devuelve el título de un objeto.
     * 
     * @return El método devuelve el valor de la variable "título".
     */
    public String getTitle() {
        return title;
    }

    /**
     * La función devuelve el autor de un libro.
     * 
     * @return El método devuelve el valor de la variable "autor".
     */
    public String getAuthor() {
        return author;
    }

    /**
     * La función devuelve el estado de disponibilidad.
     * 
     * @return El método devuelve un valor booleano.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * La función establece el estado de disponibilidad de un objeto.
     * 
     * @param available El parámetro "disponible" es una variable booleana que representa el estado de
     * disponibilidad de algo. Se puede establecer en verdadero o falso, indicando si el objeto está
     * disponible o no.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book: [Code=" + code + ", Title=" + title + ", Author=" + author + ", Available=" + available + "]";
    }
}

