package com.hj.service;

import java.util.List;

import com.hj.dao.ComplainInfoDAO;
import com.hj.entity.ComplainInfo;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.page.Page;
import com.hj.page.PageUtil;
import com.hj.page.Result;

public class ComplainInfoServiceImpl implements ComplainInfoService{

	private ComplainInfoDAO complainInfoDAO;
	
	public ComplainInfoDAO getComplainInfoDAO() {
		return complainInfoDAO;
	}

	public void setComplainInfoDAO(ComplainInfoDAO complainInfoDAO) {
		this.complainInfoDAO = complainInfoDAO;
	}

	
	public void saveComplainInfo(ComplainInfo complainInfo) {
		complainInfoDAO.save(complainInfo);
	}

	public Result findAllComplainInfo(Page page) {
		page=PageUtil.createPage(page, complainInfoDAO.findAllCount());
		Result result=new Result();
		result.setList(complainInfoDAO.findAll(page));
		result.setPage(page);
		return result;
	}

	public ComplainInfo findComplainId(Integer complainId) {
		return complainInfoDAO.findById(complainId);
	}

	public void updateComplainInfo(ComplainInfo complainInfo) {
		complainInfoDAO.attachDirty(complainInfo);
	}

	public void deleteComplainInfo(Integer complainId) {
		complainInfoDAO.delete(complainInfoDAO.findById(complainId));		
	}

	public List findComplainInfoByCustomerSatisfactionId(DictionaryTypeInfo dictionaryTypeInfo) {
		return complainInfoDAO.findByProperty("dictionaryTypeInfoByCustomerSatisfaction", dictionaryTypeInfo);
	}

}
