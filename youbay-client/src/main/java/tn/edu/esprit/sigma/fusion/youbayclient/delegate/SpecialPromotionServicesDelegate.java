package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.SpecialPromotion;
import tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation.SpecialPromotionServices;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class SpecialPromotionServicesDelegate {
	public static final String jndiName = "youbay-ejb/SpecialPromotionServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SpecialPromotionServicesRemote";

	public static SpecialPromotionServices getProxy() {
		return (SpecialPromotionServices) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static  Boolean doAddSpecialPromotion(SpecialPromotion theSpecialPromotion) {

		return getProxy().addSpecialPromotion(theSpecialPromotion);
	}

	public static SpecialPromotion doFindSpecialPromotion(
			SpecialPromotion theSpecialPromotion) {

		return getProxy().findSpecialPromotion(theSpecialPromotion);
	}

	public static SpecialPromotion doFindSpecialPromotionById(Long theId) {

		return getProxy().findSpecialPromotionById(theId);
	}

	public static Boolean doUpdateSpecialPromotion(SpecialPromotion theSpecialPromotion) {

		return getProxy().updateSpecialPromotion(theSpecialPromotion);
	}

	public static Boolean doDeleteSpecialPromotion(SpecialPromotion theSpecialPromotion) {

		return getProxy().deleteSpecialPromotion(theSpecialPromotion);
	}

}