package tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.HistoryOfViews;

@Remote
public interface HistoryOfViewsServicesRemote {

	Boolean addHistoryOfViews(HistoryOfViews theHistoryOfViews);

	HistoryOfViews findHistoryOfViews(HistoryOfViews theHistoryOfViews);



	Boolean updateHistoryOfViews(HistoryOfViews theHistoryOfViews);

	Boolean deleteHistoryOfViews(HistoryOfViews theHistoryOfViews);

}
