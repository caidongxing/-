package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.TemplateandaccountbookMapper;
import com.hy.po.Templateandaccountbook;
import com.hy.service.TemplateandaccountbookService;

@Transactional
@Service("templateandaccountbookService")
public class TemplateandaccountbookServiceImpl extends BaseServiceImpl<Templateandaccountbook> implements TemplateandaccountbookService {

	@Autowired
	private TemplateandaccountbookMapper templateandaccountbookMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(templateandaccountbookMapper);
	}
	@Override
	public List<Templateandaccountbook> findByPrimaryKey(int id) {
		return templateandaccountbookMapper.findByPrimaryKey(id);
	}
}
