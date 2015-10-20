package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Buyer;
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

	@Override
	public Boolean addBuyer(Buyer theBuyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Buyer findBuyer(Buyer theBuyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Buyer findBuyerById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateBuyer(Buyer theBuyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteBuyer(Buyer theBuyer) {
		// TODO Auto-generated method stub
		return null;
	}

}
