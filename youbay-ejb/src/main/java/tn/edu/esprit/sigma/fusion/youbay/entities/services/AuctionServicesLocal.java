package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Auction;

@Local
public interface AuctionServicesLocal {

	Boolean addAuction(Auction theAuction);

	Auction findAuction(Auction theAuction);

	Auction findAuctionById(Long theId);

	Boolean updateAuction(Auction theAuction);

	Boolean deleteAuction(Auction theAuction);
	
	
}
