
package fp2.poo.utilidades.Excepciones;
/**
 * Descripcion: Excepcion que se lanza en el caso de error con los ficheros
 *
 * @version 1.0 Mayo 2013
 * @author Manuel Lorente Alman
 */
public class OperacionNoPermitidaExcepcion extends Exception {

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */
    public static final long serialVersionUID = 24362462L;

    private String str = null;

    public OperacionNoPermitidaExcepcion(  ) {
        this.str = "";
    }  
    
    public OperacionNoPermitidaExcepcion( String str ) {
        this.str = str;
    }  
      public String toString()
    {
	return str;
    }
}
