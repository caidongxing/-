package com.gx.controller.scarlet_letter_invoice.special_invoice_fill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoicetype.InvoicetypeService;

@Controller
@RequestMapping("/specialfillController")
public class SpecialfillController extends BaseController{
	@Autowired
	private InvoicetypeService invoicetypeService;

	@RequestMapping("/first")
	public String first(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		return "/scarlet_letter_invoice/special_invoice_fill/first";
	}
	
	@RequestMapping("/fill")
	public String fill(){
		
		return "/scarlet_letter_invoice/special_invoice_fill/fill";
	}
}
