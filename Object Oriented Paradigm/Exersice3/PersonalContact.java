package Exersice3;

/**
 * La clase PersonalContact extiende la clase Contact y agrega una variable de relación para
 * representar la relación entre dos entidades.
 * 
 * @author Karina Urbina
 */
public class PersonalContact extends Contact{
    
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    /**
     * La función devuelve el valor de la variable de relación.
     * 
     * @return El método devuelve un valor de cadena.
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * La función establece el valor de la variable "relación".
     * 
     * @param relationship El parámetro "relación" es una Cadena que representa la relación entre dos
     * entidades.
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nRelationship= " + relationship + "\n";
    }
}
