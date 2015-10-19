package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

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

	public Category() {
		super();
	}   
	
	public Category(String categoryName, Integer categoryDisplayPriority) {
		super();
		this.categoryName = categoryName;
		this.categoryDisplayPriority = categoryDisplayPriority;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getCategoryId() {
		return this.CategoryId;
	}

	public void setCategoryId(Long CategoryId) {
		this.CategoryId = CategoryId;
	}   
@Column(length=25,unique=true)
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
   
}
