package Exersice3;

/**
 * La clase MeetingEvent extiende la clase Event y agrega una propiedad de ubicación para representar
 * la ubicación del evento de la reunión.
 * 
 * @author Karina Urbina
 */
public class MeetingEvent extends Event{
    
    private String location;

    public MeetingEvent(String eventName, String eventDate, String location) {
        super(eventName, eventDate);
        this.location = location;
    }

    /**
     * La función getLocation() devuelve la ubicación.
     * 
     * @return El método devuelve el valor de la variable "ubicación".
     */
    public String getLocation() {
        return location;
    }

    /**
     * La función establece el valor de la variable "ubicación".
     * 
     * @param location El parámetro "ubicación" es una cadena que representa la nueva ubicación que se
     * establecerá.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nLocation= " + location + "\n";
    }
    
}
    
