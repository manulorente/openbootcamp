
package fp2.poo.utilidades;
import  fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import  fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;

/**
 * Descripcion: Esta interfaz proporciona los método para
 *              realizar la lectura de las rutinas de un fichero.
 *              
 *
 *              
 *                             
 * @version version 1.0 Mayo 2013
 * @author Manuel Lorente Alman
 */
public interface IteracionRutinas {

    /**
     *  Descripcion: Este metodo devuelve una referencia a RutinaDeEntrenamientoInterfaz.
     *  @return rutina como RutinaDeEntrenamientoInterfaz
     *  @throws OperacionNoPermitidaExcepcion
     */
    public RutinaDeEntrenamientoInterfaz siguienteRutina( ) throws OperacionNoPermitidaExcepcion;

    /**
     *  Descripcion: Este metodo indica si hay otro objeto RutinaDeEntrenamiento.
     *
     *  @return    Devuelve un valor del tipo boolean que indica
     *             si hay más objetos del tipo RutinaDeEntrenamiento.
     */
    public boolean haySiguienteRutina();
}
