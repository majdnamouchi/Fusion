package tn.edu.esprit.sigma.fusion.entities.servicesimpl;

import javax.ejb.Stateless;
import tn.edu.esprit.sigma.fusion.entities.services.AuctionServicesLocal;
import tn.edu.esprit.sigma.fusion.entities.services.AuctionServicesRemote;

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
