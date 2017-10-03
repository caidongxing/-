package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.SignbillMapper;
import com.hy.po.Signbill;
import com.hy.service.SignbillService;

@Transactional
@Service("signbillService")
public class SignbillServiceImpl extends BaseServiceImpl<Signbill> implements SignbillService{

	@Autowired
	private SignbillMapper signbillMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(signbillMapper);
	}
	@Override
	public List<Signbill> findByForeignKey(int accountid) {
		return signbillMapper.findByForeignKey(accountid);
	}
}
