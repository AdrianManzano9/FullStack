/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Servicios.AutorServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pc
 */
public class Libreria {

    public static void main(String[] args) throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            Integer Res = -1;
            while (Res != 0) {
                System.out.println("MENU.\n"
                        + "1) Sobre una Editorial.\n"
                        + "2) Sobre un Autor.\n"
                        + "3) Sobre un Libro.\n"
                        + "0) Salir");

                Res = leer.nextInt();
                if (Res.equals(1)) {
                    menuEditorial();
                }
                if (Res.equals(2)) {
                    menuAutor();
                }
                if (Res.equals(3)) {
                    menuLibro();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }

    }

    private static void menuEditorial() throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            EditorialServicio ES = new EditorialServicio();
            System.out.println("MENU Editorial.\n"
                    + "1) Guardar una nueva Editorial.\n"
                    + "2) .\n"
                    + "3) .\n");
            Integer Res = leer.nextInt();
            if (Res.equals(1)) {
                Editorial e = new Editorial("Rumbos", true);
                ES.guardarEditorial(e);
            }
            if (Res.equals(2)) {

            }
            if (Res.equals(3)) {

            }
            if (Res.equals(4)) {

            }
            if (Res.equals(5)) {

            }
        } catch (Exception e) {

        }
    }

    private static void menuAutor() throws Exception {
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            AutorServicio AS = new AutorServicio();
            Integer Res;
            do{
            System.out.println("MENU Autor.\n"
                    + "1) Guardar un nuevo Autor.\n"
                    + "2) Buscar por nombre.\n"
                    + "3) Cambiar nombre.\n"
                    + "4) Listar autores.\n"
                    + "0) Salir del meno autor  ");
            Res = leer.nextInt();
            if (Res.equals(1)) {
                Autor e = new Autor("Agatha Christie", true);
                AS.guardarAutor(e);
            }
            if (Res.equals(2)) {
                AS.buscarPorNombre("Agatha Christie");
            }
            if (Res.equals(3)) {
                AS.modificarNombre("Pepito", "Agatha Christie");
            }
            if (Res.equals(4)) {
                AS.listarAutores();
            }
            if (Res.equals(5)) {

            }}while(Res!=0);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private static void menuLibro() throws Exception {
        try {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
            EntityManager em = emf.createEntityManager();

            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            LibroServicio LS = new LibroServicio();
            System.out.println("MENU Libro.\n"
                    + "1) Guardar un nuevo Libro.\n"
                    + "2) .\n"
                    + "3) .\n");
            Integer Res = leer.nextInt();
            if (Res.equals(1)) {
                Autor a = new Autor("Agatha Christie", true);
                Editorial e = new Editorial("Rumbos", true);
                Libro l = new Libro("El tren", 1790, 1000, 600, 400, true, a, e);
                LS.guardarLibro(l);
            }
            if (Res.equals(2)) {

            }
            if (Res.equals(3)) {

            }
            if (Res.equals(4)) {

            }
            if (Res.equals(5)) {

            }
        } catch (Exception e) {

        }
    }
}
