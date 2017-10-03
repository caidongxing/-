package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Signbill;

public interface SignbillMapper extends BaseMapper<Signbill, Serializable> {
	
	List<Signbill> findByForeignKey(@Param("accountid") int accountid);
}