package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Subcategory;

@Remote
public interface SubcategoryServicesRemote {

	Boolean addSubcategory(Subcategory theSubcategory);

	Subcategory findSubcategory(Subcategory theSubcategory);

	Subcategory findSubcategoryById(Long theId);

	Boolean updateSubcategory(Subcategory theSubcategory);

	Boolean deleteSubcategory(Subcategory theSubcategory);

}
