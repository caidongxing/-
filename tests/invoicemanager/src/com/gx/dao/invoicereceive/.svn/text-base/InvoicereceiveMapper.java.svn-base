package com.gx.dao.invoicereceive;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.po.invoicereceive.Invoicereceive;

public interface InvoicereceiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoicereceive record);

    int insertSelective(Invoicereceive record);

    Invoicereceive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invoicereceive record);

    int updateByPrimaryKey(Invoicereceive record);
    
    List<Invoicereceive> findBymedium(@Param("medium")Integer medium);
    
}