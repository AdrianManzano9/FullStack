/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.Herencia;

/**
 *
 * @author Pc
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lavadora L1 = new Lavadora();
       L1.crearLavadora();
       L1.precioFinal();
        System.out.println(L1.toString());
       Televisor T1 = new Televisor();
       T1.crearTelevisor();
       T1.precioFinal();
        System.out.println(T1.toString());
        
    }
    
}
