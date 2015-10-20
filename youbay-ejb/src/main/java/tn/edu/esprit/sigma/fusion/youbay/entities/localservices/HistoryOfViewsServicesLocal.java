package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;

@Local
public interface HistoryOfViewsServicesLocal {

	Boolean addHistoryOfViews(HistoryOfViews theHistoryOfViews);

	HistoryOfViews findHistoryOfViews(HistoryOfViews theHistoryOfViews);

	

	Boolean updateHistoryOfViews(HistoryOfViews theHistoryOfViews);

	Boolean deleteHistoryOfViews(HistoryOfViews theHistoryOfViews);

}
