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

public class Practica4Ejercicio01 {
    public static void main( String args[] ) {
        int d = 0;
        int a = 42 /d;
        System.out.println( "Este codigo nunca se ejecuta" );
    }
}
