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
public class Cuenta {

    private int numeroCuenta, DNI, saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static Cuenta crearCuenta() {

        System.out.println("Ingrese su numero de cuenta");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numC = leer.nextInt();
        System.out.println("Ingrese su DNI");
        int DNI = leer.nextInt();
        System.out.println("Ingrese su saldo");
        int saldo = leer.nextInt();
        return new Cuenta(numC, DNI, saldo);
    }

    public void ingresar(double ing) {
        saldo += ing;
    }

    public void retirar(double ret) {
        saldo -= ret;
        if (saldo < 0) {
            saldo = 0;
        }
    }
    public void extraccionRapida(){
        saldo-=20%saldo;
    }
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de $"+saldo);
    }
    public void consultarDatos() {
        System.out.println("numeroCuenta= " + numeroCuenta);
        System.out.println("DNI=          " + DNI);
        System.out.println("saldo=        " + saldo);
    }

}
