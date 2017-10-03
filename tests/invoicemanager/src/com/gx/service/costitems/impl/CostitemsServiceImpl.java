package com.gx.service.costitems.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.costitems.CostitemsMapper;
import com.gx.po.costitems.Costitems;
import com.gx.service.costitems.CostitemsService;

@Transactional
@Service("costitemsService")
public class CostitemsServiceImpl implements CostitemsService {
	@Autowired
	private CostitemsMapper costitemsMapper;

	@Override
	public List<Costitems> findAll() {
		// TODO Auto-generated method stub
		return this.costitemsMapper.findAll();
	}

	@Override
	public void saveCostitems(Costitems costitems) {
		// TODO Auto-generated method stub
		this.costitemsMapper.insert(costitems);
	}

	@Override
	public Costitems findById(int id) {
		// TODO Auto-generated method stub
		return this.costitemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateCostitems(Costitems costitems) {
		// TODO Auto-generated method stub
		this.costitemsMapper.updateByPrimaryKey(costitems);
	}

	@Override
	public void deleteCostitems(int id) {
		// TODO Auto-generated method stub
		this.costitemsMapper.deleteByPrimaryKey(id);
	}

}
