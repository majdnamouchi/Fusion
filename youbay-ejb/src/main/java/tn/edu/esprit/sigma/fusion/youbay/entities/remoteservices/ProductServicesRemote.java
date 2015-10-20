package tn.edu.esprit.sigma.fusion.youbay.entities.remoteservices;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.Product;

@Remote
public interface ProductServicesRemote {

	Boolean addProduct(Product theProduct);

	Product findProduct(Product theProduct);

	Product findProductById(Long theId);

	Boolean updateProduct(Product theProduct);

	Boolean deleteProduct(Product theProduct);

}
