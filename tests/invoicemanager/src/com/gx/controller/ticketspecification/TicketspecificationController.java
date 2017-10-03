package com.gx.controller.ticketspecification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.ticketspecification.Ticketspecification;
import com.gx.service.ticketspecification.TicketspecificationService;

@Controller
@RequestMapping("/ticketspecificationController")
public class TicketspecificationController extends BaseController{
	@Autowired
	private TicketspecificationService ticketspecificationService; 
	
	@RequestMapping("/list")
	public String list(){
		List<Ticketspecification> ticketspecifications=this.ticketspecificationService.findAll();
		request.setAttribute("ticketspecifications", ticketspecifications);
		return "/ticketspecification/ticketspecification_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/ticketspecification/ticketspecification_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/ticketspecification/ticketspecification_add";
	}
	
	@RequestMapping("/add")
	public String add(Ticketspecification ticketspecification){
		this.ticketspecificationService.saveTicketspecification(ticketspecification);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Ticketspecification ticketspecification){
		ticketspecification=this.ticketspecificationService.findById(ticketspecification.getId());
		request.setAttribute("ticketspecifications", ticketspecification);
		return "/ticketspecification/ticketspecification_update";
	}
	
	@RequestMapping("/update")
	public String update(Ticketspecification ticketspecification){
		this.ticketspecificationService.updateTicketspecification(ticketspecification);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Ticketspecification ticketspecification){
		this.ticketspecificationService.deleteTicketspecification(ticketspecification.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.ticketspecificationService.deleteTicketspecification(Integer.parseInt(sid));
		}
		return list();
	}
}
