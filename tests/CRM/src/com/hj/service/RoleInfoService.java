package com.hj.service;

import java.util.List;

import com.hj.entity.RoleInfo;
import com.hj.page.Page;
import com.hj.page.Result;

public interface RoleInfoService {

	/**
	 * 保存角色
	 * **/
	public void saveRole(RoleInfo roleInfo);
	/**
	 * 查找角色名称
	 * **/
	public List<RoleInfo> findByRoleName(String roleName);
	/**
	 * 查找所有的角色,分页
	 * **/
	public Result findAllRole(Page page);
	
	/**
	 * 查找角色id获得角色
	 * **/
	public RoleInfo findByRoleInfoId(Integer roleInfoId);
	
	/**
	 * 查找角色
	 * **/
	public void deleteRoleInfo(RoleInfo roleInfo);
	

}
