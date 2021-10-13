/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar números a sumar");
    int Num1 = leer.nextInt() ;
    int Num2 = leer.nextInt();
    int Suma = Num1+Num2;
    System.out.println("Da la suma de "+Suma);
    }
}
