package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import tn.edu.esprit.sigma.fusion.utilities.DataValidators;


/**
 * Entity implementation class for Entity: Seller
 *
 */
@Entity
@Table(name = "T_SELLER")
public class Seller extends YouBayUser implements Serializable {

	private String sellerBadges;
	private Float totalSales;
	private Float complaintPercentage;
	private String sellerDescription;
	private Float gamificationScore;
	private Boolean sellerIsSuspiciousFlag;
	private String sellerLogo;// URL-image

	private static final long serialVersionUID = 1L;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(String firstName, String lastName, String email,
			String phoneNumber, Date birthday, String countryOfResidence,
			Boolean isActive, Boolean isBanned, String sellerBadges,
			Float totalSales, Float complaintPercentage,
			String sellerDescription, Float gamificationScore,
			Boolean sellerIsSuspiciousFlag, String sellerLogo) {
		super(firstName, lastName, email, phoneNumber, birthday,
				countryOfResidence, isActive, isBanned);
		this.sellerBadges = sellerBadges;
		this.totalSales = totalSales;
		this.complaintPercentage = complaintPercentage;
		this.sellerDescription = sellerDescription;
		this.gamificationScore = gamificationScore;
		this.sellerIsSuspiciousFlag = sellerIsSuspiciousFlag;
		this.sellerLogo = sellerLogo;
	}

	@Column(length = 1000)
	public String getSellerBadges() {
		return sellerBadges;
	}

	public void setSellerBadges(String sellerBadges) {
		this.sellerBadges = sellerBadges;
	}

	public Float getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(Float totalSales) {
		this.totalSales = totalSales;
	}

	public Float getComplaintPercentage() {
		return complaintPercentage;
	}

	public void setComplaintPercentage(Float complaintPercentage) {
		this.complaintPercentage = complaintPercentage;
	}

	@Column(length = 1000)
	public String getSellerDescription() {
		return sellerDescription;
	}

	public void setSellerDescription(String sellerDescription) {
		this.sellerDescription = sellerDescription;
	}

	public Float getGamificationScore() {
		return gamificationScore;
	}

	public void setGamificationScore(Float gamificationScore) {
		this.gamificationScore = gamificationScore;
	}

	public Boolean getSellerIsSuspiciousFlag() {
		return sellerIsSuspiciousFlag;
	}

	public void setSellerIsSuspiciousFlag(Boolean sellerIsSuspiciousFlag) {
		this.sellerIsSuspiciousFlag = sellerIsSuspiciousFlag;
	}

	@Column(length = 1000)
	public String getSellerLogo() {
		return sellerLogo;
	}

	public void setSellerLogo(String sellerLogo) throws Exception {
		if (DataValidators.checkIfStringIsValidImageURL(sellerLogo)){
			this.sellerLogo = sellerLogo;	
		}else throw new Exception("    >>>>>>   " + Seller.class.getCanonicalName() + " - method : " +
			"setSellerLogo - "+ " illegal image URL : " + sellerLogo + " ! " );	
	}

}
