package com.hj.service;

import java.util.List;

import com.hj.entity.CustomerInfo;
import com.hj.entity.CustomerLevel;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.page.Page;
import com.hj.page.Result;

public interface CustomerInfoService {

	/**
	 * 获取客户性质  customerProperties
	 * */
	public List<DictionaryTypeInfo> allCustomerProperties();
	/**
	 * 获取客户类型  customerType
	 * */
	public List<DictionaryTypeInfo> allCustomerType();
	/**
	 * 获取客户级别  customerLevel
	 * */
	public List<CustomerLevel> allCustomerLevel();
	/**
	 * 获取客户开户银行 openBank
	 * */
	public List<DictionaryTypeInfo> allCustomerOpenBank();
	/**
	 * 获取客户来源     customerSource
	 * */
	public List<DictionaryTypeInfo> allCustomerSource();
	/**
	 * 添加客户信息
	 * */
	public void saveCustomerInfo(CustomerInfo customerInfo);
	/**
	 * 查找客户名称
	 * */
	public CustomerInfo findCustomerName(String customerName);
	/**
	 * 查找所以客户信息
	 * */
	public List<CustomerInfo> findAllCustomerInfo();
	/**
	 * 查找所以客户信息 分页
	 * */
	public Result findAllCustomerInfo(Page page);
	/**
	 * 查找客户详细信息
	 * */
	public CustomerInfo findCustomerInfoDetail(int CustomerId);
	/**
	 * 更新客户详细信息
	 * */
	public void updateCustomerInfo(CustomerInfo customerInfo);
	/**
	 * 删除客户详细信息
	 * */
	public void deleteCustomerInfo(Integer customerId);
	/**
	 * 搜索客户信息
	 * */
	public Result queryByProperty(String propertyName,String value,Page page);
	
	
	
}
