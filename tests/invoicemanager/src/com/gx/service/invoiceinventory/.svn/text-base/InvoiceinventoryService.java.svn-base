package com.gx.service.invoiceinventory;

import java.util.Date;
import java.util.List;

import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.vo.InvoiceinventoryVo;
import com.gx.vo.InvoicereceiveVo;

public interface InvoiceinventoryService {

	public List<InvoiceinventoryVo> findAll();
	
	public void saveInvoiceinventory(Invoiceinventory invoiceinventory);
	
	public Invoiceinventory findById(int id);
	
	public void updateInvoiceinventory(Invoiceinventory invoiceinventory);
	
	public void deleteInvoiceinventory(int id);
	
	List<InvoicereceiveVo> findByDate(Date startime,Date endtime);
	
	List<Invoiceinventory> findByContent(int invoicetype,String startnumber,int invoicenumber);
	
	List<Invoiceinventory> findByKuCun(int year,int month,int invoicetype);
	
	List<InvoiceinventoryVo> findByIdReturn(int id);
	
	/*public int update(int id,int number,String startnumber);*/
	
	public InvoiceinventoryVo findByType(int type);
}
