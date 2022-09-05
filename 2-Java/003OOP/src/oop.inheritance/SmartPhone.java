package oop.inheritance;

public class SmartPhone extends SmartDevice {
    // Properties
    private String os;
    private boolean camera;
    private boolean internet;
    private boolean bluetooth;
    private double price;

    // Constructors
    public SmartPhone() {
        super();
        this.os = "";
        this.camera = false;
        this.internet = false;
        this.bluetooth = false;
        this.price = 0;
    }
    public SmartPhone(String brand, String model, String color, int batteryCapacity, String os, boolean camera, boolean internet, boolean bluetooth, double price) {
        super(brand, model, color, batteryCapacity);
        this.os = os;
        this.camera = camera;
        this.internet = internet;
        this.bluetooth = bluetooth;
        this.price = price;
    }

    // Methods
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public boolean isCamera() {
        return camera;
    }
    public void setCamera(boolean camera) {
        this.camera = camera;
    }
    public boolean isInternet() {
        return internet;
    }
    public void setInternet(boolean internet) {
        this.internet = internet;
    }
    public boolean isBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return super.toString() + "\nOS: " + getOs() + "\nCamera: " + isCamera() + "\nInternet: " + isInternet() + "\nBluetooth: " + isBluetooth() + "\nPrice: " + getPrice();
    }
}
