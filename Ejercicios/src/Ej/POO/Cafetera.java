/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.POO;

/**
 *
 * @author Pc
 */
public class Cafetera {
    private int capacidadMaxima=1000,cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    public void servirTaza(int taza){
        cantidadActual-=taza;
        if(cantidadActual<0){
            System.out.println("No alcanza, la taza quedo con "+(taza-cantidadActual)+"cc. de cafe");
            cantidadActual=0;
        }else{
            System.out.println("Se ha llenado la taza");
        }
    }
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    public void agregarCafe(int cafe){
        cantidadActual+=cafe;
    }
}
