package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.ProductHistory;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductHistoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductHistoryServicesRemote;

/**
 * Session Bean implementation class ProductHistoryServices
 */
@Stateless
public class ProductHistoryServices implements ProductHistoryServicesRemote, ProductHistoryServicesLocal {

    /**
     * Default constructor. 
     */
    public ProductHistoryServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addProductHistory(ProductHistory theProductHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductHistory findProductHistory(ProductHistory theProductHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductHistory findProductHistoryById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateProductHistory(ProductHistory theProductHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProductHistory(ProductHistory theProductHistory) {
		// TODO Auto-generated method stub
		return null;
	}

}
