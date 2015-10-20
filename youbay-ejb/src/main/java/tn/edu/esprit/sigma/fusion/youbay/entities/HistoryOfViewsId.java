package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class HistoryOfViewsId implements Serializable {

	private Long historyOfViewsIdId;
	private Long ProductId;
	private Long BuyerId;

	private static final long serialVersionUID = 1L;

	public HistoryOfViewsId() {
		super();
	}

	public HistoryOfViewsId(Long productId, Long buyerId) {
		super();
		ProductId = productId;
		BuyerId = buyerId;
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long gethistoryOfViewsIdId() {
		return historyOfViewsIdId;
	}

	public void sethistoryOfViewsIdId(Long historyOfViewsIdId) {
		this.historyOfViewsIdId = historyOfViewsIdId;
	}

	public Long getProductId() {
		return this.ProductId;
	}

	public void setProductId(Long ProductId) {
		this.ProductId = ProductId;
	}

	public Long getBuyerId() {
		return this.BuyerId;
	}

	public void setBuyerId(Long BuyerId) {
		this.BuyerId = BuyerId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BuyerId == null) ? 0 : BuyerId.hashCode());
		result = prime * result
				+ ((ProductId == null) ? 0 : ProductId.hashCode());
		result = prime
				* result
				+ ((historyOfViewsIdId == null) ? 0 : historyOfViewsIdId
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistoryOfViewsId other = (HistoryOfViewsId) obj;
		if (BuyerId == null) {
			if (other.BuyerId != null)
				return false;
		} else if (!BuyerId.equals(other.BuyerId))
			return false;
		if (ProductId == null) {
			if (other.ProductId != null)
				return false;
		} else if (!ProductId.equals(other.ProductId))
			return false;
		if (historyOfViewsIdId == null) {
			if (other.historyOfViewsIdId != null)
				return false;
		} else if (!historyOfViewsIdId.equals(other.historyOfViewsIdId))
			return false;
		return true;
	}

}