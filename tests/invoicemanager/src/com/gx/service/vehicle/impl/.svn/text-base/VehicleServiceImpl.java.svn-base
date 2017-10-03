package com.gx.service.vehicle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.vehicle.VehicleMapper;
import com.gx.po.vehicle.Vehicle;
import com.gx.service.vehicle.VehicleService;

@Transactional
@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleMapper vehicleMapper;

	@Override
	public List<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return this.vehicleMapper.findAll();
	}

	@Override
	public void saveVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		this.vehicleMapper.insert(vehicle);
	}

	@Override
	public Vehicle findById(int id) {
		// TODO Auto-generated method stub
		return this.vehicleMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		this.vehicleMapper.updateByPrimaryKey(vehicle);
	}

	@Override
	public void deleteVehicle(int id) {
		// TODO Auto-generated method stub
		this.vehicleMapper.deleteByPrimaryKey(id);
	}

}
