package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.services.AuctionServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.AuctionServicesRemote;

/**
 * Session Bean implementation class AuctionServices
 */
@Stateless
public class AuctionServices implements AuctionServicesRemote, AuctionServicesLocal {

    /**
     * Default constructor. 
     */
    public AuctionServices() {
        // TODO Auto-generated constructor stub
    }

}
