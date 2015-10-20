package tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Category;

@Remote
public interface CategoryServicesRemote {
	
	Boolean addCategory(Category theCategory);

	Category findCategory(Category theCategory);

	Category findCategoryById(Long theId);

	Boolean updateCategory(Category theCategory);

	Boolean deleteCategory(Category theCategory);

}
