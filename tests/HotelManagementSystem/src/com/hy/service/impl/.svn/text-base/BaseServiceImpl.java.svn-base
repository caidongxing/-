package com.hy.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hy.dao.BaseMapper;
import com.hy.service.BaseService;


@Service("baseService")
public abstract class BaseServiceImpl<T> implements BaseService<T, Serializable> {

	@Autowired
	private BaseMapper<T, Serializable> baseMapper;
	public void setBaseMapper(BaseMapper<T, Serializable> baseMapper) {
		this.baseMapper = baseMapper;
	}
	
	
	
	public T selectByPrimaryKey(int id){
		return baseMapper.selectByPrimaryKey(id);
	}



	@Override
	public int deleteByPrimaryKey(int id) {
		return baseMapper.deleteByPrimaryKey(id);
	}



	@Override
	public int insert(T record) {
		return baseMapper.insert(record);
	}



	@Override
	public int insertSelective(T record) {
		return baseMapper.insertSelective(record);
	}



	@Override
	public int updateByPrimaryKeySelective(T record) {
		return baseMapper.updateByPrimaryKeySelective(record);
	}



	@Override
	public int updateByPrimaryKey(T record) {
		return baseMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public List<T> findAll(){
		return baseMapper.findAll();
	}

}
