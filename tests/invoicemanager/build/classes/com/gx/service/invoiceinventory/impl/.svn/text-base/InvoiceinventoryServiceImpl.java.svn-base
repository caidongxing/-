package com.gx.service.invoiceinventory.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.invoiceinventory.InvoiceinventoryMapper;
import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.vo.InvoiceinventoryVo;
import com.gx.vo.InvoicereceiveVo;

@Transactional
@Service("invoiceinventoryService")
public class InvoiceinventoryServiceImpl implements InvoiceinventoryService {
	@Autowired
	private InvoiceinventoryMapper invoiceinventoryMapper;

	@Override
	public List<InvoiceinventoryVo> findAll() {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.findAll();
	}

	@Override
	public void saveInvoiceinventory(Invoiceinventory invoiceinventory) {
		// TODO Auto-generated method stub
		this.invoiceinventoryMapper.insert(invoiceinventory);
	}

	@Override
	public Invoiceinventory findById(int id) {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateInvoiceinventory(Invoiceinventory invoiceinventory) {
		// TODO Auto-generated method stub
		this.invoiceinventoryMapper.updateByPrimaryKey(invoiceinventory);
	}

	@Override
	public void deleteInvoiceinventory(int id) {
		// TODO Auto-generated method stub
		this.invoiceinventoryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<InvoicereceiveVo> findByDate(Date startime, Date endtime) {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.findByDate(startime, endtime);
	}

	@Override
	public List<Invoiceinventory> findByContent(int invoicetype,
			String startnumber, int invoicenumber) {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.findByContent(invoicetype, startnumber, invoicenumber);
	}

	@Override
	public List<Invoiceinventory> findByKuCun(int year, int month,
			int invoicetype) {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.findByKuCun(year, month, invoicetype);
	}

	@Override
	public List<InvoiceinventoryVo> findByIdReturn(int id) {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.findById(id);
	}

	@Override
	public InvoiceinventoryVo findByType(int type) {
		// TODO Auto-generated method stub
		return this.invoiceinventoryMapper.findByType(type);
	}

	

}
