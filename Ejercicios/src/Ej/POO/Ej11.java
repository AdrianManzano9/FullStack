/*

Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío. 
 */
package Ej.POO;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int dia,mes,anio;
        System.out.println("Ingresar día");
        dia=leer.nextInt();
        System.out.println("Ingresar mes");
        mes=leer.nextInt();
        System.out.println("Ingresar año");
        anio=leer.nextInt()-1900;
        Date D1=new Date (anio,mes,dia);
        System.out.println(D1.toString());
        Date Act = new Date();
        int dif = D1.getYear()-Act.getYear();
        if(dif<0){
            dif*=-1;
        }
        System.out.println("Hay "+dif+" años entre esa fecha y la actual.");
        
        
    }  
}
