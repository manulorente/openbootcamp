package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("Apple", "iPhone X", "black", 3000, "iOS", true, true, true, 1300);
        SmartWatch s2 = new SmartWatch("Apple", "Watch", "black", 3000, "iOS", 1200);
        System.out.println(s1.toString());
        System.out.println();
        System.out.println(s2.toString());
    }    
}
