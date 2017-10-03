package com.gx.service.commodity.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.commodity.CommodityMapper;
import com.gx.po.commodity.Commodity;
import com.gx.service.commodity.CommodityService;

@Transactional
@Service("commodityService")
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityMapper commodityMapper;

	@Override
	public List<Commodity> findAll() {
		// TODO Auto-generated method stub
		return this.commodityMapper.findAll();
	}

	@Override
	public void saveCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		this.commodityMapper.insert(commodity);
	}

	@Override
	public Commodity findById(int id) {
		// TODO Auto-generated method stub
		return this.commodityMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		this.commodityMapper.updateByPrimaryKey(commodity);
	}

	@Override
	public void deleteCommodity(int id) {
		// TODO Auto-generated method stub
		this.commodityMapper.deleteByPrimaryKey(id);
	}

}
