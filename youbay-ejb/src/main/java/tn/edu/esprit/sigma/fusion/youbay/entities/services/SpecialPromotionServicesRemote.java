package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.SpecialPromotion;

@Remote
public interface SpecialPromotionServicesRemote {

	Boolean addSpecialPromotion(SpecialPromotion theSpecialPromotion);

	SpecialPromotion findSpecialPromotion(SpecialPromotion theSpecialPromotion);

	SpecialPromotion findSpecialPromotionById(Long theId);

	Boolean updateSpecialPromotion(SpecialPromotion theSpecialPromotion);

	Boolean deleteSpecialPromotion(SpecialPromotion theSpecialPromotion);

}
