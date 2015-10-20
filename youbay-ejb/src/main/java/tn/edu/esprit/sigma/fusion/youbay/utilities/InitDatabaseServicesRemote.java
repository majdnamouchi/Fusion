package tn.edu.esprit.sigma.fusion.youbay.utilities;

import javax.ejb.Remote;

@Remote
public interface InitDatabaseServicesRemote {

	public void truncateAllTables();

	public void populateDatabase();

}
