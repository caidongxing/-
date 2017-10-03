package com.gx.dao.administrativedivision;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.administrativedivision.Administrativedivision;

@Repository(value="administrativedivisionMapper")
public interface AdministrativedivisionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Administrativedivision record);

    int insertSelective(Administrativedivision record);

    Administrativedivision selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Administrativedivision record);

    int updateByPrimaryKey(Administrativedivision record);
    
    List<Administrativedivision> findAll();
}