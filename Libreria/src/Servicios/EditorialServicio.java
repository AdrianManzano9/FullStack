/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Editorial;
import Persistencias.EditorialDAO;
/**
 *
 * @author Pc
 */
public class EditorialServicio {
    EditorialDAO dao = new EditorialDAO();
    
    public void guardarEditorial(Editorial e) throws Exception{
        try {
            if (e.getNombre().isEmpty()) {
                throw new Exception("Deba tener un Nombre");
            }
            if (e.getAlta()==null) {
                throw new Exception("Deba decir si esta de Alta");
            }
            dao.guardarEditorial(e);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

}
