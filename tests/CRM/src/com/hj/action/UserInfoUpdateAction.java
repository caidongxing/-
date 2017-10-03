package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.UserInfo;
import com.hj.service.UserInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateAction extends ActionSupport{

	private static final long serialVersionUID = 6593273930060651747L;
    private UserInfoService userInfoService;
    private Integer userId;
    
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String execute() throws Exception {
		UserInfo userInfo=userInfoService.findUserId(userId);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("UserInfos", userInfo);
		return this.SUCCESS;
	}

}
