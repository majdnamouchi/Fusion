package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name = "T_USER")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "USER_TYPE", discriminatorType = DiscriminatorType.STRING)
public class YouBayUser implements Serializable {

	private Long youBayUserId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date birthday;
	private String countryOfResidence;
	private Boolean isActive;
	private Boolean isBanned;

	private static final long serialVersionUID = 1L;

	public YouBayUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public YouBayUser(String firstName, String lastName, String email,
			String phoneNumber, Date birthday, String countryOfResidence,
			Boolean isActive, Boolean isBanned) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.countryOfResidence = countryOfResidence;
		this.isActive = isActive;
		this.isBanned = isBanned;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getYouBayUserId() {
		return youBayUserId;
	}

	public void setYouBayUserId(Long youBayUserId) {
		this.youBayUserId = youBayUserId;
	}

	@Column(length = 100)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(length = 100)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(length = 100, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length = 100, unique = true)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Temporal(TemporalType.DATE)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(length = 100)
	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsBanned() {
		return isBanned;
	}

	public void setIsBanned(Boolean isBanned) {
		this.isBanned = isBanned;
	}

}