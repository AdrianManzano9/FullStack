/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.Colecciones;

import java.util.Date;

/**
 *
 * @author Pc
 */
public class Pelicula {
    private String Titulo;
    private String Director;
    private double Duracion;

    public Pelicula() {
    }


    public String getTitulo() {
        return Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + Duracion + " horas}";
    }
    
    
}
