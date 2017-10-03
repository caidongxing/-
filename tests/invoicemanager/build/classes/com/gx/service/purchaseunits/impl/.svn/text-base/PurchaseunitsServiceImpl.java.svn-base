package com.gx.service.purchaseunits.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.purchaseunits.PurchaseunitsMapper;
import com.gx.po.purchaseunits.Purchaseunits;
import com.gx.service.purchaseunits.PurchaseunitsService;

@Transactional
@Service("purchaseunitsService")
public class PurchaseunitsServiceImpl implements PurchaseunitsService {
	@Autowired
	private PurchaseunitsMapper purchaseunitsMapper;

	@Override
	public List<Purchaseunits> findAll() {
		// TODO Auto-generated method stub
		return this.purchaseunitsMapper.findAll();
	}

	@Override
	public void savePurchaseunits(Purchaseunits purchaseunits) {
		// TODO Auto-generated method stub
		this.purchaseunitsMapper.insert(purchaseunits);
	}

	@Override
	public Purchaseunits findById(int id) {
		// TODO Auto-generated method stub
		return this.purchaseunitsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updatePurchaseunits(Purchaseunits purchaseunits) {
		// TODO Auto-generated method stub
		this.purchaseunitsMapper.updateByPrimaryKey(purchaseunits);
	}

	@Override
	public void deletePurchaseunits(int id) {
		// TODO Auto-generated method stub
		this.purchaseunitsMapper.deleteByPrimaryKey(id);
	}

}
