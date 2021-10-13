package Ej.POO;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro L1=new Libro();
        System.out.println("Ingresar Nombre del Autor");
        L1.Autor=leer.next();
        System.out.println("Ingresar ISBN");
        L1.ISBN=leer.nextInt();
        System.out.println("Ingresar titulo del libro");
        L1.Título=leer.next();
        System.out.println("Ingresar el n° de pagínas");
        L1.Número_de_páginas=leer.nextInt();
        System.out.println(L1.toString());
    }

}
