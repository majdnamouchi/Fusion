package tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.CustomizedAds;

@Remote
public interface CustomizedAdsServicesRemote {

	Boolean addCustomizedAds(CustomizedAds theCustomizedAds);

	CustomizedAds findCustomizedAds(CustomizedAds theCustomizedAds);

	CustomizedAds findCustomizedAdsById(Long theId);

	Boolean updateCustomizedAds(CustomizedAds theCustomizedAds);

	Boolean deleteCustomizedAds(CustomizedAds theCustomizedAds);

}
