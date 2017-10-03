package com.gx.service.taxitem;

import java.util.List;

import com.gx.po.taxitem.Taxitem;

public interface TaxitemService {

	public List<Taxitem> findAll();
	
	public void saveTaxitem(Taxitem taxitem);
	
	public Taxitem findById(int id);
	
	public void updateTaxitem(Taxitem taxitem);
	
	public void deleteTaxitem(int id);
}
