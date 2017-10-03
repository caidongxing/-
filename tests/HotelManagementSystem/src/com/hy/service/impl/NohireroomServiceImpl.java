package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.NohireroomMapper;
import com.hy.page.Page;
import com.hy.po.Nohireroom;
import com.hy.service.NohireroomService;

@Transactional
@Service("nohireroomService")
public class NohireroomServiceImpl extends BaseServiceImpl<Nohireroom> implements NohireroomService {

	@Autowired
	private NohireroomMapper nohireroomMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(nohireroomMapper);
	}
	@Override
	public Page<Nohireroom> queryPage(int status, Integer starnumber,
			Integer endnumber, Page<Nohireroom> page) {
		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		List<Nohireroom> nohireroom = nohireroomMapper.queryPage(status, starnumber, endnumber, firstResult, page.getPageSize());
		page.setTotal(nohireroomMapper.count(status, starnumber, endnumber));
		page.setResult(nohireroom);
		page.visiblePages();//计算分页显示
		return page;
	}
	@Override
	public Nohireroom findByPrimaryKey(int nohireroomid) {
		return nohireroomMapper.findByPrimaryKey(nohireroomid);
	}
	
}
