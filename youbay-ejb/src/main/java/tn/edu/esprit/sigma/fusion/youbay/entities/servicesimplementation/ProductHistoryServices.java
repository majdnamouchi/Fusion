package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.ProductHistory;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.ProductHistoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ProductHistoryServicesRemote;

/**
 * Session Bean implementation class ProductHistoryServices
 */
@Stateless
public class ProductHistoryServices implements ProductHistoryServicesRemote,
		ProductHistoryServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ProductHistoryServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addProductHistory(ProductHistory theProductHistory) {
		Boolean b = false;
		try {
			entityManager.persist(theProductHistory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public ProductHistory findProductHistory(ProductHistory theProductHistory) {
		return entityManager.find(ProductHistory.class,
				theProductHistory.getPriceHistoryId());
	}

	@Override
	public ProductHistory findProductHistoryById(Long theId) {
		return entityManager.find(ProductHistory.class, theId);
	}

	@Override
	public Boolean updateProductHistory(ProductHistory theProductHistory) {
		boolean b = false;
		try {
			entityManager.merge(theProductHistory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteProductHistory(ProductHistory theProductHistory) {
		Boolean b = false;
		try {
			theProductHistory = findProductHistoryById(theProductHistory
					.getPriceHistoryId());
			entityManager.remove(theProductHistory);
			b = true;
		} catch (Exception e) {
		}
		return b;	}

}
