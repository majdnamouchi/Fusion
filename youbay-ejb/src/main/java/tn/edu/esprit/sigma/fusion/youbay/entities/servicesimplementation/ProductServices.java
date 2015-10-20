package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Product;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ProductServicesRemote;

/**
 * Session Bean implementation class ProductServices
 */
@Stateless
public class ProductServices implements ProductServicesRemote, ProductServicesLocal {

    /**
     * Default constructor. 
     */
    public ProductServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addProduct(Product theProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProduct(Product theProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateProduct(Product theProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProduct(Product theProduct) {
		// TODO Auto-generated method stub
		return null;
	}

}
