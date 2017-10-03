package com.hy.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T, PK extends Serializable> {

	int deleteByPrimaryKey(int id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
    List<T> findAll();
}
