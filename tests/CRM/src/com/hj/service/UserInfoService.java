package com.hj.service;

import java.util.List;

import com.hj.entity.UserInfo;
import com.hj.page.Page;
import com.hj.page.Result;

public interface UserInfoService {
    /***
     * 查找登陆用户名
     * **/
	public List<UserInfo>  findUserLoginName(String userLoginName);
	
	 /***
     * 保存用户信息
     * **/
	public void  saveUserInfo(UserInfo userInfo);
	
	/**
	 * 查找所有的用户信息,分页
	 * **/
	public Result findAllUser(Page page);
	/**
	 * 查找用户id
	 * 
	 * **/
	public UserInfo findUserId(Integer userId);
	/**
	 * 更新用户信息
	 * 
	 * **/
	public void updateUserInfo(UserInfo userInfo);
	
	/**
	 * 删除用户id
	 * 
	 * **/
	public void deleteUserId(Integer userId);
}


