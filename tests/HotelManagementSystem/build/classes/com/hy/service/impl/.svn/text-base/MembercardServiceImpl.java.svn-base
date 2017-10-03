package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.MembercardMapper;
import com.hy.po.Membercard;
import com.hy.service.MembercardService;

@Transactional
@Service("membercardService")
public class MembercardServiceImpl extends BaseServiceImpl<Membercard> implements MembercardService {

	@Autowired
	private MembercardMapper membercardMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(membercardMapper);
	}
	@Override
	public List<Membercard> findByNumber(String Number) {
		return membercardMapper.findByNumber(Number);
	}
}
