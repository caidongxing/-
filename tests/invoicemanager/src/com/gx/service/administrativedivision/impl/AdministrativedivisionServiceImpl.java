package com.gx.service.administrativedivision.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.administrativedivision.AdministrativedivisionMapper;
import com.gx.po.administrativedivision.Administrativedivision;
import com.gx.service.administrativedivision.AdministrativedivisionService;

@Transactional
@Service("administrativedivisionService")
public class AdministrativedivisionServiceImpl implements AdministrativedivisionService {
	@Autowired
	private AdministrativedivisionMapper administrativedivisionMapper;

	@Override
	public List<Administrativedivision> findAll() {
		// TODO Auto-generated method stub
		return this.administrativedivisionMapper.findAll();
	}

	@Override
	public void saveAdministrativedivision(
			Administrativedivision administrativedivision) {
		// TODO Auto-generated method stub
		this.administrativedivisionMapper.insert(administrativedivision);
	}

	@Override
	public Administrativedivision findById(int id) {
		// TODO Auto-generated method stub
		return this.administrativedivisionMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateAdministrativedivision(
			Administrativedivision administrativedivision) {
		// TODO Auto-generated method stub
		this.administrativedivisionMapper.updateByPrimaryKey(administrativedivision);
	}

	@Override
	public void deleteAdministrativedivision(int id) {
		// TODO Auto-generated method stub
		this.administrativedivisionMapper.deleteByPrimaryKey(id);
	}

}
