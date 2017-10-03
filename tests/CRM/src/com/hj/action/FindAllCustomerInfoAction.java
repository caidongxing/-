package com.hj.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.page.Page;
import com.hj.page.Result;
import com.hj.service.CustomerInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class FindAllCustomerInfoAction extends ActionSupport{


	private static final long serialVersionUID = 1L;
	private CustomerInfoService customerInfoService;//注入Service 然后再设置set和get方法
    private Integer currentPage;
	
	
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public CustomerInfoService getCustomerInfoService() {
		return customerInfoService;
	}
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	@Override
	public String execute() throws Exception {
			
		Page page=new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		
		Result findAllCustomerInfo =customerInfoService.findAllCustomerInfo(page);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("findAllCustomerInfo", findAllCustomerInfo.getList());
		request.setAttribute("page", findAllCustomerInfo.getPage());
		
	     /*List<CustomerInfo>	findAllCustomerInfo=customerInfoService.findAllCustomerInfo();
		     HttpServletRequest request=ServletActionContext.getRequest();
		     request.setAttribute("findAllCustomerInfo", findAllCustomerInfo);*/
		return this.SUCCESS;
	}
	
	
	
}
