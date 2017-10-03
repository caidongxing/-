package com.hy.service;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("hiding")
public interface BaseService <T,Serializable> {

	int deleteByPrimaryKey(int id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
    List<T> findAll();
}
