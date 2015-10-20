package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.SpecialPromotion;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.SpecialPromotionServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.SpecialPromotionServicesRemote;

/**
 * Session Bean implementation class SpecialPromotionServices
 */
@Stateless
public class SpecialPromotionServices implements
		SpecialPromotionServicesRemote, SpecialPromotionServicesLocal {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public SpecialPromotionServices() {
	}

	@Override
	public Boolean addSpecialPromotion(SpecialPromotion theSpecialPromotion) {
		Boolean b = false;
		try {
			entityManager.persist(theSpecialPromotion);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public SpecialPromotion findSpecialPromotion(
			SpecialPromotion theSpecialPromotion) {
		return entityManager.find(SpecialPromotion.class,
				theSpecialPromotion.getSpecialPromotionId());
	}

	@Override
	public SpecialPromotion findSpecialPromotionById(Long theId) {
		return entityManager.find(SpecialPromotion.class, theId);
	}

	@Override
	public Boolean updateSpecialPromotion(SpecialPromotion theSpecialPromotion) {
		boolean b = false;
		try {
			entityManager.merge(theSpecialPromotion);
			b = true;
		} catch (Exception e) {
		}
		return b;	}

	@Override
	public Boolean deleteSpecialPromotion(SpecialPromotion theSpecialPromotion) {
		Boolean b = false;
		try {
			theSpecialPromotion = findSpecialPromotionById(theSpecialPromotion
					.getSpecialPromotionId());
			entityManager.remove(theSpecialPromotion);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
