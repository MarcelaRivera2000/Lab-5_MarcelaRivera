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
public class Superheroes {
    private ArrayList<Poderes> superpoderes=new ArrayList();
    private String nombre,planeta;
    private int edad,n_villanosAtrapados;
    private double altura;
    private String equipo;
    
    public Superheroes() {
    }

    public Superheroes(String nombre, String planeta, int edad, double altura) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.n_villanosAtrapados = setN_villanosAtrapados(n_villanosAtrapados);
        this.altura = altura;
    }

    public Superheroes(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    

    public ArrayList<Poderes> getSuperpoderes() {
        return superpoderes;
    }

    public void setSuperpoderes(ArrayList<Poderes> superpoderes) {
        this.superpoderes = superpoderes;
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

    public int getN_villanosAtrapados() {
        return n_villanosAtrapados;
    }

    public int setN_villanosAtrapados(int n_villanosAtrapados) {
       return this.n_villanosAtrapados += n_villanosAtrapados;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
