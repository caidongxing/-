package com.gx.dao.invoiceinventory;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.po.invoicereceive.Invoicereceive;
import com.gx.vo.InvoiceinventoryVo;
import com.gx.vo.InvoicereceiveVo;

@Repository(value="invoiceinventoryMapper")
public interface InvoiceinventoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invoiceinventory record);

    int insertSelective(Invoiceinventory record);

    Invoiceinventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invoiceinventory record);

    int updateByPrimaryKey(Invoiceinventory record);
    
    List<InvoiceinventoryVo> findAll();
    
    List<InvoicereceiveVo> findByDate(@Param("startime")Date startime,@Param("endtime")Date endtime);
    
    List<Invoiceinventory> findByContent(@Param("invoicetype")Integer invoicetype,@Param("startnumber")String startnumber,@Param("invoicenumber")Integer invoicenumber);
    
    List<Invoiceinventory> findByKuCun(@Param("year")Integer year,@Param("month")Integer month,@Param("invoicetype")Integer invoicetype);
    
    List<InvoiceinventoryVo> findById(Integer id);
    
    int update (Invoiceinventory record);
    
    InvoiceinventoryVo findByType(@Param("type")int type);
    
    
}