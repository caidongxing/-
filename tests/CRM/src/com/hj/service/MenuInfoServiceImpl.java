package com.hj.service;

import java.util.List;

import com.hj.dao.MenuInfoDAO;
import com.hj.entity.MenuInfo;

public class MenuInfoServiceImpl implements MenuInfoService {

	private MenuInfoDAO menuInfoDAO;
	
	public MenuInfoDAO getMenuInfoDAO() {
		return menuInfoDAO;
	}

	public void setMenuInfoDAO(MenuInfoDAO menuInfoDAO) {
		this.menuInfoDAO = menuInfoDAO;
	}

	@SuppressWarnings("unchecked")
	public List<MenuInfo> findAllMenuInfo() {
		return menuInfoDAO.findAll();
	}

}
