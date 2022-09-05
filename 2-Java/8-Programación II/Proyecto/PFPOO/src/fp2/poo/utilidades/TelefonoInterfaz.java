
package fp2.poo.utilidades;
import  fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
/**
 * Interface de Telefono con su respectiva excepcion
 * si hay un error.
 *
 * @author Manuel Lorente Alman
 * @version 1.0 Mayo 2013
 */
public interface TelefonoInterfaz{

    /**
     * Descripcion: Devuelve el valor del telefono.
     * @return telefono como String
     */
    public String getTelefono();

    /**
     * Descripcion: Asigna un valor del telefono.
     * @param t de tipo String
     * @throws TelefonoIncorrectoExcepcion si hay error en el telefono
     */
    public void setTelefono( String t )  throws TelefonoIncorrectoExcepcion ;


}
