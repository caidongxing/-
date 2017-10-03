package com.hj.service;

import java.util.List;

import com.hj.entity.MenuInfo;

public interface MenuInfoService {

	/***
	 * @author Administrator
	 * 获取菜单信息
	 * **/
	public  List<MenuInfo> findAllMenuInfo();
	
}
