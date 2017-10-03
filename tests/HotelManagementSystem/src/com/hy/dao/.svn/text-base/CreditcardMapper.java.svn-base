package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Creditcard;

public interface CreditcardMapper extends BaseMapper<Creditcard, Serializable> {
	
	List<Creditcard> fiindByNumber(@Param("Number") String Number);
}