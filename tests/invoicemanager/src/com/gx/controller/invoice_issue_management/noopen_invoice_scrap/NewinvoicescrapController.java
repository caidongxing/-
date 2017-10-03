package com.gx.controller.invoice_issue_management.noopen_invoice_scrap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/newinvoicescrapController")
public class NewinvoicescrapController extends BaseController{

	@RequestMapping("/first")
	public String first(){
		return "/invoice_issue_management/noopen_invoice_scrap/first";
	}
	
	@RequestMapping("/confirm")
	public String confirm(){
		return "/invoice_issue_management/noopen_invoice_scrap/confirm";
	}
}
