package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;

@Remote
public interface HistoryOfViewsServicesRemote {

	Boolean addHistoryOfViews(HistoryOfViews theHistoryOfViews);

	HistoryOfViews findHistoryOfViews(HistoryOfViews theHistoryOfViews);

	HistoryOfViews findHistoryOfViewsById(Long theId);

	Boolean updateHistoryOfViews(HistoryOfViews theHistoryOfViews);

	Boolean deleteHistoryOfViews(HistoryOfViews theHistoryOfViews);

}
