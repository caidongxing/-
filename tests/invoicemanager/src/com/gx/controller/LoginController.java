package com.gx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.user.User;
import com.gx.service.user.UserService;

@Controller
@RequestMapping("/loginController")
public class LoginController extends BaseController{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(String username,String password,String certificatepassword){
		//登陆
		boolean b=false;
		User user=this.userService.login(username, password, certificatepassword);
		if(user!=null){
			request.getSession().setAttribute("Users", user);
			
			b=true;
		}
		if(b){
			return "/main/main";
		}else {
			return "/main/main";
		}
	}
	
	@RequestMapping("/refresh")
	public String refresh(){
		//刷新
		
		return "/main/main";
	}
	
	@RequestMapping("/lock")
	public String lock(){
		//锁屏
		
		return "/main/lock";
	}
	
	@RequestMapping("/unlock")
	public String unlock(){
		//解锁
		
		return "/main/main";
	}
	
	@RequestMapping("/lnitialization")
	public String lnitialization(){
		//初始化
		
		return "/main/register";
	}
}
