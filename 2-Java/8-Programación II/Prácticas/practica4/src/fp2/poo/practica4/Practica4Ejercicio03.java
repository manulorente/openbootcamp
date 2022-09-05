/*
 *  @(#)Practica4Ejercicio03.java
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

public class Practica4Ejercicio03 {
    public static void main(String[] args) {
        String str = null;

        str.length();
        System.out.println("Este codigo nunca se ejecuta");
    }
}

