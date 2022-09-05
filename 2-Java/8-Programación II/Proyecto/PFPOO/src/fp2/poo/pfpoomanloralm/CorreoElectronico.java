
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
/**
 *  Clase que contiene la informacion del correo electronico
 *  de un cliente.Comprueba que el formato del correo
 *  electronico sea correcto.
 *
 *  @author Manuel Lorente Almán
 *  @since 22-Mayo-2013
 *  @version  1.0
 */
public class CorreoElectronico implements CorreoElectronicoInterfaz
{
    private String correo;
    /**
     * Constructor de CorreoElectronico
     * @param cadena de tipo String
     * @throws CorreoElectronicoIncorrectoExcepcion si el email es incorrecto
     */
    public CorreoElectronico(String cadena)throws CorreoElectronicoIncorrectoExcepcion
    {
	setCorreoElectronico(cadena);
    }
    /*
     * Hereda comentarios de documentacion
     */
    public String getCorreoElectronico()
    {
	return correo;
    }
    /*
     * Hereda comentarios de documentacion
     */
    public void setCorreoElectronico(String email)throws CorreoElectronicoIncorrectoExcepcion
    {
	int caracter = 0;
	int i = 0;
	
	for( i = 0; i < email.length(); i++)
	 {
	     if ('@' == email.charAt(i))
		 caracter++;
		
		  }
	if (caracter != 1)
	    throw new CorreoElectronicoIncorrectoExcepcion("Correo electronico incorrecto\n");
	else
	    correo = email;
    }
}