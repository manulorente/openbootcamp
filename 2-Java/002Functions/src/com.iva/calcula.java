package com.iva;

public class calcula {
        public static void main(String[] args) {
            System.out.print("Enter the price: ");
            double price = read.dataDouble();
            System.out.printf("\nPrice with IVA is %.2f\n", getIVA(price));
    }   
    
    static double getIVA(double price) {
        return price * 1.21;
    }
}
