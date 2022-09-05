
package fp2.poo.pfpoomanloralm;
import fp2.poo.utilidades.RutinaDeEntrenamientoInterfaz;
/**
 * Clase de RutinaDeEntrenamiento que consta de un identificador
 * con el entrenamiento concreto, su descripcion, el numero de
 * veces que realiza esta rutina por semana y el numero de minutos
 * que se dedica en realizar esta rutina de entrenamiento.
 * 
 * @author Manuel Lorente Alman
 * @since 22-Mayo-2013
 * @version 1.0
 */
public class RutinaDeEntrenamiento implements RutinaDeEntrenamientoInterfaz
{
    private String entreno;
    private String descripcionEntreno;
    private int frecuenciaEntreno;
    private int tiempoEntreno;
    
    /**
     * Constructor de RutinaDeEntrenamiento
     * 
     * @param identificador de tipo String
     * @param descripcion de tipo String 
     * @param frecuency de tipo int
     * @param time de tipo int
     */
    
    public RutinaDeEntrenamiento(String identificador, String descripcion,
				 int frecuency, int time)
    {
	setIdEntrenamiento(identificador);
	setDescripcion(descripcion);
	setFrecuencia(frecuency);
	setTiempo(time);
    }
    
    public String getIdEntrenamiento()
    {
	return entreno;
    }
    
    public void setIdEntrenamiento (String id)
    {
	entreno = id;
    }
    
    public String getDescripcion()
    {
	return descripcionEntreno;
    }
    
    public void setDescripcion (String id)
    {
	descripcionEntreno = id;
    }
    
    public int getFrecuencia()
    {
	return frecuenciaEntreno;
    }
    
    public void setFrecuencia( int frecuencia)
    {
	frecuenciaEntreno = frecuencia;
    }

    public int getTiempo()
    {
	return tiempoEntreno;
    }
    
    public void setTiempo( int tiempo)
    {
	tiempoEntreno = tiempo;
    }


}