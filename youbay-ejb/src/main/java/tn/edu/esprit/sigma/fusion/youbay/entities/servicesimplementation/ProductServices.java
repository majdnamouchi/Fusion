package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Product;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.ProductServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ProductServicesRemote;

/**
 * Session Bean implementation class ProductServices
 */
@Stateless
public class ProductServices implements ProductServicesRemote,
		ProductServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProductServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addProduct(Product theProduct) {
		Boolean b = false;
		try {
			entityManager.persist(theProduct);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Product findProduct(Product theProduct) {
		return entityManager.find(Product.class, theProduct.getProductId());
	}

	@Override
	public Product findProductById(Long theId) {
		return entityManager.find(Product.class, theId);
	}

	@Override
	public Boolean updateProduct(Product theProduct) {
		boolean b = false;
		try {
			entityManager.merge(theProduct);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteProduct(Product theProduct) {
		Boolean b = false;
		try {
			theProduct = findProductById(theProduct.getProductId());
			entityManager.remove(theProduct);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
