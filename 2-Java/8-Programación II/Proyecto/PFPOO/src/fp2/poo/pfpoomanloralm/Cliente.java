
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.ClienteInterfaz;

/**
 *  Clase del cliente que contiene los datos
 *  identificativos de un cliente y la rutina
 *  de entrenamiento asociada.
 *
 *  @author Manuel Lorente Almán
 *  @since 22-Mayo-2013
 *  @version 1.0
 */

public class Cliente implements ClienteInterfaz
{
    private DniInterfaz dniCliente;
    private String nombreCliente;
    private TelefonoInterfaz telefonoCliente;
    private DomicilioInterfaz domicilioCliente;
    private CorreoElectronicoInterfaz emailCliente;
    private String entrenamientoCliente;
    
    /**
     * Constructor de Cliente
     * 
     * @param dni de tipo DniInterfaz
     * @param nombre de tipo String
     * @param telefono de tipo TelefonoInterfaz
     * @param domicilio de tipo DomicilioInterfaz
     * @param email de tipo CorreoElectronicoInterfaz
     * @param entrenamiento de tipo String 
     */
    public Cliente( DniInterfaz dni, String nombre, TelefonoInterfaz telefono,
		    DomicilioInterfaz domicilio, CorreoElectronicoInterfaz email, String entrenamiento)
    {
	setDni(dni);
	setNombre(nombre);
	setTelefono(telefono);
	setDomicilio(domicilio);
	setCorreoElectronico(email);
	setEntrenamiento(entrenamiento);
    }
    /*
     * Hereda comentario de documentacion
     */
    public DniInterfaz getDni()
    {
	return dniCliente;
    }
    /*
     * Hereda comentario de documentacion
     */
    public void setDni( DniInterfaz dni)
    {
	dniCliente = dni;
    }
    /*
     * Hereda comentario de documentacion
     */
    public TelefonoInterfaz getTelefono( )
    {
	return telefonoCliente;
    }
    /*
     * Hereda comentario de documentacion
     */
    public void setTelefono( TelefonoInterfaz telf)
    {
	telefonoCliente = telf;
    }
    /*
     * Hereda comentario de documentacion
     */
    public String getNombre()
    {
	return nombreCliente;
    }
    /*
     * Hereda comentario de documentacion
     */
    public void setNombre(String nombre)
    {
	nombreCliente = nombre;
    }
    /*
     * Hereda comentario de documentacion
     */
    public DomicilioInterfaz getDomicilio()
    {
	return domicilioCliente;
    }
    /*
     * Hereda comentario de documentacion
     */
    public void setDomicilio(DomicilioInterfaz domicilio)
    {
	domicilioCliente = domicilio;
    }
    /*
     * Hereda comentario de documentacion
     */
    public CorreoElectronicoInterfaz getCorreoElectronico()
    {
	return emailCliente;
    }
    /*
     * Hereda comentario de documentacion
     */
    public void setCorreoElectronico(CorreoElectronicoInterfaz email)
    {
	emailCliente = email;
    }
    /*
     * Hereda comentario de documentacion
     */
    public String getEntrenamiento()
    {
	return entrenamientoCliente;
    }
    /*
     * Hereda comentario de documentacion
     */
    public void setEntrenamiento(String entrenamiento)
    {
	entrenamientoCliente = entrenamiento;
    }

}
