package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Signbilldetail;

public interface SignbilldetailMapper extends BaseMapper<Signbilldetail, Serializable> {
	
	List<Signbilldetail> findByAccountId(@Param("accountid") int accountid);
	
	List<Signbilldetail> findForeignKey(@Param("signbillid") int signbillid);
}