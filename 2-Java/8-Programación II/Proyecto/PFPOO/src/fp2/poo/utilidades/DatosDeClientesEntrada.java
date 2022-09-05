package fp2.poo.utilidades;
import fp2.poo.pfpoomanloralm.Cliente; 
import fp2.poo.pfpoomanloralm.CorreoElectronico; 
import fp2.poo.pfpoomanloralm.Dni; 
import fp2.poo.pfpoomanloralm.Domicilio;
import fp2.poo.pfpoomanloralm.Telefono;

import fp2.poo.utilidades.IteracionClientes;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion ;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;

import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;


import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Clase que contiene los datos de clientes de entrada y lee los ficheros
 * que se les proporciona por linea de comandos, comprobando que haya
 * un siguiente cliente.
 *
 * @author Manuel Lorente Alman
 * @version 1.0 Mayo 2013
 *
 */
public class DatosDeClientesEntrada implements IteracionClientes {
 
    private BufferedReader  in      =  null;
    private String          ruta    = "./datos/";
    private ClienteInterfaz cliente =  null;
    /**
     * Constructor de DatosDeClientesEntrada.
     *
     * @param nombreDelFichero de tipo String
     * @throws OperacionNoPermitidaExcepcion si hay error con los ficheros
     */
    public DatosDeClientesEntrada (String nombreDelFichero) throws OperacionNoPermitidaExcepcion {
        try{
            in = new BufferedReader (new InputStreamReader(
                                 new FileInputStream(ruta + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero");
        }
    }    

    public ClienteInterfaz siguienteCliente( ) throws OperacionNoPermitidaExcepcion {
        if ( cliente == null )
            throw new OperacionNoPermitidaExcepcion();
        ClienteInterfaz local  = cliente;
        cliente = null;
        return local;
    }

    public boolean haySiguienteCliente() {
        String                    linea           = null;
        DniInterfaz               dni             = null;
        String                    nombre          = null;
        TelefonoInterfaz          telefono        = null;
        DomicilioInterfaz         domicilio       = null;
        CorreoElectronicoInterfaz eMail           = null;
        String                    idEntrenamiento = null;
        boolean                   lecturaInvalida = false;
        boolean                   finLectura      = false;  

        cliente= null;
        while( (finLectura  == false) && (cliente == null) ) 
	    {
		lecturaInvalida = false;
		try{
		    try {
			linea = in.readLine().trim();  
			dni   = new Dni (linea);
		    } catch ( DniIncorrectoExcepcion e ) {
			System.err.println(e);
			lecturaInvalida = true;
		    }
		    linea   =  in.readLine().trim(); 
		    nombre  =  linea;
		    try {
			linea    = in.readLine().trim();  
			telefono = new Telefono (linea);
		    } catch ( TelefonoIncorrectoExcepcion e ) {
			System.err.println(e);                    
			lecturaInvalida = true;
		    } 
		    linea     = (in.readLine()).trim(); 
		    domicilio = new Domicilio( linea ); 
		    try {
			linea = in. readLine().trim(); 
			eMail       = new CorreoElectronico (linea);
		    } catch ( CorreoElectronicoIncorrectoExcepcion e ) {
			System.err.println(e);
			lecturaInvalida = true;
		    }                                          
		    linea           = in. readLine().trim();  
		    idEntrenamiento = linea;
		    if(lecturaInvalida == false) {   
			cliente = new Cliente ( dni,
						nombre,
						telefono,
						domicilio, 
						eMail, 
						idEntrenamiento);  
		    } else {
			this.cliente      = null;
		    }
		    linea = in. readLine().trim();   /* los 10 simbolos '-' */ 
		} catch ( IOException e ) {
		    finLectura  = true;
		    cliente = null;
		} catch (Exception e) {
		    finLectura  = true;
		    cliente = null;
		}
	
	    }
		
	return ( (cliente == null) ? false : true );
    }
}



