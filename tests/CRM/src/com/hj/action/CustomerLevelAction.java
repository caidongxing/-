package com.hj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.CustomerLevel;
import com.hj.service.CustomerLevelService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerLevelAction extends ActionSupport{

	private static final long serialVersionUID = -4270574223934770283L;
	private CustomerLevelService customerLevelService;

	@Override
	public String execute() throws Exception {
		List<CustomerLevel> allCustomerLevel=customerLevelService.AllCustomerLevel();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("allCustomerLevel", allCustomerLevel);
		return this.SUCCESS;
	}
	//注入Service后 进行set方法
	public void setCustomerLevelService(CustomerLevelService customerLevelService) {
		this.customerLevelService = customerLevelService;
	}
	
}
