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
public class tutor extends alumno{
    private ArrayList<String> clasesposibles=new ArrayList();
    private int ganancias;
    private ArrayList<String> tutosdadas=new ArrayList();
    private double nivelenseñanza;

    public tutor() {
    }

    public tutor(int ganancias, double nivelenseñanza, String nombre, int edad, String carrera, String lugarnacimiento, int numecuenta, String usuario, String contraseña, ArrayList<String> clasesposibles) {
        super(nombre, edad, carrera, lugarnacimiento, numecuenta, usuario, contraseña);
        this.ganancias = ganancias;
        this.nivelenseñanza = nivelenseñanza;
        this.clasesposibles=clasesposibles;
    }

    public ArrayList<String> getClasesposibles() {
        return clasesposibles;
    }

    public void setClasesposibles(ArrayList<String> clasesposibles) {
        this.clasesposibles = clasesposibles;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public ArrayList<String> getTutosdadas() {
        return tutosdadas;
    }

    public void setTutosdadas(ArrayList<String> tutosdadas) {
        this.tutosdadas = tutosdadas;
    }

    public double getNivelenseñanza() {
        return nivelenseñanza;
    }

    public void setNivelenseñanza(double nivelenseñanza) {
        this.nivelenseñanza = nivelenseñanza;
    }

    @Override
    public String toString() {
        return "tutor{" + "clasesposibles=" + clasesposibles + ", ganancias=" + ganancias + ", tutosdadas=" + tutosdadas + ", nivelense\u00f1anza=" + nivelenseñanza + '}';
    }
    
}
