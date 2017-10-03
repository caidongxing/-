package com.hy.service;

import java.io.Serializable;
import java.util.List;

import com.hy.po.Signbilldetail;

public interface SignbilldetailService extends BaseService<Signbilldetail, Serializable> {

	List<Signbilldetail> findByAccountId(Integer accountid);
	
	List<Signbilldetail> findForeignKey(Integer signbillid);
}
