/*
 *  @(#)Practica4Ejercicio06.java
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

import java.util.Random;

public class Practica4Ejercicio06 {
    public static void main (String args[]){
        try {	
            int  a = 0;

            a = args.length;
            System.out.println( "a: " + a );
            int b = 0;
            b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch(ArithmeticException e){ 
            System.out.println( "División por cero. " + e );
        } catch( ArrayIndexOutOfBoundsException e ){ 
            System.out.println( "Indice fuera de limites. " + e );
        }
	    System.out.println( "Después del bloque try/catch. " );
    }
}

