package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.AssistantItemsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.AssistantItemsServicesRemote;

/**
 * Session Bean implementation class AssistantItemsServices
 */
@Stateless
public class AssistantItemsServices implements AssistantItemsServicesRemote, AssistantItemsServicesLocal {

    /**
     * Default constructor. 
     */
    public AssistantItemsServices() {
        // TODO Auto-generated constructor stub
    }

}
