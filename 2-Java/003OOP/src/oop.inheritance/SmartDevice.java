package oop.inheritance;

public class SmartDevice {

    // Properties
    private String brand;
    private String model;
    private String color;
    private int batteryCapacity;

    // Constructors
    public SmartDevice() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.batteryCapacity = 0;
    }
    public SmartDevice(String brand, String model, String color, int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.batteryCapacity = batteryCapacity;
    }

    // Methods
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public String toString(){
        return "Brand: " + this.brand + "\nModel: " + this.model + "\nColor: " + this.color + "\nBattery capacity: " + this.batteryCapacity;
    }
}