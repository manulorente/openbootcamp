package oop.inheritance;

public class SmartWatch extends SmartDevice{
    // Properties
    private String os;
    private double price;

    // Constructors
    public SmartWatch() {
        super();
        this.os = "";
        this.price = 0;
    }
    public SmartWatch(String brand, String model, String color, int batteryCapacity, String os, double price) {
        super(brand, model, color, batteryCapacity);
        this.os = os;
        this.price = price;
    }

    // Methods
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString()
    {
        return super.toString() + "\nOS: " + this.os + "\nPrice: " + this.price;
    }
    
}
