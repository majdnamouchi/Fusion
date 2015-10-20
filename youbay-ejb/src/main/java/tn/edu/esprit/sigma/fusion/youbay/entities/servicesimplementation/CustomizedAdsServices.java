package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.CustomizedAds;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.CustomizedAdsServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.CustomizedAdsServicesRemote;

/**
 * Session Bean implementation class CustomizedAdsServices
 */
@Stateless
public class CustomizedAdsServices implements CustomizedAdsServicesRemote, CustomizedAdsServicesLocal {

    /**
     * Default constructor. 
     */
    public CustomizedAdsServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addCustomizedAds(CustomizedAds theCustomizedAds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomizedAds findCustomizedAds(CustomizedAds theCustomizedAds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomizedAds findCustomizedAdsById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateCustomizedAds(CustomizedAds theCustomizedAds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCustomizedAds(CustomizedAds theCustomizedAds) {
		// TODO Auto-generated method stub
		return null;
	}

}
