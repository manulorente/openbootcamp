/*
 *  @(#)Practica4Ejercicio07.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Error de division por cero e indice fuera
 *              de limites.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
 
package fp2.poo.practica4;

/**
 *  Este programa contiene un error
 *  Una subclase debe estar antes que su superclase
 *  en una serie de sentencias catch. Si no es así,
 *  existirá código que no es alcanzable y se producirá
 *  un error en tiempo de compilación.
 */
public class Practica4Ejercicio07 {
    public static void main (String args[]){
        try {	
            int  a = 0;
            int  b = 42/a;
            System.out.println("Este codigo nunca se ejecuta");
        } catch ( ArithmeticException e ){	
            System.out.println( "Se alcanzó ¡¡¡VICTORIA!!!!" );
        }	
	catch ( Exception e ){ 
	    System.out.println("Sentencia catch para cualquier excepcion " + e);
	}
    }
}
