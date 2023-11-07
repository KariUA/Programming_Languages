package Exersice3;

/**
 * La interfaz EventFactory define un método que crea un evento con un nombre determinado, fecha e
 * información adicional.
 * 
 * @author Karina Urbina
 */
public interface EventFactory {
    
    /**
     * La función crea un evento con un nombre determinado, fecha e información adicional.
     * 
     * @param eventName Una cadena que representa el nombre del evento.
     * @param eventDate Una cadena que representa la fecha del evento en un formato específico 
     * @param moreInfo Una cadena que contiene información adicional sobre el evento. Esto podría
     * incluir detalles como la ubicación del evento, la hora, la descripción o cualquier otra
     * información relevante.
     * @return El método createEvent devuelve un objeto Evento.
     */
    Event createEvent(String eventName, String eventDate, String moreInfo); 
    
}

/**
 * La clase WeddingEventFactory implementa la interfaz EventFactory y proporciona una implementación
 * para el método createEvent().
 */
class WeddingEventFactory implements EventFactory {
    @Override
    public Event createEvent(String eventName, String eventDate, String moreInfo) {
        return new WeddingEvent(eventName, eventDate, moreInfo);
    }
}

/**
 * La clase MeetingEventFactory implementa la interfaz EventFactory y proporciona una implementación
 * para el método createEvent().
 */
class MeetingEventFactory implements EventFactory {
    @Override
    public Event createEvent(String eventName, String eventDate, String moreInfo) {
        return new MeetingEvent(eventName, eventDate, moreInfo);
    }
}

