/*
 *  @(#)Practica4Ejercicio02.java
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

public class Practica4Ejercicio02 {

    static void metodo() {
        int d = 0;
        int a = 10/d;

        System.out.println("Este codigo nunca se ejecuta");
    }

    public static void main ( String args[] ) {
        Practica4Ejercicio02.metodo();

        System.out.println( "Este codigo nunca se ejecuta" );
    }
}

