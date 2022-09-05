package fp2.poo.principal;

import fp2.poo.pfpoomanloralm.Gimnasio;
import  fp2.poo.pfpoomanloralm.Dni;
import  fp2.poo.pfpoomanloralm.Telefono;
import  fp2.poo.pfpoomanloralm.CorreoElectronico;
import  fp2.poo.pfpoomanloralm.Cliente;
import  fp2.poo.pfpoomanloralm.Domicilio;
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.ClienteInterfaz;
import fp2.poo.utilidades.Excepciones.CorreoElectronicoIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;
import fp2.poo.utilidades.Excepciones.TelefonoIncorrectoExcepcion;
/**
 * Clase principal del programa que gestiona el uso de un gimnasio
 * asignadole a cada cliente una rutina de entrenamiento
 *
 * @author Manuel Lorente Alman
 * @since 22-Mayo-2013
 * @version 1.0
 */
class Main {
    public static void main(String args[]) {
        Gimnasio g = null;
	Cliente c = null;
        try {
        
            if ( args.length != 2 ) {
               throw new OperacionNoPermitidaExcepcion("Numero de argumentos incorrecto");
            } else {
            
                g = new Gimnasio( args[0] /* ficheroRutinas  */ ,
                                  args[1] /* ficheroClientes */ ); 
		/*g.mostrarClientes();
		  c = new Cliente( new Dni ("77844874V"),
		  "Manu", new Telefono("954342431"),
		  new Domicilio("mi casa"),
		  new CorreoElectronico("lorentemanuel93@gmail.com"),
		  "Entrenamiento elegido");
		  
		  g.insertarCliente(c);
		  g.mostrarClientes();
		  
		  }
		  } catch (DniIncorrectoExcepcion e){
		  System.out.println("Dni incorrecto o cliente ya registrado");
		  }
		  catch ( CorreoElectronicoIncorrectoExcepcion e){
		  System.out.println("Error en el correo electronico");
		  }
		  catch (TelefonoIncorrectoExcepcion e){
		  System.out.println("Error en el telefono");*/
	    }
	}
	catch ( OperacionNoPermitidaExcepcion e) {
	    System.out.println(e);   
	}
    }   
}

