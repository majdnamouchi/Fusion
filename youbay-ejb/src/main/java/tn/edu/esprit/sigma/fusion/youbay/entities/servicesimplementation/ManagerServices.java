package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.sigma.fusion.youbay.entities.Manager;
import tn.edu.esprit.sigma.fusion.youbay.entities.localservices.ManagerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices.ManagerServicesRemote;

/**
 * Session Bean implementation class ManagerServices
 */
@Stateless
public class ManagerServices implements ManagerServicesRemote,
		ManagerServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ManagerServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addManager(Manager theManager) {

		Boolean b = false;
		try {
			entityManager.persist(theManager);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Manager findManager(Manager theManager) {
		return entityManager.find(Manager.class, theManager.getYouBayUserId());
	}

	@Override
	public Manager findManagerById(Long theId) {
		return entityManager.find(Manager.class, theId);
	}

	@Override
	public Boolean updateManager(Manager theManager) {
		boolean b = false;
		try {
			entityManager.merge(theManager);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteManager(Manager theManager) {
		Boolean b = false;
		try {
			theManager = findManagerById(theManager.getYouBayUserId());
			entityManager.remove(theManager);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
