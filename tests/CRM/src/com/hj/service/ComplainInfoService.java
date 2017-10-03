package com.hj.service;

import java.util.List;

import com.hj.entity.ComplainInfo;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.page.Page;
import com.hj.page.Result;
//客户投诉
public interface ComplainInfoService {

	/**
	 * 添加客户投诉信息
	 */
	 public void saveComplainInfo(ComplainInfo complainInfo);
	 
	 /**
	  * 查找所有的用户投诉信息,分页
	  ***/
	public Result findAllComplainInfo(Page page);
		
	/***
	 * 查找客户投诉complainId
	 ***/
	public ComplainInfo findComplainId(Integer complainId);	
	/***
	 * 更新客户投诉信息
	 ***/
	public void updateComplainInfo(ComplainInfo complainInfo);	
	
	/***
	 * 删除客户投诉信息
	 ***/
	public void deleteComplainInfo(Integer complainId);	
	/***
	 * 查找投诉表里的客户投诉状态id  满意‘不满意，其他
	 ***/
	public List findComplainInfoByCustomerSatisfactionId(DictionaryTypeInfo dictionaryTypeInfo);	
	
}
