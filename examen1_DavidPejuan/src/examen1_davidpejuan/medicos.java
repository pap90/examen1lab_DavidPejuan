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
public class medicos extends normales{
    private double nivelsoli;
    private double preocupacion;

    public medicos() {
    }

    public medicos(double nivelsoli, double preocupacion, double conocimientoacumulado, double nivelaprendizaje, String nombre, int edad, String carrera, String lugarnacimiento, int numecuenta, String usuario, String contraseña) {
        super(conocimientoacumulado, nivelaprendizaje, nombre, edad, carrera, lugarnacimiento, numecuenta, usuario, contraseña);
        this.nivelsoli = nivelsoli;
        this.preocupacion = preocupacion;
    }

    public double getNivelsoli() {
        return nivelsoli;
    }

    public void setNivelsoli(double nivelsoli) {
        this.nivelsoli = nivelsoli;
    }

    public double getPreocupacion() {
        return preocupacion;
    }

    public void setPreocupacion(double preocupacion) {
        this.preocupacion = preocupacion;
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
        return "medicos{" + "nivelsoli=" + nivelsoli + ", preocupacion=" + preocupacion + '}';
    }

    @Override
    public double tuto(double nivelens) {
        return ((nivelens-(super.getNivelaprendizaje()*0.6)/nivelsoli-preocupacion));
    }
    
   
}
