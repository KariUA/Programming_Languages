package Exercise1;

/**
 * La clase Círculo representa un círculo geométrico con un radio determinado.
 * 
 * @author Karina Urbina 
 */
public class Circle extends GeometricObject {

    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * La función getRadius() devuelve el valor del radio.
     * 
     * @return El método devuelve el valor de la variable de radio.
     */
    public double getRadius() {
        return this.radius;
    }

}
