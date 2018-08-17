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
public class examen {
    private String clase;
    private double conoreque;
    private String tema;
    private double puntaje;

    public examen() {
    }

    public examen(String clase, double conoreque, String tema, double puntaje) {
        this.clase = clase;
        this.conoreque = conoreque;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public double getConoreque() {
        return conoreque;
    }

    public void setConoreque(double conoreque) {
        this.conoreque = conoreque;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "examen{" + "clase=" + clase + ", conoreque=" + conoreque + ", tema=" + tema + ", puntaje=" + puntaje + '}';
    }
    
}
