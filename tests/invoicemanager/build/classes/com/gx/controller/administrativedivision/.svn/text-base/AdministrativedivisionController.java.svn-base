package com.gx.controller.administrativedivision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.administrativedivision.Administrativedivision;
import com.gx.service.administrativedivision.AdministrativedivisionService;

@Controller
@RequestMapping("/administrativedivisionController")
public class AdministrativedivisionController  extends BaseController{
	@Autowired
	private AdministrativedivisionService administrativedivisionService;
	
	@RequestMapping("/list")
	public String list(){
		List<Administrativedivision> administrativedivisions=this.administrativedivisionService.findAll();
		request.setAttribute("administrativedivisions", administrativedivisions);
		return "/administrativedivision/administrativedivision_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/administrativedivision/administrativedivision_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/administrativedivision/administrativedivision_add";
	}
	
	@RequestMapping("/add")
	public String add(Administrativedivision administrativedivision){
		this.administrativedivisionService.saveAdministrativedivision(administrativedivision);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Administrativedivision administrativedivision){
		administrativedivision=this.administrativedivisionService.findById(administrativedivision.getId());
		request.setAttribute("administrativedivisions", administrativedivision);
		return "/administrativedivision/administrativedivision_update";
	}
	
	@RequestMapping("/update")
	public String update(Administrativedivision administrativedivision){
		this.administrativedivisionService.updateAdministrativedivision(administrativedivision);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Administrativedivision administrativedivision){
		this.administrativedivisionService.deleteAdministrativedivision(administrativedivision.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.administrativedivisionService.deleteAdministrativedivision(Integer.parseInt(sid));
		}
		return list();
	}
}
