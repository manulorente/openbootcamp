/*
 *  @(#)Practica4Ejercicio01.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Error de ejecución. Division por cero.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica4;

import java.lang.Exception;
import fp2.poo.practica4.Practica4Ejercicio13Exception;

public class Practica4Ejercicio13Main {

    static void calcula (int a) throws Practica4Ejercicio13Exception {
        System.out.println("Ejecuta calcula (" + a + ")" );
        if ( a > 10 )
            throw new Practica4Ejercicio13Exception(a);
        System.out.println("Finalizacion normal");
    }

    public static void main (String args[]){
        try {
            calcula (1);
            calcula (20);
        } catch ( Practica4Ejercicio13Exception e ){
            System.out.println( "Excepción Capturada " + e );
        }
    }
}




