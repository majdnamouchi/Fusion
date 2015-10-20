package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductServicesRemote;

/**
 * Session Bean implementation class ProductServices
 */
@Stateless
public class ProductServices implements ProductServicesRemote, ProductServicesLocal {

    /**
     * Default constructor. 
     */
    public ProductServices() {
        // TODO Auto-generated constructor stub
    }

}
