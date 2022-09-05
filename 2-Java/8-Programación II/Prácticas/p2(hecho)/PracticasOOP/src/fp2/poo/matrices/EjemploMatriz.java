/*
 *  Fichero: EjemploMatriz.java
 *
 *  Fundamentos de Programaci｢n II. GITT.
 *  Departamento de Ingenier｡a Telemtica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.matrices;

/**
 * Descripci｢n: Esta es una clase de ejemplo para utilizar
 *              una matriz en Java.
 *
 * @version versi｢n 1.0 Abril 2011
 * @author  Fundamentos de Programaci｢n II
 */
public class EjemploMatriz {

    /*
     *  Descripci｢n: MＵodo main que declara una variable matriz,
     *               realiza la instanciaci｢n y accede a sus elementos.
     */
    public static void main(String args[ ])
    {	
        int diasDelMes [] = {31,28,31,30,31,30,31,31,30,31,30,31};
	System.out.println("Diciembre tiene "+ diasDelMes[11]+" dias ");
	System.out.println("Enero tiene "+ diasDelMes [0]+" dias ");
    }
}
