package Exersice3;

//NOTA: La diferencia entre EasySingleton y Singleton esta en el archivo AgendaSingleton.java, y la explicacion de cual es mejor utilizar tambien esta en ese archivo.

/**
 * La clase Main es la clase principal del programa.
 * 
 * @author Karina Urbina 
 */
public class Main {
    public static void main(String[] args) {

        //Se crea la agenda personal
        AgendaSingleton personalAgenda = AgendaSingleton.getInstance(); 

        //Se crean los contactos 
        ContactFactory personalContactFactory = new PersonalContactFactory(); 
        Contact friend = personalContactFactory.createContact("Todoroki", "123456789", "Friend"); 
        Contact crush = personalContactFactory.createContact("Megumi Fushiguro", "12233445", "Crush");

        //Se crean los eventos
        EventFactory meetingFactory = new MeetingEventFactory();
        Event meeting1 = meetingFactory.createEvent("Sumergirme en la desgracia", "2023-11-01", "Mi cuarto");
        Event meeting2 = meetingFactory.createEvent("Cena conmigo misma", "2023-12-25", "La cocina de mi casa");
        EventFactory weddingFactory = new WeddingEventFactory();
        Event wedding = weddingFactory.createEvent("Boda", "2023-12-25", "Wall-e y Eva se casan");

        //Se agregan los contactos y eventos a la agenda
        personalAgenda.addItem(friend);
        personalAgenda.addItem(crush);
        personalAgenda.addItem(meeting1);
        personalAgenda.addItem(meeting2);
        personalAgenda.addItem(wedding);

        //Se imprime la agenda
        System.out.println("*********************** Personal Agenda:");
        System.out.println(personalAgenda);

        // Example modification
        ((PersonalContact)friend).setName("Todoroki Shoto");
        personalAgenda.modifyItem(0, friend);

        System.out.println("*********************** Personal Agenda after modification:");
        System.out.println(personalAgenda);

        //Se crea la agenda de negocios
        AgendaSingleton businessAgenda = AgendaSingleton.getInstance(); 

        //Se crean los contactos y eventos
        ContactFactory businessContactFactory = new BusinessContactFactory();
        Contact colleague = businessContactFactory.createContact("Sarah Johnson", "555555555", "INTEL Inc");
        Contact client = businessContactFactory.createContact("James Brown", "666666666", "XYZ Inc");

        Event meeting3 = meetingFactory.createEvent("Entrega de Proyecto", "2023-11-08", "Conference Room B");
        Event wedding2 = weddingFactory.createEvent("Boda", "2023-12-25", "Alice");

        businessAgenda.addItem(colleague);
        businessAgenda.addItem(client);
        businessAgenda.addItem(wedding2);
        businessAgenda.addItem(meeting3);

        System.out.println("*********************** Business Agenda:");
        System.out.println(businessAgenda);
    }
}
