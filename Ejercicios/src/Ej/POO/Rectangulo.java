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
public class Rectangulo {
    private int altura,base,superficie,perímetro;

    public Rectangulo() {
    }
    
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    
    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar base");
        int base=leer.nextInt();
        System.out.println("Ingresar altura");
        int altura=leer.nextInt();
        return new Rectangulo(altura,base);
    }
    public void superficie(){
    superficie=base*altura;
    }
    public void perímetro(){
    perímetro=(base+altura)*2;
    }
    public void  Dibujar(){
        for(int i=1;i<=altura;i++){
            for (int j = 1; j <= base; j++) {
                if((i==1||i==altura||j==1)&&j!=base){
                    System.out.print("*");
                }else if(j==base){
                    System.out.println("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
      
        
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", base=" + base + ", superficie=" + superficie + ", per\u00edmetro=" + perímetro + '}';
    }
    
}
