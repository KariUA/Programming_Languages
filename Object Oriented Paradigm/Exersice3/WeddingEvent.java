package Exersice3;

/**
 * La clase WeddingEvent amplía la clase Event y agrega propiedades para los novios.
 * 
 * @author Karina Urbina
 */
public class WeddingEvent extends Event{

    private String info;

    public WeddingEvent(String eventName, String eventDate, String info) {
        super(eventName, eventDate);
        this.info = info;
    }

    /**
     * La función getInfo() devuelve la información de los novios.
     * 
     * @return El método devuelve el valor de la variable "info".
     */
    public String getInfo() {
        return info;
    }

    /**
     * La función establece el valor de la variable "info".
     * 
     * @param info El parámetro "info" es una cadena que representa la nueva información que se
     * establecerá.
     */
    public void setInfo(String info) {
        this.info = info;

    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nInfo= " + info + "\n";
    }

}
