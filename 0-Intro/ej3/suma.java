package Intro.ej3;

public class suma {
    public static void main(String[] args) {
        // Ask for input numbers
        System.out.print("Introduce the first number: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce the second number: ");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce the third number: ");
        int num3 = Integer.parseInt(System.console().readLine());
        // Print the sum of them
        System.out.println("The sum is: " + add(num1, num2, num3));
    }

    // Function to add three numbers an return the sum
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}