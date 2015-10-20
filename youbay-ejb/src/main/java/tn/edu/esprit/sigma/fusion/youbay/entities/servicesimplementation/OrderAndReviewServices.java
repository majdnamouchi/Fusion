package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.OrderAndReview;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.OrderAndReviewServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.OrderAndReviewServicesRemote;

/**
 * Session Bean implementation class OrderAndReviewServices
 */
@Stateless
public class OrderAndReviewServices implements OrderAndReviewServicesRemote,
		OrderAndReviewServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public OrderAndReviewServices() {
	}

	@Override
	public Boolean addOrderAndReview(OrderAndReview theOrderAndReview) {
		Boolean b = false;
		try {
			entityManager.persist(theOrderAndReview);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public OrderAndReview findOrderAndReview(OrderAndReview theOrderAndReview) {
		return entityManager.find(OrderAndReview.class,
				theOrderAndReview.getOrderAndReviewId());
	}

	@Override
	public Boolean updateOrderAndReview(OrderAndReview theOrderAndReview) {
		boolean b = false;
		try {
			entityManager.merge(theOrderAndReview);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteOrderAndReview(OrderAndReview theOrderAndReview) {
		//ATTENTION!
		//this is a composed key, we can't deleted unless
		//we delete the key-classes
		Boolean b = false;
		try {
			theOrderAndReview = findOrderAndReview(theOrderAndReview);
			entityManager.remove(theOrderAndReview);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
