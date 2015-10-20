package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Buyer;

@Local
public interface BuyerServicesLocal {

	Boolean addBuyer(Buyer theBuyer);

	Buyer findBuyer(Buyer theBuyer);

	Buyer findBuyerById(Long theId);

	Boolean updateBuyer(Buyer theBuyer);

	Boolean deleteBuyer(Buyer theBuyer);

}
