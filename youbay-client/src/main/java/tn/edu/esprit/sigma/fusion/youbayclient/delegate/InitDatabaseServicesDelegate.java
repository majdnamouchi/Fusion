package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.utilities.InitDatabaseServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class InitDatabaseServicesDelegate {
	public static final String jndiName = "/youbay-ejb/InitDatabaseServices!tn.edu.esprit.sigma.fusion.youbay.utilities.InitDatabaseServicesRemote";

	public static InitDatabaseServicesRemote getProxy() {
		return (InitDatabaseServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static void doTruncateAllTables() {
		getProxy().truncateAllTables();
	}

	public static void doPopulateDatabase() {
		getProxy().populateDatabase();
	}

}