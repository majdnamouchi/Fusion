package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductHistoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductHistoryServicesRemote;

/**
 * Session Bean implementation class ProductHistoryServices
 */
@Stateless
public class ProductHistoryServices implements ProductHistoryServicesRemote, ProductHistoryServicesLocal {

    /**
     * Default constructor. 
     */
    public ProductHistoryServices() {
        // TODO Auto-generated constructor stub
    }

}
