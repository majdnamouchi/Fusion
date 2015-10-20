package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Subcategory;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.SubcategoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SubcategoryServicesRemote;

/**
 * Session Bean implementation class SubcategoryServices
 */
@Stateless
public class SubcategoryServices implements SubcategoryServicesRemote,
		SubcategoryServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public SubcategoryServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addSubcategory(Subcategory theSubcategory) {
		Boolean b = false;
		try {
			entityManager.persist(theSubcategory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Subcategory findSubcategory(Subcategory theSubcategory) {
		return entityManager.find(Subcategory.class,
				theSubcategory.getSubcategoryId());
	}

	@Override
	public Subcategory findSubcategoryById(Long theId) {
		return entityManager.find(Subcategory.class, theId);
	}

	@Override
	public Boolean updateSubcategory(Subcategory theSubcategory) {
		boolean b = false;
		try {
			entityManager.merge(theSubcategory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteSubcategory(Subcategory theSubcategory) {
		Boolean b = false;
		try {
			theSubcategory = findSubcategoryById(theSubcategory
					.getSubcategoryId());
			entityManager.remove(theSubcategory);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
