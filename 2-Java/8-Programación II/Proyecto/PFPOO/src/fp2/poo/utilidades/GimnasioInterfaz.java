
package fp2.poo.utilidades;
import fp2.poo.utilidades.DniInterfaz;
import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz; 
import fp2.poo.utilidades.Excepciones.OperacionNoPermitidaExcepcion;

/**
 * Esta es una clase que representa un gimnasio.
 * Mantiene un conjunto de clientes y rutinas de entrenamiento.
 *
 * @version version 1.0 Mayo 2013
 * @author  Manuel Lorente Alman
 */
public interface GimnasioInterfaz {

    /**
     * Maximo numero de clientes que puede haber en el gimnasio.
     */
    public final static int MAX_NUM_CLIENTES = 1000;

    /**
     * Maximo numero de rutinas de entrenamiento que puede haber en el gimnasio.
     */
    public final static int MAX_NUM_RUTINAS  = 1000;

    /**
     *  Inserta un nuevo cliente, proporcionandolo como parametro.
     *  En el caso de superar el numero maximo de clientes permitidos
     *  o en el caso de que ya exista un cliente con el mismo dni
     *  se lanzara la excepcion OperacionNoPermitidaExcepcion
     * @param cliente de tipo ClienteInterfaz
     * @throws OperacionNoPermitidaExcepcion
     */
    public void insertarCliente(ClienteInterfaz cliente) 
           throws OperacionNoPermitidaExcepcion;

    /**
     *  Inserta una nueva rutina, proporcionandola como parametro.
     *  En el caso de superar el numero maximo de rutinas permitidas
     *  o en el caso de que ya exista una rutina con el mismo identificador
     *  se lanzara la excepcion OperacionNoPermitidaExcepcion
     * @param rut de tipo RutinaDeEntrenamientoInterfaz
     * @throws OperacionNoPermitidaExcepcion
     */
    public void insertarRutinaEntrenamiento(RutinaDeEntrenamientoInterfaz rut) 
           throws OperacionNoPermitidaExcepcion;



    /**
     *  Muestra por la salida estandar (System.out) todos los clientes que hay en el
     *  gimnasio.
     *  El orden de salida de los datos es el siguiente:
     *  DNI, Nombre, Numero de telefono, Domicilio, Correo electrónico 
     *  y además el atributo descripcion de la rutina de entrenamiento de este cliente. 
     *  Cada uno de estos datos debe ir en una linea diferente.
     *  No se inserta ninguna informacion adicional a la especificada.
     */
    public void mostrarClientes();

    public void mostrarRutinas();




} 
