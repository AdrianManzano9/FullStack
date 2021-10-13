/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import Persistencias.LibroDAO;

/**
 *
 * @author Pc
 */
public class LibroServicio {

    public LibroServicio() {
    }

    LibroDAO dao = new LibroDAO();
    
    public void guardarLibro(Libro e) throws Exception {
        try {
            if (e.getAlta() == null) {
                throw new Exception("Debe decir si esta de alta.");
            }
            if (e.getAnio()==null) {
                throw new Exception("Debe indiacar el año.");
            }
            if (e.getAutor()== null) {
                throw new Exception("Debe indicar el nombre del autor.");
            }
            if (e.getEditorial()==null) {
                throw new Exception("Debe indiacar el nombre de la editorial");
            }
            if (e.getEjemplares()== null) {
                throw new Exception("Debe indiacar cuantos hay.");
            }
            if (e.getEjemplaresPrestados()==null) {
                throw new Exception("Debe indiacar cuantos se prestaron");
            }
            if (e.getEjemplaresRestantes()==null) {
                throw new Exception("Debe indiacar cuantos quedan sin prestar");
            }
            if (e.getTitulo()==null) {
                throw new Exception("Debe indiacar el titulo");
            }
            dao.guardarLibro(e);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

}
