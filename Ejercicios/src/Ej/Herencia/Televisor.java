/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.Herencia;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public final class Televisor extends Electrodoméstico{
  private double resolución;
  private  boolean sintonizador_TDT;

    public Televisor() {
    }

    public Televisor(double resolución, boolean sintonizador_TDT, double precio, String color, String consumo_energético, Integer peso) {
        super(precio, color, consumo_energético, peso);
        this.resolución = resolución;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public double getResolución() {
        return resolución;
    }

    public void setResolución(double resolución) {
        this.resolución = resolución;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
    
    public void crearTelevisor(){
        System.out.println("Datos del televisor");
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor (en pulgadas).");
        resolución = leer.nextDouble();
        System.out.println("¿Tiene sintonizador TDT? (s/n)");
        if (leer.next().equalsIgnoreCase("s")) {
            sintonizador_TDT = true;
        } 
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (resolución>40) {
            precio+=precio*0.3;
        }
        if (sintonizador_TDT) {
            precio+=500;
        }
        System.out.println("El precio del televisor es: "+precio);
    }

    @Override
    public String toString() {
        return "Televisor{" + "resoluci\u00f3n=" + resolución + ", sintonizador_TDT=" + sintonizador_TDT +super.toString() + '}';
    }
    
}
