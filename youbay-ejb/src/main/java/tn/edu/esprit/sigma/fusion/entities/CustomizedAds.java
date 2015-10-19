package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: CustomizedAds
 *
 */
@Entity
@Table(name = "T_CUSTOMIZEDADS")
public class CustomizedAds implements Serializable {

	private Long customizedAdsId;
	private Date startDate;
	private Date endDate;
	private Float importanceScore;
	private String customizedMessage;
	private Boolean isAPurchasedAd;
	private Boolean isACustomizedMarketingAd;

	private static final long serialVersionUID = 1L;

	/*
	 * link attributes
	 */
	private List<Buyer> buyers;
	private Product product;

	public CustomizedAds() {
		super();
	}

	public CustomizedAds(Date startDate, Date endDate, Float importanceScore,
			String customizedMessage, Boolean isAPurchasedAd,
			Boolean isACustomizedMarketingAd) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.importanceScore = importanceScore;
		this.customizedMessage = customizedMessage;
		this.isAPurchasedAd = isAPurchasedAd;
		this.isACustomizedMarketingAd = isACustomizedMarketingAd;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCustomizedAdsId() {
		return customizedAdsId;
	}

	public void setCustomizedAdsId(Long customizedAdsId) {
		this.customizedAdsId = customizedAdsId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Float getImportanceScore() {
		return importanceScore;
	}

	public void setImportanceScore(Float importanceScore) {
		this.importanceScore = importanceScore;
	}

	public String getCustomizedMessage() {
		return customizedMessage;
	}

	public void setCustomizedMessage(String customizedMessage) {
		this.customizedMessage = customizedMessage;
	}

	public Boolean getIsAPurchasedAd() {
		return isAPurchasedAd;
	}

	public void setIsAPurchasedAd(Boolean isAPurchasedAd) {
		this.isAPurchasedAd = isAPurchasedAd;
	}

	public Boolean getIsACustomizedMarketingAd() {
		return isACustomizedMarketingAd;
	}

	public void setIsACustomizedMarketingAd(Boolean isACustomizedMarketingAd) {
		this.isACustomizedMarketingAd = isACustomizedMarketingAd;
	}

	@OneToMany(mappedBy = "customizedAds")
	public List<Buyer> getBuyers() {
		return buyers;
	}

	public void setBuyers(List<Buyer> buyers) {
		this.buyers = buyers;
	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
