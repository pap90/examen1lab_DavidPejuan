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
public class licenciado extends normales{
    private double interez;

    public licenciado() {
    }

    public licenciado(double interez, double conocimientoacumulado, double nivelaprendizaje, String nombre, int edad, String carrera, String lugarnacimiento, int numecuenta, String usuario, String contraseña) {
        super(conocimientoacumulado, nivelaprendizaje, nombre, edad, carrera, lugarnacimiento, numecuenta, usuario, contraseña);
        this.interez = interez;
    }

    public double getInterez() {
        return interez;
    }

    public void setInterez(double interez) {
        this.interez = interez;
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
        return "licenciado{" + "interez=" + interez + '}';
    }

    @Override
    public double tuto(double nivelens) {
        return (((nivelens-super.getNivelaprendizaje())/interez*3));
    }
    
}
