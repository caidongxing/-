package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.CustomerInfo;
import com.hj.service.CustomerInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerInfoDetailAction extends ActionSupport{

	private static final long serialVersionUID = 6974341542162566512L;
	private Integer  customerId;
	private CustomerInfoService customerInfoService;
	
	@Override
	public String execute() throws Exception {
		CustomerInfo customerInfo=customerInfoService.findCustomerInfoDetail(customerId);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("customerInfo", customerInfo);
		return this.SUCCESS;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public CustomerInfoService getCustomerInfoService() {
		return customerInfoService;
	}
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}


	
}
