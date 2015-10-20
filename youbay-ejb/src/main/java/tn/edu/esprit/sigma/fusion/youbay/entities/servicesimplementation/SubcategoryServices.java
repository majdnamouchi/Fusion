package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Subcategory;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SubcategoryServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SubcategoryServicesRemote;

/**
 * Session Bean implementation class SubcategoryServices
 */
@Stateless
public class SubcategoryServices implements SubcategoryServicesRemote, SubcategoryServicesLocal {

    /**
     * Default constructor. 
     */
    public SubcategoryServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addSubcategory(Subcategory theSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subcategory findSubcategory(Subcategory theSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Subcategory findSubcategoryById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateSubcategory(Subcategory theSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSubcategory(Subcategory theSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

}
