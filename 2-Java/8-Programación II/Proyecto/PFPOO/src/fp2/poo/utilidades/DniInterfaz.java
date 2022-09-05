 
package fp2.poo.utilidades;
import  fp2.poo.utilidades.Excepciones.DniIncorrectoExcepcion;

/**
 *
 * Descripcion: La interfaz Dni mantiene los metodos 
 * para manejar objetos del tipo Dni.
 * @author Manuel Lorente Alman
 * @version 1.0 Mayo 2013
 */
public interface DniInterfaz {

    /**
     * Descripcion: metodo que proporciona un valor 
     *              para configurar  el dni.
     *  @param dni de tipo String
     * @throws DniIncorrectoExcepcion si el dni es incorrecto
     */ 
    public void setDni( String dni ) throws DniIncorrectoExcepcion;

    /**
     * Descripcion: metodo que devuelve como String el dni.
     * @return devuelve el dni como String
     */
    public String getDni();

}
