package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.SubcategoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SubcategoryServicesRemote;

/**
 * Session Bean implementation class SubcategoryServices
 */
@Stateless
public class SubcategoryServices implements SubcategoryServicesRemote, SubcategoryServicesLocal {

    /**
     * Default constructor. 
     */
    public SubcategoryServices() {
        // TODO Auto-generated constructor stub
    }

}
