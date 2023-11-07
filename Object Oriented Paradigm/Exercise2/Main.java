package Exercise2;

import java.util.Date;
import java.util.List;


/**
 * La clase Main es la clase principal del programa.
 * 
 * @author Karina Urbina 
 */
public class Main {
    public static void main(String[] args) {

        // Se crea la biblioteca
        Library library = new Library();

        // Se crean los socios
        Member member1 = new Member(1, "Karina Urbina", "TEC, San Carlos");
        Member member2 = new Member(2, "Megumi Fushiguro", "A un lado de mi corazón");
        Member member3 = new Member(3, "Izuku Midoriya", "Musutafu, Japón");

        // Se crean los libros
        Book book1 = new Book(101, "La espada de la asesina", "Sarah J. Maas");
        Book book2 = new Book(102, "El camino de los reyes", "Brandon Sanderson");
        Book book3 = new Book(103, "El nombre del viento", "Patrick Rothfuss");
        Book book4 = new Book(104, "El temor de un hombre sabio", "Patrick Rothfuss");
        Book book5 = new Book(105, "Palabras radiantes", "Brandon Sanderson");
        Book book6 = new Book(106, "Juramentada", "Brandon Sanderson");
        Book book7 = new Book(107, "El Imperio Final", "Brandon Sanderson");
        Book book8 = new Book(108, "El pozo de la ascensión", "Brandon Sanderson");
        Book book9 = new Book(109, "Percy Jackson y el ladrón del rayo", "Rick Riordan");
        Book book10 = new Book(110, "Percy Jackson y el mar de los monstruos", "Rick Riordan");
        Book book11 = new Book(111, "Percy Jackson y la maldición del titán", "Rick Riordan");
        Book book12 = new Book(112, "Percy Jackson y la batalla del laberinto", "Rick Riordan");

        // Se agregan los socios a la biblioteca
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        // Se agregan los libros a la biblioteca
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        
        // Se prestan libros a los socios
        member1.borrowBook(book1, new Date()); // Yo presto el La espada de la asesina,
        member1.borrowBook(book2, new Date()); // El camino de los reyes,
        member1.borrowBook(book3, new Date()); // El nombre del viento,
        member1.borrowBook(book6, new Date()); // y Juramentada.

        member2.borrowBook(book4, new Date()); // Megumi Fushiguro presta El temor de un hombre sabio,
        member2.borrowBook(book8, new Date()); // El pozo de la ascensión,
        member2.borrowBook(book9, new Date()); // y Percy Jackson y el ladrón del rayo.

        member3.borrowBook(book5, new Date()); // Izuku Midoriya presta Palabras radiantes,

        // Se el estado de los libros en la biblioteca
        library.showBookStatus();

        // Se muestran los libros prestados a cada socio
        System.out.println("\n--Books borrowed by Karina Urbina:");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println( "Book: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
        System.out.println("\n--Books borrowed by Megumi Fushiguro:");
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println( "Book: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
        System.out.println("\n--Books borrowed by Izuku Midoriya:");
        for (Book book : member3.getBorrowedBooks()) {
            System.out.println( "Book: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        // Se obtienen los socios con más de tres préstamos
        List<Member> membersWithMoreThanThreeLoans = library.getMembersWithMoreThanThreeLoans();
        System.out.println("\n--Members with more than 3 loans:");
        for (Member member : membersWithMoreThanThreeLoans) {
            System.out.println(member);
        }
    }
}