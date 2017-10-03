package com.gx.controller.receive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.receive.Receive;
import com.gx.service.receive.ReceiveService;

@Controller
@RequestMapping("/receiveController")
public class ReceiveController  extends BaseController{
	@Autowired
	private ReceiveService receiveService;
	
	@RequestMapping("/list")
	public String list(){
		List<Receive> receives=this.receiveService.findAll();
		request.setAttribute("receives", receives);
		return "/receive/receive_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/receive/receive_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/receive/receive_add";
	}
	
	@RequestMapping("/add")
	public String add(Receive receive){
		this.receiveService.saveReceive(receive);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Receive receive){
		receive=this.receiveService.findById(receive.getId());
		request.setAttribute("receives", receive);
		return "/receive/receive_update";
	}
	
	@RequestMapping("/update")
	public String update(Receive receive){
		this.receiveService.updateReceive(receive);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Receive receive){
		this.receiveService.deleteReceive(receive.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.receiveService.deleteReceive(Integer.parseInt(sid));
		}
		return list();
	}
}
