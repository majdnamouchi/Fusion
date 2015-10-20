package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;

@Local
public interface HistoryOfViewsServicesLocal {

	Boolean addHistoryOfViews(HistoryOfViews theHistoryOfViews);

	HistoryOfViews findHistoryOfViews(HistoryOfViews theHistoryOfViews);

	HistoryOfViews findHistoryOfViewsById(Long theId);

	Boolean updateHistoryOfViews(HistoryOfViews theHistoryOfViews);

	Boolean deleteHistoryOfViews(HistoryOfViews theHistoryOfViews);

}
