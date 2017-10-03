package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Aignbilltemplate;

public interface AignbilltemplateMapper extends BaseMapper<Aignbilltemplate, Serializable> {
	
	List<Aignbilltemplate> queryPage(@Param("templatename") String templatename,@Param("firstResult") int firstResult, @Param("pageSize") int pageSize);
	int count(@Param("templatename") String templatename);
}