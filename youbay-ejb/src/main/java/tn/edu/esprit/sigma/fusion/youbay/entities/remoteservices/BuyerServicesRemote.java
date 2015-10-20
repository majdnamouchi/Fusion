package tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Buyer;

@Remote
public interface BuyerServicesRemote {

	Boolean addBuyer(Buyer theBuyer);

	Buyer findBuyer(Buyer theBuyer);

	Buyer findBuyerById(Long theId);

	Boolean updateBuyer(Buyer theBuyer);

	Boolean deleteBuyer(Buyer theBuyer);

}
