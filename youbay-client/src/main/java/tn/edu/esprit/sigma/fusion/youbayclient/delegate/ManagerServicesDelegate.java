package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Manager;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ManagerServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class ManagerServicesDelegate {
	public static final String jndiName = "youbay-ejb/ManagerServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ManagerServicesRemote";

	public static ManagerServicesRemote getProxy() {
		return (ManagerServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	public static Boolean doAddManager(Manager theManager) {
		return getProxy().addManager(theManager);
	}

	public static Manager doFindManager(Manager theManager) {
		return getProxy().findManager(theManager);
	}

	public static Manager doFindManagerById(Long theId) {
		return getProxy().findManagerById(theId);
	}

	public static Boolean doUpdateManager(Manager theManager) {
		return getProxy().updateManager(theManager);
	}

	public static Boolean doDeleteManager(Manager theManager) {
		return getProxy().deleteManager(theManager);
	}

}