package com.gx.controller.purchaseunits;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.purchaseunits.Purchaseunits;
import com.gx.service.purchaseunits.PurchaseunitsService;

@Controller
@RequestMapping("/purchaseunitsController")
public class PurchaseunitsController  extends BaseController{
	@Autowired
	private PurchaseunitsService purchaseunitsService;
	
	@RequestMapping("/list")
	public String list(){
		List<Purchaseunits> purchaseunits=this.purchaseunitsService.findAll();
		request.setAttribute("purchaseunitss", purchaseunits);
		return "/purchaseunits/purchaseunits_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/purchaseunits/purchaseunits_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/purchaseunits/purchaseunits_add";
	}
	
	@RequestMapping("/add")
	public String add(Purchaseunits purchaseunits){
		this.purchaseunitsService.savePurchaseunits(purchaseunits);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Purchaseunits purchaseunits){
		purchaseunits=this.purchaseunitsService.findById(purchaseunits.getId());
		request.setAttribute("purchaseunitss", purchaseunits);
		return "/purchaseunits/purchaseunits_update";
	}
	
	@RequestMapping("/update")
	public String update(Purchaseunits purchaseunits){
		this.purchaseunitsService.updatePurchaseunits(purchaseunits);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Purchaseunits purchaseunits){
		this.purchaseunitsService.deletePurchaseunits(purchaseunits.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.purchaseunitsService.deletePurchaseunits(Integer.parseInt(sid));
		}
		return list();
	}
}
