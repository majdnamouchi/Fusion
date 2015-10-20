package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

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

}
