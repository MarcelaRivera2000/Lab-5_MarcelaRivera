/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_marcelarivera;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Villanos {
    private ArrayList<Poderes> poderes=new ArrayList();
     private String nombre,planeta;
    private int edad,n_muertescausadas;
    private double altura;
    private boolean carcel;

    public Villanos() {
    }

    public Villanos(String nombre, String planeta, int edad, double altura) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.n_muertescausadas = n_muertescausadas;
        this.altura = altura;
        this.carcel = carcel;
    }

    public ArrayList<Poderes> getPoderes() {
        return poderes;
    }

    public void setPoderes(ArrayList<Poderes> poderes) {
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getN_muertescausadas() {
        return n_muertescausadas;
    }

    public void setN_muertescausadas(int n_muertescausadas) {
        this.n_muertescausadas = n_muertescausadas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
