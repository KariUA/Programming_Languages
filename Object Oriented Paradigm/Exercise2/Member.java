package Exercise2;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;


/**
 * La clase Miembro representa un miembro de la biblioteca con una identificación, nombre, dirección y
 * una lista de préstamos únicos.
 * 
 * @author Karina Urbina
 */
public class Member {
    
    private int memberID;
    private String name;
    private String address;
    private List<Loan> loans;
    
    public Member(int memberID, String name, String address) {
        this.memberID = memberID;
        this.name = name;
        this.address = address;
        this.loans = new ArrayList<Loan>();
    }

    /**
     * La función devuelve el valor de la variable memberID.
     * 
     * @return El método devuelve un valor entero.
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * La función devuelve el valor de la variable name.
     * 
     * @return El método devuelve un valor de cadena.
     */
    public String getName() {
        return name;
    }

    /**
     * La función devuelve el valor de la variable address.
     * 
     * @return El método devuelve un valor de cadena.
     */
    public String getAddress() {
        return address;
    }

    /**
     * La función devuelve el valor de la variable loans.
     * 
     * @return El método devuelve un valor de lista.
     */
    public List<Loan> getLoans() {
        return loans;
    }

    /**
     * La función devuelve el número de préstamos de una colección.
     * 
     * @return El número de préstamos en la lista de "préstamos".
     */
    public int getNumberOfLoans() {
        return loans.size();
    }

    /**
     * La función "borrowBook" crea un nuevo préstamo para un libro determinado, lo agrega a una lista
     * de préstamos y marca el libro como no disponible.
     * 
     * @param book El parámetro libro es una instancia de la clase Libro. Representa el libro que se
     * está tomando prestado.
     */
    public void borrowBook(Book book, Date date) {
        Loan loan = new Loan(book, this, date);
        loans.add(loan);
        book.setAvailable(false);
    }

    /**
     * La función devuelve una serie de libros prestados.
     * 
     * @return El método devuelve una serie de objetos Libro.
     */
    public Book[] getBorrowedBooks() {
        Book[] borrowedBooks = new Book[loans.size()];
        for (int i = 0; i < loans.size(); i++) {
            borrowedBooks[i] = loans.get(i).getBook();
        }
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "Member : "
                + "\nMemberID= " + memberID
                + "\nName= " + name
                + "\nAddress= " + address
                + "\nLoans= " + loans;
    }
}
