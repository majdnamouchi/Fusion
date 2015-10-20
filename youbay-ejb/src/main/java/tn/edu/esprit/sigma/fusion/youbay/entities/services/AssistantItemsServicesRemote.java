package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.AssistantItems;

@Remote
public interface AssistantItemsServicesRemote {
	Boolean addAssistantItems(AssistantItems theAssistantItems);

	AssistantItems findAssistantItems(AssistantItems theAssistantItems);

	AssistantItems findAssistantItemsById(Long theId);

	Boolean updateAssistantItems(AssistantItems theAssistantItems);

	Boolean deleteAssistantItems(AssistantItems theAssistantItems);

}
