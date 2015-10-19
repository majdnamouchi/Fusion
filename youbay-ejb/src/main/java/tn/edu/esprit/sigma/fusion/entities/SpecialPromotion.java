package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: SpecialPromotion
 *
 */
@Entity
@Table(name = "T_SPECIALPROMOTION")
public class SpecialPromotion implements Serializable {

	private Long specialPromotionId;
	private Date startDate;
	private Date endDate;
	private Boolean dealDisabledByAdmin;
	private String dealDescription;
	private Float reductionPercentage;

	private static final long serialVersionUID = 1L;

	public SpecialPromotion() {
		super();
	}

	public SpecialPromotion(Date startDate, Date endDate,
			Boolean dealDisabledByAdmin, String dealShortDescription,
			String dealDescription, Float reductionPercentage) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.dealDisabledByAdmin = dealDisabledByAdmin;
		this.dealDescription = dealDescription;
		this.reductionPercentage = reductionPercentage;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getSpecialPromotionId() {
		return this.specialPromotionId;
	}

	public void setSpecialPromotionId(Long specialPromotionId) {
		this.specialPromotionId = specialPromotionId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getDealDisabledByAdmin() {
		return this.dealDisabledByAdmin;
	}

	public void setDealDisabledByAdmin(Boolean dealDisabledByAdmin) {
		this.dealDisabledByAdmin = dealDisabledByAdmin;
	}

	@Column(length = 200)
	public String getDealDescription() {
		return this.dealDescription;
	}

	public void setDealDescription(String dealDescription) {
		this.dealDescription = dealDescription;
	}

	public Float getReductionPercentage() {
		return this.reductionPercentage;
	}

	public void setReductionPercentage(Float reductionPercentage) {
		this.reductionPercentage = reductionPercentage;
	}

}
