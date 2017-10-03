package com.gx.controller.tax_return_manage.invoice_data_export;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/invoiceexportController")
public class InvoiceexportController extends BaseController{

	@RequestMapping("/first")
	public String first(){
		
		return "/tax_return_manage/invoice_data_export/first";
	}
	
	@RequestMapping("/export")
	public String export(){
		
		return "/tax_return_manage/invoice_data_export/list";
	}
}
