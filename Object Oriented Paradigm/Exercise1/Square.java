package Exercise1;

/**
 * La clase Cuadrado representa una forma cuadrada con una longitud de lado determinada.
 * 
 * @author Karina Urbina 
 */
public class Square extends GeometricObject {
    
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * La función devuelve la longitud del lado de un objeto.
     * 
     * @return El método devuelve el valor de la variable "sideLength" como doble.
     */
    public double getSideLength() {
        return sideLength;
    }
}
