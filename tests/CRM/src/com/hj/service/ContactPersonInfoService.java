package com.hj.service;

import java.util.List;

import com.hj.entity.ContactPersonInfo;
import com.hj.page.Page;
import com.hj.page.Result;

public interface ContactPersonInfoService {
	/**
	 * 添加联系个人信息
	 */
       public void saveContactPersonInfo(ContactPersonInfo contactPersonInfo);
    /**
   	 * 查询所有联系个人信息
   	 */
       public List<ContactPersonInfo> findAllContactPersonInfo();
   	/**
   	 * 查找所有联系人信息 分页
   	 * */
   	public Result findAllContactPersonInfo(Page page);  
	/**
   	 * 查找联系人信息 id 
   	 * */
   	public ContactPersonInfo findByContactId(Integer contactId);  
   	/**
   	 * 更新联系人信息 id 
   	 * */   
	public void updateContactPersonInfo(ContactPersonInfo contactPersonInfo);  
	
	/**
   	 * 删除联系人信息 id 
   	 * */   
	public void deleteContactPersonInfo(Integer contactId);  
	
	
}
