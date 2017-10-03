package com.gx.dao.vehicle;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.vehicle.Vehicle;

@Repository(value="vehicleMapper")
public interface VehicleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vehicle record);

    int insertSelective(Vehicle record);

    Vehicle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Vehicle record);

    int updateByPrimaryKey(Vehicle record);
    
    public List<Vehicle> findAll();
}