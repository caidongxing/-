package com.hy.service;

import java.io.Serializable;

import com.hy.page.Page;
import com.hy.po.Settleaccounts;

public interface SettleaccountsService extends BaseService<Settleaccounts, Serializable> {

	Page<Settleaccounts> queryPage(String chinesename,String idnumber,String roomnumber,
			Page<Settleaccounts> page);
	int settleAccounts(Settleaccounts settleaccounts);
}
