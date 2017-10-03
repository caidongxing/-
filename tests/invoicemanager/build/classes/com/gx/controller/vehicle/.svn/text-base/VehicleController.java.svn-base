package com.gx.controller.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.vehicle.Vehicle;
import com.gx.service.vehicle.VehicleService;

@Controller
@RequestMapping("/vehicleController")
public class VehicleController extends BaseController{
	@Autowired
	private VehicleService vehicleService;

	@RequestMapping("/list")
	public String list(){
		List<Vehicle> vehicles=this.vehicleService.findAll();
		request.setAttribute("vehicles", vehicles);
		return "/vehicle/vehicle_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/vehicle/vehicle_add";
	}
	
	@RequestMapping("/add")
	public String add(Vehicle vehicle){
		this.vehicleService.saveVehicle(vehicle);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Vehicle vehicle){
		vehicle=this.vehicleService.findById(vehicle.getId());
		request.setAttribute("vehicles", vehicle);
		return "/vehicle/vehicle_update";
	}
	
	@RequestMapping("/update")
	public String update(Vehicle vehicle){
		this.vehicleService.updateVehicle(vehicle);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Vehicle vehicle){
		this.vehicleService.deleteVehicle(vehicle.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.vehicleService.deleteVehicle(Integer.parseInt(sid));
		}
		return list();
	}
}
