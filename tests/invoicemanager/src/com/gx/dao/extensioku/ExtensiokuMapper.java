package com.gx.dao.extensioku;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.po.extensioku.Extensioku;
import com.gx.vo.ExtensiokuVo;


public interface ExtensiokuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Extensioku record);

    int insertSelective(Extensioku record);

    Extensioku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Extensioku record);

    int updateByPrimaryKey(Extensioku record);
    
    List<ExtensiokuVo> findBymedium(@Param("medium")int medium);
    
    List<Extensioku> findOnReturn(@Param("medium")int medium);
    
    List<ExtensiokuVo> findBymediumAndType(@Param("medium")int medium,@Param("type")int type);
}