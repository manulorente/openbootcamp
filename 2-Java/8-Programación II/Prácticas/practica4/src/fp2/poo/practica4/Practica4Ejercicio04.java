/*
 *  @(#)Practica4Ejercicio04.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Error de ejecución acceso a un método con una
 *              referencia nula.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
 
package fp2.poo.practica4;

import java.lang.ArithmeticException;

public class Practica4Ejercicio04 {
    public static void main (String args[]){
        int d, a;

        try {
            d = 0;
            a = 42/d;
            System.out.println("Este codigo nunca se ejecuta");
        } catch ( ArithmeticException e ){ 
            System.out.println( "División por cero." + e );
        }
        System.out.println( "Después de catch." );
    }
}

