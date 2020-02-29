/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_marcelarivera;

/**
 *
 * @author Mvrivera
 */
public class Poderes {
    private int nivelpoder;
    private String descripcion;
    private boolean mortal;

    public Poderes() {
    }

    public Poderes(int nivelpoder, String descripcion, boolean mortal) {
        this.nivelpoder = nivelpoder;
        this.descripcion = descripcion;
        this.mortal = mortal;
    }

    public int getNivelpoder() {
        return nivelpoder;
    }

    public void setNivelpoder(int nivelpoder) {
        this.nivelpoder = nivelpoder;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getMortal() {
        return mortal;
    }

    public void setMortal(boolean mortal) {
        this.mortal = mortal;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
}
