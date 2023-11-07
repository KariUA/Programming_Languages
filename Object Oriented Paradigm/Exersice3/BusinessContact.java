package Exersice3;

/**
 * La clase BusinessContact amplía la clase Contact y agrega un campo de empresa para representar un
 * contacto comercial.
 * 
 * @author Karina Urbina
 */
public class BusinessContact extends Contact {
    
    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    /**
     * La función devuelve el nombre de la empresa.
     * 
     * @return El método devuelve el valor de la variable "empresa".
     */
    public String getCompany() {
        return company;
    }

    /**
     * La función establece el valor de la variable "empresa".
     * 
     * @param company El parámetro "empresa" es una cadena que representa el nombre de una empresa.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCompany= " + company + "\n";
    }
}
