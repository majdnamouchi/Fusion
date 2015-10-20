package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Manager;

@Remote
public interface ManagerServicesRemote {

	Boolean addManager(Manager theManager);

	Manager findManager(Manager theManager);

	Manager findManagerById(Long theId);

	Boolean updateManager(Manager theManager);

	Boolean deleteManager(Manager theManager);

}
