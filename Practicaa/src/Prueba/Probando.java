/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Pc
 */
public class Probando {

    public Probando() {
    }

    public static boolean numeroCapicua(Integer x) {
        if (x == null) {
            return false;
        } else if (x < 0) {
            x *= -1;
        }
        String Cadena = x.toString();
        String Invertida = "";
        if (Cadena.length() == 1) {
            return true;
        } else {
            for (int i = Cadena.length(); i > 0; i--) {
                Invertida += (Cadena.substring(i - 1, i));
            }
            return Cadena.equals(Invertida);
        }
    }
    public static int prisioneroDulce(int inicio,int cantidadCaramelos, int cantidadPresos){
        int aux=0;
        while (cantidadCaramelos!=0) {      
        for (int i = inicio; i <= cantidadPresos; i++) {
            cantidadCaramelos-=1;
            if (cantidadCaramelos==0) {
                aux=i;
                break;
            }
        }
        inicio=1;
        
        }
    return aux;
    }
}
