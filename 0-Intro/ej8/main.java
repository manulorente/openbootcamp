package Intro.ej8;

public class main {
    public static void main(String[] args) {
        Persona pp = new Persona();
        pp.setNombre("Juan");
        pp.setEdad(20);
        pp.setTelefono("655698456");
        System.out.println("Nombre: " + pp.getNombre() + "\nEdad: " + pp.getEdad() + "\nTelefono: " + pp.getTelefono());
    }
    
}

class Persona {
    // Attributes are private by default and can be accessed only from the class itself through getters and setters
    private int edad;
    private String nombre;
    private String telefono;

    // Default constructor
    public Persona() {
    }
    // Constructor with parameters
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Encapsulation allows to hide the data from the outside world, and only allow the user to access the data through the methods.
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}