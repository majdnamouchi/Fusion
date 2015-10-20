package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Auction;

@Remote
public interface AuctionServicesRemote {

	Boolean addAuction(Auction theAuction);

	Auction findAuction(Auction theAuction);

	Auction findAuctionById(Long theId);

	Boolean updateAuction(Auction theAuction);

	Boolean deleteAuction(Auction theAuction);

}
