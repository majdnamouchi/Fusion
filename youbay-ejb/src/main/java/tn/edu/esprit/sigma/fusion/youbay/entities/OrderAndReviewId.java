package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Entity implementation class for Entity: OrderAndReviewId
 *
 */
@Embeddable
public class OrderAndReviewId implements Serializable {

	private Long orderAndReviewIdId;
	private Long ProductId;
	private Long BuyerId;

	private static final long serialVersionUID = 1L;

	public OrderAndReviewId() {
		super();
	}

	public OrderAndReviewId(Long productId, Long buyerId) {
		super();
		ProductId = productId;
		BuyerId = buyerId;
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

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getOrderAndReviewIdId() {
		return orderAndReviewIdId;
	}

	public void setOrderAndReviewIdId(Long orderAndReviewIdId) {
		this.orderAndReviewIdId = orderAndReviewIdId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BuyerId == null) ? 0 : BuyerId.hashCode());
		result = prime
				* result
				+ ((orderAndReviewIdId == null) ? 0 : orderAndReviewIdId
						.hashCode());
		result = prime * result
				+ ((ProductId == null) ? 0 : ProductId.hashCode());
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
		OrderAndReviewId other = (OrderAndReviewId) obj;
		if (BuyerId == null) {
			if (other.BuyerId != null)
				return false;
		} else if (!BuyerId.equals(other.BuyerId))
			return false;
		if (orderAndReviewIdId == null) {
			if (other.orderAndReviewIdId != null)
				return false;
		} else if (!orderAndReviewIdId.equals(other.orderAndReviewIdId))
			return false;
		if (ProductId == null) {
			if (other.ProductId != null)
				return false;
		} else if (!ProductId.equals(other.ProductId))
			return false;
		return true;
	}

}
