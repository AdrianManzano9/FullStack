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
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingresar número");
       int Num = leer.nextInt();
       if (Num%2==0){
       System.out.println("El número es par");
       }else{
           System.out.println("El número es impar");
       } ;
    }
    
}
