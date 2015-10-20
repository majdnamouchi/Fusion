package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.OrderAndReview;

@Local
public interface OrderAndReviewServicesLocal {

	Boolean addOrderAndReview(OrderAndReview theOrderAndReview);

	OrderAndReview findOrderAndReview(OrderAndReview theOrderAndReview);

	OrderAndReview findOrderAndReviewById(Long theId);

	Boolean updateOrderAndReview(OrderAndReview theOrderAndReview);

	Boolean deleteOrderAndReview(OrderAndReview theOrderAndReview);

}
