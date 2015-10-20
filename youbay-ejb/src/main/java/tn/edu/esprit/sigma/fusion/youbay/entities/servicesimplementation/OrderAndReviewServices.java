package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.OrderAndReview;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.OrderAndReviewServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.OrderAndReviewServicesRemote;

/**
 * Session Bean implementation class OrderAndReviewServices
 */
@Stateless
public class OrderAndReviewServices implements OrderAndReviewServicesRemote, OrderAndReviewServicesLocal {

    /**
     * Default constructor. 
     */
    public OrderAndReviewServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addOrderAndReview(OrderAndReview theOrderAndReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderAndReview findOrderAndReview(OrderAndReview theOrderAndReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderAndReview findOrderAndReviewById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateOrderAndReview(OrderAndReview theOrderAndReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteOrderAndReview(OrderAndReview theOrderAndReview) {
		// TODO Auto-generated method stub
		return null;
	}

}
