package Ej.POO;


import Ej.POO.Circunferencia;

/**
 *
 * @author Pc
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia C1 = new Circunferencia();
        C1.crearCircunferencia();
        C1.area();
        C1.perimetro();
        System.out.println(C1.toString());

    }

}
