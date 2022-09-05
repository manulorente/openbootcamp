
package fp2.poo.utilidades;


/**
 * Descripcion: Clase que describe los componentes de una
 *              rutina de entrenamiento.      
 *
 * @version version 1.0 Mayo 2013
 * @author  Manuel Lorente Alman
 */
public interface RutinaDeEntrenamientoInterfaz {
    
    /**
     *  Descripcion: Metodo getter del id de entrenamiento.
     * @return entrenamiento como String
     */
    public String getIdEntrenamiento ();

    /**
     *  Descripcion: Metodo setter del id de entrenamiento.
     *  @param id de tipo String
     */
    public void setIdEntrenamiento (String id);

    /**
     *  Descripcion: Metodo getter de la descripcion.
     * @return descripcion como String
     */
    public String getDescripcion ();

    /**
     *  Descripcion: Metodo setter de la descripcion.
     *  @param id de tipo String
     */
    public void setDescripcion (String id);

    /**
     *  Descripcion: Metodo getter de la frecuencia.
     * @return frecuencia como int
     */
    public int getFrecuencia ();

    /**
     *  Descripcion: Metodo setter de la frecuencia.
     *  @param frecuencia de tipo int
     */
    public void setFrecuencia( int frecuencia );

    /**
     *  Descripcion: Metodo getter de la tiempo.
     *  @return tiempo como int
     */
    public int getTiempo ();

    /**
     *  Descripcion: Metodo setter de la tiempo.
     *  @param tiempo de tipo int
     */
    public void setTiempo( int tiempo );


}
