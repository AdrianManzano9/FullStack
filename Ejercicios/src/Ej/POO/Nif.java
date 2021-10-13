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
public class Nif {

    private int DNI;
    private String letra;
    private static String[] vector = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Nif() {
    }

    public Nif(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public static Nif crearNif() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su DNI.");
        int DNI = leer.nextInt();
        return new Nif(DNI,vector[DNI%23]);
    }
}
