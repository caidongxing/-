package com.gx.dao.commodity;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.commodity.Commodity;

@Repository(value="commodityMapper")
public interface CommodityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
    
    List<Commodity> findAll();
}