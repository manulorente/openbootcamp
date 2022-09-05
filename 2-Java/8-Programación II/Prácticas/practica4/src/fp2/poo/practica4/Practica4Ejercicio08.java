/*
 *  @(#)Practica4Ejercicio08.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Ejemplo de sentencias try anidadas.
 *              
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
 
package fp2.poo.practica4;

class Practica4Ejercicio08 {
    public static void main (String args[]) {
        try {	
            int  a = args.length;
            /*
             * Si no hay ningún argumento en la línea de comandos
             * la siguiente sentencia genera un excepción. Div por 0
             */
            int b = 42/a;
            System.out.println( "a = " + a );

            try { 
                /* 
                 * bloque try anidado.
                 *
                 * Si se utiliza un argumento en la línea de comandos,
                 * la siguiente sentencia genera una excepc. Div. 0
                 */
                if (a == 1 ) 
                    a = a / ( a - a );
                /*
                 * Si se le pasan dos argumento en Linea de Comandos
                 */
                if ( a == 2 ) {
                    int c[] = { 1 };
                    c[42] = 99; //genera excep. fuera de limites
                }
            } catch ( ArrayIndexOutOfBoundsException e ) { 
                System.out.println("Índice fuera de limites. " + e);
            }		
        } catch ( ArithmeticException e ){ 
            System.out.println( "División por cero: " + e );
        }
    }
}

