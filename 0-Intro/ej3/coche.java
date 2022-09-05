package Intro.ej3;

public class coche {
    int number_of_doors;

    public static void main(String[] args) {
        // Create new car object and set number of doors
        coche miCoche = new coche();
        miCoche.number_of_doors = 3;
        // Increment the number of doors
        miCoche.inc();
        miCoche.inc();
        // Print the sum of them
        System.out.println("miCoche tiene " + miCoche.number_of_doors+ " puertas");
    }

    // Function to increment the number of doors
    public void inc() {
        this.number_of_doors++;
    }

}