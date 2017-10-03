package com.hj.service;

import java.util.List;

import com.hj.dao.CustomerInfoDAO;
import com.hj.dao.CustomerLevelDAO;
import com.hj.dao.DictionaryTypeDAO;
import com.hj.dao.DictionaryTypeInfoDAO;
import com.hj.entity.CustomerInfo;
import com.hj.entity.CustomerLevel;
import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.page.Page;
import com.hj.page.PageUtil;
import com.hj.page.Result;



@SuppressWarnings("unchecked")
public class CustomerInfoServiceImpl implements CustomerInfoService {

	private CustomerLevelDAO  customerLevelDAO;         //客户级别
	private DictionaryTypeDAO dictionaryTypeDAO;        //数据字典分类
	private DictionaryTypeInfoDAO dictionaryTypeInfoDAO;//数据字典分类信息
	private CustomerInfoDAO customerInfoDAO; //客户信息
	

	public List<CustomerLevel> allCustomerLevel() {
		return customerLevelDAO.findAll();
	}
	public List<DictionaryTypeInfo> allCustomerOpenBank() {
		DictionaryType dictionaryType=(DictionaryType) dictionaryTypeDAO.findByDataTypeName("开户银行-分类").get(0);
		List<DictionaryTypeInfo> allCustomerOpenBank=dictionaryTypeInfoDAO.findByProperty("dictionaryType", dictionaryType);//"dictionaryType"按这个字典分类来查找
		return allCustomerOpenBank;
	}
	public List<DictionaryTypeInfo> allCustomerProperties() {
		DictionaryType dictionaryType=(DictionaryType) dictionaryTypeDAO.findByDataTypeName("企业性质-分类").get(0);
		List<DictionaryTypeInfo> allCustomerProperties=dictionaryTypeInfoDAO.findByProperty("dictionaryType", dictionaryType);//"dictionaryType"按这个字典分类来查找
		return allCustomerProperties;
	}
	public List<DictionaryTypeInfo> allCustomerSource() {
		DictionaryType dictionaryType=(DictionaryType) dictionaryTypeDAO.findByDataTypeName("信息来源-分类").get(0);
		List<DictionaryTypeInfo> allCustomerSource=dictionaryTypeInfoDAO.findByProperty("dictionaryType", dictionaryType);//"dictionaryType"按这个字典分类来查找
		return allCustomerSource;
	}
	public List<DictionaryTypeInfo> allCustomerType() {
		DictionaryType dictionaryType=(DictionaryType) dictionaryTypeDAO.findByDataTypeName("企业类型-分类").get(0);
		List<DictionaryTypeInfo> allCustomerType=dictionaryTypeInfoDAO.findByProperty("dictionaryType", dictionaryType);//"dictionaryType"按这个字典分类来查找
		return allCustomerType;
	}
	public void saveCustomerInfo(CustomerInfo customerInfo) {
		customerInfoDAO.save(customerInfo);
	}
	public CustomerInfo findCustomerName(String customerName) {
		List<CustomerInfo> customerInfos=customerInfoDAO.findByCustomerName(customerName);
		if(customerInfos.size()!=0){
			return customerInfos.get(0);
		}else{
			return null;
		}
		
	}
	public Result findAllCustomerInfo(Page page) {
		page = PageUtil.createPage(page, customerInfoDAO.queryAllCount());
		List<CustomerInfo> customerInfos=customerInfoDAO.findAll(page);
		Result result= new Result();
		result.setList(customerInfos);
		result.setPage(page);
		return result;
	}
	public List<CustomerInfo> findAllCustomerInfo() {
		return customerInfoDAO.findAll();
	}
	public CustomerInfo findCustomerInfoDetail(int CustomerId) {
		return customerInfoDAO.findById(CustomerId);
	}
	public void updateCustomerInfo(CustomerInfo customerInfo) {
		customerInfoDAO.attachDirty(customerInfo);
	}
	public void deleteCustomerInfo(Integer customerId) {
		CustomerInfo customerInfoId = customerInfoDAO.findById(customerId);
		if(customerInfoId !=null){
			customerInfoDAO.delete(customerInfoId);
		}
		
	}
	public Result queryByProperty(String propertyName, String value,Page page) {
		page = PageUtil.createPage(page, customerInfoDAO.findByPropertyCount(propertyName, value));
		List<CustomerInfo> customerInfos=customerInfoDAO.findByProperty(propertyName, value);
		Result result= new Result();
		result.setList(customerInfos);
		result.setPage(page);
		return result;
	}

	
	public void setCustomerLevelDAO(CustomerLevelDAO customerLevelDAO) {
		this.customerLevelDAO = customerLevelDAO;
	}
	public void setDictionaryTypeDAO(DictionaryTypeDAO dictionaryTypeDAO) {
		this.dictionaryTypeDAO = dictionaryTypeDAO;
	}
	public void setDictionaryTypeInfoDAO(DictionaryTypeInfoDAO dictionaryTypeInfoDAO) {
		this.dictionaryTypeInfoDAO = dictionaryTypeInfoDAO;
	}
	public void setCustomerInfoDAO(CustomerInfoDAO customerInfoDAO) {
		this.customerInfoDAO = customerInfoDAO;
	}
	

	

	
	
}
