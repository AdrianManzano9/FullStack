/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencias;

import Entidades.Autor;
import static com.sun.org.apache.xpath.internal.XPath.SELECT;
import static com.sun.webkit.dom.EventImpl.SELECT;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static javax.swing.text.html.HTML.Tag.SELECT;

/**
 *
 * @author Pc
 */
public class AutorDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    public void guardarAutor(Autor a) throws Exception {
        try {
            Autor E = new Autor();
            E.setId(a.getId());
            E.setNombre(a.getNombre());
            E.setAlta(a.getAlta());

            em.getTransaction().begin();
            em.persist(E);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void modificarAutor(Autor a) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void eliminarAutor(Autor a) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public Autor buscarPorNombre(String Nombre) throws Exception {
        try {
            Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", Nombre).getSingleResult();
            if (autor != null) {
                return autor;
            } else {
                throw new Exception("No hay coincidencias");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    public List<Autor> listarAutores() throws Exception {
        try {
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        if (autores != null) {
                return autores;
            } else {
                throw new Exception("No se encontraron autores");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
