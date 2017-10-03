package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Nohireroom;

public interface NohireroomMapper extends BaseMapper<Nohireroom, Serializable> {
	
	Nohireroom findByPrimaryKey(int nohireroomid);
	
	List<Nohireroom> queryPage(@Param("status") int status,
			@Param("starnumber") Integer starnumber,
			@Param("endnumber") Integer endnumber,
			@Param("firstResult") int firstResult,
			@Param("pageSize") int pageSize);
	
	int count(@Param("status") int status,
			@Param("starnumber") Integer starnumber,
			@Param("endnumber") Integer endnumber);
}