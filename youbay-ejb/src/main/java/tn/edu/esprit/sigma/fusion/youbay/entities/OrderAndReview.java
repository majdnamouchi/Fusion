package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: OrderAndReview
 *
 */
@Entity
@Table(name = "T_ORDERANDREVIEW")
public class OrderAndReview implements Serializable {

	private OrderAndReviewId orderAndReviewId;
	private Float pricePaidByBuyer;
	private String initialMessageToSeller;
	private Boolean oderFulfilledBySeller;
	private Boolean hasFiledComplaint;
	private Date dateOfPurchase;
	private Boolean orderDeliveredToBuyer;
	private Boolean buyerHasLeftAReview;
	private String reviewTitle;
	private String reviewText;
	private Integer productRating;

	private static final long serialVersionUID = 1L;

	/**
	 * link attributes
	 */
	private Buyer buyer;
	private Product product;

	public OrderAndReview() {

	}

	public OrderAndReview(Float pricePaidByBuyer,
			String initialMessageToSeller, Boolean oderFulfilledBySeller,
			Boolean hasFiledComplaint, Date dateOfPurchase,
			Boolean orderDeliveredToBuyer, Boolean buyerHasLeftAReview,
			String reviewTitle, String reviewText, Integer productRating,
			Buyer buyer, Product product) {
		super();
		this.orderAndReviewId.setBuyerId(buyer.getYouBayUserId());
		this.orderAndReviewId.setProductId(product.getProductId());
		this.pricePaidByBuyer = pricePaidByBuyer;
		this.initialMessageToSeller = initialMessageToSeller;
		this.oderFulfilledBySeller = oderFulfilledBySeller;
		this.hasFiledComplaint = hasFiledComplaint;
		this.dateOfPurchase = dateOfPurchase;
		this.orderDeliveredToBuyer = orderDeliveredToBuyer;
		this.buyerHasLeftAReview = buyerHasLeftAReview;
		this.reviewTitle = reviewTitle;
		this.reviewText = reviewText;
		this.productRating = productRating;
		this.buyer = buyer;
		this.product = product;
	}

	@EmbeddedId
	public OrderAndReviewId getOrderAndReviewId() {
		return orderAndReviewId;
	}

	public void setOrderAndReviewId(OrderAndReviewId orderAndReviewId) {
		this.orderAndReviewId = orderAndReviewId;
	}

	public Float getPricePaidByBuyer() {
		return pricePaidByBuyer;
	}

	public void setPricePaidByBuyer(Float pricePaidByBuyer) {
		this.pricePaidByBuyer = pricePaidByBuyer;
	}

	@Column(length = 1000)
	public String getInitialMessageToSeller() {
		return initialMessageToSeller;
	}

	public void setInitialMessageToSeller(String initialMessageToSeller) {
		this.initialMessageToSeller = initialMessageToSeller;
	}

	public Boolean getOderFulfilledBySeller() {
		return oderFulfilledBySeller;
	}

	public void setOderFulfilledBySeller(Boolean oderFulfilledBySeller) {
		this.oderFulfilledBySeller = oderFulfilledBySeller;
	}

	public Boolean getHasFiledComplaint() {
		return hasFiledComplaint;
	}

	public void setHasFiledComplaint(Boolean hasFiledComplaint) {
		this.hasFiledComplaint = hasFiledComplaint;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Boolean getOrderDeliveredToBuyer() {
		return orderDeliveredToBuyer;
	}

	public void setOrderDeliveredToBuyer(Boolean orderDeliveredToBuyer) {
		this.orderDeliveredToBuyer = orderDeliveredToBuyer;
	}

	public Boolean getBuyerHasLeftAReview() {
		return buyerHasLeftAReview;
	}

	public void setBuyerHasLeftAReview(Boolean buyerHasLeftAReview) {
		this.buyerHasLeftAReview = buyerHasLeftAReview;
	}

	@Column(length = 25)
	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	@Column(length = 1000)
	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Integer getProductRating() {
		return productRating;
	}

	public void setProductRating(Integer productRating) {
		this.productRating = productRating;
		/**
		 * 
		 */
	}

	@ManyToOne
	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}