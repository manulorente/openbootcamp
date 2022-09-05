/*
 *  @(#)Practica4Ejercicio09.java
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

class Practica4Ejercicio09 {
 
    /*
     * Las sentencias try pueden estar implícitamente anidadas
     * a través de llamadas a métodos
     */
    static void metodo (){
        try {
            throw new NullPointerException( "demo" );
        } catch ( NullPointerException e ) { 
            System.out.println( "Captura dentro de demo" + e );
            /*
             * Vuelve a lanzar la excepción capturada 
             */
            throw e;	
	}		
    }

    public static void main (String args[]){
        try {
            metodo();
        } catch ( NullPointerException e ){ 
            System.out.println("Nueva captura: " + e);
        }
    }
}

