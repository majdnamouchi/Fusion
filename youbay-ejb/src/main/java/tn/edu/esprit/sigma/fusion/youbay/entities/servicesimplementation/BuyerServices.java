package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.BuyerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.BuyerServicesRemote;

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
