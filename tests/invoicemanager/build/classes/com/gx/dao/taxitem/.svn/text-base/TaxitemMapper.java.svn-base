package com.gx.dao.taxitem;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.taxitem.Taxitem;

@Repository(value="taxitemMapper")
public interface TaxitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taxitem record);

    int insertSelective(Taxitem record);

    Taxitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taxitem record);

    int updateByPrimaryKey(Taxitem record);
    
    List<Taxitem> findAll();
}