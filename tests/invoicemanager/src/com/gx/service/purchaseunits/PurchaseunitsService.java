package com.gx.service.purchaseunits;

import java.util.List;

import com.gx.po.purchaseunits.Purchaseunits;

public interface PurchaseunitsService {

	public List<Purchaseunits> findAll();
	
	public void savePurchaseunits(Purchaseunits purchaseunits);
	
	public Purchaseunits findById(int id);
	
	public void updatePurchaseunits(Purchaseunits purchaseunits);
	
	public void deletePurchaseunits(int id);
}
