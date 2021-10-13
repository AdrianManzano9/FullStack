/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.POO;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Circunferencia {

    
    private Double radio, Area, Perimetro;

    public Circunferencia() {
        
    }

    public Circunferencia(Double radio) {
        this.radio = radio;
        
    }
    
    
    
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar Radio");
        radio = leer.nextDouble();
        return new Circunferencia(radio);
    }

    public Circunferencia area() {
        Area = 3.14 * Math.pow(radio, 2);
        return null;

    }

    public Circunferencia perimetro() {
        Perimetro = 2 * 3.14 * radio;
        return null;

    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", Area=" + Area + ", Perimetro=" + Perimetro + '}';
    }

    
}
