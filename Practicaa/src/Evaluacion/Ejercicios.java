/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

/**
 *
 * @author Pc
 */
public class Ejercicios {

    public static boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
        boolean Boleano = false;
        if (numEnt % 2 == 0 && numLargo >= 0 && Math.round(numReal) == Math.floor(numReal)) {
            Boleano = true;
        }
        return Boleano;
    }

    public static String geringoso(String palabra) {
        palabra = palabra.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");
        return palabra;

    }

    public static String inversa(String palabra) {
        String invertida = "";
        palabra = palabra.toLowerCase();
        for (int i = palabra.length(); i > 0; i--) {
            invertida += palabra.substring(i - 1, i);
        }
        return invertida;

    }
}

