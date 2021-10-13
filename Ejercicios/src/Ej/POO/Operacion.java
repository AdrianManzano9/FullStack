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
public class Operacion {

    private int num1, num2,Suma,resta,Mult,división;

    public Operacion() {
    }
    
    

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Operacion crearOperacionstatic() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 números");
        int numA=leer.nextInt();
        int numB=leer.nextInt();
        return new Operacion(numA,numB);

    }

    public int sumar() {
        Suma = num1 + num2;
        return Suma;
    }

    public int restar() {
        resta = num1 - num2;
        return resta;
    }

    public int multiplicar() {
        if (num1 != 0 && num2 != 0) {
            Mult = num1 * num2;
            return Mult;
        } else {
            System.out.println("No se puede multiplicar");
            return 0;
        }

    }
    public int dividir() {
        if (num1 != 0 && num2 != 0) {
            división = num1 * num2;
            return división;
        } else {
            System.out.println("No se puede dividir");
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", Suma=" + Suma + ", resta=" + resta + ", Mult=" + Mult + ", divisi\u00f3n=" + división + '}';
    }
    

}
