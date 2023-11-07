package Exercise1;
import java.util.List;
import java.util.Arrays;

/**
 * La clase Main es la clase principal que ejecuta el programa.
 * @author Karina Urbina 
 */
public class Main {
    public static void main(String[] args) {
        // Crear los objetos geométricos.
        Square square = new Square(9.0);
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Ellipse ellipse = new Ellipse(2.0, 3.0);
        Line line = new Line(10.0);

        // Crear una lista de objetos dibujables.
        Text chistesMalos = new Text(" *** Chistes malos para salvar el semestre *** \n \n"
                                + "¿Qué hace un pez en la universidad? \n - Sacar buenas notas en arquitectura naval. "
                                + "\n¿Qué es un terapeuta? \n - 1024 gigapeutas."
                                + "\n¿Cómo se titula la película de un estudiante de informática? \n - El código Da Vinci."
                                + "\n¿Qué le dice un bit al otro? \n - Nos vemos en el bus. \n \n"
                                + " --- Fin de los chistes malos XD ---");

        Text datosCuriosos = new Text(" *** Datos curiosos *** \n \n"
                                + "- El primer ordenador del mundo fue el ENIAC, pesaba 30 toneladas y ocupaba 167 metros cuadrados. "
                                + "\n- El primer ratón de ordenador fue inventado por Douglas Engelbart en 1964. "
                                + "\n- El primer virus informático fue creado en 1983 por Fred Cohen. "
                                + "\n- El primer lenguaje de programación fue el Fortran, creado en 1954 por John Backus. "
                                + "\n- El primer ordenador portátil fue creado en 1981 por Adam Osborne. \n \n"
                                + "--- Fin de los datos curiosos ---");

        // Crear un grupo de objetos dibujables
        Group grupoDibujables = new Group(Arrays.asList(chistesMalos, datosCuriosos));

        // Crear una hoja con los objetos dibujables
        Sheet hoja = new Sheet(Arrays.asList(square, circle, rectangle, ellipse, line, grupoDibujables));

        // Crear una lista de hojas
        List<Sheet> hojasDocumento = Arrays.asList(hoja);

        // Crear un documento con las hojas
        Document documento = new Document(hojasDocumento);

        // Acceder y mostrar los elementos del documento
        for (Sheet sheet : documento.getSheets()) {
            for (Drawable object : sheet.getObjects()) {
                if (object instanceof Text) {
                    System.out.println("Texto: " + ((Text) object).getText());
                } else if (object instanceof Circle) {
                    System.out.println("Círculo con radio: " + ((Circle) object).getRadius());
                } else if (object instanceof Rectangle) {
                    System.out.println("\nRectángulo con lados: " + ((Rectangle) object).getHeight() + " y " + ((Rectangle) object).getWidth());
                } else if (object instanceof Ellipse) {
                    System.out.println("\nElipse con semiejes: " + ((Ellipse) object).getMajorAxis() + " y " + ((Ellipse) object).getMinorAxis());
                } else if (object instanceof Line) {
                    System.out.println("\nLínea con longitud: " + ((Line) object).getLength());
                } else if (object instanceof Square) {
                    System.out.println("\nCuadrado con lado: " + ((Square) object).getSideLength());
                } else if (object instanceof Group) {
                    System.out.println("\nGrupo de objetos:");
                    for (Drawable innerObject : ((Group) object).getObjects()) {
                        if (innerObject instanceof Text) {
                            System.out.println("\nTexto: " + ((Text) innerObject).getText());
                        }
                    }
                }
            }
        }
    }
}
