/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencias;
import Entidades.Editorial;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EditorialDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    
    public void guardarEditorial(Editorial editorial) throws Exception {
        try {
            Editorial E = new Editorial();
            E.setId(editorial.getId());
            E.setNombre(editorial.getNombre());
            E.setAlta(editorial.getAlta());
            
            em.getTransaction().begin();
            em.persist(E);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
