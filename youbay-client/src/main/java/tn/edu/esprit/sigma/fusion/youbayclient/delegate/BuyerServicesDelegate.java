package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Buyer;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.BuyerServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class BuyerServicesDelegate {
	public static final String jndiName = "youbay-ejb/BuyerServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.BuyerServicesRemote";

	public static BuyerServicesRemote getProxy() {
		return (BuyerServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddBuyer(Buyer theBuyer) {

		return getProxy().addBuyer(theBuyer);
	}

	public static Buyer doFindBuyer(Buyer theBuyer) {

		return getProxy().findBuyer(theBuyer);
	}

	public static Buyer doFindBuyerById(Long theId) {

		return getProxy().findBuyerById(theId);
	}

	public static Boolean doUpdateBuyer(Buyer theBuyer) {

		return getProxy().updateBuyer(theBuyer);
	}

	public static Boolean doDeleteBuyer(Buyer theBuyer) {

		return getProxy().deleteBuyer(theBuyer);
	}

}