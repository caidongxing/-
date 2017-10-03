package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Membercard;

public interface MembercardMapper extends BaseMapper<Membercard, Serializable> {
	
    List<Membercard> findByNumber(@Param("Number") String Number);
}