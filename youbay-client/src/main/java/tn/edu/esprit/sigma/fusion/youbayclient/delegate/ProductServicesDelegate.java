package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Product;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ProductServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class ProductServicesDelegate {
	public static final String jndiName = "youbay-ejb/ProductServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ProductServicesRemote";

	public static ProductServicesRemote getProxy() {
		return (ProductServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddProduct(Product theProduct) {

		return getProxy().addProduct(theProduct);
	}

	public static Product doFindProduct(Product theProduct) {

		return getProxy().findProduct(theProduct);
	}

	public static  Product doFindProductById(Long theId) {

		return getProxy().findProductById(theId);
	}

	public static Boolean doUpdateProduct(Product theProduct) {

		return getProxy().updateProduct(theProduct);
	}

	public static Boolean doDeleteProduct(Product theProduct) {
		
		return getProxy().deleteProduct(theProduct);
	}

}