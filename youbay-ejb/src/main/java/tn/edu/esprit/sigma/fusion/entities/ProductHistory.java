package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import tn.edu.esprit.sigma.fusion.utilities.DataValidators;

/**
 * Entity implementation class for Entity: ProductHistory
 *
 */
@Entity
@Table(name="T_PRODUCTHISTORY")

public class ProductHistory implements Serializable {

	
	private Long priceHistoryId;
	private Date historyDate;
	private String productNameHistory;
	private String productImageHistory;//URL-IMAGE
	private String productShortDescriptionHistory;
	private String productMainDescriptionHistory;
	private Float sellerPriceHistory;
	private String subcategoryAdditionalValuesHistory;
	private Integer quantityAvailableHistory;
	
	private static final long serialVersionUID = 1L;

	public ProductHistory() {
		super();
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getPriceHistoryId() {
		return this.priceHistoryId;
	}

	public void setPriceHistoryId(Long priceHistoryId) {
		this.priceHistoryId = priceHistoryId;
	}   
	@Temporal(TemporalType.TIMESTAMP)
	public Date getHistoryDate() {
		return this.historyDate;
	}

	public void setHistoryDate(Date historyDate) {
		this.historyDate = historyDate;
	}   
	@Column(length=25)
	public String getProductNameHistory() {
		return this.productNameHistory;
	}

	public void setProductNameHistory(String productNameHistory) {
		this.productNameHistory = productNameHistory;
	}   
	@Column(length=1000)
	public String getProductImageHistory() {
		return this.productImageHistory;
	}

	public void setProductImageHistory(String productImageHistory) throws Exception {
		
		if (DataValidators.checkIfStringIsValidImageURL(productImageHistory)){
			this.productImageHistory = productImageHistory;	
		}else throw new Exception("    >>>>>>   " + ProductHistory.class.getCanonicalName() + " - method : " +
			"setProductImageHistory - "+ " illegal image URL : " + productImageHistory + " ! " );
		
	}   
	public String getProductShortDescriptionHistory() {
		return this.productShortDescriptionHistory;
	}

	public void setProductShortDescriptionHistory(String productShortDescriptionHistory) {
		this.productShortDescriptionHistory = productShortDescriptionHistory;
	}
	
@Column(length=1000)
	public String getProductMainDescriptionHistory() {
		return this.productMainDescriptionHistory;
	}

	public void setProductMainDescriptionHistory(String productMainDescriptionHistory) {
		this.productMainDescriptionHistory = productMainDescriptionHistory;
	}   
	
	public Float getSellerPriceHistory() {
		return this.sellerPriceHistory;
	}

	public void setSellerPriceHistory(Float sellerPriceHistory) {
		this.sellerPriceHistory = sellerPriceHistory;
	}   
	@Column(length=1000)
	public String getSubcategoryAdditionalValuesHistory() {
		return this.subcategoryAdditionalValuesHistory;
	}

	public void setSubcategoryAdditionalValuesHistory(String subcategoryAdditionalValuesHistory) {
		this.subcategoryAdditionalValuesHistory = subcategoryAdditionalValuesHistory;
	}   
	public Integer getQuantityAvailableHistory() {
		return this.quantityAvailableHistory;
	}

	public void setQuantityAvailableHistory(Integer quantityAvailableHistory) {
		this.quantityAvailableHistory = quantityAvailableHistory;
	}
   
}