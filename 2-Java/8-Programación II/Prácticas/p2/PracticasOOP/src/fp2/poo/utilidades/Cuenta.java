/*
 *  Fichero: Cuenta.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


package fp2.poo.utilidades;

/**
 * Descripcion: Esta es una clase que representa una cuenta bancaria.
 *              Mantiene una asociacion entre un usuario (nombre) y.
 *              su saldo (saldo).
 *
 * @version version 1.0 Abril 2011
 * @author  Fundamentos de Programacion II
 */
public class Cuenta {

    /** nombre es el atributo asociado al nombre de un usuario */
    private String nombre;

    /** saldo es el atributo asociado al dinero de una cuenta de usuario */
    private double saldo;

    /*
     *  Descripcion: Constructor de la clase.          
     */
    public Cuenta ( String nombre, double saldo ) {
        this.nombre = nombre;
        this.saldo  = saldo ;
    }

    /*
     *  Descripcion: Este metodo configura el atributo nombre a un valor.
     */
    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    /*
     *  Descripcion: Este metodo configura el atributo saldo a un valor.
     *               
     */
    public void setSaldo( double saldo ) {
        this.saldo = saldo ;
    }

    /*
     *  Descripcion: Este metodo obtiene el atributo nombre.
     *           
     */
    public String getNombre( ) {
        return this.nombre ;
    }

    /*
     *  Descripcion: Este metodo obtiene el valor del atributo saldo.
     *       
     */
    public double getSaldo( ) {
        return this.saldo;
    }
}