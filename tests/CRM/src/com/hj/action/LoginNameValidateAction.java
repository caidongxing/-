package com.hj.action;

import java.util.List;

import com.hj.entity.UserInfo;
import com.hj.service.UserInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginNameValidateAction extends ActionSupport{
	
	private static final long serialVersionUID = 4624704958138616813L;
	private String userLoginName;
	private boolean ok;
	private UserInfoService userInfoService;
	public String getUserLoginName() {
		return userLoginName;
	}
	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	@Override
	public String execute() {
		//判断用户登录名是否与输入的相同
		if(userInfoService.findUserLoginName(userLoginName).size()!=0){
			ok=true;
		}else{
			ok=false;
		}
	    return this.SUCCESS;
    }
} 