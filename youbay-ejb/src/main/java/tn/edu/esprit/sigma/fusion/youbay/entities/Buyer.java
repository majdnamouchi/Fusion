package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Buyer
 *
 */
@Entity
@Table(name = "T_BUYER")
public class Buyer extends YouBayUser implements Serializable {

	private String buyerBadges;
	private Boolean iSMale;
	private Float totalSpending;
	private String AddressLine1;
	private String AddressLine2;// NULABLE
	private String AddressCity;
	private Float AccountBalance;
	private Float gamificationScore;
	private List<OrderAndReview> orderAndReviews;

	private static final long serialVersionUID = 1L;
	/*
	 * link attributes
	 */
	private CustomizedAds customizedAds;
	private List<Auction> auctions;
	private List<HistoryOfViews> historyOfViewss;
	private List<Product> products;

	public Buyer() {
		super();
	}

	public Buyer(String buyerBadges, Boolean iSMale, Float totalSpending,
			String addressLine1, String addressLine2, String addressCity,
			Float accountBalance, Float gamificationScore) {
		super();
		this.buyerBadges = buyerBadges;
		this.iSMale = iSMale;
		this.totalSpending = totalSpending;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		AddressCity = addressCity;
		AccountBalance = accountBalance;
		this.gamificationScore = gamificationScore;
	}

	@Column(length = 1000)
	public String getBuyerBadges() {
		return buyerBadges;
	}

	public void setBuyerBadges(String buyerBadges) {
		this.buyerBadges = buyerBadges;
	}

	public Boolean getiSMale() {
		return iSMale;
	}

	public void setiSMale(Boolean iSMale) {
		this.iSMale = iSMale;
	}

	public Float getTotalSpending() {
		return totalSpending;
	}

	public void setTotalSpending(Float totalSpending) {
		this.totalSpending = totalSpending;
	}

	@Column(length = 200)
	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	@Column(length = 200)
	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	@Column(length = 200)
	public String getAddressCity() {
		return AddressCity;
	}

	public void setAddressCity(String addressCity) {
		AddressCity = addressCity;
	}

	public Float getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(Float accountBalance) {
		AccountBalance = accountBalance;
	}

	public Float getGamificationScore() {
		return gamificationScore;
	}

	public void setGamificationScore(Float gamificationScore) {
		this.gamificationScore = gamificationScore;
	}

	/*
	 * link attributes
	 */
	@ManyToOne
	public CustomizedAds getCustomizedAds() {
		return customizedAds;
	}

	public void setCustomizedAds(CustomizedAds customizedAds) {
		this.customizedAds = customizedAds;
	}

	@OneToMany(mappedBy = "buyer")
	public List<Auction> getAuctions() {
		return auctions;
	}

	public void setAuctions(List<Auction> auctions) {
		this.auctions = auctions;
	}

	@OneToMany(mappedBy = "buyer")
	public List<OrderAndReview> getOrderAndReviews() {
		return orderAndReviews;
	}

	public void setOrderAndReviews(List<OrderAndReview> orderAndReviews) {
		this.orderAndReviews = orderAndReviews;
	}

	@OneToMany(mappedBy = "buyer")
	public List<HistoryOfViews> getHistoryOfViewss() {
		return historyOfViewss;
	}

	public void setHistoryOfViewss(List<HistoryOfViews> historyOfViewss) {
		this.historyOfViewss = historyOfViewss;
	}

	@ManyToMany
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}