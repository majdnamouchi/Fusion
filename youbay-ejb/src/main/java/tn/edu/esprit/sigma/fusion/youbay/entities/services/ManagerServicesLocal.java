package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Manager;

@Local
public interface ManagerServicesLocal {

	Boolean addManager(Manager theManager);

	Manager findManager(Manager theManager);

	Manager findManagerById(Long theId);

	Boolean updateManager(Manager theManager);

	Boolean deleteManager(Manager theManager);

}
