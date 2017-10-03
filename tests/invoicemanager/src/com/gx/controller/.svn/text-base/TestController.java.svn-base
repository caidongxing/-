package com.gx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.customer.Customer;
import com.gx.service.customer.CustomerService;

@Controller
@RequestMapping("/testController")
public class TestController extends BaseController{
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/test")
	public String test(){
		return "/invoice_manager/recovery_new_invoice";
		//return "/goodsandservicestax/goodsandservicestax_list";
		//return "/administrativedivision/administrativedivision_list";
	}
	
	
	@RequestMapping("/list")
	public String list(){
		List<Customer> customers=this.customerService.findAll();
		request.setAttribute("customers", customers);
		return "/main/Test";
	}
}
