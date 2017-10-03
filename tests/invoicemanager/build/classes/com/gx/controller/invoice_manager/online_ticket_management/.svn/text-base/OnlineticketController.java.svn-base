package com.gx.controller.invoice_manager.online_ticket_management;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.core.BaseController;
import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.po.invoicereceive.Invoicereceive;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.service.invoicereceive.InvoicereceiveService;
import com.gx.service.invoicetype.InvoicetypeService;
import com.gx.vo.InvoicereceiveVo;

@Controller
@RequestMapping("/onlineticketController")
public class OnlineticketController extends BaseController{
	
	@Autowired
	private InvoicereceiveService invoicereceiveService;
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;
	@Autowired
	private InvoicetypeService invoicetypeService;

	@RequestMapping("/online_ticket")
	public String online_ticket(){
		return "/invoice_manager/online_ticket_management/online_ticket";
	}
	
	@RequestMapping("/findByDate")
	public String findByDate(Date startime,Date endtime){
		System.out.println("开始时间"+startime+"结束时间"+endtime);
		List<InvoicereceiveVo> invoicereceiveVos=this.invoiceinventoryService.findByDate(startime, endtime);
		request.setAttribute("invoicereceiveVos", invoicereceiveVos);
		return "/invoice_manager/online_ticket_management/online_ticket";
	}
	
	@RequestMapping("/autoDowload")
	public String autoDowload(int id){
		Invoicereceive invoicereceive=this.invoicereceiveService.findById(id);
		
		Invoiceinventory invoiceinventory=new Invoiceinventory();
		invoiceinventory.setInvoicetype(invoicereceive.getInvoicetype());
		invoiceinventory.setBillinglimit(invoicereceive.getBillinglimit());
		
		Invoicetype invoicetype=this.invoicetypeService.findById(invoicereceive.getInvoicetype());
		invoiceinventory.setClassname("北京市"+invoicetype.getClassname());
		invoiceinventory.setStartnumber(invoicereceive.getStartnumber());
		invoiceinventory.setInvoicenumber(invoicereceive.getInvoicenumber());
		invoiceinventory.setEndnumber(invoicereceive.getEndnumber());
		invoiceinventory.setLinggoudate(invoicereceive.getLinggoudate());
		
		this.invoiceinventoryService.saveInvoiceinventory(invoiceinventory);
		
		return online_ticket();
	}
	
	@RequestMapping("/findByContent")
	public String findByContent(){
		
		return "";
	}
	
	@RequestMapping("/dowload")
	public String dowload(){
		
		return online_ticket();
	}
}
