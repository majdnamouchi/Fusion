package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.HistoryOfViewsServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class HistoryOfViewsServicesDelegate {
	public static final String jndiName = "youbay-ejb/HistoryOfViewsServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.HistoryOfViewsServicesRemote";

	public static HistoryOfViewsServicesRemote getProxy() {
		return (HistoryOfViewsServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddHistoryOfViews(HistoryOfViews theHistoryOfViews) {

		return getProxy().addHistoryOfViews(theHistoryOfViews);
	}

	public static HistoryOfViews doFindHistoryOfViews(HistoryOfViews theHistoryOfViews) {

		return getProxy().findHistoryOfViews(theHistoryOfViews);
	}

	public static Boolean doUpdateHistoryOfViews(HistoryOfViews theHistoryOfViews) {

		return getProxy().updateHistoryOfViews(theHistoryOfViews);
	}

	public static Boolean doDeleteHistoryOfViews(HistoryOfViews theHistoryOfViews) {

		return getProxy().deleteHistoryOfViews(theHistoryOfViews);
	}

}