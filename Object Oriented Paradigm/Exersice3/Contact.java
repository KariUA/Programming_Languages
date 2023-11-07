package Exersice3;

/**
 * La clase Contacto representa un contacto con un nombre y número de teléfono, y proporciona métodos
 * para obtener y establecer estos valores.
 * 
 * @author Karina Urbina
 */
public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * La función getName() devuelve el nombre de un objeto.
     * 
     * @return El método devuelve el valor de la variable "nombre".
     */
    public String getName() {
        return name;
    }

    /**
     * La función establece el nombre de un objeto.
     * 
     * @param name El parámetro de nombre es una cadena que representa el nombre que se establecerá.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * La función devuelve el número de teléfono.
     * 
     * @return El método devuelve un valor de cadena, específicamente el valor de la variable
     * "phoneNumber".
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * La función establece el valor de la variable número de teléfono.
     * 
     * @param phoneNumber El parámetro phoneNumber es una cadena que representa un número de teléfono.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact: "
                + "\nName= " + name
                + "\nPhone Number= " + phoneNumber;
    }
}
