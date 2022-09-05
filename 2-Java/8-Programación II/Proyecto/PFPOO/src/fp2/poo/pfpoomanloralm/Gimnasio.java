
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz; 
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.GimnasioInterfaz;
import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.DatosDeRutinasEntrada;
import fp2.poo.utilidades.DatosDeClientesEntrada;

/**
 * Esta es una clase que representa un gimnasio.
 * Mantiene un conjunto de clientes y rutinas de entrenamiento.
 *
 * @author Manuel Lorente Alman
 * @since 22-Mayo-2013
 * @version 1.0
 */
public class Gimnasio implements GimnasioInterfaz 
{
    private RutinaDeEntrenamientoInterfaz matrizRutinasEntrenamiento [] = null;
    private ClienteInterfaz matrizClientes [] = null;
    private int numeroRutinasEntrenamientoUsados = 0;
    private int numeroClientesUsados = 0;
    /**
     * Constructor de Gimnasio
     * @param ficheroRutinas de tipo String
     * @param ficheroClientes de tipo String
     * @throws OperacionNoPermitidaExcepcion si hay error en parámetros de entrada
     */
    public Gimnasio ( String ficheroRutinas, String ficheroClientes )
	throws OperacionNoPermitidaExcepcion 
    {
	this.matrizClientes = new ClienteInterfaz[MAX_NUM_CLIENTES];
	this.matrizRutinasEntrenamiento = new RutinaDeEntrenamientoInterfaz[MAX_NUM_RUTINAS];
	
	DatosDeRutinasEntrada rut = null;
	 
	try {
	    
	    rut = new DatosDeRutinasEntrada(ficheroRutinas);
	    
	    while(rut.haySiguienteRutina()) 
		{
		    RutinaDeEntrenamientoInterfaz rutina = rut.siguienteRutina();
		    this.insertarRutinaEntrenamiento ( rutina );
		}
	} catch (OperacionNoPermitidaExcepcion e) {
	    System.err.println("Error en la lectura de rutina");
	}
	
	DatosDeClientesEntrada cli = null;
	
	try {
	    
	    cli = new DatosDeClientesEntrada(ficheroClientes);
	    
	    while( cli.haySiguienteCliente()) 
		{
		    ClienteInterfaz cliente = cli.siguienteCliente();
		    this.insertarCliente ( cliente );
		}
	} catch (OperacionNoPermitidaExcepcion e) {
	    System.err.println(e);
	}
    }
    
    public void insertarCliente(ClienteInterfaz cliente) throws OperacionNoPermitidaExcepcion
    {
	
	int control = 0;
	try {
	    if (numeroClientesUsados == MAX_NUM_CLIENTES)
		throw new OperacionNoPermitidaExcepcion("Lista de cliente llena\n");
	    else
		{
		    for (int i = 0; i < numeroClientesUsados; i++)
			{
			    if (matrizClientes[i].getDni().getDni().equals(cliente.getDni().getDni()))
				control++;
			}
		    if (control != 0)
			throw new OperacionNoPermitidaExcepcion("Cliente ya registrado\n");
		    else
			{
			    matrizClientes[numeroClientesUsados] = cliente;
			    numeroClientesUsados++;
			}
		    
		}
	}catch(OperacionNoPermitidaExcepcion e)
	    {
		System.err.println(e);
	    }
    }
    public void insertarRutinaEntrenamiento(RutinaDeEntrenamientoInterfaz rut) 
	throws OperacionNoPermitidaExcepcion
    {
	try {
	    int control = 0;
	    if (numeroRutinasEntrenamientoUsados == MAX_NUM_RUTINAS)
		throw new OperacionNoPermitidaExcepcion("Lista de rutinas llena\n");
	    else
		{
		for (int j = 0; j < numeroRutinasEntrenamientoUsados; j++)
		    {
			if(matrizRutinasEntrenamiento[j].getIdEntrenamiento().equals(rut.getIdEntrenamiento()))
			    control++;
		    }
		if (control != 0)
		    throw new OperacionNoPermitidaExcepcion("Rutina de entrenamiento ya registrada\n");
		else
		    {
			matrizRutinasEntrenamiento[numeroRutinasEntrenamientoUsados] = rut;
			numeroRutinasEntrenamientoUsados++;
		    }
		}
	}catch(OperacionNoPermitidaExcepcion e)
	    {
		System.out.println("Error con rutina de entrenamiento llena o registrada");
	    }
    }
    
    

    public void mostrarClientes()
    {
	for (int i = 0; i< numeroClientesUsados; i++)
	    {
		System.out.println(matrizClientes[i].getDni().getDni());
		System.out.println(matrizClientes[i].getNombre());
		System.out.println(matrizClientes[i].getTelefono().getTelefono());
		System.out.println(matrizClientes[i].getDomicilio().getDomicilio());
		System.out.println(matrizClientes[i].getCorreoElectronico().getCorreoElectronico());
		System.out.println(matrizClientes[i].getEntrenamiento());
		System.out.println(" ");
	    }
    }

    public void mostrarRutinas()
    {
	for (int i = 0; i< numeroRutinasEntrenamientoUsados; i++)
	    {
		System.out.println(matrizRutinasEntrenamiento[i].getIdEntrenamiento());
		System.out.println(matrizRutinasEntrenamiento[i].getDescripcion());
		System.out.println(matrizRutinasEntrenamiento[i].getFrecuencia());
		System.out.println(matrizRutinasEntrenamiento[i].getTiempo());
			System.out.println(" ");
	    }
    }
    
    
}
