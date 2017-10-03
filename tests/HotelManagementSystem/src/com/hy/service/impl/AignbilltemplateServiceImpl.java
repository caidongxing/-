package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.AignbilltemplateMapper;
import com.hy.page.Page;
import com.hy.po.Aignbilltemplate;
import com.hy.service.AignbilltemplateService;

@Transactional
@Service("aignbilltemplateService")
public class AignbilltemplateServiceImpl  extends BaseServiceImpl<Aignbilltemplate> implements AignbilltemplateService{

	@Autowired
	private AignbilltemplateMapper aignbilltemplateMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(aignbilltemplateMapper);
	}
	
	@Override
	public Page<Aignbilltemplate> queryPage(String templatename,
			Page<Aignbilltemplate> page) {
		
		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		
		List<Aignbilltemplate> aignbilltemplate = aignbilltemplateMapper.queryPage(templatename, firstResult, page.getPageSize());
		page.setTotal(aignbilltemplateMapper.count(templatename));
		page.setResult(aignbilltemplate);
		page.visiblePages();//计算分页显示
		return page;
	}
}
