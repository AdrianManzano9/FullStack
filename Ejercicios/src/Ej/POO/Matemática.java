/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.POO;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Pc
 */
public class Matemática {

    private double Num1, Num2;

    public Matemática() {
    }

    public Matemática(double Num1, double Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public double getNum1() {
        return Num1;
    }

    public double getNum2() {
        return Num2;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }

    public double devolverMayor() {
        return max(Num1, Num2);
    }

    public double calcularPotencia() {
        return pow(max(abs(Num1), abs(Num2)), min(abs(Num1), abs(Num2)));

    }

    public double calculaRaiz() {
        return sqrt(min(Num1, Num2));
    }

    @Override
    public String toString() {
        return "Matem\u00e1tica{" + "Num1=" + Num1 + ", Num2=" + Num2 + '}';
    }

}
