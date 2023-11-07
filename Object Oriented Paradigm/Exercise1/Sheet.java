package Exercise1;
import java.util.List;

/**
 * La clase Hoja representa una hoja de dibujos y proporciona métodos para agregar y recuperar dibujos.
 * 
 * @author Karina Urbina 
 */
public class Sheet {

    private List<Drawable> objects; 

    public Sheet(List<Drawable> objects) {
        this.objects = objects;
    }

    /**
     * La función devuelve una lista de objetos dibujables.
     * 
     * @return El método devuelve una lista de objetos dibujables.
     */
    public List<Drawable> getObjects() {
        return objects;
    }

}
