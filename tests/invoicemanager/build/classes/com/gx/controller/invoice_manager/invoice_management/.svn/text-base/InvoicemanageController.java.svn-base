package com.gx.controller.invoice_manager.invoice_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.service.invoiceinventory.InvoiceinventoryService;

@Controller
@RequestMapping("/invoicemanageController")
public class InvoicemanageController extends BaseController{
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;

	@RequestMapping("/choice_medium")
	public String choice_medium(){
		return "/invoice_manager/read_new_invoices/read_new_invoices_first";
	}
	
	@RequestMapping("/findByKuCun")
	public String findByKuCun(int year,int month,int invoicetype){
		boolean b=false;
		if(year==0){
			if(month==0){
				if(invoicetype==0){
					
				}else {
					
				}
			}else {
				if(invoicetype==0){
					
				}else {
					
				}
			}
		}else {
			if(month==0){
				if(invoicetype==0){
					
				}else {
					
				}
			}else {
				if(invoicetype==0){
					
				}else {
					
				}
			}
		}
		
		List<Invoiceinventory> invoiceinventories=this.invoiceinventoryService.findByKuCun(year, month, invoicetype);
		request.setAttribute("invoiceinventories", invoiceinventories);
		return "";
	}
}
