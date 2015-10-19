package tn.edu.esprit.sigma.fusion.entities.servicesimpl;

import javax.ejb.Stateless;
import tn.edu.esprit.sigma.fusion.entities.services.BuyerServicesLocal;
import tn.edu.esprit.sigma.fusion.entities.services.BuyerServicesRemote;

/**
 * Session Bean implementation class BuyerServices
 */
@Stateless
public class BuyerServices implements BuyerServicesRemote, BuyerServicesLocal {

    /**
     * Default constructor. 
     */
    public BuyerServices() {
        // TODO Auto-generated constructor stub
    }

}
