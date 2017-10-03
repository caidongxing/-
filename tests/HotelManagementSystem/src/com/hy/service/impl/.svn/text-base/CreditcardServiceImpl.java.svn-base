package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.CreditcardMapper;
import com.hy.po.Creditcard;
import com.hy.service.CreditcardService;

@Transactional
@Service("creditcardService")
public class CreditcardServiceImpl extends BaseServiceImpl<Creditcard> implements CreditcardService {

	@Autowired
	private CreditcardMapper creditcardMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(creditcardMapper);
	}
	@Override
	public List<Creditcard> fiindByNumber(String Number) {
		return creditcardMapper.fiindByNumber(Number);
	}
}
