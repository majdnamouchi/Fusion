package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.CustomizedAds;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.CustomizedAdsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.CustomizedAdsServicesRemote;

/**
 * Session Bean implementation class CustomizedAdsServices
 */
@Stateless
public class CustomizedAdsServices implements CustomizedAdsServicesRemote,
		CustomizedAdsServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public CustomizedAdsServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addCustomizedAds(CustomizedAds theCustomizedAds) {
		Boolean b = false;
		try {
			entityManager.persist(theCustomizedAds);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public CustomizedAds findCustomizedAds(CustomizedAds theCustomizedAds) {
		return entityManager.find(CustomizedAds.class,
				theCustomizedAds.getCustomizedAdsId());
	}

	@Override
	public CustomizedAds findCustomizedAdsById(Long theId) {
		return entityManager.find(CustomizedAds.class, theId);
	}

	@Override
	public Boolean updateCustomizedAds(CustomizedAds theCustomizedAds) {
		boolean b = false;
		try {
			entityManager.merge(theCustomizedAds);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteCustomizedAds(CustomizedAds theCustomizedAds) {
		Boolean b = false;
		try {
			theCustomizedAds = findCustomizedAdsById(theCustomizedAds
					.getCustomizedAdsId());
			entityManager.remove(theCustomizedAds);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}
}
