package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import tn.edu.esprit.sigma.fusion.youbay.utilities.DataValidators;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity
@Table(name = "T_PRODUCT")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long productId;
	private String productName;
	private String productImage;// URL-IMAGE
	private String productDescription;
	private Float SellerPrice;
	private String subcategoryAttributesAndValues;
	private Float isDisabledBySeller;
	private Float isDisabledByAdmin;
	private Integer quantityAvailable;
	/*
	 * link attributes
	 */

	private Seller seller;
	private Subcategory subcategory;
	private List<SpecialPromotion> specialPromotions;
	private List<ProductHistory> productHistories;
	private List<CustomizedAds> customizedAdss;
	private List<Auction> auctions;
	private List<OrderAndReview> orderAndReviews;
	private List<HistoryOfViews> historyOfViewss;
	private List<Buyer> buyers;

	public Product() {
		super();
	}

	public Product(String productName, String productImage,
			String productDescription, Float sellerPrice,
			String subcategoryAttributesAndValues, Float isDisabledBySeller,
			Float isDisabledByAdmin, Integer quantityAvailable) {
		super();
		this.productName = productName;
		this.productImage = productImage;
		this.productDescription = productDescription;
		SellerPrice = sellerPrice;
		this.subcategoryAttributesAndValues = subcategoryAttributesAndValues;
		this.isDisabledBySeller = isDisabledBySeller;
		this.isDisabledByAdmin = isDisabledByAdmin;
		this.quantityAvailable = quantityAvailable;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Column(length = 25)
	public String getProductName() {
		return this.productName;
	}

	@Column(length = 1000)
	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Column(length = 1000)
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Float getSellerPrice() {
		return SellerPrice;
	}

	public void setSellerPrice(Float sellerPrice) {
		SellerPrice = sellerPrice;
	}

	@Column(length = 1000)
	public String getSubcategoryAttributesAndValues() {
		return subcategoryAttributesAndValues;
	}

	public void setSubcategoryAttributesAndValues(
			String subcategoryAttributesAndValues) throws Exception {
		if (DataValidators
				.checkIfStringIsValidImageURL(subcategoryAttributesAndValues)) {
			this.subcategoryAttributesAndValues = subcategoryAttributesAndValues;
		} else
			throw new Exception("    >>>>>>   "
					+ Product.class.getCanonicalName() + " - method : "
					+ "setSellerLogo - " + " illegal image URL : "
					+ subcategoryAttributesAndValues + " ! ");

	}

	public Float getIsDisabledBySeller() {
		return isDisabledBySeller;
	}

	public void setIsDisabledBySeller(Float isDisabledBySeller) {
		this.isDisabledBySeller = isDisabledBySeller;
	}

	public Float getIsDisabledByAdmin() {
		return isDisabledByAdmin;
	}

	public void setIsDisabledByAdmin(Float isDisabledByAdmin) {
		this.isDisabledByAdmin = isDisabledByAdmin;
	}

	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * link attributes
	 */
	@ManyToOne
	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@ManyToOne
	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	@OneToMany(mappedBy = "product")
	public List<SpecialPromotion> getSpecialPromotions() {
		return specialPromotions;
	}

	public void setSpecialPromotions(List<SpecialPromotion> specialPromotions) {
		this.specialPromotions = specialPromotions;
	}

	@OneToMany(mappedBy = "product")
	public List<ProductHistory> getProductHistories() {
		return productHistories;
	}

	public void setProductHistories(List<ProductHistory> productHistories) {
		this.productHistories = productHistories;
	}

	@OneToMany(mappedBy = "product")
	public List<CustomizedAds> getCustomizedAdss() {
		return customizedAdss;
	}

	public void setCustomizedAdss(List<CustomizedAds> customizedAdss) {
		this.customizedAdss = customizedAdss;
	}

	@OneToMany(mappedBy = "product")
	public List<Auction> getAuctions() {
		return auctions;
	}

	public void setAuctions(List<Auction> auctions) {
		this.auctions = auctions;
	}

	@OneToMany(mappedBy = "product")
	public List<OrderAndReview> getOrderAndReviews() {
		return orderAndReviews;
	}

	public void setOrderAndReviews(List<OrderAndReview> orderAndReviews) {
		this.orderAndReviews = orderAndReviews;
	}

	@OneToMany(mappedBy = "product")
	public List<HistoryOfViews> getHistoryOfViewss() {
		return historyOfViewss;
	}

	public void setHistoryOfViewss(List<HistoryOfViews> historyOfViewss) {
		this.historyOfViewss = historyOfViewss;
	}

	@ManyToMany(mappedBy = "products")
	public List<Buyer> getBuyers() {
		return buyers;
	}

	public void setBuyers(List<Buyer> buyers) {
		this.buyers = buyers;
	}

}
