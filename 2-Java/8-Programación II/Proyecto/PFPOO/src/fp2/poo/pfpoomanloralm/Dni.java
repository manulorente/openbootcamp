
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;

/**
 *  Clase que contiene la informacion del dni de un cliente
 *  y comprueba que el dni sea correcto.
 *
 *  @author Manuel Lorente Almán
 *  @since 22-Mayo-2013
 *  @version  1.0
 */
public class Dni implements DniInterfaz
{
    
    private String dni;
    /**
     * Constructor de Dni
     * @param a de tipo String
     */
    public Dni(String a)throws DniIncorrectoExcepcion
    {
	setDni(a);	
    }
    /*
     * Hereda informacion de la documentacion
     */
    public String getDni()
    {
	return this.dni;
    }
    /*
     *Hereda informacion de la documentacion
     */
    public void setDni( String dni)throws DniIncorrectoExcepcion
    {
	
	int control = 0 ;
	int i = 0;
	
	if (dni.length() != 9)
	    control = 1;
	for(i = 0; i < (dni.length()-1); i++)
	    { 

		if(Character.isDigit(dni.charAt(i))== false)
		    control = 1;
		
				   
	    }
	if (Character.isLetter(dni.charAt(i))== false)
	    control = 1;
	if (control != 0)
	    throw new DniIncorrectoExcepcion("Dni incorrecto\n");
	else
	    this.dni = dni;
    }

}
