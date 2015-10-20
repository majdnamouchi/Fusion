package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.OrderAndReview;

@Remote
public interface OrderAndReviewServicesRemote {

	Boolean addOrderAndReview(OrderAndReview theOrderAndReview);

	OrderAndReview findOrderAndReview(OrderAndReview theOrderAndReview);

	OrderAndReview findOrderAndReviewById(Long theId);

	Boolean updateOrderAndReview(OrderAndReview theOrderAndReview);

	Boolean deleteOrderAndReview(OrderAndReview theOrderAndReview);

}
