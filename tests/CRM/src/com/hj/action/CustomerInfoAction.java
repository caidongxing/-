package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.CustomerLevel;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.CustomerInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerInfoAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	private CustomerInfoService customerInfoService;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		//所以客户企业性质-分类"
		request.setAttribute("allCustomerProperties", customerInfoService.allCustomerProperties());
		//所以客户企业类型-分类
		request.setAttribute("allCustomerType", customerInfoService.allCustomerType());
		//所以客户开户银行-分类
		request.setAttribute("allCustomerOpenBank", customerInfoService.allCustomerOpenBank());
		//所以客户信息来源-分类
		request.setAttribute("allCustomerSource", customerInfoService.allCustomerSource());
		//所以客户信级别-分类
		request.setAttribute("allCustomerLevel", customerInfoService.allCustomerLevel());
		
		return this.SUCCESS;
		
		
		//测试
		/**
		System.out.println("所以客户企业性质-分类");
		for(DictionaryTypeInfo allCustomerProperties:customerInfoService.allCustomerProperties()){
			System.out.println(allCustomerProperties.getDataInformationName()+" ");
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("所以客户企业类型-分类");
		for(DictionaryTypeInfo allCustomerType:customerInfoService.allCustomerType()){
			System.out.println(allCustomerType.getDataInformationName()+" ");
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("所以客户开户银行-分类");
		for(DictionaryTypeInfo allCustomerOpenBank:customerInfoService.allCustomerOpenBank()){
			System.out.println(allCustomerOpenBank.getDataInformationName()+" ");
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("所以客户信息来源-分类");
		for(DictionaryTypeInfo allCustomerSource:customerInfoService.allCustomerSource()){
			System.out.println(allCustomerSource.getDataInformationName()+" ");
		}
		System.out.println("-----------------------------------------------------------------");
		
		
		System.out.println("所以客户信级别-分类");
		for(CustomerLevel allcustomerLevel:customerInfoService.allCustomerLevel()){
			System.out.println(allcustomerLevel.getLevelName()+" ");
		}
		System.out.println("-----------------------------------------------------------------");
		****/
		
	}

	//注入Service 的 set 方法
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	
	
}
