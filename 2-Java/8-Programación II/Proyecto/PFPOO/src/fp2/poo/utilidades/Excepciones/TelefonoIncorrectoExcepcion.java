
package fp2.poo.utilidades.Excepciones;
/**
 * Descripcion: Excepcion que se lanza en caso de error en el formato
 * del telefono
 *
 * @version 1.0 Mayo 2013
 * @author Manuel Lorente Alman
 */
public class TelefonoIncorrectoExcepcion extends Exception {

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */
    public static final long serialVersionUID = 24362461L;

    private String descripcion;

    public TelefonoIncorrectoExcepcion() {
    }

    public TelefonoIncorrectoExcepcion( String descripcion ) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return descripcion;
    }
}
