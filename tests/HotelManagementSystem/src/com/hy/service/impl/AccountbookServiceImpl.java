package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.AccountbookMapper;
import com.hy.page.Page;
import com.hy.po.Accountbook;
import com.hy.service.AccountbookService;

@Transactional
@Service("accountbookService")
public class AccountbookServiceImpl extends BaseServiceImpl<Accountbook> implements AccountbookService {

	@Autowired
	private AccountbookMapper accountbookMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(accountbookMapper);
	}
	
	@Override
	public Page<Accountbook> queryPage(String accountbookname, Page<Accountbook> page) {
		
		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		List<Accountbook> accountbook = accountbookMapper.queryPage(accountbookname, firstResult, page.getPageSize());
		page.setTotal(accountbookMapper.count(accountbookname));
		page.setResult(accountbook);
		page.visiblePages();//计算分页显示
		return page;
	}

	@Override
	public List<Accountbook> findByStatus() {
		return accountbookMapper.findByStatus();
	}
}
