package Ej.POO;


import Ej.POO.Operacion;


public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion O1=new Operacion();
        O1=O1.crearOperacionstatic();
        O1.sumar();
        O1.restar();
        O1.multiplicar();
        O1.dividir();
        System.out.println(O1.toString());
        
    }
    
}
