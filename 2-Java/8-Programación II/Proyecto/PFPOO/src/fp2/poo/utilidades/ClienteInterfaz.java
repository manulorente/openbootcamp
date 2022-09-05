
package fp2.poo.utilidades;

import fp2.poo.utilidades.CorreoElectronicoInterfaz;
import fp2.poo.utilidades.DomicilioInterfaz;
import fp2.poo.utilidades.TelefonoInterfaz;
import fp2.poo.utilidades.DniInterfaz;

/**
 * Descripcion: Esta es una clase que representa un cliente. 
 *              
 *
 * @version version 1.0 Mayo 2013
 * @author  Manuel Lorente Alman
 */
public interface ClienteInterfaz {
    /**
     *  Descripcion: Metodo getter del dni
     *  @return devuelve el dni como DniInterfaz          
     */
    public DniInterfaz getDni( );

    /**
     *  Descripcion: Metodo setter de dni.
     *  @param dni de tipo DniInterfaz
     */
    public void setDni( DniInterfaz dni );

    /**
     *  Descripcion: Metodo getter de telefono. 
     *  @return devuelve el telefono como TelefonoInterfaz
     */
    public TelefonoInterfaz getTelefono( );

    /**
     *  Descripcion: Metodo setter de telefono.
     *  @param telf de tipo TelefonoInterfaz
     */
    public void setTelefono( TelefonoInterfaz telf );

    /**
     *  Descripcion: Metodo getter de nombre.   
     *  @return devuelve el nombre como String
     */
    public String getNombre( );

    /**
     *  Descripcion: Metodo setter de nombre.
     *  @param nombre de tipo String
     */
    public void setNombre( String nombre );
    
    /**
     *  Descripcion: Metodo getter de domicilio.
     *  @return devuelve el domicilio como DomicilioInterfaz
     */
    public DomicilioInterfaz getDomicilio( );
    
    /**
     *  Descripcion: Metodo setter de domicilio.
     *  @param domicilio de tipo DomicilioInterfaz
     */
    public void setDomicilio( DomicilioInterfaz domicilio );
    
    /**
     *  Descripcion: Metodo getter de Correo electronico.
     *  @return devuelve el email como CorreoElectronicoInterfaz
     */   
    public CorreoElectronicoInterfaz getCorreoElectronico( );
    
    /**
     *  Descripcion: Metodo setter de Correo electronico. 
     *  @param eMail de tipo CorreoElectronicoInterfaz
     */
    public void setCorreoElectronico( CorreoElectronicoInterfaz eMail );
    
    /**
     *  Descripcion: Metodo getter de entrenamiento.
     *  @return devuelve el entrenamiento como String
     */   
    public String getEntrenamiento( );
    
    /**
     *  Descripcion: Metodo setter de entrenamiento.
     *  @param entrenamiento de tipo String
     */
    public void setEntrenamiento( String entrenamiento );
}
