package com.hj.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.page.Page;
import com.hj.page.Result;
import com.hj.service.ContactPersonInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class FindAllContactPersonInfoAction extends ActionSupport{
	
	private static final long serialVersionUID = -8700700547579336696L;
	
	private ContactPersonInfoService contactPersonInfoService;//注入
    private Integer currentPage;
    
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public ContactPersonInfoService getContactPersonInfoService() {
		return contactPersonInfoService;
	}
	public void setContactPersonInfoService(
			ContactPersonInfoService contactPersonInfoService) {
		this.contactPersonInfoService = contactPersonInfoService;
	}
	
	
	@Override
	public String execute() throws Exception {
		Page page=new Page();
		page.setEveryPage(10);
		if(currentPage==null){
		   currentPage=1;
		}
		page.setCurrentPage(currentPage);
		Result findAllContactPersonInfo= contactPersonInfoService.findAllContactPersonInfo(page);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("findAllContactPersonInfo", findAllContactPersonInfo.getList());
		request.setAttribute("page", findAllContactPersonInfo.getPage());
        return this.SUCCESS;
	}	
}
