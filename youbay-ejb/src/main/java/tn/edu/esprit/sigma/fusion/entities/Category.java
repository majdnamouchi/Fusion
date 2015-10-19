package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
@Table(name = "T_CATEGORY")
public class Category implements Serializable {

	private Long CategoryId;
	private String categoryName;
	private Integer categoryDisplayPriority;

	private static final long serialVersionUID = 1L;
	/**
	 * link attributes
	 */
	private List<Subcategory> subcategorys;

	public Category() {
		super();
	}

	public Category(String categoryName, Integer categoryDisplayPriority) {
		super();
		this.categoryName = categoryName;
		this.categoryDisplayPriority = categoryDisplayPriority;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCategoryId() {
		return this.CategoryId;
	}

	public void setCategoryId(Long CategoryId) {
		this.CategoryId = CategoryId;
	}

	@Column(length = 25, unique = true)
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

	@OneToMany(mappedBy = "category")
	public List<Subcategory> getSubcategorys() {
		return subcategorys;
	}

	public void setSubcategorys(List<Subcategory> subcategorys) {
		this.subcategorys = subcategorys;
	}

}
