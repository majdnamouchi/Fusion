package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Seller;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.SellerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SellerServicesRemote;

/**
 * Session Bean implementation class SellerServices
 */
@Stateless
public class SellerServices implements SellerServicesRemote,
		SellerServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public SellerServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addSeller(Seller theSeller) {
		Boolean b = false;
		try {
			entityManager.persist(theSeller);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Seller findSeller(Seller theSeller) {
		return entityManager.find(Seller.class, theSeller.getYouBayUserId());
	}

	@Override
	public Seller findSellerById(Long theId) {
		return entityManager.find(Seller.class, theId);
	}

	@Override
	public Boolean updateSeller(Seller theSeller) {
		boolean b = false;
		try {
			entityManager.merge(theSeller);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteSeller(Seller theSeller) {
		Boolean b = false;
		try {
			theSeller = findSellerById(theSeller.getYouBayUserId());
			entityManager.remove(theSeller);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
