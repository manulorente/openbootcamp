
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.DomicilioInterfaz;
/**
 * Clase de domicilio con la direccion postal
 * de un cliente
 * @author Manuel Lorente Alman
 * @version 1.0
 */
public class Domicilio implements DomicilioInterfaz
{
    private String nombreDomicilio;
    /**
     * Constructor de Domicilio
     *
     * @param cadena con domicilio de tipo String
     */
    public Domicilio(String cadena)
    {
	setDomicilio(cadena);
    }
    /*
     * Hereda informacion de documentacion
     */
    public String getDomicilio()
    {
	return this.nombreDomicilio;
    }
    /*
     * Hereda informacion de documentacion
     */
    public void setDomicilio(String nombre)
    {
	nombreDomicilio = nombre;
    }
    
}