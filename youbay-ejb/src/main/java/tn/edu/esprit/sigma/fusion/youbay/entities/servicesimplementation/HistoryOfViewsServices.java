package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.HistoryOfViewsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.HistoryOfViewsServicesRemote;

/**
 * Session Bean implementation class HistoryOfViewsServices
 */
@Stateless
public class HistoryOfViewsServices implements HistoryOfViewsServicesRemote,
		HistoryOfViewsServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public HistoryOfViewsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		Boolean b = false;
		try {
			entityManager.persist(theHistoryOfViews);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public HistoryOfViews findHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		return entityManager.find(HistoryOfViews.class,
				theHistoryOfViews.getHistoryOfViewsId());
	}

	@Override
	public Boolean updateHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		boolean b = false;
		try {
			entityManager.merge(theHistoryOfViews);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		// ATTENTION!
		// this is a composed key, we can't deleted unless
		// we delete the key-classes
		Boolean b = false;
		try {
			theHistoryOfViews = findHistoryOfViews(theHistoryOfViews);
			entityManager.remove(theHistoryOfViews);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
