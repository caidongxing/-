package com.hy.controller;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONSerializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Accountbook;
import com.hy.po.Accountbookanditems;
import com.hy.po.Accountitems;
import com.hy.service.AccountbookService;
import com.hy.service.AccountbookanditemsService;
import com.hy.service.AccountitemsService;

@Controller
@RequestMapping("accountBookController")
public class AccountBookController extends BaseController {

	@Autowired
	private AccountbookService accountbookService;
	@Autowired
	private AccountitemsService accountitemsService;
	@Autowired
	private AccountbookanditemsService accountbookanditemsService;
	
	@RequestMapping("list")
	public String list(String accountbookname, Page<Accountbook> page ){
		
		page = accountbookService.queryPage(accountbookname, page);
		model.addAttribute("page", page);
		model.addAttribute("accountbookname", accountbookname);
		
		return "/accountbook/list";
	}
	
	@RequestMapping("addView")
	public String addView(){
		List<Accountitems> accountitems = accountitemsService.findAll();
		model.addAttribute("accountitems", accountitems);
		
		return "/accountbook/add";
	}
	
	@RequestMapping("save")
	public String save(Accountbook accountbook,int[] accountitems){
		try {
			
			int id = accountbookService.insertSelective(accountbook);
			Accountbookanditems vo = new Accountbookanditems();
			int count = 0;
			for (int i : accountitems) {
				vo.setAccountbookid(accountbook.getAccountbookid());
				vo.setAccountitemsid(i);
				count = accountbookanditemsService.insert(vo);
			}
			if(count>0 && id > 0){
				
				return "redirect:/accountBookController/list.do";
			}else {
				return "/error/500";
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
	}
	
	@RequestMapping("updateView")
	public String updateView(int id){
		Accountbook accountbook = accountbookService.selectByPrimaryKey(id);
		List<Accountitems> accountitems = accountitemsService.findAll();
		
		model.addAttribute("accountitems", accountitems);
		model.addAttribute("accountbook", accountbook);
		return "/accountbook/update";
	}
	
	@RequestMapping("findByKey")
	public void findByKey(int id){
		List<Accountbookanditems> vo = accountbookanditemsService.findByKey(id);
		String result = JSONSerializer.toJSON(vo).toString();
		try {
			response.getWriter().write(result);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	@RequestMapping("update")
	public String update(Accountbook accountbook,int[] accountitems){
		try {
			
			int count = accountbookanditemsService.deleteByKey(accountbook.getAccountbookid());
			
			boolean status = false;
			if(count > 0){
				int count2 = accountbookService.updateByPrimaryKeySelective(accountbook);
				
				Accountbookanditems vo = new Accountbookanditems();
				int count1 = 0;
				for (int i : accountitems) {
					vo.setAccountbookid(accountbook.getAccountbookid());
					vo.setAccountitemsid(i);
					count1 = accountbookanditemsService.insert(vo);
				}
				if(count2 > 0){
					status = true;
				}
				if(count1 > 0){
					status = true;
				}
				
			}
			if(status == true){
				return "redirect:/accountBookController/list.do";
			}else {
				return "/error/500";
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
	}
	
	@RequestMapping("view")
	public String view(int id){
		Accountbook accountbook = accountbookService.selectByPrimaryKey(id);
		List<Accountbookanditems> vo = accountbookanditemsService.findByKey(id);
		
		model.addAttribute("accountbook", accountbook);
		model.addAttribute("vo", vo);
		return "/accountbook/view";
	}
	
	@RequestMapping("delete")
	public String delete(int id){
		try {
			
			accountbookanditemsService.deleteByKey(id);
			accountbookService.deleteByPrimaryKey(id);
			return "redirect:/accountBookController/list.do";
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
		
	}
}
