package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Category;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.CategoryLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.CategoryRemote;

/**
 * Session Bean implementation class CategoryServices
 */
@Stateless
public class CategoryServices implements CategoryRemote, CategoryLocal {

    /**
     * Default constructor. 
     */
    public CategoryServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addCategory(Category theCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findCategory(Category theCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findCategoryById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateCategory(Category theCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCategory(Category theCategory) {
		// TODO Auto-generated method stub
		return null;
	}

}
