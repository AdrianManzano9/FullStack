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
public final class Lavadora extends Electrodoméstico {
   private Integer Carga;

    public Lavadora() {
    }

    public Lavadora(Integer Carga) {
        this.Carga = Carga;
    }

    public Lavadora(Integer Carga, double precio, String color, String consumo_energético, Integer peso) {
        super(precio, color, consumo_energético, peso);
        this.Carga = Carga;
    }

   

    public Integer getCarga() {
        return Carga;
    }

    public void setCarga(Integer Carga) {
        this.Carga = Carga;
    }
    
   
    public void crearLavadora() {
        System.out.println("Datos de la lavadora: ");
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico(); 
        System.out.println("Ingrese la carga de la lavadora (en Kg).");
        Carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (Carga>30) {
            precio+=500;
        }
        System.out.println("El precio de la lavadora es: "+precio);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "Carga=" + Carga + super.toString()+ '}';
    }

  
    
    
}
