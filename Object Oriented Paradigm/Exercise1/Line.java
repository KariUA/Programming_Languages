package Exercise1;

/**
 * La clase Línea representa una línea geométrica con una longitud determinada.
 * @author Karina Urbina 
 */
public class Line extends GeometricObject{
    
    private double length;

    public Line(double length) {
        this.length = length;
    }

    /**
     * La función devuelve la longitud.
     * 
     * @return El método devuelve el valor de la variable "longitud" como doble.
     */
    public double getLength() {
        return length;
    }
}
