
package fp2.poo.utilidades.Excepciones;
/**
 * Descripcion: Excepcion si el dni es incorrecto
 *
 * @version 1.0 Mayo 2013
 * @author Manuel Lorente Alman
 */

public class DniIncorrectoExcepcion extends Exception{

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */
    public static final long serialVersionUID = 24362463L;

    private String str = null;

    public DniIncorrectoExcepcion() {
    }  

    public DniIncorrectoExcepcion(String str) {
        this.str = str;
    }
  
    public String toString()
    {
	return str;
    }
}
