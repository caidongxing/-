package com.gx.dao.purchaseunits;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.purchaseunits.Purchaseunits;

@Repository(value="purchaseunitsMapper")
public interface PurchaseunitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Purchaseunits record);

    int insertSelective(Purchaseunits record);

    Purchaseunits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Purchaseunits record);

    int updateByPrimaryKey(Purchaseunits record);
    
    List<Purchaseunits> findAll();
}