package Exercise1;

/**
 * La clase Ellipse representa una forma de elipse con un eje menor y un eje mayor.
 * 
 * @author Karina Urbina 
 */
public class Ellipse extends GeometricObject {

    private double minorAxis;
    private double majorAxis;

    public Ellipse(double minorAxis, double majorAxis) {
        this.minorAxis = minorAxis;
        this.majorAxis = majorAxis;
    }

    /**
     * La función devuelve el valor del eje menor.
     * 
     * @return El método devuelve el valor de la variable "minorAxis", que es de tipo doble.
     */
    public double getMinorAxis() {
        return minorAxis;
    }

    /**
     * La función devuelve el valor del eje mayor.
     * 
     * @return El método devuelve el valor de la variable "majorAxis", que es de tipo doble.
     */
    public double getMajorAxis() {
        return majorAxis;
    }
}


