package Exersice3;

/**
 * La interfaz ContactFactory define un método que crea un objeto de contacto.
 * 
 * @author Karina Urbina
 */
public interface ContactFactory {

    /**
     * La función crea un contacto con un nombre, número de teléfono e información adicional.
     * 
     * @param name El nombre del contacto. Debería ser una cuerda.
     * @param phoneNumber Una cadena que representa el número de teléfono del contacto.
     * @param moreInfo El parámetro "moreInfo" es una cadena que se puede utilizar para proporcionar
     * información adicional sobre el contacto, como su dirección de correo electrónico, dirección o
     * cualquier otro detalle relevante.
     * @return El método createContact devuelve un objeto de contacto.
     */
    Contact createContact(String name, String phoneNumber, String moreInfo);
}

/**
 * La clase PersonalContactFactory implementa la interfaz ContactFactory y proporciona una
 * implementación para el método createContact().
 */
class PersonalContactFactory implements ContactFactory {
    @Override
    public Contact createContact(String name, String phoneNumber, String moreInfo) {
        return new PersonalContact(name, phoneNumber, moreInfo);
    }
}

/**
 * La clase BusinessContactFactory implementa la interfaz ContactFactory y proporciona una
 * implementación para el método createContact().
 */
class BusinessContactFactory implements ContactFactory {
    @Override
    public Contact createContact(String name, String phoneNumber, String moreInfo) {
        return new BusinessContact(name, phoneNumber, moreInfo);
    }
}
    

