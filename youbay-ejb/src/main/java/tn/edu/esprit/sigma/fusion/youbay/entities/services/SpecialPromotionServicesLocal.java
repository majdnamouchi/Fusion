package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.SpecialPromotion;

@Local
public interface SpecialPromotionServicesLocal {

	Boolean addSpecialPromotion(SpecialPromotion theSpecialPromotion);

	SpecialPromotion findSpecialPromotion(SpecialPromotion theSpecialPromotion);

	SpecialPromotion findSpecialPromotionById(Long theId);

	Boolean updateSpecialPromotion(SpecialPromotion theSpecialPromotion);

	Boolean deleteSpecialPromotion(SpecialPromotion theSpecialPromotion);

}
