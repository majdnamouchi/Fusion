package tn.edu.esprit.sigma.fusion.entities.servicesimpl;

import javax.ejb.Stateless;
import tn.edu.esprit.sigma.fusion.entities.services.CategoryLocal;
import tn.edu.esprit.sigma.fusion.entities.services.CategoryRemote;

/**
 * Session Bean implementation class CategoryServices
 */
@Stateless
public class CategoryServices implements CategoryRemote, CategoryLocal {

    /**
     * Default constructor. 
     */
    public CategoryServices() {
        // TODO Auto-generated constructor stub
    }

}
