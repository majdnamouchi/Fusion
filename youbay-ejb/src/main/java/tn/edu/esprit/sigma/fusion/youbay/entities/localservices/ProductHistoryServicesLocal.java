package tn.edu.esprit.sigma.fusion.youbay.entities.localservices;

import javax.ejb.Local;

import tn.edu.esprit.sigma.fusion.youbay.entities.ProductHistory;

@Local
public interface ProductHistoryServicesLocal {

	Boolean addProductHistory(ProductHistory theProductHistory);

	ProductHistory findProductHistory(ProductHistory theProductHistory);

	ProductHistory findProductHistoryById(Long theId);

	Boolean updateProductHistory(ProductHistory theProductHistory);

	Boolean deleteProductHistory(ProductHistory theProductHistory);

}
