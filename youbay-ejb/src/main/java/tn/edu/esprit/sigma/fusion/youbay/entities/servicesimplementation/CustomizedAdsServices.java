package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.CustomizedAdsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.CustomizedAdsServicesRemote;

/**
 * Session Bean implementation class CustomizedAdsServices
 */
@Stateless
public class CustomizedAdsServices implements CustomizedAdsServicesRemote, CustomizedAdsServicesLocal {

    /**
     * Default constructor. 
     */
    public CustomizedAdsServices() {
        // TODO Auto-generated constructor stub
    }

}
