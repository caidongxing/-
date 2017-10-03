package com.hj.action;

import com.hj.entity.CustomerLevel;
import com.hj.service.CustomerLevelService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateCustomerLevelAction extends ActionSupport{

	private static final long serialVersionUID = -3337510190071731122L;

	private Integer[] levelId;
	private Double[]  business;
	private String[]  levelName;
	private CustomerLevelService customerLevelService;
	@Override
	public String execute() throws Exception {
		for(int i=0;i<levelId.length;i++){
			CustomerLevel customerLevel=new CustomerLevel();
			customerLevel.setLevelId(levelId[i]);
			customerLevel.setBusiness(business[i]);
			customerLevel.setLevelName(levelName[i]);
			customerLevelService.updateCustomerLevel(customerLevel);
		}
		return this.SUCCESS;
	}
	public void setLevelId(Integer[] levelId) {
		this.levelId = levelId;
	}
	public void setBusiness(Double[] business) {
		this.business = business;
	}
	public void setLevelName(String[] levelName) {
		this.levelName = levelName;
	}
	public void setCustomerLevelService(CustomerLevelService customerLevelService) {
		this.customerLevelService = customerLevelService;
	}
	
	
	
	

}
