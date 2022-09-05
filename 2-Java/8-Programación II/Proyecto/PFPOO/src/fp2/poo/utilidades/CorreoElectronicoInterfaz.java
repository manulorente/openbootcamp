
package fp2.poo.utilidades;
import  fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;

/**
 * Descripcion: Esta es una clase que representa un correo electronico.
 *              
 *
 * @version version 1.0 Mayo 2013
 * @author  Manuel Lorente Alman
 */
public interface CorreoElectronicoInterfaz {

    /**
     * Descripcion: Devuelve el valor del correo electronico.
     * @return devuelve email como String
     */
    public String getCorreoElectronico();

    /**
     * Descripcion: Asigna un valor del correo electronico.
     * @param email de tipo String
     * @throws CorreoElectronicoIncorrectoExcepcion si hay un error en el email
     */
    public void setCorreoElectronico(String email) throws CorreoElectronicoIncorrectoExcepcion;


}
