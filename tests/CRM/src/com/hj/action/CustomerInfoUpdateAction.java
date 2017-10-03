package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.CustomerInfo;
import com.hj.service.CustomerInfoService;
import com.opensymphony.xwork2.ActionSupport;

/***
 * @author taozhida
 * @version
 * 更新前执行
 * 1.用来获得客户的详细信息，通过客户ID （类似查看用户的详细情况）
 * 2.获得数据字典自信，并保存request范围，用于在更新页面中显示下拉列表。
 * */
public class CustomerInfoUpdateAction  extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Integer customerId;
	private CustomerInfoService customerInfoService;

	@Override
	public String execute() throws Exception {
		/**1*/
		CustomerInfo customerInfo=customerInfoService.findCustomerInfoDetail(customerId);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("customerInfo", customerInfo);
		/**2*/
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
	}


	
	public CustomerInfoService getCustomerInfoService() {
		return customerInfoService;
	}
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	
}
