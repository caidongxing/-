package com.hj.service;

import java.util.List;

import com.hj.dao.CustomerLevelDAO;
import com.hj.entity.CustomerLevel;

@SuppressWarnings("unchecked")
public class CustomerLevelServiceImpl implements CustomerLevelService{

	public CustomerLevelDAO customerLevelDAO;
	public CustomerLevelDAO getCustomerLevelDAO() {
		return customerLevelDAO;
	}
	public void setCustomerLevelDAO(CustomerLevelDAO customerLevelDAO) {
		this.customerLevelDAO = customerLevelDAO;
	}
	
	
	public List<CustomerLevel> AllCustomerLevel() {
		return customerLevelDAO.findAll();
	}

	public void updateCustomerLevel(CustomerLevel customerLevel) {
		customerLevelDAO.attachDirty(customerLevel);
		
	}

	
}
