package com.hy.controller;

import java.util.List;

import net.sf.json.JSONSerializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Accountbook;
import com.hy.po.Aignbilltemplate;
import com.hy.po.Templateandaccountbook;
import com.hy.service.AccountbookService;
import com.hy.service.AignbilltemplateService;
import com.hy.service.TemplateandaccountbookService;


@Controller
@RequestMapping("signbillTemplateController")
public class SignbillTemplateController extends BaseController {

	@Autowired
	private AccountbookService accountbookService;
	@Autowired
	private AignbilltemplateService aignbilltemplateService;
	@Autowired
	private TemplateandaccountbookService templateandaccountbookService;
	
	
	@RequestMapping("list")
	public String list(String templatename,Page<Aignbilltemplate> page){
		
		page = aignbilltemplateService.queryPage(templatename, page);
		model.addAttribute("page", page);
		model.addAttribute("templatename", templatename);
		
		return "/signbilltemplate/list";
	}
	
	@RequestMapping("addView")
	public String addView(){
		List<Accountbook> accountbook = accountbookService.findByStatus();
		model.addAttribute("accountbook", accountbook);
		return "/signbilltemplate/add";
	}
	
	
	@RequestMapping("selectById")
	public void selectById(int id) throws Exception{
		Accountbook accountbook = accountbookService.selectByPrimaryKey(id);
		String result = JSONSerializer.toJSON(accountbook).toString();
		response.getWriter().write(result);
	}
	
	@RequestMapping("save")
	public String save(Aignbilltemplate aignbilltemplate,int[] accountbookid){
		
		try {
			int count = aignbilltemplateService.insertSelective(aignbilltemplate);
			if(count > 0){
				Templateandaccountbook vo = new Templateandaccountbook();
				
				for (int i : accountbookid) {
					vo.setSignbilltemplateid(aignbilltemplate.getSignbilltemplateid());
					vo.setAccountbookid(i);
					templateandaccountbookService.insert(vo);
				}
				
			}else {
				throw new Exception("新增异常。");
			}
			
			return "redirect:/signbillTemplateController/list.do";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/accountbook/500";
		}
		
	}
	
	@RequestMapping("updateView")
	public String updateView(int id){
		Aignbilltemplate aignbilltemplate = aignbilltemplateService.selectByPrimaryKey(id);
		
		List<Accountbook> accountbook = accountbookService.findByStatus();
		model.addAttribute("accountbook", accountbook);
		model.addAttribute("aignbilltemplate", aignbilltemplate);
		
		return "/signbilltemplate/update";
	}
	
	@RequestMapping("findByPrimaryKey")
	public void findByPrimaryKey(int id) throws Exception{
		List<Templateandaccountbook> vo = templateandaccountbookService.findByPrimaryKey(id);
		String result = JSONSerializer.toJSON(vo).toString();
		response.getWriter().write(result);
	}
	
	
	@RequestMapping("update")
	public String update(Aignbilltemplate aignbilltemplate,int[] accountbookid){
		try {
			
			templateandaccountbookService.deleteByPrimaryKey(aignbilltemplate.getSignbilltemplateid());
			
			int count = aignbilltemplateService.updateByPrimaryKeySelective(aignbilltemplate);
			if(count > 0){
				Templateandaccountbook vo = new Templateandaccountbook();
				
				for (int i : accountbookid) {
					vo.setSignbilltemplateid(aignbilltemplate.getSignbilltemplateid());
					vo.setAccountbookid(i);
					templateandaccountbookService.insert(vo);
				}
				
			}else {
				throw new Exception("修改异常。");
			}
			
			return "redirect:/signbillTemplateController/list.do";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/accountbook/500";
		}
	}
	
	@RequestMapping("delete")
	public String delete(int id){
		try {
			
			int count = aignbilltemplateService.deleteByPrimaryKey(id);
			templateandaccountbookService.deleteByPrimaryKey(id);
			if(count>0){
				return "redirect:/signbillTemplateController/list.do";
			}else {
				throw new Exception("删除异常！");
			}
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/accountbook/500";
		}
		
	}
}
