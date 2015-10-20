package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Seller;

@Remote
public interface SellerServicesRemote {

	Boolean addSeller(Seller theSeller);

	Seller findSeller(Seller theSeller);

	Seller findSellerById(Long theId);

	Boolean updateSeller(Seller theSeller);

	Boolean deleteSeller(Seller theSeller);

}
