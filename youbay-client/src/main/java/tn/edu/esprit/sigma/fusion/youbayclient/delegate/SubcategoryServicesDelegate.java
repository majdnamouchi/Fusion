package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Subcategory;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SubcategoryServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class SubcategoryServicesDelegate {
	public static final String jndiName = "youbay-ejb/SubcategoryServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SubcategoryServicesRemote";

	public static SubcategoryServicesRemote getProxy() {
		return (SubcategoryServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddSubcategory(Subcategory theSubcategory) {
		return getProxy().addSubcategory(theSubcategory);
	}

	public static Subcategory doFindSubcategory(Subcategory theSubcategory) {
		return getProxy().findSubcategory(theSubcategory);
	}

	public static Subcategory doFindSubcategoryById(Long theId) {
		return getProxy().findSubcategoryById(theId);
	}

	public static Boolean doUpdateSubcategory(Subcategory theSubcategory) {
		return getProxy().updateSubcategory(theSubcategory);
	}

	public static  Boolean doDeleteSubcategory(Subcategory theSubcategory) {

		return getProxy().deleteSubcategory(theSubcategory);
	}

}