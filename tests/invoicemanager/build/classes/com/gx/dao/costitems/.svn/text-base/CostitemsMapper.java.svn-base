package com.gx.dao.costitems;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.costitems.Costitems;

@Repository(value="costitemsMapper")
public interface CostitemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Costitems record);

    int insertSelective(Costitems record);

    Costitems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Costitems record);

    int updateByPrimaryKey(Costitems record);
    
    List<Costitems> findAll();
}