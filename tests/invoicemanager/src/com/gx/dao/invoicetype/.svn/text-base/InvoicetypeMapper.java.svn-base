package com.gx.dao.invoicetype;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.invoicetype.Invoicetype;

@Repository(value="invoicetypeMapper")
public interface InvoicetypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoicetype record);

    int insertSelective(Invoicetype record);

    Invoicetype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invoicetype record);

    int updateByPrimaryKey(Invoicetype record);
    
    List<Invoicetype> findAll();
}