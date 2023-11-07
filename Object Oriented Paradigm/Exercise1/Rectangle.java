package Exercise1;

/**
 * La clase Rectángulo representa un rectángulo geométrico con un ancho y alto específicos.
 * 
 * @author Karina Urbina 
 */
public class Rectangle extends GeometricObject {

    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * La función getWidth() devuelve el ancho de un objeto.
     * 
     * @return El método devuelve el valor de la variable "ancho" como doble.
     */
    public double getWidth() {
        return width;
    }

    /**
     * La función getHeight() devuelve el valor de altura.
     * 
     * @return El método devuelve el valor de la variable "altura" como doble.
     */
    public double getHeight() {
        return height;
    }
    
}
