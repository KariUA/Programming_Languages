package Exersice3;
import java.util.ArrayList;
import java.util.List;


/** Diferencia entre un Eager Singleton y un Lazy Singleton 
 * 
 * La diferencia principal se resume en que el Eager Singleton se crea cuando se carga la clase aunque no se use
 * y esto puede ser un desperdicio de memoria. Por otro lado, el Lazy Singleton se crea cuando se llama 
 * al método getInstance(), por lo que puede ser más eficiente en términos de memoria.
 *
 * 
 * Apesar de esto, para este ejercicio es mejor usar un Eager Singleton porque se necesita que la agenda esté disponible 
 * en todo momento y no se necesita que se cree cuando se llame al método getInstance(). Además, 
 * la agenda no es un objeto pesado, por lo que no se desperdicia mucha memoria. 
 */



/**
 * La clase Agenda  representa una colección de elementos como Contactos y eventos, proporciona métodos
 * para agregar, eliminar, modificar y recuperar elementos de la colección.
 * 
 * @author Karina Urbina
 */
public class AgendaSingleton {

    private static AgendaSingleton instance; //Eager Singleton

    private List<Object> items;

    private AgendaSingleton() {
        this.items = new ArrayList<>();
    }

    public static AgendaSingleton getInstance() {
        if (instance == null) {
            instance = new AgendaSingleton();
        }
        return instance;
    }

    /**
     * La función agrega un elemento a una lista.
     * 
     * @param item El parámetro "elemento" es de tipo Objeto, lo que significa que puede aceptar
     * cualquier tipo de objeto como argumento.
     */
    public void addItem(Object item) {
        items.add(item);
    }

    /**
     * La función elimina un elemento de una colección.
     * 
     * @param item El parámetro "elemento" es un objeto que representa el elemento que se eliminará de
     * la colección.
     */
    public void removeItem(Object item) {
        items.remove(item);
    }

    /**
     * La función modificarItem reemplaza un elemento en un índice específico en una lista con un
     * elemento nuevo.
     * 
     * @param index El parámetro de índice es un número entero que representa la posición del elemento
     * en la lista que desea modificar. Se utiliza para acceder al elemento de la lista que desea
     * reemplazar con el nuevo elemento.
     * @param newItem El nuevo elemento con el que desea reemplazar el elemento en el índice
     * especificado.
     */
    public void modifyItem(int index, Object newItem) {
        items.set(index, newItem);
    }

    /**
     * La función devuelve una lista de objetos.
     * 
     * @return Se devuelve una lista de elementos de objetos.
     */
    public List<Object> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n->>> Agenda Contents:\n");
        for (int i = 0; i < items.size(); i++) {
            result.append(i + 1).append(". ").append(items.get(i)).append("\n");
        }
        return result.toString();
    }
}
