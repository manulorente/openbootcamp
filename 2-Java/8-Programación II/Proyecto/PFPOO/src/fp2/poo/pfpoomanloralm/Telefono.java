
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
/**
 *  Clase de Telefono del cliente que en el caso de que el telefono
 *  sea incorrecto lanza la excepcion correspondiente.
 *
 *  @author Manuel Lorente Alman
 *  @since 22-Mayo-2013
 *  @version 1.0
 */

public class Telefono implements TelefonoInterfaz
{
    private String t;
    /**
     * Constructor de Telefono
     * @param b de tipo String
     * @throws TelefonoIncorrectoExcepcion 
     */
    public Telefono(String b)throws TelefonoIncorrectoExcepcion
    {
	setTelefono(b);

    }
    
    public String getTelefono()
    {
	return this.t;
    }
    
    public void setTelefono( String t)throws TelefonoIncorrectoExcepcion
    {
	int control = 0;
	int i = 0;

	if (t.length() != 9)
	    control = 1;
	for ( i = 0; i < t.length();i++)
	    {
		if(!Character.isDigit(t.charAt(i)))
		    control = 1;
	    }
	if (control == 1)
	    throw new TelefonoIncorrectoExcepcion("Telefono incorrecto\n");
	else
	    this.t = t;
    }
}