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

    public Superheroes() {
    }

    public Superheroes(String nombre, String planeta, int edad, int n_villanosAtrapados, double altura) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.edad = edad;
        this.n_villanosAtrapados = n_villanosAtrapados;
        this.altura = altura;
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

    public void setN_villanosAtrapados(int n_villanosAtrapados) {
        this.n_villanosAtrapados = n_villanosAtrapados;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Superheroes{" + "superpoderes=" + superpoderes + ", nombre=" + nombre + ", planeta=" + planeta + ", edad=" + edad + ", n_villanosAtrapados=" + n_villanosAtrapados + ", altura=" + altura + '}';
    }
    
    
    
}
