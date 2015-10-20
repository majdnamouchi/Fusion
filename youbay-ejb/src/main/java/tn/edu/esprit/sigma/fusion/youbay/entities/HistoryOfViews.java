package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: HistoryOfViews
 *
 */
@Entity
@Table(name = "t_HistoryOfViews")
public class HistoryOfViews implements Serializable {
	private HistoryOfViewsId historyOfViewsId;
	private Date dateTimeOfView;

	private static final long serialVersionUID = 1L;

	/*
	 * link attributes
	 */
	private Buyer buyer;
	private Product product;

	public HistoryOfViews() {
		super();
	}

	public HistoryOfViews(Date dateTimeOfView, Buyer buyer, Product product) {
		super();
		this.historyOfViewsId.setProductId(product.getProductId());
		this.historyOfViewsId.setBuyerId(buyer.getYouBayUserId());
		this.dateTimeOfView = dateTimeOfView;

	}

	@EmbeddedId
	public HistoryOfViewsId getHistoryOfViewsId() {
		return historyOfViewsId;
	}

	public void setHistoryOfViewsId(HistoryOfViewsId historyOfViewsId) {
		this.historyOfViewsId = historyOfViewsId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateTimeOfView() {
		return this.dateTimeOfView;
	}

	public void setDateTimeOfView(Date dateTimeOfView) {
		this.dateTimeOfView = dateTimeOfView;
	}

	@ManyToOne
	@JoinColumn(name="BuyerId")
	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	@ManyToOne
	@JoinColumn(name="ProductId")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
