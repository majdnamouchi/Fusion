package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Seller;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SellerServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class SellerServicesDelegate {
	public static final String jndiName = "youbay-ejb/SellerServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SellerServicesRemote";

	public static SellerServicesRemote getProxy() {
		return (SellerServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddSeller(Seller theSeller) {
		return getProxy().addSeller(theSeller);
	}

	public static Seller doFindSeller(Seller theSeller) {
		return getProxy().findSeller(theSeller);
	}

	public static Seller doFindSellerById(Long theId) {
		return getProxy().findSellerById(theId);
	}

	public static Boolean doUpdateSeller(Seller theSeller) {
		return getProxy().updateSeller(theSeller);
	}

	public static Boolean doDeleteSeller(Seller theSeller) {
		return getProxy().deleteSeller(theSeller);
	}

}