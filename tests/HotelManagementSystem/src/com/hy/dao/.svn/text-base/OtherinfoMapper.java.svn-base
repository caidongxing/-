package com.hy.dao;

import java.io.Serializable;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Otherinfo;
import com.hy.vo.OtherInfo;

public interface OtherinfoMapper extends BaseMapper<Otherinfo, Serializable> {
	
	OtherInfo findByForeignKey(@Param("roomreservationid") int id);
}