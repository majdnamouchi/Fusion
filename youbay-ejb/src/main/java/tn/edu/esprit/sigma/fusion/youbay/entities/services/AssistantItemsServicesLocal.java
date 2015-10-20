package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.AssistantItems;

@Local
public interface AssistantItemsServicesLocal {
	Boolean addAssistantItems(AssistantItems theAssistantItems);

	AssistantItems findAssistantItems(AssistantItems theAssistantItems);

	AssistantItems findAssistantItemsById(Long theId);

	Boolean updateAssistantItems(AssistantItems theAssistantItems);

	Boolean deleteAssistantItems(AssistantItems theAssistantItems);

	// Comment for git testing purposes
	
}
