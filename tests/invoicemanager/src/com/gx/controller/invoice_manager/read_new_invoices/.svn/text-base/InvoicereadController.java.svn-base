package com.gx.controller.invoice_manager.read_new_invoices;

import java.util.List;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.po.invoicereceive.Invoicereceive;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.service.invoicereceive.InvoicereceiveService;
import com.gx.service.invoicetype.InvoicetypeService;
import com.gx.vo.InvoiceinventoryVo;

@Controller
@RequestMapping("/invoicereadController")
public class InvoicereadController extends BaseController{
	@Autowired
	private InvoicereceiveService invoicereceiveService;
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;
	@Autowired
	private InvoicetypeService invoicetypeService;

	@RequestMapping("/choice_medium")
	public String choice_medium(){
		return "/invoice_manager/read_new_invoices/read_new_invoices_first";
	}
	
	@RequestMapping("/read_confirm")
	public String read_confirm(int medinu){
		List<Invoicereceive> invoicereceives=this.invoicereceiveService.findBymedium(medinu);
		System.out.println("========================123=======================");
		for (int i = 0; i < invoicereceives.size(); i++) {
			Invoiceinventory invoiceinventory=new Invoiceinventory();
			invoiceinventory.setInvoicetype(invoicereceives.get(i).getInvoicetype());
			invoiceinventory.setBillinglimit(invoicereceives.get(i).getBillinglimit());
			
			Invoicetype invoicetype=this.invoicetypeService.findById(invoicereceives.get(i).getInvoicetype());
			invoiceinventory.setClassname("北京市"+invoicetype.getClassname());
			invoiceinventory.setStartnumber(invoicereceives.get(i).getStartnumber());
			invoiceinventory.setInvoicenumber(invoicereceives.get(i).getInvoicenumber());
			invoiceinventory.setEndnumber(invoicereceives.get(i).getEndnumber());
			invoiceinventory.setLinggoudate(invoicereceives.get(i).getLinggoudate());
			
			this.invoiceinventoryService.saveInvoiceinventory(invoiceinventory);
		}
		
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findAll();
		request.setAttribute("invoiceinventories", invoiceinventoryVos);
		
		return "/invoice_manager/read_new_invoices/read_new_invoices_success";
	}
	
}
