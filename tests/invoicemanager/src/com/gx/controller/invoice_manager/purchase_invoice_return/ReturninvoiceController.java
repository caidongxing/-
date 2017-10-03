package com.gx.controller.invoice_manager.purchase_invoice_return;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.core.BaseController;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.service.invoicetype.InvoicetypeService;
import com.gx.vo.InvoiceinventoryVo;

@Controller
@RequestMapping("/returninvoiceController")
public class ReturninvoiceController extends BaseController{
	@Autowired
	private InvoicetypeService invoicetypeService;
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;

	@RequestMapping("/list")
	public String list(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		return "/invoice_manager/purchase_invoice_return/invoice_return_list";
	}
	
	@RequestMapping("/confirm_list")
	public String confirm_list(int id){
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findByIdReturn(id);
		request.setAttribute("invoiceinventoryVos", invoiceinventoryVos);
		request.getSession().setAttribute("id", id);
		return "/invoice_manager/purchase_invoice_return/invoice_return_confirm";
	}
	
	@RequestMapping("/return_medium")
	public String return_medium(){
		return "/invoice_manager/purchase_invoice_return/invoice_return_medium";
	}
	//查询领购票
	@RequestMapping("/findByDateOrType")
	public String findByDateOrType(){
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findAll();
		request.setAttribute("invoiceinventories", invoiceinventoryVos);
		
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		return "/invoice_manager/purchase_invoice_return/invoice_return_list";
	}
	//退票
	@ResponseBody
	@RequestMapping("/returnInvoice")
	public Object  returnInvoice(HttpServletRequest request){
		int id=(Integer) request.getSession().getAttribute("id");
		this.invoiceinventoryService.deleteInvoiceinventory(id);
		return JSONSerializer.toJSON(id);
	}
}
