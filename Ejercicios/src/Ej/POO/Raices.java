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
public class Raices {

    private int a, b, c;
    private double Discriminante;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        Discriminante = Math.pow(b, 2) - 4 * a * c;
        return Discriminante;
    }

    public static Raices crearTrinomio(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingresar primer termino. A: ");
        int A = leer.nextInt();
        System.out.print("Ingresar segundo termino. B: ");
        int B = leer.nextInt();
        System.out.println("Ingresar tercer termino. C: ");
        int C= leer.nextInt();
        return new Raices(A,B,C);
    }
    
    public  boolean tieneRaices() {
        if (Discriminante >= 0) {
            return true;
        }
        return false;
    }

    public boolean tieneRaiz() {
        if (Discriminante == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("****Raices****");
            System.out.println(-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
            System.out.println(-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.print("Raiz: ");
            System.out.println(-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
        }
    }
    
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        }else if (tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene solución.");
        }
    }
}

