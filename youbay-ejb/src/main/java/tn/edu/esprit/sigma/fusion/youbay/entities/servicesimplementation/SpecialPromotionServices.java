package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.SpecialPromotionServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SpecialPromotionServicesRemote;

/**
 * Session Bean implementation class SpecialPromotionServices
 */
@Stateless
public class SpecialPromotionServices implements SpecialPromotionServicesRemote, SpecialPromotionServicesLocal {

    /**
     * Default constructor. 
     */
    public SpecialPromotionServices() {
        // TODO Auto-generated constructor stub
    }

}
