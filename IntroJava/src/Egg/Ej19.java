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
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar medida del lado");
        int Lado = leer.nextInt();
        for (int i = 1; i <= Lado; i++) {
            for (int j = 1; j <= Lado; j++) {
                if ((i == 1 || i == Lado || j == 1) && j != Lado) {
                    System.out.print("*");
                } else if (j == Lado) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

}
