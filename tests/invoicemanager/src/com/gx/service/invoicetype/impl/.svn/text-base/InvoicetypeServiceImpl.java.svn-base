package com.gx.service.invoicetype.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.invoicetype.InvoicetypeMapper;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoicetype.InvoicetypeService;

@Transactional
@Service("invoicetypeService")
public class InvoicetypeServiceImpl implements InvoicetypeService {
	@Autowired
	private InvoicetypeMapper invoicetypeMapper;

	@Override
	public List<Invoicetype> findAll() {
		// TODO Auto-generated method stub
		return this.invoicetypeMapper.findAll();
	}

	@Override
	public void saveInvoicetype(Invoicetype invoicetype) {
		// TODO Auto-generated method stub
		this.invoicetypeMapper.insert(invoicetype);
	}

	@Override
	public Invoicetype findById(int id) {
		// TODO Auto-generated method stub
		return this.invoicetypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateInvoicetype(Invoicetype invoicetype) {
		// TODO Auto-generated method stub
		this.invoicetypeMapper.updateByPrimaryKey(invoicetype);
	}

	@Override
	public void deleteInvoicetype(int id) {
		// TODO Auto-generated method stub
		this.invoicetypeMapper.deleteByPrimaryKey(id);
	}

}
