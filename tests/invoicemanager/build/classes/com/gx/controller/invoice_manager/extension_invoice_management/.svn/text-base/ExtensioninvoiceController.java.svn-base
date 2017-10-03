package com.gx.controller.invoice_manager.extension_invoice_management;

import java.util.Date;
import java.util.List;

import net.sf.json.JSONSerializer;

import org.apache.commons.lang.StringUtils;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.core.BaseController;
import com.gx.po.extensioku.Extensioku;
import com.gx.po.invoiceinventory.Invoiceinventory;
import com.gx.po.invoicetype.Invoicetype;
import com.gx.service.extensioku.ExtensiokuService;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.service.invoicetype.InvoicetypeService;
import com.gx.vo.ExtensiokuVo;
import com.gx.vo.InvoiceinventoryVo;

@Controller
@RequestMapping("/extensioninvoiceController")
public class ExtensioninvoiceController extends BaseController{
	@Autowired
	private InvoicetypeService invoicetypeService;
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;
	@Autowired
	private ExtensiokuService extensiokuService;
	//向分机分配发票
	@RequestMapping("/list")
	public String list(){
		List<Invoicetype> invoicetypes=this.invoicetypeService.findAll();
		request.setAttribute("invoicetypes", invoicetypes);
		
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findAll();
		request.setAttribute("invoiceinventories", invoiceinventoryVos);
		return "/invoice_manager/extension_invoice_management/extension_invoice_list";
	}
	
	@RequestMapping("/extension")
	public String extension(int id){
		Invoiceinventory invoiceinventory=this.invoiceinventoryService.findById(id);
		request.setAttribute("invoiceinventories", invoiceinventory);
		request.getSession().setAttribute("id", id);
		return "/invoice_manager/extension_invoice_management/extension_invoice_window";
	}
	
	@RequestMapping("/finish")
	public String finish(){
		return "/invoice_manager/extension_invoice_management/extension_invoice_finish";
	}
	
	//收回分机剩余发票
	@RequestMapping("/extension_first")
	public String extension_first(){
		return "/invoice_manager/extension_invoice_management/recovery_extension_invoice";
	}
	
	@RequestMapping("/extension_list")
	public String extension_list(int medium){
		List<ExtensiokuVo> extensiokuVos=this.extensiokuService.findBymedium(medium);
		request.setAttribute("extensiokuVos", extensiokuVos);
		
		for (int i = 0; i < extensiokuVos.size(); i++) {
			this.extensiokuService.delete(extensiokuVos.get(i).getId());
			Invoiceinventory invoiceinventory=new Invoiceinventory();
			
			invoiceinventory.setInvoicetype(extensiokuVos.get(i).getInvoicetype());
			invoiceinventory.setBillinglimit(extensiokuVos.get(i).getBillinglimit());
			
			Invoicetype invoicetype=this.invoicetypeService.findById(extensiokuVos.get(i).getInvoicetype());
			invoiceinventory.setClassname("北京市"+invoicetype.getClassname());
			invoiceinventory.setStartnumber(extensiokuVos.get(i).getStartnumber());
			invoiceinventory.setInvoicenumber(extensiokuVos.get(i).getInvoicenumber());
			invoiceinventory.setEndnumber(extensiokuVos.get(i).getEndnumber());
			invoiceinventory.setLinggoudate(new Date());
			
			this.invoiceinventoryService.saveInvoiceinventory(invoiceinventory);
		}
		return "/invoice_manager/extension_invoice_management/recovery_extension_invoice_list";
	}
	//收回新购发票
	@RequestMapping("/new_first")
	public String new_first(){
		return "/invoice_manager/extension_invoice_management/recovery_new_invoice";
	}
	
	@RequestMapping("/new_list")
	public String new_list(int medium,int type){
		List<ExtensiokuVo> extensiokuVos=this.extensiokuService.findBymediumAndType(medium, type);
		request.setAttribute("extensiokuVos", extensiokuVos);
		
		for (int i = 0; i < extensiokuVos.size(); i++) {
			this.extensiokuService.delete(extensiokuVos.get(i).getId());
			Invoiceinventory invoiceinventory=new Invoiceinventory();
			
			invoiceinventory.setInvoicetype(extensiokuVos.get(i).getInvoicetype());
			invoiceinventory.setBillinglimit(extensiokuVos.get(i).getBillinglimit());
			
			Invoicetype invoicetype=this.invoicetypeService.findById(extensiokuVos.get(i).getInvoicetype());
			invoiceinventory.setClassname("北京市"+invoicetype.getClassname());
			invoiceinventory.setStartnumber(extensiokuVos.get(i).getStartnumber());
			invoiceinventory.setInvoicenumber(extensiokuVos.get(i).getInvoicenumber());
			invoiceinventory.setEndnumber(extensiokuVos.get(i).getEndnumber());
			invoiceinventory.setLinggoudate(new Date());
			
			this.invoiceinventoryService.saveInvoiceinventory(invoiceinventory);
		}
		
		return "/invoice_manager/extension_invoice_management/recovery_new_invoice_list";
	}
	//向分机分配发票--查询主机领购发票
	@RequestMapping("/findByDateOrType")
	public String findByDateOrType(){
		List<InvoiceinventoryVo> invoiceinventoryVos=this.invoiceinventoryService.findAll();
		request.setAttribute("invoiceinventories", invoiceinventoryVos);
		return "/invoice_manager/extension_invoice_management/extension_invoice_list";
	}
	//向分机分配发票--分票
	@ResponseBody
	@RequestMapping("/share")
	public Object share(int id,int number){
		int ids=(Integer) request.getSession().getAttribute("id");
		Invoiceinventory invoiceinventory=this.invoiceinventoryService.findById(ids);
		
		Extensioku extensioku=new Extensioku();
		extensioku.setInvoicetype(invoiceinventory.getInvoicetype());
		extensioku.setBillinglimit(invoiceinventory.getBillinglimit());
		extensioku.setClassname(invoiceinventory.getClassname());
		extensioku.setStartnumber(invoiceinventory.getStartnumber());
		extensioku.setInvoicenumber(invoiceinventory.getInvoicenumber());
		int start=Integer.parseInt(invoiceinventory.getStartnumber());
		String end=StringUtils.leftPad(String.valueOf(Integer.valueOf(start)+number-1), 8, "0");
		System.out.println("终止号：======"+end);
		extensioku.setEndnumber(end);
		extensioku.setMedium(id);
		extensioku.setExtensionnumber(1);
		extensioku.setExtensiondate(new Date());
		extensioku.setExtensionstatus(19);
		extensioku.setIfreturn(false);
		extensioku.setIfrefund(false);
		this.extensiokuService.save(extensioku);
		
		if(invoiceinventory.getInvoicenumber()==number){
			this.invoiceinventoryService.deleteInvoiceinventory(ids);
		}else{
			
		}
		return JSONSerializer.toJSON(id);
	}
	
	
}
