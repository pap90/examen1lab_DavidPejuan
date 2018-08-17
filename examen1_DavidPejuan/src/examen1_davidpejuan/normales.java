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
public abstract class normales extends alumno{
    private double conocimientoacumulado;
    private double nivelaprendizaje;
    ArrayList<examen> ep=new ArrayList();
    ArrayList<examen> eh=new ArrayList();

    public normales() {
    }

    public normales(double conocimientoacumulado, double nivelaprendizaje, String nombre, int edad, String carrera, String lugarnacimiento, int numecuenta, String usuario, String contraseña) {
        super(nombre, edad, carrera, lugarnacimiento, numecuenta, usuario, contraseña);
        this.conocimientoacumulado = conocimientoacumulado;
        this.nivelaprendizaje = nivelaprendizaje;
    }

    public double getConocimientoacumulado() {
        return conocimientoacumulado;
    }

    public void setConocimientoacumulado(double conocimientoacumulado) {
        this.conocimientoacumulado = conocimientoacumulado;
    }

    public double getNivelaprendizaje() {
        return nivelaprendizaje;
    }

    public void setNivelaprendizaje(double nivelaprendizaje) {
        this.nivelaprendizaje = nivelaprendizaje;
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
        return "normales{" + "conocimientoacumulado=" + conocimientoacumulado + ", nivelaprendizaje=" + nivelaprendizaje + ", ep=" + ep + ", eh=" + eh + '}';
    }
    
    public abstract double tuto(double nivelens);
    
}
