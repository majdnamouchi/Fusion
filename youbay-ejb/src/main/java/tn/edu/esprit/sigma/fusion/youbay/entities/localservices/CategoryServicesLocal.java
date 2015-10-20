package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Category;

@Local
public interface CategoryServicesLocal {
	
	Boolean addCategory(Category theCategory);

	Category findCategory(Category theCategory);

	Category findCategoryById(Long theId);

	Boolean updateCategory(Category theCategory);

	Boolean deleteCategory(Category theCategory);

}
