package com.gx.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.customer.Customer;
import com.gx.service.customer.CustomerService;

@Controller
@RequestMapping("/customerController")
public class CustomerController  extends BaseController{
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String list(){
		List<Customer> customers=this.customerService.findAll();
		request.setAttribute("customers", customers);
		return "/customer/customer_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/customer/customer_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/customer/customer_add";
	}
	
	@RequestMapping("/add")
	public String add(Customer customer){
		this.customerService.saveCustomer(customer);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Customer customer){
		customer=this.customerService.findById(customer.getId());
		request.setAttribute("customers", customer);
		return "/customer/customer_update";
	}
	
	@RequestMapping("/update")
	public String update(Customer customer){
		this.customerService.updateCustomer(customer);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Customer customer){
		this.customerService.deleteCustomer(customer.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.customerService.deleteCustomer(Integer.parseInt(sid));
		}
		return list();
	}
}
