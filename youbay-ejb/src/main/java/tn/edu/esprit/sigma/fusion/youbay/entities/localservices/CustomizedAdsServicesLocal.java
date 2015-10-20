package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.CustomizedAds;

@Local
public interface CustomizedAdsServicesLocal {

	Boolean addCustomizedAds(CustomizedAds theCustomizedAds);

	CustomizedAds findCustomizedAds(CustomizedAds theCustomizedAds);

	CustomizedAds findCustomizedAdsById(Long theId);

	Boolean updateCustomizedAds(CustomizedAds theCustomizedAds);

	Boolean deleteCustomizedAds(CustomizedAds theCustomizedAds);

}
