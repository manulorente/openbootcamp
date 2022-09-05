/*
 *  @(#)Practica4Ejercicio12.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Declaracion de metodo con throws.
 *              
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
package fp2.poo.practica4;

import java.lang.IllegalAccessException;

public class Practica4Ejercicio12 {

    /*
     * lanza una excepción fuera del método
     */
    static void metodoA () {
        try {
            System.out.println("Dentro de metodoA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("Sentencia finally metodoA");
        }
    }

    /*
     * ejecuta la sentencia return dentro del bloque try
     */
    static void metodoB () {
        try {
            System.out.println("Dentro de metodoB");
            return;
        } finally {
            System.out.println("Sentencia finally metodoB");
        }
    }

    /*   
     * ejecuta un bloque try normalmente
     */
    static void metodoC () {
        try {
            System.out.println("Dentro de metodoC");
        } finally {
            System.out.println("Sentencia finally metodoC");
        }
    }

    public static void main (String args[]){
        try {
            metodoA ();
        } catch ( Exception e ) {
            System.out.println( "Excepción Capturada " + e );
        }
        metodoB ();
        metodoC ();
    }
}


