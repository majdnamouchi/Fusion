package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Auction;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.AuctionServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.AuctionServicesRemote;

/**
 * Session Bean implementation class AuctionServices
 */
@Stateless
public class AuctionServices implements AuctionServicesRemote, AuctionServicesLocal {

    /**
     * Default constructor. 
     */
    public AuctionServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addAuction(Auction theAuction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction findAuction(Auction theAuction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction findAuctionById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAuction(Auction theAuction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAuction(Auction theAuction) {
		// TODO Auto-generated method stub
		return null;
	}

}
