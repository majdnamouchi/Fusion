package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.ProductHistory;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ProductHistoryServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class ProductHistoryServicesDelegate {
	public static final String jndiName = "youbay-ejb/ProductHistoryServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ProductHistoryServicesRemote";

	public static ProductHistoryServicesRemote getProxy() {
		return (ProductHistoryServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddProductHistory(ProductHistory theProductHistory) {
		
		return getProxy().addProductHistory(theProductHistory);
	}

	public static ProductHistory  doFindProductHistory(ProductHistory theProductHistory) {
		
		return getProxy().findProductHistory(theProductHistory);
	}

	public static ProductHistory  doFindProductHistoryById(Long theId) {
		
		return getProxy().findProductHistoryById(theId);
	}

	public static Boolean  doUpdateProductHistory(ProductHistory theProductHistory) {
		
		return getProxy().updateProductHistory(theProductHistory);
	}

	public static Boolean  doDeleteProductHistory(ProductHistory theProductHistory) {
		
		return getProxy().deleteProductHistory(theProductHistory);
	}
}