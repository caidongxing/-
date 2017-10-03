package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.page.Page;
import com.hj.page.Result;
import com.hj.service.UserInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoFindAllAction extends ActionSupport{

	
	private static final long serialVersionUID = -4228214588472091990L;
	private UserInfoService userInfoService;
	private Integer currentPage;
	
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String execute() throws Exception {
		Page page=new Page();
		page.setEveryPage(10);
		if(currentPage==null ||currentPage==0){
		   currentPage=1;
		}
		page.setCurrentPage(currentPage);
		
		Result result=userInfoService.findAllUser(page);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("findAllUserInfo", result.getList());
		request.setAttribute("page", result.getPage());
		
		return this.SUCCESS;
	}

	
	
}
