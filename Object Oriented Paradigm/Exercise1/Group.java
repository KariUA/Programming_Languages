package Exercise1;

import java.util.List;

/**
 * La clase Group representa una colección de objetos Drawable que se pueden dibujar.
 * 
 * @author Karina Urbina 
 */
public class Group extends Drawable {
    
    private List<Drawable> objects;

    public Group(List<Drawable> objects) {
        this.objects = objects;
    }

    /**
     * La función devuelve una lista de objetos dibujables.
     * 
     * @return Se devuelve una lista de objetos dibujables.
     */
    public List<Drawable> getObjects() {
        return objects;
    }  
}
