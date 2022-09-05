package Intro.ej4;

public class control {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        int numeroFor = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(numeroFor);
            numeroFor++;
        }

        String estacion = "PRIMAVERA";
        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No se ha encontrado la estacion");
                break;
        }
    }
}
