
package fp2.poo.utilidades;

import  fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;
import  fp2.poo.utilidades.ClienteInterfaz;

/**
 * Descripcion: Esta interfaz proporciona los método para
 *              realizar la lectura de los clientes de un fichero.
 *              
 *      
 *                             
 * @version version 1.0 Mayo 2013
 * @author  Manuel Lorente Alman
 */
public interface IteracionClientes {

    /**
     *  Descripcion: Este metodo devuelve una referencia a ClienteInterfaz.
     *  @return cliente como ClienteInterfaz
     *  @throws OperacionNoPermitidaExcepcion
     */
    public ClienteInterfaz siguienteCliente( ) throws OperacionNoPermitidaExcepcion;

    /**
     *  Descripcion: Este metodo indica si hay otra objeto Cliente.
     *
     *  @return    Devuelve un valor del tipo boolean que indica
     *             si hay más objetos del tipo Cliente.
     */
    public boolean haySiguienteCliente();
}
