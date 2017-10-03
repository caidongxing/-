package com.gx.controller.invoice_manager.online_share_management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.service.invoicetype.InvoicetypeService;
import com.gx.vo.InvoiceinventoryVo;

@Controller
@RequestMapping("/onlineshareController")
public class OnlineshareController extends BaseController{
	@Autowired
	private InvoicetypeService invoicetypeService;
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;

	@RequestMapping("/online_list")
	public String online_list(){
		return "/invoice_manager/online_share_management/online_partticket";
	}
	
	@RequestMapping("/online_finish")
	public String online_finish(){
		return "/invoice_manager/online_share_management/online_partticket_finish";
	}
	
	@RequestMapping("/download_list")
	public String download_list(){
		return "/invoice_manager/online_share_management/download_host_invoice";
	}
	
	@RequestMapping("/download_check")
	public String download_check(){
		return "/invoice_manager/online_share_management/download_host_invoice_check";
	}
	
	@RequestMapping("/download_finish")
	public String download_finish(){
		return "/invoice_manager/online_share_management/download_host_invoice_finish";
	}
	
	@RequestMapping("/status")
	public String status(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		return "/invoice_manager/online_share_management/leading_status";
	}
	
	@RequestMapping("/status_list")
	public String status_list(){
		return "/invoice_manager/online_share_management/leading_status_list";
	}
	
	@RequestMapping("/list")
	public String list(){
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findAll();
		request.setAttribute("invoiceinventories", invoiceinventoryVos);
		return "/invoice_manager/online_share_management/download_host_invoice";
	}
}
