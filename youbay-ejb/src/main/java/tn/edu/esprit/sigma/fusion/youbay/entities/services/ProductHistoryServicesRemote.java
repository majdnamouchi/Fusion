package tn.edu.esprit.sigma.fusion.youbay.entities.services;

import javax.ejb.Remote;

import tn.edu.esprit.sigma.fusion.youbay.entities.ProductHistory;

@Remote
public interface ProductHistoryServicesRemote {

	Boolean addProductHistory(ProductHistory theProductHistory);

	ProductHistory findProductHistory(ProductHistory theProductHistory);

	ProductHistory findProductHistoryById(Long theId);

	Boolean updateProductHistory(ProductHistory theProductHistory);

	Boolean deleteProductHistory(ProductHistory theProductHistory);

}
