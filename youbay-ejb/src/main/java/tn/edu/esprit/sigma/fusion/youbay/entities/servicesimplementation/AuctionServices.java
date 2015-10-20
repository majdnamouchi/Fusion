package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Auction;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.AuctionServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.AuctionServicesRemote;

/**
 * Session Bean implementation class AuctionServices
 */
@Stateless
public class AuctionServices implements AuctionServicesRemote,
		AuctionServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public AuctionServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addAuction(Auction theAuction) {
		Boolean b = false;
		try {
			entityManager.persist(theAuction);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Auction findAuction(Auction theAuction) {
		return entityManager.find(Auction.class, theAuction.getAuctionId());
	}

	@Override
	public Auction findAuctionById(Long theId) {
		return entityManager.find(Auction.class, theId);
	}

	@Override
	public Boolean updateAuction(Auction theAuction) {
		boolean b = false;
		try {
			entityManager.merge(theAuction);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteAuction(Auction theAuction) {
		Boolean b = false;
		try {
			theAuction = findAuctionById(theAuction.getAuctionId());
			entityManager.remove(theAuction);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
