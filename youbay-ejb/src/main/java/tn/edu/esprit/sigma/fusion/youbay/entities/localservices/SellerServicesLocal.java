package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Seller;

@Local
public interface SellerServicesLocal {

	Boolean addSeller(Seller theSeller);

	Seller findSeller(Seller theSeller);

	Seller findSellerById(Long theId);

	Boolean updateSeller(Seller theSeller);

	Boolean deleteSeller(Seller theSeller);

}
