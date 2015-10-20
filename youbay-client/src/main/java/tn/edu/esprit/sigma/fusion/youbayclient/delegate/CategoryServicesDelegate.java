package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Category;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.CategoryServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class CategoryServicesDelegate {
	public static final String jndiName = "youbay-ejb/CategoryServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.CategoryServicesRemote";

	public static CategoryServicesRemote getProxy() {
		return (CategoryServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	
	public static Boolean doAddCategory(Category theCategory) {
		
		return getProxy().addCategory(theCategory);
	}

	
	public static Category doFindCategory(Category theCategory) {
		
		return getProxy().findCategory(theCategory);
	}

	
	public static Category doFindCategoryById(Long theId) {
		
		return getProxy().findCategoryById(theId);
	}

	
	public static  Boolean doUpdateCategory(Category theCategory) {
		
		return getProxy().updateCategory(theCategory);
	}

	
	public static Boolean doDeleteCategory(Category theCategory) {
		
		return getProxy().deleteCategory(theCategory);
	}

}