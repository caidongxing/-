package com.gx.service.extensioku.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.extensioku.ExtensiokuMapper;
import com.gx.po.extensioku.Extensioku;
import com.gx.service.extensioku.ExtensiokuService;
import com.gx.vo.ExtensiokuVo;

@Transactional
@Service("extensiokuService")
public class ExtensiokuServiceImpl implements ExtensiokuService {
	@Autowired
	private ExtensiokuMapper extensiokuMapper;

	@Override
	public void save(Extensioku extensioku) {
		// TODO Auto-generated method stub
		this.extensiokuMapper.insert(extensioku);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.extensiokuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<ExtensiokuVo> findBymedium(int medium) {
		// TODO Auto-generated method stub
		return this.extensiokuMapper.findBymedium(medium);
	}

	@Override
	public List<Extensioku> findOnReturn(int medium) {
		// TODO Auto-generated method stub
		return this.extensiokuMapper.findOnReturn(medium);
	}

	@Override
	public List<ExtensiokuVo> findBymediumAndType(int medium, int type) {
		// TODO Auto-generated method stub
		return this.extensiokuMapper.findBymediumAndType(medium, type);
	}
	
}
