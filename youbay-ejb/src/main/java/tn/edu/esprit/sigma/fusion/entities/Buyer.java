package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	private static final long serialVersionUID = 1L;

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

	public Boolean getIsMale() {
		return iSMale;
	}

	public void setIsMale(Boolean iSMale) {
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
}