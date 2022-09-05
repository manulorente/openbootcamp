/*
 *  Fichero: Calculadora.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.practica1;

import java.lang.*;


/**
 * Descripcion: Esta una clase es un ejemplo de implementacion y uso  
 *              de los metodos de una clase.
 *              
 *
 * @version version 1.0 Abril 2011
 * @author  Fundamentos de Programacion II
 */
public class Calculadora {

    /** Atributo privado donde se almacena los resultados obtenidos. */
    private int memoria ;

    /**
     *  Constructor de la clase Calculadora.
     *
     *  Parametros: No hay par metros.
     */
    public Calculadora() {
        this.memoria = 0; 
    }

    /**
     *  Descripcion: Este metodo realiza la suma de los dos parametros 
     *               proporcionados.
     *
     */
    public int suma( int param1 , int param2 ) {
        int resultado = 0; // Almacena el resultado de la suma .
 
        resultado = param1 + param2 ; 
        this.memoria = resultado ;   /* Se almacena en memoria.*/
        return resultado ;
    }

    /**
     *  Descripcion: Este metodo realiza la suma del valor
     *               proporcionado como par metros con el valor
     *               almacenado en memoria.
     */
    public int suma( int param ) {
        int resultado = 0; 

        resultado = param + this.getMemoria(); 
        this.memoria = resultado ; /* Lo almacenamos en memoria. */
        return resultado ;
    }

    /**
     *  Descripcion: Este metodo realiza la division de dos valores
     *               proporcionados como par metros.
     *
     */
    public int divide( int param1 , int param2 ) {
        int resultado = 0; // Almacena el resultado de la division.

        resultado = param1 / param2 ; 
        this.memoria = resultado ; /* Lo almacenamos en memoria. */
        return resultado ;
    }

    /**
     *  Descripcion: Este metodo calcula el factorial de un numero.
     *
     */
    public int factorial( int param ) {
        int resultado = 1; 

        for (int i = param; i > 0; i -- ){
            resultado = resultado * i;
        }
        return resultado;
    }

    /**
     *  Descripcion: Este metodo devuelve el valor almacenado en 
     *               memoria.
     */
    public int getMemoria() {
        return this.memoria;
    }
}
