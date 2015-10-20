package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Category;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.CategoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.CategoryServicesRemote;

/**
 * Session Bean implementation class CategoryServices
 */
@Stateless
public class CategoryServices implements CategoryServicesRemote, CategoryServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public CategoryServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addCategory(Category theCategory) {
		Boolean b = false;
		try {
			entityManager.persist(theCategory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Category findCategory(Category theCategory) {
		return entityManager.find(Category.class, theCategory.getCategoryId());
	}

	@Override
	public Category findCategoryById(Long theId) {
		return entityManager.find(Category.class, theId);
	}

	@Override
	public Boolean updateCategory(Category theCategory) {
		boolean b = false;
		try {
			entityManager.merge(theCategory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteCategory(Category theCategory) {
		Boolean b = false;
		try {
			theCategory = findCategoryById(theCategory.getCategoryId());
			entityManager.remove(theCategory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
