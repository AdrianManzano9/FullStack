package Egg;


import java.util.Scanner;

/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */

/**
 *
 * @author Pc
 */
public class EjE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar tiempo en min");
        int min = leer.nextInt();
       int días=min/1440; int hor=(min/60)-(días*24); 
        System.out.println("Equivale a "+días+" días, "+hor+" horas");
        
    }
    
}
