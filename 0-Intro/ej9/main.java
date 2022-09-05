package Intro.ej9;

public class main {

    public static void main(String[] args) {
        Persona pp = new Persona();
        pp.setNombre("Juan");
        pp.setEdad(20);
        pp.setTelefono("655698456");
        System.out.println("Nombre: " + pp.getNombre() + "\nEdad: " + pp.getEdad() + "\nTelefono: " + pp.getTelefono());

        System.out.println("");

        Cliente c = new Cliente();
        c.setNombre("Paco");
        c.setEdad(25);
        c.setTelefono("656982233");
        c.setCredito(1200);
        System.out.println("Nombre: " + c.getNombre() + "\nEdad: " + c.getEdad() + "\nTelefono: " + c.getTelefono() + "\nCredito: " + c.getCredito());

        System.out.println("");

        Trabajador t = new Trabajador(28, "Andres", "621147741");
        t.setSalario(36500);
        System.out.println("Nombre: " + t.getNombre() + "\nEdad: " + t.getEdad() + "\nTelefono: " + t.getTelefono() + "\nSalario: " + t.getSalario());
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

class Cliente extends Persona {
    private float credito;
    
    public Cliente() {
    }
    public Cliente(int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }
  
    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private float salario;
    
    public Trabajador() {
    }
    public Trabajador(int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
}