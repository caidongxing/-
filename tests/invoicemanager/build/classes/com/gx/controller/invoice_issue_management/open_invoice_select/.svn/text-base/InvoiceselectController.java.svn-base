package com.gx.controller.invoice_issue_management.open_invoice_select;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.attributedetails.Attributedetails;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.attributedetails.AttributedetailsService;
import com.gx.service.invoicetype.InvoicetypeService;

@Controller
@RequestMapping("/invoiceselectController")
public class InvoiceselectController extends BaseController{
	@Autowired
	private InvoicetypeService invoicetypeService;
	@Autowired
	private AttributedetailsService attributedetailsService;
	
	@RequestMapping("/list_date")
	public String list_date(){
		return "/invoice_issue_management/open_invoice_select/list_date";
	}
	
	
	@RequestMapping("/list")
	public String list(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		
		List<Attributedetails> attributedetails=this.attributedetailsService.findAll();
		request.setAttribute("attributedetails", attributedetails);
		return "/invoice_issue_management/open_invoice_select/list";
	}
	
	@RequestMapping("/list_select")
	public String list_select(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		
		return "/invoice_issue_management/open_invoice_select/list_select";
	}
	
	@RequestMapping("/combination_select")
	public String combination_select(){
		return "/invoice_issue_management/open_invoice_select/combination_select";
	}
	
	@RequestMapping("/output_export")
	public String output_export(){
		return "/invoice_issue_management/open_invoice_select/output_export";
	}
	
	@RequestMapping("/output_date")
	public String output_date(){
		return "/invoice_issue_management/open_invoice_select/output_date";
	}
	
}
