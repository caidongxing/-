package com.gx.service.invoicereceive.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.invoicereceive.InvoicereceiveMapper;
import com.gx.po.invoicereceive.Invoicereceive;
import com.gx.service.invoicereceive.InvoicereceiveService;

@Transactional
@Service("invoicereceiveService")
public class InvoicereceiveServiceImpl implements InvoicereceiveService {
	@Autowired
	private InvoicereceiveMapper invoicereceiveMapper;

	@Override
	public List<Invoicereceive> findBymedium(int medium) {
		// TODO Auto-generated method stub
		return this.invoicereceiveMapper.findBymedium(medium);
	}

	@Override
	public Invoicereceive findById(int id) {
		// TODO Auto-generated method stub
		return this.invoicereceiveMapper.selectByPrimaryKey(id);
	}

}
