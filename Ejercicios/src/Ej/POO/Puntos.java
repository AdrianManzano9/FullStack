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
public class Puntos {

    private int x1, y1, x2, y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese las cordenadas del primer punto.");
        System.out.print("x: ");int x1 = leer.nextInt();
        System.out.print("y: ");int y1 = leer.nextInt();
        
        System.out.println("Ingrese las cordenadas del segundo punto.");
        System.out.print("x: ");int x2 = leer.nextInt();
        System.out.print("y: ");int y2 = leer.nextInt();
        
        return new Puntos(x1, y1, x2, y2);
    }
    
    public void calcularDistancia(){
        System.out.println("La distanscia entre los puntos es de: "+Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
    }
}
