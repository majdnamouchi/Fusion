package tn.edu.esprit.sigma.fusion.youbayclient.delegate;

import tn.edu.esprit.sigma.fusion.youbay.entities.Auction;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.AuctionServicesRemote;
import tn.edu.esprit.sigma.fusion.youbayclient.locator.ServiceLocator;

public class AuctionServicesDelegate  {
	public static final String jndiName = "youbay-ejb/AuctionServices!tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.AuctionServicesRemote";

	public static AuctionServicesRemote getProxy() {
		return (AuctionServicesRemote) ServiceLocator.getInstance().getProxy(
				jndiName);
	}

	
	public static Boolean doAddAuction(Auction theAuction) {
		
		return getProxy().addAuction(theAuction);
	}

	
	public static Auction doFindAuction(Auction theAuction) {
		
		return getProxy().findAuction(theAuction);
	}

	
	public static Auction doFindAuctionById(Long theId) {
		
		return getProxy().findAuctionById(theId);
	}

	
	public static Boolean doUpdateAuction(Auction theAuction) {
		
		return getProxy().updateAuction(theAuction);
	}

	
	public static Boolean doDeleteAuction(Auction theAuction) {
		
		return getProxy().deleteAuction(theAuction);
	}

}