package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.page.Page;
import com.hj.page.Result;
import com.hj.service.CustomerInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerInfoQueryAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String type;
	private String key;
	private CustomerInfoService customerInfoService;
	private Integer currentPage;
	
	
	@Override
	public String execute() throws Exception {
		/**
		 * 如果key为空 或null 就查询所以 否则就模糊查询条件的
		 * */
		if(key==null){
			Page page=new Page();
			page.setEveryPage(10);
			page.setCurrentPage(currentPage);
			
			Result findAllCustomerInfo =customerInfoService.findAllCustomerInfo(page);
			HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("findAllCustomerInfo", findAllCustomerInfo.getList());
			request.setAttribute("page", findAllCustomerInfo.getPage());
			
		}else {
			Page page=new Page();
			page.setEveryPage(10);
			if(currentPage==null){
			   currentPage=1;
			}
			page.setCurrentPage(currentPage);
			
			Result result=customerInfoService.queryByProperty(type, key, page);
			HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("findAllCustomerInfo", result.getList());
			request.setAttribute("page", result.getPage());
			request.setAttribute("key", key);//搜索后 要搜索内容还保存在文本框
			request.setAttribute(type, "selected");//搜索后 要搜索类别还保存在选择框
		}
		
		return this.SUCCESS;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public CustomerInfoService getCustomerInfoService() {
		return customerInfoService;
	}
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
}
