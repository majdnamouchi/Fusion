package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Subcategory;

@Local
public interface SubcategoryServicesLocal {

	Boolean addSubcategory(Subcategory theSubcategory);

	Subcategory findSubcategory(Subcategory theSubcategory);

	Subcategory findSubcategoryById(Long theId);

	Boolean updateSubcategory(Subcategory theSubcategory);

	Boolean deleteSubcategory(Subcategory theSubcategory);

}
