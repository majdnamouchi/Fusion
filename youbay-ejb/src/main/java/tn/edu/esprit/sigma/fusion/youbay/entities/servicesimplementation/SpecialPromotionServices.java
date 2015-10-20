package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.SpecialPromotion;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SpecialPromotionServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.SpecialPromotionServicesRemote;

/**
 * Session Bean implementation class SpecialPromotionServices
 */
@Stateless
public class SpecialPromotionServices implements SpecialPromotionServicesRemote, SpecialPromotionServicesLocal {

    /**
     * Default constructor. 
     */
    public SpecialPromotionServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addSpecialPromotion(SpecialPromotion theSpecialPromotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpecialPromotion findSpecialPromotion(
			SpecialPromotion theSpecialPromotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpecialPromotion findSpecialPromotionById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateSpecialPromotion(SpecialPromotion theSpecialPromotion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSpecialPromotion(SpecialPromotion theSpecialPromotion) {
		// TODO Auto-generated method stub
		return null;
	}

}
