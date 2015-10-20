package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.OrderAndReview;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.OrderAndReviewServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class OrderAndReviewServicesDelegate {
	public static final String jndiName = "youbay-ejb/OrderAndReviewServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.OrderAndReviewServicesRemote";

	public static OrderAndReviewServicesRemote getProxy() {
		return (OrderAndReviewServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddOrderAndReview(OrderAndReview theOrderAndReview) {

		return getProxy().addOrderAndReview(theOrderAndReview);
	}

	public static OrderAndReview doFindOrderAndReview(OrderAndReview theOrderAndReview) {

		return getProxy().findOrderAndReview(theOrderAndReview);
	}

	public static Boolean doUpdateOrderAndReview(OrderAndReview theOrderAndReview) {

		return getProxy().updateOrderAndReview(theOrderAndReview);
	}

	public static Boolean doDeleteOrderAndReview(OrderAndReview theOrderAndReview) {

		return getProxy().deleteOrderAndReview(theOrderAndReview);
	}

}