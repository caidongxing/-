package com.gx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;

@Controller
@RequestMapping("/mainController")
public class MainController extends BaseController{
	
	@RequestMapping("/lock")
	public String lock(){
		
		return "/main/lock";
	}
	
	@RequestMapping("/register")
	public String register(){
		//注册
		return "/main/register";
	}
	
	@RequestMapping("/systemsettings")
	public String systemsettings(){
		//参数设置
		return "/systemsettings/systemsettings";
	}
	
	@RequestMapping("/reset")
	public String reset(){
		//初始化
		return "/systemsettings/reset";
	}
	
	
}
