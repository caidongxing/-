package com.gx.controller.taxitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.taxitem.Taxitem;
import com.gx.service.taxitem.TaxitemService;

@Controller
@RequestMapping("/taxitemController")
public class TaxitemController  extends BaseController{
	@Autowired
	private TaxitemService taxitemService;
	
	@RequestMapping("/list")
	public String list(){
		List<Taxitem> taxitems=this.taxitemService.findAll();
		request.setAttribute("taxitems", taxitems);
		return "/taxitem/taxitem_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/taxitem/taxitem_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/taxitem/taxitem_add";
	}
	
	@RequestMapping("/add")
	public String add(Taxitem taxitem){
		this.taxitemService.saveTaxitem(taxitem);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Taxitem taxitem){
		taxitem=this.taxitemService.findById(taxitem.getId());
		request.setAttribute("taxitems", taxitem);
		return "/taxitem/taxitem_update";
	}
	
	@RequestMapping("/update")
	public String update(Taxitem taxitem){
		this.taxitemService.updateTaxitem(taxitem);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Taxitem taxitem){
		this.taxitemService.deleteTaxitem(taxitem.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.taxitemService.deleteTaxitem(Integer.parseInt(sid));
		}
		return list();
	}
}
