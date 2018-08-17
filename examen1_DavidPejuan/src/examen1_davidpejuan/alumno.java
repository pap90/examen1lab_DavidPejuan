/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidpejuan;

/**
 *
 * @author david
 */
public class alumno {
    private String nombre;
    private int edad;
    private String carrera;
    private String lugarnacimiento;
    private int numecuenta;
    private String usuario;
    private String contraseña;

    public alumno() {
    }

    public alumno(String nombre, int edad, String carrera, String lugarnacimiento, int numecuenta, String usuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugarnacimiento = lugarnacimiento;
        this.numecuenta = numecuenta;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public int getNumecuenta() {
        return numecuenta;
    }

    public void setNumecuenta(int numecuenta) {
        this.numecuenta = numecuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
    
}
