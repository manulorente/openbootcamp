/*
 *  Fichero: EjemploMatriz.java
 *
 *  Fundamentos de Programaci¢n II. GITT.
 *  Departamento de Ingenier¡a Telem tica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.matrices;

/**
 * Descripci¢n: Esta es una clase de ejemplo para utilizar
 *              una matriz en Java.
 *
 * @version versi¢n 1.0 Abril 2011
 * @author  Fundamentos de Programaci¢n II
 */
public class EjemploMatriz {

    /*
     *  Descripci¢n: M‚todo main que declara una variable matriz,
     *               realiza la instanciaci¢n y accede a sus elementos.
     */
    public static void main(String args[ ]) {
        int diasDelMes [] = null;

        diasDelMes = new int [12];
        diasDelMes [0]=31;
        diasDelMes [1]=28;
        diasDelMes [2]=31;
        diasDelMes [3]=30;
        diasDelMes [4]=31;
        diasDelMes [5]=30;
        diasDelMes [6]=31;
        diasDelMes [7]=31;
        diasDelMes [8]=30;
        diasDelMes [9]=31;
        diasDelMes [10]=30;
        diasDelMes [11]=31;
        System.out.println("Abril tiene "+ diasDelMes [3]+" dias ");
}
}