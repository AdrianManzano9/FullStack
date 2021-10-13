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
public class Electrodoméstico {

    protected double precio;
    protected String color;
    protected String consumo_energético;
    protected Integer peso;

    public Electrodoméstico() {
    }

    public Electrodoméstico(double precio, String color, String consumo_energético, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energético = consumo_energético;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo_energético() {
        return consumo_energético;
    }

    public void setConsumo_energético(String consumo_energético) {
        this.consumo_energético = consumo_energético;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public static String comprobarConsumoEnergetico(String letra) {
        if (letra.equals("A") || letra.equals("B") || letra.equals("C") || letra.equals("D") || letra.equals("E")) {
            return letra;
        } else {
            return "F";
        }
    }

    public static String comprobarColor(String color) {
        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);
        precio = 1000;
        System.out.println("Ingrese el color del electrodomestico (blanco, negro, rojo, azul o gris).");
        color = Electrodoméstico.comprobarColor(leer.next());
        System.out.println("Ingrese su consumo energetico (Entre A y F).");
        consumo_energético = Electrodoméstico.comprobarConsumoEnergetico(leer.next().toUpperCase());
        System.out.println("Ingrese el peso del electrodomestico (en kg).");
        peso= leer.nextInt();
    }

    public void precioFinal() {
        switch (consumo_energético) {
            case "A":
                precio += 1000;
            case "B":
                precio += 600;
            case "D":
                precio += 500;
            case "E":
                precio += 300;
            case "F":
                precio += 100;
        }
        if (peso<=19&&peso>=1) {
            precio += 100;
        } else if (peso<=20&&peso>=49) {
            precio += 500;
        } else if (peso<=50&&peso>=79) {
            precio += 800;
        } else if (peso<=80) {
            precio += 1000;
        } 
    }

    @Override
    public String toString() {
        return ", precio=" + precio + ", color=" + color + ", consumo_energ\u00e9tico=" + consumo_energético + ", peso=" + peso ;
    }
    
}
