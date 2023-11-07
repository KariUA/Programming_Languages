package Exersice3;

/**
 * La clase Event representa un evento con un nombre y una fecha, y proporciona métodos para obtener y
 * establecer estos valores.
 * 
 * @author Karina Urbina
 */
public class Event {
    
    private String eventName;
    private String eventDate;

    public Event(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    /**
     * La función devuelve el nombre de un evento.
     * 
     * @return El método devuelve el valor de la variable eventName.
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * La función establece el nombre de un evento.
     * 
     * @param eventName El parámetro "eventName" es una cadena que representa el nombre de un evento.
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * La función devuelve la fecha del evento como una cadena.
     * 
     * @return El método devuelve un valor de cadena.
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * La función establece la fecha del evento para un objeto.
     * 
     * @param eventDate El parámetro eventDate es una cadena que representa la fecha de un evento.
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event: "
                + "\nEventName= " + eventName
                + "\nEventDate= " + eventDate;
    } 
}
