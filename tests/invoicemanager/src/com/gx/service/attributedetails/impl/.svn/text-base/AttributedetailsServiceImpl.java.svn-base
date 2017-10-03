package com.gx.service.attributedetails.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.attributedetails.AttributedetailsMapper;
import com.gx.po.attributedetails.Attributedetails;
import com.gx.service.attributedetails.AttributedetailsService;

@Transactional
@Service("attributedetailsService")
public class AttributedetailsServiceImpl implements AttributedetailsService {
	@Autowired
	private AttributedetailsMapper attributedetailsMapper;

	@Override
	public List<Attributedetails> findAll() {
		// TODO Auto-generated method stub
		return this.attributedetailsMapper.findById();
	}

}
