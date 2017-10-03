package com.gx.controller.invoiceinventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.service.invoicetype.InvoicetypeService;
import com.gx.vo.InvoiceinventoryVo;

@Controller
@RequestMapping("/invoiceinventoryController")
public class InvoiceinventoryController  extends BaseController{
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;
	@Autowired
	private InvoicetypeService invoicetypeService;
	
	@RequestMapping("/list")
	public String list(){
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findAll();
		request.setAttribute("invoiceinventories", invoiceinventoryVos);
		return "/invoiceinventory/invoice_inventory";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "";
	}
	
	@RequestMapping("/add")
	public String add(){
		
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(){
		return "";
	}
	
	@RequestMapping("/update")
	public String update(){
		return "";
	}
	
	@RequestMapping("/delete")
	public String delete(){
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			//this.costitemsService.deleteCostitems(Integer.parseInt(sid));
		}
		return list();
	}
	
	@RequestMapping("/inventory_query")
	public String inventory_query(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		return "/invoiceinventory/invoice_inventory";
	}
}
