package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.CustomizedAds;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.CustomizedAdsServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class CustomizedAdsServicesDelegate {
	public static final String jndiName = "youbay-ejb/CustomizedAdsServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.CustomizedAdsServicesRemote";

	public static CustomizedAdsServicesRemote getProxy() {
		return (CustomizedAdsServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddCustomizedAds(CustomizedAds theCustomizedAds) {

		return getProxy().addCustomizedAds(theCustomizedAds);
	}

	public static CustomizedAds doFindCustomizedAds(CustomizedAds theCustomizedAds) {

		return getProxy().findCustomizedAds(theCustomizedAds);
	}

	public static CustomizedAds doFindCustomizedAdsById(Long theId) {

		return getProxy().findCustomizedAdsById(theId);
	}

	public static Boolean doUpdateCustomizedAds(CustomizedAds theCustomizedAds) {

		return getProxy().updateCustomizedAds(theCustomizedAds);
	}

	public static Boolean doDeleteCustomizedAds(CustomizedAds theCustomizedAds) {

		return getProxy().deleteCustomizedAds(theCustomizedAds);
	}

}