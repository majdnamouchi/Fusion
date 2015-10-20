package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.CategoryLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.CategoryRemote;

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
