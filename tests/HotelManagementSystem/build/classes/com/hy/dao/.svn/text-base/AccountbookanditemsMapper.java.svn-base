package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Accountbookanditems;

public interface AccountbookanditemsMapper extends BaseMapper<Accountbookanditems, Serializable> {

	int deleteByKey(int accountbookid);
	List<Accountbookanditems> findByKey(int accountbookid);
	
	List<Accountbookanditems> findAccountbookitemsById(@Param("accountbookid") int accountbookid,@Param("signbillid") int signbillid);
}