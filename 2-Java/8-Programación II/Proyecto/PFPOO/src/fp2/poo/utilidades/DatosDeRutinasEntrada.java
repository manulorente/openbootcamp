package fp2.poo.utilidades;


import fp2.poo.utilidades.IteracionRutinas;

import fp2.poo.pfpoomanloralm.RutinaDeEntrenamiento;

import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion; 

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Clase de Datos de turinas de entrada que lee de la 
 * linea de comandos el fichero con las rutinas de entrenamiento
 * a asignar para cada cliente del gimnasio.
 *
 * @author Manuel Lorente Alman
 * @version 1.0 Mayo 2013
 */
public class DatosDeRutinasEntrada implements IteracionRutinas {
 
    private BufferedReader        in       = null;
    private String                ruta     = "./datos/";
    private RutinaDeEntrenamiento rutina   = null;
    /**
     * Constructor de DatosDeRutinasEntrada.
     *
     * @param nombreDelFichero del tipo String
     * @throws OperacionNopermitidaExcepcion si hay error con el fichero
     */
    public DatosDeRutinasEntrada (String nombreDelFichero) throws OperacionNoPermitidaExcepcion {
        try{
            in = new BufferedReader (new InputStreamReader(
                                 new FileInputStream(ruta + nombreDelFichero)));
        } catch (FileNotFoundException e) {
            throw new OperacionNoPermitidaExcepcion("Error en apertura de fichero");
        }
    }    

    public RutinaDeEntrenamientoInterfaz siguienteRutina( ) throws OperacionNoPermitidaExcepcion {
        if ( rutina == null )
            throw new OperacionNoPermitidaExcepcion();
        RutinaDeEntrenamiento local  = rutina;
        rutina  = null;
        return local;
    }

    public boolean haySiguienteRutina() {
        String                linea           = null;
        String                idEntrenamiento = null;
        String                descripcion     = null;
        int                   frecuencia      = -1;
        int                   tiempo          = -1;
        boolean               lecturaInvalida = false;
        boolean               finLectura      = false;

        
        rutina  = null;
        while((finLectura  == false) && ( rutina == null)) {
            lecturaInvalida = false;
           
            try{
                idEntrenamiento =                    (in.readLine()).trim(); 
                descripcion     =                    (in.readLine()).trim(); 
                frecuencia      = Integer.parseInt ( (in.readLine()).trim()); 
                tiempo          = Integer.parseInt ( (in.readLine()).trim()); 
                linea           =                    (in.readLine()).trim();    
                rutina = new RutinaDeEntrenamiento ( idEntrenamiento,
                                                     descripcion,
                                                     frecuencia,
                                                     tiempo);                                                   
           } catch ( IOException e ) {
                finLectura  = true;
                rutina  = null;
           } catch (Exception e) {
                finLectura  = true;
                rutina  = null;
           }
       }
       return (( rutina  == null) ? false : true );
    }
}



