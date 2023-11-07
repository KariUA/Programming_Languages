package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * La clase Biblioteca representa una biblioteca y proporciona métodos para agregar miembros y libros,
 * recuperar miembros con más de tres préstamos y mostrar el estado de los libros en la biblioteca.
 * 
 * @author Karina Urbina 
 */
public class Library {
    
    private List<Member> members;
    private List<Book> books;

    public Library() {
        this.members = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    /**
     * La función addMember agrega un miembro a una lista de miembros.
     * 
     * @param member El parámetro "miembro" es de tipo "Miembro", lo que significa que espera que se
     * pase un objeto de la clase "Miembro" como argumento al llamar a este método.
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * La función addBook agrega un libro a una colección de libros.
     * 
     * @param book El parámetro "libro" es de tipo Libro. Representa el objeto libro que desea agregar
     * a la colección de libros.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * La función devuelve una lista de miembros que tienen más de tres préstamos.
     * 
     * @return El método devuelve una lista de miembros que tienen más de tres préstamos.
     */
    public List<Member> getMembersWithMoreThanThreeLoans() {
        return members.stream()
                .filter(member -> member.getNumberOfLoans() > 3)
                .collect(Collectors.toList());
    }

    /**
     * La función  imprime el estado de los libros de la biblioteca.
     */
    public void showBookStatus() {
        System.out.println("\nStatus of books in the library:");
        for (Book book : books) {
            System.out.println("- "+ book.getTitle() + " by " + book.getAuthor() + " is " + (book.isAvailable() ? "available" : "not available"));
        }
    }
}
