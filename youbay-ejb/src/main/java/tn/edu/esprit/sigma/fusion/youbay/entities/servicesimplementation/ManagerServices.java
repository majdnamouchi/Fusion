package tn.edu.esprit.sigma.fusion.youbay.entities.servicesimplementation;

import javax.ejb.Stateless;

import tn.edu.esprit.sigma.fusion.youbay.entities.Manager;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ManagerServicesLocal;
import tn.edu.esprit.sigma.fusion.youbay.entities.services.ManagerServicesRemote;

/**
 * Session Bean implementation class ManagerServices
 */
@Stateless
public class ManagerServices implements ManagerServicesRemote, ManagerServicesLocal {

    /**
     * Default constructor. 
     */
    public ManagerServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addManager(Manager theManager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager findManager(Manager theManager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Manager findManagerById(Long theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateManager(Manager theManager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteManager(Manager theManager) {
		// TODO Auto-generated method stub
		return null;
	}

}
