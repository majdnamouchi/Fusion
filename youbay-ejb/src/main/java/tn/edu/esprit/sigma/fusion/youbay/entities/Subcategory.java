package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import tn.edu.esprit.sigma.fusion.youbay.utilities.DataValidators;

/**
 * Entity implementation class for Entity: Subcategory
 *
 */
@Entity
@Table(name = "T_SUBCATEGORY")
public class Subcategory implements Serializable {

	private Long subcategoryId;
	private String categoryName;
	private Integer categoryDisplayPriority;
	private String subcategoryAttributesAndTypes;
	private Boolean isActive;
	private String assistantAvatarImage;// URL-IMAGE

	private static final long serialVersionUID = 1L;

	/**
	 * Link attributes
	 */
	private Category category;
	private List<AssistantItems> assistantItemss;
	private List<Product> products;

	public Subcategory() {
		super();
	}

	public Subcategory(String categoryName, Integer categoryDisplayPriority,
			String subcategoryAttributesAndTypes, Boolean isActive,
			String assistantAvatarImage) {
		super();
		this.categoryName = categoryName;
		this.categoryDisplayPriority = categoryDisplayPriority;
		this.subcategoryAttributesAndTypes = subcategoryAttributesAndTypes;
		this.isActive = isActive;
		this.assistantAvatarImage = assistantAvatarImage;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getSubcategoryId() {
		return this.subcategoryId;
	}

	public void setSubcategoryId(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	@Column(length = 25)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryDisplayPriority() {
		return this.categoryDisplayPriority;
	}

	public void setCategoryDisplayPriority(Integer categoryDisplayPriority) {
		this.categoryDisplayPriority = categoryDisplayPriority;
	}

	@Column(length = 1000)
	public String getSubcategoryAttributesAndTypes() {
		return this.subcategoryAttributesAndTypes;
	}

	public void setSubcategoryAttributesAndTypes(
			String subcategoryAttributesAndTypes) {
		this.subcategoryAttributesAndTypes = subcategoryAttributesAndTypes;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Column(length = 1000)
	public String getAssistantAvatarImage() {
		return this.assistantAvatarImage;
	}

	public void setAssistantAvatarImage(String assistantAvatarImage)
			throws Exception {

		if (DataValidators.checkIfStringIsValidImageURL(assistantAvatarImage)) {
			this.assistantAvatarImage = assistantAvatarImage;
		} else
			throw new Exception("    >>>>>>   "
					+ Subcategory.class.getCanonicalName() + " - method : "
					+ "setAssistantAvatarImage - " + " illegal image URL : "
					+ assistantAvatarImage + " ! ");

	}

	/**
	 * link attributes
	 */
	@ManyToOne
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@OneToMany(mappedBy = "subcategory")
	public List<AssistantItems> getAssistantItemss() {
		return assistantItemss;
	}

	public void setAssistantItemss(List<AssistantItems> assistantItemss) {
		this.assistantItemss = assistantItemss;
	}

	@OneToMany(mappedBy = "subcategory")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
