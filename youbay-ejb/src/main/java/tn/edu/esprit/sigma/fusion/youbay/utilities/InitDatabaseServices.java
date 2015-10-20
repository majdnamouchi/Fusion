package tn.edu.esprit.sigma.fusion.youbay.utilities;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class InitDatabase
 */
@Stateless
public class InitDatabaseServices implements InitDatabaseServicesRemote {

	/**
	 * Default constructor.
	 * 
	 */
//	@PersistenceContext
//	EntityManager em;

	public InitDatabaseServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void truncateAllTables() {
//		em.getTransaction().begin();
//		em.createNativeQuery("truncate table YouBayUser").executeUpdate();
//		em.getTransaction().commit();
		System.out.println("==================> truncateAllTables");

	}

	@Override
	public void populateDatabase() {
		// TODO Auto-generated method stub

	}

}
