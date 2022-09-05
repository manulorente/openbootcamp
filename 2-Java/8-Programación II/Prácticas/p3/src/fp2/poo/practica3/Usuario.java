/*
 *  Fichero: Usuario.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */

//package fp2.poo.practica3;


public class Usuario implements Persona{
    
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String domicilio;
    
    public String getPrimerApellido( ){
	return this.apellido1;
    }
    
    public void setPrimerApellido(  String primerApellido ){
	this.apellido1 = primerApellido;
	System.out.print(apellido1+" ");
    }
    public String getSegundoApellido( ){
	return this.apellido2;
    }
    public void setSegundoApellido( String segundoApellido ){
	this.apellido2 = segundoApellido;
	System.out.println(apellido2);
    }
    public String getDNI( ){
	return this.dni;
    }
    
    public void setDNI( String dni ){
	this.dni = dni;
	System.out.println(dni);
    }
    public String getDomicilio( ){
	return this.domicilio;
    }
    public void setDomicilio( String domicilio ){
	this.domicilio = domicilio;
	System.out.println(domicilio);
    }
    public String getNombre( ){
	return this.nombre;
    }

    public void setNombre( String nombre )
    {
	this.nombre = nombre;
	System.out.print(nombre+" ");
    }
    public static void main(String args[])
    {
	Usuario a = new Usuario();
	a.setNombre("Manuel");
	a.setPrimerApellido("Lorente");
	a.setSegundoApellido("Alman");
	a.setDNI("77844874v");
	a.setDomicilio("Plaza Pedro Santos Gomez 11, 1A");
   
    }
   
    
}



