package com.gx.controller.invoice_issue_management.invoice_fill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.commodity.Commodity;
import com.gx.po.customer.Customer;
import com.gx.po.user.User;
import com.gx.service.commodity.CommodityService;
import com.gx.service.customer.CustomerService;
import com.gx.service.invoiceinventory.InvoiceinventoryService;
import com.gx.vo.InvoiceinventoryVo;


@Controller
@RequestMapping("/invoicefillController")
public class invoicefillController extends BaseController{
	@Autowired
	private CustomerService customerService;
	@Autowired
	private InvoiceinventoryService invoiceinventoryService;
	@Autowired
	private CommodityService commodityService;
	
	public static void main(String[] args) {
		
	}
	@RequestMapping("/confirm")
	public String confirm(){
		InvoiceinventoryVo invoiceinventoryVo=this.invoiceinventoryService.findByType(1);
		request.getSession().setAttribute("invoiceinventoryVo", invoiceinventoryVo);
		return "/invoice_issue_management/invoice_fill/confirm";
	}
	
	@RequestMapping("/fill_window")
	public String fill_window(){
		User user=(User) request.getSession().getAttribute("Users");
		System.out.println("用户名：===="+user);
		request.setAttribute("users", user);
		return "/invoice_issue_management/invoice_fill/fill_window";
	}
	
	@RequestMapping("/fill_customer")
	public String fill_customer(){
		List<Customer> customers=this.customerService.findAll();
		request.setAttribute("customers", customers);
		return "/invoice_issue_management/invoice_fill/fill_customer";
	}
	
	@RequestMapping("/fill_customer_finish")
	public String fill_customer_finish(int id){
		Customer customers=this.customerService.findById(id);
		request.setAttribute("customers", customers);
		return "/invoice_issue_management/invoice_fill/fill_window";
	}
	
	@RequestMapping("/fill_copy")
	public String fill_copy(){
		
		return "/invoice_issue_management/invoice_fill/fill_copy";
	}
	
	@RequestMapping("/fill_list")
	public String fill_list(){
		List<Commodity> commodities=this.commodityService.findAll();
		request.setAttribute("commodities", commodities);
		return "/invoice_issue_management/invoice_fill/fill_list";
	}
	
	@RequestMapping("/fill_commodity")
	public String fill_commodity(){
		List<Commodity> commodities=this.commodityService.findAll();
		request.setAttribute("commodities", commodities);
		return "/invoice_issue_management/invoice_fill/fill_commodity";
	}
	
	@RequestMapping("/fill_commodity_finish")
	public String fill_commodity_finish(int id){
		Commodity commodities=this.commodityService.findById(id);
		System.out.println("商品ID==============="+commodities.getId());
		request.setAttribute("commodities", commodities);
		return "/invoice_issue_management/invoice_fill/fill_list";
	}
}
