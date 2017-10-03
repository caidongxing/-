package com.hj.service;

import java.util.List;

import com.hj.dao.ContactPersonInfoDAO;
import com.hj.entity.ContactPersonInfo;
import com.hj.entity.CustomerInfo;
import com.hj.page.Page;
import com.hj.page.PageUtil;
import com.hj.page.Result;

@SuppressWarnings("unchecked")
public class ContactPersonInfoServiceImpl implements  ContactPersonInfoService{

	private ContactPersonInfoDAO contactPersonInfoDAO; //注入contactPersonInfoDAO  set get方法 
	
	public ContactPersonInfoDAO getContactPersonInfoDAO() {
		return contactPersonInfoDAO;
	}
	public void setContactPersonInfoDAO(ContactPersonInfoDAO contactPersonInfoDAO) {
		this.contactPersonInfoDAO = contactPersonInfoDAO;
	}
	
	
	
	public void saveContactPersonInfo(ContactPersonInfo contactPersonInfo) {
		contactPersonInfoDAO.save(contactPersonInfo);	
	}
	public List<ContactPersonInfo> findAllContactPersonInfo() {
		return contactPersonInfoDAO.findAll();
	}
	public Result findAllContactPersonInfo(Page page) {
		page = PageUtil.createPage(page, contactPersonInfoDAO.findByContactPersonCount());
		List<CustomerInfo> customerInfos=contactPersonInfoDAO.findAll(page);
		Result result= new Result();
		result.setList(customerInfos);
		result.setPage(page);
		return result;
	}
	public ContactPersonInfo findByContactId(Integer contactId) {
		return contactPersonInfoDAO.findById(contactId);
	}
	public void updateContactPersonInfo(ContactPersonInfo contactPersonInfo) {
		contactPersonInfoDAO.attachDirty(contactPersonInfo);
	}
	public void deleteContactPersonInfo(Integer contactId) {
		ContactPersonInfo contactPersonInfo=this.findByContactId(contactId);
		contactPersonInfoDAO.delete(contactPersonInfo);
		
	}
	
}
