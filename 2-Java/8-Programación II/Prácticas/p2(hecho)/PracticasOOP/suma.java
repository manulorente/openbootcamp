import java.util.Scanner;

public class suma {

   // método main que inicia la ejecución
   public static void main( String args[] ) {

      // crear un Scanner para obtener la entrada desde la ventana de comandos
        Scanner entrada = new Scanner( System.in );

      int numero1; // el primer operando
      int numero2; // el segundo operando
      int suma;    // suma del numero1 y numero2

      System.out.print( "Ingresar el primer entero: " ); // indicador
      numero1 = entrada.nextInt();  // leer el primer número del usuario

      System.out.print( "Ingresar el segundo entero: " ); // indicador
      numero2 = entrada.nextInt();  // leer el segundo número del usuario

      suma = numero1 + numero2;     // agregar los números

      System.out.printf( "La suma de %d y %d es %d\n", numero1, numero2, suma );

   }  // fin del método main

}  // fin de la clase suma
