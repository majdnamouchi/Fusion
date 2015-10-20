package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Buyer;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.BuyerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.BuyerServicesRemote;

/**
 * Session Bean implementation class BuyerServices
 */
@Stateless
public class BuyerServices implements BuyerServicesRemote, BuyerServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public BuyerServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addBuyer(Buyer theBuyer) {
		Boolean b = false;
		try {
			entityManager.persist(theBuyer);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Buyer findBuyer(Buyer theBuyer) {
		return entityManager.find(Buyer.class, theBuyer.getYouBayUserId());
	}

	@Override
	public Buyer findBuyerById(Long theId) {
		return entityManager.find(Buyer.class, theId);
	}

	@Override
	public Boolean updateBuyer(Buyer theBuyer) {
		boolean b = false;
		try {
			entityManager.merge(theBuyer);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteBuyer(Buyer theBuyer) {
		Boolean b = false;
		try {
			theBuyer = findBuyerById(theBuyer.getYouBayUserId());
			entityManager.remove(theBuyer);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
