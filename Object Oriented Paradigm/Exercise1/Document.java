package Exercise1;
import java.util.List;

/**
 * La clase Documento representa un documento que contiene una lista de hojas.
 * 
 * @author Karina Urbina 
 */
public class Document {

    private List<Sheet> sheets; // Lista de hojas.

    public Document(List<Sheet> sheets) {
        this.sheets = sheets;
    }

    /**
     * La función devuelve una lista de objetos Hoja.
     * 
     * @return Se devuelve una lista de objetos de hoja.
     */
    public List<Sheet> getSheets() {
        return sheets;
    }    
}
