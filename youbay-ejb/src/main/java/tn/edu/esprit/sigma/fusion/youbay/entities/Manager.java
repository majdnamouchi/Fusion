package tn.edu.esprit.sigma.fusion.youbay.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Manager
 *
 */
@Entity
@Table(name = "T_MANAGER")
public class Manager extends YouBayUser implements Serializable {

	private Boolean canManageCategories;
	private Boolean canManageManagers;
	private Boolean canModerateSellersAndBuyers;
	private Boolean canAddAdvertisement;
	private Boolean canExportData;
	private static final long serialVersionUID = 1L;

	public Manager() {
		super();
	}

	public Manager(Boolean canManageCategories, Boolean canManageManagers,
			Boolean canModerateSellersAndBuyers, Boolean canAddAdvertisement,
			Boolean canExportData) {
		super();
		this.canManageCategories = canManageCategories;
		this.canManageManagers = canManageManagers;
		this.canModerateSellersAndBuyers = canModerateSellersAndBuyers;
		this.canAddAdvertisement = canAddAdvertisement;
		this.canExportData = canExportData;
	}

	public Boolean getCanManageCategories() {
		return this.canManageCategories;
	}

	public void setCanManageCategories(Boolean canManageCategories) {
		this.canManageCategories = canManageCategories;
	}

	public Boolean getCanManageManagers() {
		return this.canManageManagers;
	}

	public void setCanManageManagers(Boolean canManageManagers) {
		this.canManageManagers = canManageManagers;
	}

	public Boolean getCanModerateSellersAndBuyers() {
		return this.canModerateSellersAndBuyers;
	}

	public void setCanModerateSellersAndBuyers(
			Boolean canModerateSellersAndBuyers) {
		this.canModerateSellersAndBuyers = canModerateSellersAndBuyers;
	}

	public Boolean getCanAddAdvertisement() {
		return this.canAddAdvertisement;
	}

	public void setCanAddAdvertisement(Boolean canAddAdvertisement) {
		this.canAddAdvertisement = canAddAdvertisement;
	}

	public Boolean getCanExportData() {
		return this.canExportData;
	}

	public void setCanExportData(Boolean canExportData) {
		this.canExportData = canExportData;
	}

}
