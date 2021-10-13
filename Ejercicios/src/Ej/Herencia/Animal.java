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
class Animal {
   protected String nombre;
   protected String alimento;
   protected Integer edad;
   protected String raza;


    protected Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
   
    protected void Alimentarse(){
        System.out.print(nombre+" se esta alimentando de ");
    }
    
}