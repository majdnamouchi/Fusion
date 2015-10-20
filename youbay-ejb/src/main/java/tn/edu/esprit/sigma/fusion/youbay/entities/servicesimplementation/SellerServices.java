package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Seller;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SellerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SellerServicesRemote;

/**
 * Session Bean implementation class SellerServices
 */
@Stateless
public class SellerServices implements SellerServicesRemote, SellerServicesLocal {

    /**
     * Default constructor. 
     */
    public SellerServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addSeller(Seller theSeller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller findSeller(Seller theSeller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seller findSellerById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateSeller(Seller theSeller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSeller(Seller theSeller) {
		// TODO Auto-generated method stub
		return null;
	}

}
