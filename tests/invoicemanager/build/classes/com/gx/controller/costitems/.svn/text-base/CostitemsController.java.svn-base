package com.gx.controller.costitems;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.costitems.Costitems;
import com.gx.service.costitems.CostitemsService;

@Controller
@RequestMapping("/costitemsController")
public class CostitemsController  extends BaseController{
	@Autowired
	private CostitemsService costitemsService;
	
	@RequestMapping("/list")
	public String list(){
		List<Costitems> costitems=this.costitemsService.findAll();
		request.setAttribute("costitemss", costitems);
		return "/costitems/costitems_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/costitems/costitems_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/costitems/costitems_add";
	}
	
	@RequestMapping("/add")
	public String add(Costitems costitems){
		this.costitemsService.saveCostitems(costitems);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Costitems costitems){
		costitems=this.costitemsService.findById(costitems.getId());
		request.setAttribute("costitemss", costitems);
		return "/costitems/costitems_update";
	}
	
	@RequestMapping("/update")
	public String update(Costitems costitems){
		this.costitemsService.updateCostitems(costitems);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Costitems costitems){
		this.costitemsService.deleteCostitems(costitems.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.costitemsService.deleteCostitems(Integer.parseInt(sid));
		}
		return list();
	}
}
