package com.hy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.AgreementclientMapper;
import com.hy.po.Agreementclient;
import com.hy.service.AgreementclientService;

@Transactional
@Service("agreementclientService")
public class AgreementclientServiceImpl extends BaseServiceImpl<Agreementclient> implements AgreementclientService {

	@Autowired
	private AgreementclientMapper agreementclientMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(agreementclientMapper);
	}
}