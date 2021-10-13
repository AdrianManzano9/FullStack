/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Alumno {
private String Alumno;
private ArrayList<Integer> Notas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String Alumno) {
        this.Alumno = Alumno;
       
    }

    public String getAlumno() {
        return Alumno;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public void setNotas(ArrayList<Integer> Notas) {
        this.Notas = Notas;
    }

    public void notaFinal (){
    Integer NF = (Notas.get(0)+Notas.get(1)+Notas.get(2))/3;
        System.out.println("Su nota final es de "+NF);
    }
}
