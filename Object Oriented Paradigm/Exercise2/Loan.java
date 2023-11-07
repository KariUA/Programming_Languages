package Exercise2;

import java.util.Date;

/**
 * La clase de préstamo representa el préstamo de un libro a un miembro, incluido el libro, el miembro
 * y la fecha del préstamo.
 * 
 * @author Karina Urbina
 */
public class Loan {
    
    private Book book;
    private Member member;
    private Date date;

    public Loan(Book book, Member member, Date date) {
        this.book = book;
        this.member = member;
        this.date = date;
    }

    /**
     * La función getBook() devuelve un objeto Libro.
     * 
     * @return El método devuelve un objeto Libro.
     */
    public Book getBook() {
        return book;
    }

    /**
     * La función devuelve un objeto Miembro.
     * 
     * @return El método devuelve un objeto de tipo Miembro.
     */
    public Member getMember() {
        return member;
    }

    /**
     * La función devuelve un objeto Fecha.
     * 
     * @return El método devuelve un objeto Fecha.
     */
    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Loan: "
                + "\nBook= " + book
                + "\nMember= " + member
                + "\nDate= " + date;
    }
}
