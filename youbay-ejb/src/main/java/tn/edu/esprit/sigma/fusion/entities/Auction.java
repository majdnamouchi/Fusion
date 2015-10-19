package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Auction
 *
 */
@Entity
@Table(name = "T_AUCTION")
public class Auction implements Serializable {

	private Long auctionId;
	private Date startTime;
	private Date endTime;
	private Float currentPrice;

	private static final long serialVersionUID = 1L;

	public Auction() {
		super();
	}

	public Auction(Date startTime, Date endTime, Float currentPrice) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.currentPrice = currentPrice;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAuctionId() {
		return this.auctionId;
	}

	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}
}
