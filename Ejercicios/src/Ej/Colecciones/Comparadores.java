/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej.Colecciones;
import Ej.Colecciones.Pelicula;
import java.util.Comparator;
import Ej.Colecciones.Ej5;
/**
 *
 * @author Pc
 */
class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDes = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t1.getDuracion(), t.getDuracion());
         }
    };
    public static Comparator<Pelicula> ordenarPorDuracionAsen = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t.getDuracion(), t1.getDuracion());
         }
    };
    public static Comparator<Pelicula> ordenarPorTituloAsen = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getTitulo().compareTo(t.getTitulo());
         }
    };
    public static Comparator<Pelicula> ordenarPorDirectorAsen = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDirector().compareTo(t.getDirector());
         }
    };
  
}
