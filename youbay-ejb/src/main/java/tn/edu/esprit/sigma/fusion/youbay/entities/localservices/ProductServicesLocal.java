package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.Product;

@Local
public interface ProductServicesLocal {

	Boolean addProduct(Product theProduct);

	Product findProduct(Product theProduct);

	Product findProductById(Long theId);

	Boolean updateProduct(Product theProduct);

	Boolean deleteProduct(Product theProduct);

}
