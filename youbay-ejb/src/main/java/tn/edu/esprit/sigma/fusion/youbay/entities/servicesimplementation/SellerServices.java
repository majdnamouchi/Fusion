package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.SellerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SellerServicesRemote;

/**
 * Session Bean implementation class SellerServices
 */
@Stateless
public class SellerServices implements SellerServicesRemote, SellerServicesLocal {

    /**
     * Default constructor. 
     */
    public SellerServices() {
        // TODO Auto-generated constructor stub
    }

}
