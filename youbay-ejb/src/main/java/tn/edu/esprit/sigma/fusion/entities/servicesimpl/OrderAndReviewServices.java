package tn.edu.esprit.sigma.fusion.entities.servicesimpl;

import javax.ejb.Stateless;
import tn.edu.esprit.sigma.fusion.entities.services.OrderAndReviewServicesLocal;
import tn.edu.esprit.sigma.fusion.entities.services.OrderAndReviewServicesRemote;

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
