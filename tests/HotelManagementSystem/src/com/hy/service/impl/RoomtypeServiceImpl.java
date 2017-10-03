package com.hy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.RoomtypeMapper;
import com.hy.po.Roomtype;
import com.hy.service.RoomtypeService;

@Transactional
@Service("roomtypeService")
public class RoomtypeServiceImpl extends BaseServiceImpl<Roomtype> implements RoomtypeService {

	@Autowired
	private RoomtypeMapper roomtypeMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(roomtypeMapper);
	}
}
