package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.ManagerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ManagerServicesRemote;

/**
 * Session Bean implementation class ManagerServices
 */
@Stateless
public class ManagerServices implements ManagerServicesRemote, ManagerServicesLocal {

    /**
     * Default constructor. 
     */
    public ManagerServices() {
        // TODO Auto-generated constructor stub
    }

}
