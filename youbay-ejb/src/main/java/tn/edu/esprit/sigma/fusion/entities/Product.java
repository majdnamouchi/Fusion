package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

import tn.edu.esprit.sigma.fusion.utilities.DataValidators;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity
@Table(name="T_PRODUCT")

public class Product implements Serializable {

	
	private Long productId;
	private String productName;
	private String productImage;//URL-IMAGE
	private String productDescription;
	private Float SellerPrice;
	private String subcategoryAttributesAndValues;
	private Float isDisabledBySeller;
	private Float isDisabledByAdmin;
	private Integer quantityAvailable;
	private static final long serialVersionUID = 1L;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
	@Column(length=25)
	public String getProductName() {
		return this.productName;
	}
	@Column(length=1000)
	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	@Column(length=1000)
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
	@Column(length=1000)
	public String getSubcategoryAttributesAndValues() {
		return subcategoryAttributesAndValues;
	}

	public void setSubcategoryAttributesAndValues(
			String subcategoryAttributesAndValues) throws Exception {
		if (DataValidators.checkIfStringIsValidImageURL(subcategoryAttributesAndValues)){
			this.subcategoryAttributesAndValues = subcategoryAttributesAndValues;	
		}else throw new Exception("    >>>>>>   " + Product.class.getCanonicalName() + " - method : " +
			"setSellerLogo - "+ " illegal image URL : " + subcategoryAttributesAndValues + " ! " );	
	
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
	
}
