package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.AssistantItems;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.AssistantItemsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.AssistantItemsServicesRemote;

/**
 * Session Bean implementation class AssistantItemsServices
 */
@Stateless
public class AssistantItemsServices implements AssistantItemsServicesRemote,
		AssistantItemsServicesLocal {

	/**
	 * Default constructor.
	 */
	public AssistantItemsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addAssistantItems(AssistantItems theAssistantItems) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssistantItems findAssistantItems(AssistantItems theAssistantItems) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssistantItems findAssistantItemsById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAssistantItems(AssistantItems theAssistantItems) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAssistantItems(AssistantItems theAssistantItems) {
		// TODO Auto-generated method stub
		return null;
	}

}
