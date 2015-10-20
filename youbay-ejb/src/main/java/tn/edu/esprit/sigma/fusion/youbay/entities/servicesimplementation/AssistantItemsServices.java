package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.AssistantItems;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.AssistantItemsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.AssistantItemsServicesRemote;

/**
 * Session Bean implementation class AssistantItemsServices
 */
@Stateless
public class AssistantItemsServices implements AssistantItemsServicesRemote,
		AssistantItemsServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public AssistantItemsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addAssistantItems(AssistantItems theAssistantItems) {
		Boolean b = false;
		try {
			entityManager.persist(theAssistantItems);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public AssistantItems findAssistantItems(AssistantItems theAssistantItems) {
		return entityManager.find(AssistantItems.class,
				theAssistantItems.getAssistantItemsId());
	}

	@Override
	public AssistantItems findAssistantItemsById(Long theId) {
		return entityManager.find(AssistantItems.class, theId);
	}

	@Override
	public Boolean updateAssistantItems(AssistantItems theAssistantItems) {
		boolean b = false;
		try {
			entityManager.merge(theAssistantItems);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteAssistantItems(AssistantItems theAssistantItems) {
		Boolean b = false;
		try {
			theAssistantItems = findAssistantItemsById(theAssistantItems
					.getAssistantItemsId());
			entityManager.remove(theAssistantItems);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
