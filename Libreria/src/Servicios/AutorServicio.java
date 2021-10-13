/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Autor;
import Persistencias.AutorDAO;
import java.util.List;

/**
 *
 * @author Pc
 */
public class AutorServicio {

    AutorDAO dao = new AutorDAO();

    public AutorServicio() {
    }

    public void guardarAutor(Autor e) throws Exception {
        try {
            if (e.getNombre().isEmpty()) {
                throw new Exception("Debe tener un nombre");
            }
            if (e.getAlta() == null) {
                throw new Exception("Deba decir si esta de Alta");
            }
            dao.guardarAutor(e);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public void modificarNombre(String NombreNuevo, String NombreViejo) throws Exception {
        try {
            if (NombreNuevo.isEmpty()) {
                throw new Exception("Debe indicar el nuevo nombre.");
            }
            if (NombreViejo.isEmpty()) {
                throw new Exception("Debe indicar el nombre que tenísa.");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public void buscarPorNombre(String Nombre) throws Exception{
        try {
            if (Nombre.isEmpty()) {
                throw new Exception("Debe indicar en nombre a buscar");
            }
          Autor a = dao.buscarPorNombre(Nombre);
            System.out.println("ID: "+a.getId());
            System.out.println("Nombre: "+a.getNombre());
            System.out.println("Alta: "+a.getAlta());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void listarAutores() throws Exception {
        try {
            List<Autor> autores = dao.listarAutores();
            for (Autor autor : autores) {
                System.out.println("ID: "+autor.getId());
                System.out.println("Nombre: "+autor.getNombre());
                System.out.println("Alta: "+autor.getAlta());
            }
        } catch (Exception e) {
            throw e;
        }
 
      
    }
}
