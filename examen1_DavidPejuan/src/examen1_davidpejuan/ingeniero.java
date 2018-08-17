/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidpejuan;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ingeniero extends normales{
    private double destreza;
    private double nivelcomunicacion;

    public ingeniero() {
    }

    public ingeniero(double destreza, double nivelcomunicacion, double conocimientoacumulado, double nivelaprendizaje, String nombre, int edad, String carrera, String lugarnacimiento, int numecuenta, String usuario, String contraseña) {
        super(conocimientoacumulado, nivelaprendizaje, nombre, edad, carrera, lugarnacimiento, numecuenta, usuario, contraseña);
        this.destreza = destreza;
        this.nivelcomunicacion = nivelcomunicacion;
    }

    public double getDestreza() {
        return destreza;
    }

    public void setDestreza(double destreza) {
        this.destreza = destreza;
    }

    public double getNivelcomunicacion() {
        return nivelcomunicacion;
    }

    public void setNivelcomunicacion(double nivelcomunicacion) {
        this.nivelcomunicacion = nivelcomunicacion;
    }

    public ArrayList<examen> getEp() {
        return ep;
    }

    public void setEp(ArrayList<examen> ep) {
        this.ep = ep;
    }

    public ArrayList<examen> getEh() {
        return eh;
    }

    public void setEh(ArrayList<examen> eh) {
        this.eh = eh;
    }

    

    @Override
    public String toString() {
        return "ingeniero{" + "destreza=" + destreza + ", nivelcomunicacion=" + nivelcomunicacion + '}';
    }

    @Override
    public double tuto(double nivelens) {
        return (((nivelens-super.getNivelaprendizaje())+destreza)/nivelcomunicacion);
    }
    
    
}
