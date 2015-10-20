package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.AssistantItems;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.AssistantItemsServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class AssistantItemsServicesDelegate {
	public static final String jndiName = "youbay-ejb/AssistantItemsServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.AssistantItemsServicesRemote";

	public static AssistantItemsServicesRemote getProxy() {
		return (AssistantItemsServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}

	public static Boolean doAddAssistantItems(AssistantItems theAssistantItems) {

		return getProxy().addAssistantItems(theAssistantItems);
	}

	public static AssistantItems doFindAssistantItems(AssistantItems theAssistantItems) {

		return getProxy().findAssistantItems(theAssistantItems);
	}

	public static AssistantItems doFindAssistantItemsById(Long theId) {

		return getProxy().findAssistantItemsById(theId);
	}

	public static Boolean doUpdateAssistantItems(AssistantItems theAssistantItems) {

		return getProxy().updateAssistantItems(theAssistantItems);
	}

	public static Boolean doDeleteAssistantItems(AssistantItems theAssistantItems) {

		return getProxy().deleteAssistantItems(theAssistantItems);
	}

}