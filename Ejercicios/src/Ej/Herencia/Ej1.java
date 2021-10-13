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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Stich", "Carnvoro", 15, "Doberman");
        perro.Alimentarse();
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
    }

}
