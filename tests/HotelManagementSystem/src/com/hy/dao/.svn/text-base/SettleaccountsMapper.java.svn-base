package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Settleaccounts;

public interface SettleaccountsMapper extends BaseMapper<Settleaccounts, Serializable> {
	
	public List<Settleaccounts> queryPage(@Param("chinesename") String chinesename,@Param("idnumber") String idnumber,@Param("roomnumber") String roomnumber,
			@Param("firstResult") int firstResult,@Param("pageSize") int pageSize);
	public int count(@Param("chinesename") String chinesename,@Param("idnumber") String idnumber,@Param("roomnumber") String roomnumber);
}