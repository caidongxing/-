package com.hj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.MenuInfo;
import com.hj.service.MenuInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class MenuInfoFindAllAction extends ActionSupport{

	private static final long serialVersionUID = 5733166340077623612L;
	private MenuInfoService menuInfoService;
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request=ServletActionContext.getRequest();
		List<MenuInfo> menuInfoFindAll=menuInfoService.findAllMenuInfo();
		request.setAttribute("menuInfoFindAll", menuInfoFindAll);
		return this.SUCCESS;
	}

	public MenuInfoService getMenuInfoService() {
		return menuInfoService;
	}

	public void setMenuInfoService(MenuInfoService menuInfoService) {
		this.menuInfoService = menuInfoService;
	}
	
	
}
