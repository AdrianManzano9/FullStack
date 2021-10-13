/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.POO;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int mostrarVocales() {
        int cant = 0;
        String aux = frase.toLowerCase();
        for (int i = 0; i < longitud; i++) {
            if (aux.charAt(i) == 'a' || aux.charAt(i) == 'e' || aux.charAt(i) == 'i' || aux.charAt(i) == 'o' || aux.charAt(i) == 'u') {
                cant += 1;
            }
        }
        return cant;
    }

    public String invertirFrase() {
        String esarf = "";
        for (int i = longitud; i > 0; i--) {
            esarf += frase.substring(i - 1, i);
        }
        return esarf;
    }

    public void vecesRepetido(String letra) {
        int aux = 0;
        String F_aux = frase.toLowerCase();
        for (int i = 0; i < longitud; i++) {
            if (F_aux.substring(i, i+1).equals(letra)) {
                aux += 1;
            }
        }
        if (aux > 1) {
            System.out.println("El carácter " + letra + " se repite " + aux + " veces");
        } else if (aux == 1) {
            System.out.println("El carácter " + letra + " se repite una vez");
        } else {
            System.out.println("No se encontraron coincidencias");
        }
    }

    public void compararLongitud(String fras) {
        if(fras.length()>longitud){
            System.out.println("La frase ingresada es mas larga que la frase guardada");
        }else if (fras.length()==longitud) {
            System.out.println("Ambas fraces tienen la misma longitud");
        }else{
            System.out.println("La frase guardada es mas larga que la frase ingresada");
        }
    }

    public void unirFrases(String fras){
        System.out.println(frase.concat(fras));
    }
    
    public void reemplazar(String letra){
        System.out.println(frase.replace('a', letra.toLowerCase().charAt(0)).replace('A', letra.toUpperCase().charAt(0)));
    }
    
    public boolean contiene(String letra){
        return frase.contains(letra);
    }
    
}
