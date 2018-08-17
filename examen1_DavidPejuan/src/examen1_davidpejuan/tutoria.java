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
public class tutoria {
    private int hora;
    private int aula;
    private int dia;
    private String clase;
    private String mes;
    private int año;
    private String tema;
    private tutor tuto;
    ArrayList<normales> e=new ArrayList();

    public tutoria() {
    }

    public tutoria(int hora, int aula, int dia, String clase, String mes, int año, String tema, tutor tuto) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.clase = clase;
        this.mes = mes;
        this.año = año;
        this.tema = tema;
        this.tuto = tuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public tutor getTuto() {
        return tuto;
    }

    public void setTuto(tutor tuto) {
        this.tuto = tuto;
    }

    public ArrayList<normales> getE() {
        return e;
    }

    public void setE(ArrayList<normales> e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "tutoria{" + "hora=" + hora + ", aula=" + aula + ", dia=" + dia + ", clase=" + clase + ", mes=" + mes + ", a\u00f1o=" + año + ", tema=" + tema + ", tuto=" + tuto + ", e=" + e + '}';
    }
    
}
