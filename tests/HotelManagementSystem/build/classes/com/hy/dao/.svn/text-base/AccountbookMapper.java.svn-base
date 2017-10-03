package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Accountbook;

public interface AccountbookMapper extends BaseMapper<Accountbook, Serializable> {
	
	List<Accountbook> findByStatus();
	public List<Accountbook> queryPage(@Param("accountbookname") String accountbookname,@Param("firstResult") int firstResult, @Param("pageSize") int pageSize);
	public int count(@Param("accountbookname") String name);
}