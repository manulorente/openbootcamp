/*
 *  Fichero: MatrizBidimensional.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.matrices;

/**
 * Descripcion: Esta clase mantiene una matriz bidimensional.
*
 * @version version 1.0 Abril 2011
 * @author  Fundamentos de Programacion II
 */
public class MatrizBidimensional {

    /** nœmero de filas de la matriz bidimensional */
    private int filas     = 0; 

    /** numero de columnas de la matriz bidimensional */
    private int columnas  = 0; 

    /** la matriz bidimensional */
    private int biDim[][] = null;

    /*
     *  Descripcion: Constructor de la clase.  
     *               Inicializa los valores
     *  @param filas numero de filas de la matriz bidimensional
     *  @param columnas numero de columnas de la matriz bidimensional
     */
    public MatrizBidimensional( int filas, int columnas) {
        this.biDim    = new int[filas][columnas];
        this.filas    = this.biDim.length;
        this.columnas = columnas;
        this.inicializacion();
    }

    /*
     *  Descripcion: Inicializa los valores de la matriz.
     *            
     *  @return Nada.
     */
    private void inicializacion(){
        for (int i = 0, k = 0; i < this.filas ; i++){
            for (int j = 0; j < this.columnas; j++) {
                this.biDim [i][j] = k;
                k++;
            }    
        }
    }

    /*
     *  Descripcion: Muestra el contenido de una matriz.
     *           
     *  @return Nada.
     */
    public void imprimeMatriz() {
        for (int i = 0; i < biDim.length; i++) {
            for (int j = 0; j < this.biDim[i].length; j++){
                System.out.print("\t" + this.biDim[i][j]);
            }
            System.out.println();
        }
    }

    /*
     *  Descripcion: Metodo getter.
     *        
     *  @return Devuelve el numero de filas de la matriz.
     */
    public int getNumFilas(){
        return this.filas;
    }

    /*
     *  Descripcion: Metodo getter.
     *         
     *  @return Devuelve el numero de columnas de la matriz.
     */

    public int getNumColumnas(){
        return this.columnas;
    }
} 

class Bidimensional {
    public static void main(String args[ ]) {
        MatrizBidimensional matriz = new MatrizBidimensional (4, 5);
        matriz.imprimeMatriz();
    }
}
