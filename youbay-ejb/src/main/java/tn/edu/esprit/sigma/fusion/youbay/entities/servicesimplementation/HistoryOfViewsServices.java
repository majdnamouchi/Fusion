package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.HistoryOfViewsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.HistoryOfViewsServicesRemote;

/**
 * Session Bean implementation class HistoryOfViewsServices
 */
@Stateless
public class HistoryOfViewsServices implements HistoryOfViewsServicesRemote, HistoryOfViewsServicesLocal {

    /**
     * Default constructor. 
     */
    public HistoryOfViewsServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistoryOfViews findHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistoryOfViews findHistoryOfViewsById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteHistoryOfViews(HistoryOfViews theHistoryOfViews) {
		// TODO Auto-generated method stub
		return null;
	}

}
