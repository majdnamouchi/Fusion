package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.HistoryOfViewsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.HistoryOfViewsServicesRemote;

/**
 * Session Bean implementation class HistoryOfViewsServices
 */
@Stateless
public class HistoryOfViewsServices implements HistoryOfViewsServicesRemote, HistoryOfViewsServicesLocal {

    /**
     * Default constructor. 
     */
    public HistoryOfViewsServices() {
        // TODO Auto-generated constructor stub
    }

}
