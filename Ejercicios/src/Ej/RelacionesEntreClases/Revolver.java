/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.RelacionesEntreClases;

/**
 *
 * @author Pc
 */
public class Revolver {

    private static long posición_actual;
    private static long posición_tiro;

    ;

    public Revolver() {
    }

    public static void llenarRevolver() {
        posición_actual = Math.round(Math.random() * 8);
        posición_tiro = Math.round(Math.random() * 8);
        
    }

    public static boolean disparar() {
        if (posición_actual == posición_tiro) {
            return true;
        } else {
            return false;
        }
    }
    public static void siguienteDisparo(){
        posición_actual+=1;
        if(posición_actual>8){
            posición_actual=1;
        }
    }

    public static String ToString() {
        return "posición actual: "+posición_actual+" ,posición tiro: "+posición_tiro; 
    }

    
    
}
