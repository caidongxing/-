package com.gx.controller.commodity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.commodity.Commodity;
import com.gx.service.commodity.CommodityService;

@Controller
@RequestMapping("/commodityController")
public class CommodityController  extends BaseController{
	@Autowired
	private CommodityService commodityService;
	
	@RequestMapping("/list")
	public String list(){
		List<Commodity> commodities=this.commodityService.findAll();
		request.setAttribute("commodities", commodities);
		return "/commodity/commodity_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/commodity/commodity_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/commodity/commodity_add";
	}
	
	@RequestMapping("/add")
	public String add(Commodity commodity){
		this.commodityService.saveCommodity(commodity);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Commodity commodity){
		commodity=this.commodityService.findById(commodity.getId());
		request.setAttribute("commoditys", commodity);
		return "/commodity/commodity_update";
	}
	
	@RequestMapping("/update")
	public String update(Commodity commodity){
		this.commodityService.updateCommodity(commodity);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Commodity commodity){
		this.commodityService.deleteCommodity(commodity.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.commodityService.deleteCommodity(Integer.parseInt(sid));
		}
		return list();
	}
}
