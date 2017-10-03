package com.gx.controller.goodsandservicestax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.goodsandservicestax.Goodsandservicestax;
import com.gx.service.goodsandservicestax.GoodsandservicestaxService;

@Controller
@RequestMapping("/goodsandservicestaxController")
public class GoodsandservicestaxController  extends BaseController{
	@Autowired
	private GoodsandservicestaxService goodsandservicestaxService;
	
	@RequestMapping("/list")
	public String list(){
		List<Goodsandservicestax> goodsandservicestaxs=this.goodsandservicestaxService.findAll();
		request.setAttribute("goodsandservicestaxs", goodsandservicestaxs);
		return "/goodsandservicestax/goodsandservicestax_list";
	}
	
	@RequestMapping("/listByName")
	public String listByName(){
		
		return "/goodsandservicestax/goodsandservicestax_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/goodsandservicestax/goodsandservicestax_add";
	}
	
	@RequestMapping("/add")
	public String add(Goodsandservicestax goodsandservicestax){
		this.goodsandservicestaxService.saveGoodsandservicestax(goodsandservicestax);
		return list();
	}
	
	@RequestMapping("/toedit")
	public String toedit(Goodsandservicestax goodsandservicestax){
		goodsandservicestax=this.goodsandservicestaxService.findById(goodsandservicestax.getId());
		request.setAttribute("goodsandservicestaxs", goodsandservicestax);
		return "/goodsandservicestax/goodsandservicestax_update";
	}
	
	@RequestMapping("/update")
	public String update(Goodsandservicestax goodsandservicestax){
		this.goodsandservicestaxService.updateGoodsandservicestax(goodsandservicestax);
		return list();
	}
	
	@RequestMapping("/delete")
	public String delete(Goodsandservicestax goodsandservicestax){
		this.goodsandservicestaxService.deleteGoodsandservicestax(goodsandservicestax.getId());
		return list();
	}
	
	@RequestMapping("/delitem")
	public String delitem(String ids){
		String[] sts=ids.split(",");
		for (String sid:sts) {
			this.goodsandservicestaxService.deleteGoodsandservicestax(Integer.parseInt(sid));
		}
		return list();
	}
}
