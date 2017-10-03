package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.AccountbookanditemsMapper;
import com.hy.po.Accountbookanditems;
import com.hy.service.AccountbookanditemsService;

@Transactional
@Service("accountbookanditemsService")
public class AccountbookanditemsServiceImpl extends BaseServiceImpl<Accountbookanditems> implements AccountbookanditemsService {

	@Autowired
	private AccountbookanditemsMapper accountbookanditemsMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(accountbookanditemsMapper);
	}
	
	@Override
	public int deleteByKey(int accountbookid) {
		return accountbookanditemsMapper.deleteByKey(accountbookid);
	}

	@Override
	public List<Accountbookanditems> findByKey(int accountbookid) {
		return accountbookanditemsMapper.findByKey(accountbookid);
	}

	@Override
	public List<Accountbookanditems> findAccountbookitemsById(
			int accountbookid, int signbillid) {
		return accountbookanditemsMapper.findAccountbookitemsById(accountbookid, signbillid);
	}
}
