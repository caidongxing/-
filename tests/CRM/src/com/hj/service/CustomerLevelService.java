package com.hj.service;

import java.util.List;

import com.hj.entity.CustomerLevel;

public interface CustomerLevelService {

	//查找所有客户级别
	public List<CustomerLevel> AllCustomerLevel();
	//更新客户级别
	public void updateCustomerLevel(CustomerLevel customerLevel);
}
