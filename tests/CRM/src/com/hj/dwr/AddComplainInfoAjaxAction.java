package com.hj.dwr;

import java.text.SimpleDateFormat;
import java.util.Map;

import com.hj.entity.ComplainInfo;
import com.hj.entity.CustomerInfo;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.entity.UserInfo;
import com.hj.service.ComplainInfoService;
import com.hj.service.CustomerInfoService;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.UserInfoService;

public class AddComplainInfoAjaxAction {
	private ComplainInfoService complainInfoService;
	private CustomerInfoService customerInfoService;
	private UserInfoService userInfoService;
	private DictionaryTypeInfoService dictionaryTypeInfoService;
	


	public ComplainInfoService getComplainInfoService() {
		return complainInfoService;
	}
	public void setComplainInfoService(ComplainInfoService complainInfoService) {
		this.complainInfoService = complainInfoService;
	}
	public CustomerInfoService getCustomerInfoService() {
		return customerInfoService;
	}
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	public DictionaryTypeInfoService getDictionaryTypeInfoService() {
		return dictionaryTypeInfoService;
	}
	public void setDictionaryTypeInfoService(
			DictionaryTypeInfoService dictionaryTypeInfoService) {
		this.dictionaryTypeInfoService = dictionaryTypeInfoService;
	}



	/***
	 * 保存投诉信息
	 * **/

	@SuppressWarnings("unchecked")
	public String saveComplainInfo(Map complain) throws Exception{
		String complainTheme= complain.get("complainTheme").toString();
		    System.out.println(complainTheme);
		Integer customerId=Integer.parseInt(complain.get("customerId").toString());
		    System.out.println(customerId);
		String complainPerson= complain.get("complainPerson").toString();
		    System.out.println(complainPerson);
		Integer userId=Integer.parseInt(complain.get("userId").toString());
		    System.out.println(userId);
		Integer customerSatisfaction=Integer.parseInt(complain.get("customerSatisfaction").toString());
		    System.out.println(customerSatisfaction);
		Integer complainStatus=Integer.parseInt(complain.get("complainStatus").toString());
		    System.out.println(complainStatus);
		String complainDate= complain.get("complainDate").toString();
		    System.out.println(complainDate);
		String complainContent= complain.get("complainContent").toString();
		    System.out.println(complainContent);
		String complainHandleWay= complain.get("complainHandleWay").toString();
		    System.out.println(complainHandleWay);
		String complainRemarkInfo= complain.get("complainRemarkInfo").toString();
		    System.out.println(complainRemarkInfo);
		
		
		 
		 
		    
		    
		ComplainInfo complainInfo=new ComplainInfo();
		//设置客户Id
		CustomerInfo  customerIds=customerInfoService.findCustomerInfoDetail(customerId);
		complainInfo.setCustomerInfo(customerIds);
		//设置用户Id
		UserInfo userInfoIds=userInfoService.findUserId(userId);
		complainInfo.setUserInfo(userInfoIds);
		//设置满意程度Id
		DictionaryTypeInfo customerSatisfactionIds=dictionaryTypeInfoService.findDictionaryTypeInfoId(customerSatisfaction);
		complainInfo.setDictionaryTypeInfoByCustomerSatisfaction(customerSatisfactionIds);
		//设置状态Id
		DictionaryTypeInfo complainStatusIds=dictionaryTypeInfoService.findDictionaryTypeInfoId(complainStatus);
		complainInfo.setDictionaryTypeInfoByComplainStatus(complainStatusIds);
		
		complainInfo.setComplainTheme(complainTheme);
		complainInfo.setComplainPerson(complainPerson);
		complainInfo.setComplainDate(new SimpleDateFormat("yyyy-MM-dd").parse(complainDate));
		complainInfo.setComplainContent(complainContent);
		complainInfo.setComplainHandleWay(complainHandleWay);
		complainInfo.setComplainRemarkInfo(complainRemarkInfo);
		complainInfoService.saveComplainInfo(complainInfo);
		
		String str="录入客户投诉信息成功！";
		return str;
	}
	
	/***
	 * 更新投诉信息
	 * **/

	@SuppressWarnings("unchecked")
	public String updateComplainInfo(Map complain) throws Exception{
		
		Integer complainId=Integer.parseInt(complain.get("complainId").toString());
		    System.out.println(complainId);
		String complainTheme= complain.get("complainTheme").toString();
	        System.out.println(complainTheme);
		Integer customerId=Integer.parseInt(complain.get("customerId").toString());
		    System.out.println(customerId);
		String complainPerson= complain.get("complainPerson").toString();
		    System.out.println(complainPerson);
		Integer userId=Integer.parseInt(complain.get("userId").toString());
		    System.out.println(userId);
		Integer customerSatisfaction=Integer.parseInt(complain.get("customerSatisfaction").toString());
		    System.out.println(customerSatisfaction);
		Integer complainStatus=Integer.parseInt(complain.get("complainStatus").toString());
		    System.out.println(complainStatus);
		String complainDate= complain.get("complainDate").toString();
		    System.out.println(complainDate);
		String complainContent= complain.get("complainContent").toString();
		    System.out.println(complainContent);
		String complainHandleWay= complain.get("complainHandleWay").toString();
		    System.out.println(complainHandleWay);
		String complainRemarkInfo= complain.get("complainRemarkInfo").toString();
	        System.out.println(complainRemarkInfo);
		
		ComplainInfo complainInfo=new ComplainInfo();
		//设置客户Id
		CustomerInfo  customerIds=customerInfoService.findCustomerInfoDetail(customerId);
		complainInfo.setCustomerInfo(customerIds);
		//设置用户Id
		UserInfo userInfoIds=userInfoService.findUserId(userId);
		complainInfo.setUserInfo(userInfoIds);
		//设置满意程度Id
		DictionaryTypeInfo customerSatisfactionIds=dictionaryTypeInfoService.findDictionaryTypeInfoId(customerSatisfaction);
		complainInfo.setDictionaryTypeInfoByCustomerSatisfaction(customerSatisfactionIds);
		//设置状态Id
		DictionaryTypeInfo complainStatusIds=dictionaryTypeInfoService.findDictionaryTypeInfoId(complainStatus);
		complainInfo.setDictionaryTypeInfoByComplainStatus(complainStatusIds);
		
		complainInfo.setComplainTheme(complainTheme);
		complainInfo.setComplainPerson(complainPerson);
		complainInfo.setComplainDate(new SimpleDateFormat("yyyy-MM-dd").parse(complainDate));
		complainInfo.setComplainContent(complainContent);
		complainInfo.setComplainHandleWay(complainHandleWay);
		complainInfo.setComplainRemarkInfo(complainRemarkInfo);
		complainInfo.setComplainId(complainId);
		complainInfoService.updateComplainInfo(complainInfo);
		
		String str="更新客户投诉信息成功！";
		return str;
	}
	
	/***
	 * 注销投诉信息
	 * **/

	@SuppressWarnings("unchecked")
	public String deleteComplainInfo(Integer complainId) throws Exception{
		
		complainInfoService.deleteComplainInfo(complainId);
		String str="注销客户投诉信息成功！";
		return str;
	}
	
	/***
	 * 批量注销投诉信息
	 * **/

	@SuppressWarnings("unchecked")
	public String deleteComplainInfoBatch(Integer[] complainIds) throws Exception{
		for(Integer complainId : complainIds){
			this.deleteComplainInfo(complainId);
		}
		String str="注批量注销投诉信息成功！";
		return str;
	}
	
	
}
