package Exercise1;

/**
 * La clase Texto representa un objeto dibujable que contiene un valor de texto.
 * 
 * @author Karina Urbina 
 */
public class Text extends Drawable {
    private String text;

    public Text(String text) {

        this.text = text;
    }

    /**
     * La función getText() devuelve el valor de la variable de texto.
     * 
     * @return El método devuelve un valor de cadena.
     */
    public String getText() {
        return text;
    }
}
