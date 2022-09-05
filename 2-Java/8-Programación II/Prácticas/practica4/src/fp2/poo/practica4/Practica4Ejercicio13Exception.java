/*
 *  @(#)Practica4Ejercicio13Exception.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

package fp2.poo.practica4;

import java.lang.Exception;

/**
 * Descripcion: Implementacion de una Excepcion.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
public class Practica4Ejercicio13Exception extends Exception{

    /** 
      * Este atributo estatico se incluye para evitar el warning con la opcion -Xlint 
      * Es necesario ya que la clase Exception es serializable 
      * (este tema no se ve en practica).
      */
    public static final long serialVersionUID = 24362462L;

    private int detalle;
	
    public Practica4Ejercicio13Exception(int a){
		detalle = a;
    }

    public String toString(){
        return "Practica4Ejercicio13Exception[" + detalle + "]";
    }
}



