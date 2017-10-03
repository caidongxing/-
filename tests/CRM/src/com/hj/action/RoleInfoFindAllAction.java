package com.hj.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.page.Page;
import com.hj.page.Result;
import com.hj.service.RoleInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class RoleInfoFindAllAction extends ActionSupport{
	private static final long serialVersionUID = 8457162063215474823L;
	private RoleInfoService roleInfoService;
	private Integer currentPage;
	
	@Override
	public String execute() throws Exception {
		
		Page page=new Page();
		page.setEveryPage(10);
		if(currentPage==null ||currentPage==0){
		   currentPage=1;
		}
		page.setCurrentPage(currentPage);
		
		Result result=roleInfoService.findAllRole(page);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("findAllRoleInfo", result.getList());
		request.setAttribute("page", result.getPage());
		return this.SUCCESS;
	}

	public RoleInfoService getRoleInfoService() {
		return roleInfoService;
	}

	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

}
