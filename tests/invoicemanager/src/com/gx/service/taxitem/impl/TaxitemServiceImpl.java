package com.gx.service.taxitem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.taxitem.TaxitemMapper;
import com.gx.po.taxitem.Taxitem;
import com.gx.service.taxitem.TaxitemService;

@Transactional
@Service("taxitemService")
public class TaxitemServiceImpl implements TaxitemService {
	@Autowired
	private TaxitemMapper taxitemMapper;

	@Override
	public List<Taxitem> findAll() {
		// TODO Auto-generated method stub
		return this.taxitemMapper.findAll();
	}

	@Override
	public void saveTaxitem(Taxitem taxitem) {
		// TODO Auto-generated method stub
		this.taxitemMapper.insert(taxitem);
	}

	@Override
	public Taxitem findById(int id) {
		// TODO Auto-generated method stub
		return this.taxitemMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateTaxitem(Taxitem taxitem) {
		// TODO Auto-generated method stub
		this.taxitemMapper.updateByPrimaryKey(taxitem);
	}

	@Override
	public void deleteTaxitem(int id) {
		// TODO Auto-generated method stub
		this.taxitemMapper.deleteByPrimaryKey(id);
	}

}
