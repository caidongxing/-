package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Clientinfo;

public interface ClientinfoMapper extends BaseMapper<Clientinfo, Serializable> {
	
	List<Clientinfo> findByParam(@Param("name") String name);
}