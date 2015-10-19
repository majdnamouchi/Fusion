package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity implementation class for Entity: HistoryOfViews
 *
 */

public class HistoryOfViews implements Serializable {
	private Long historyOfViewsId;
	private Date dateTimeOfView;
	private static final long serialVersionUID = 1L;

	public HistoryOfViews() {
		super();
	}

	public Date getDateTimeOfView() {
		return this.dateTimeOfView;
	}

	public void setDateTimeOfView(Date dateTimeOfView) {
		this.dateTimeOfView = dateTimeOfView;
	}

	public Long getHistoryOfViewsId() {
		return historyOfViewsId;
	}

	public void setHistoryOfViewsId(Long historyOfViewsId) {
		this.historyOfViewsId = historyOfViewsId;
	}

}
