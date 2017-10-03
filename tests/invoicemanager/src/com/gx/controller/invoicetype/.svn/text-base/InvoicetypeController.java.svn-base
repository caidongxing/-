package com.gx.controller.invoicetype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoicetype.InvoicetypeService;

@Controller
@RequestMapping("/invoicetypeController")
public class InvoicetypeController  extends BaseController{
	@Autowired
	private InvoicetypeService invoicetypeService;
	
	@RequestMapping("/list")
	public String list(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		return "/invoicetype/invoicetype_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/invoicetype/invoicetype_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/invoicetype/invoicetype_add";
	}
	
	@RequestMapping("/add")
	public String add(Invoicetype invoicetype){
		this.invoicetypeService.saveInvoicetype(invoicetype);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Invoicetype invoicetype){
		invoicetype=this.invoicetypeService.findById(invoicetype.getId());
		request.setAttribute("invoicetypes", invoicetype);
		return "/invoicetype/invoicetype_update";
	}
	
	@RequestMapping("/update")
	public String update(Invoicetype invoicetype){
		this.invoicetypeService.updateInvoicetype(invoicetype);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Invoicetype invoicetype){
		this.invoicetypeService.deleteInvoicetype(invoicetype.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.invoicetypeService.deleteInvoicetype(Integer.parseInt(sid));
		}
		return list();
	}
}
