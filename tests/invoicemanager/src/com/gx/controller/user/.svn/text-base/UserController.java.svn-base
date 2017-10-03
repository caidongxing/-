package com.gx.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.core.BaseController;
import com.gx.po.user.User;
import com.gx.service.user.UserService;

@Controller
@RequestMapping("/userController")
public class UserController extends BaseController{
	@Autowired
	private UserService userService;

	@RequestMapping("/list")
	public String findAll(){
		List<User> users=this.userService.findAll();
		request.setAttribute("users", users);
		return "/user/user_list";
	}
	
	@RequestMapping("/toadd")
	public String toadd(){
		
		return "/user/user_add";
	}
	
	@RequestMapping("/save")
	public String saveUser(User user){
		this.userService.saveUser(user);
		return findAll();
	}
	
	@RequestMapping("/toedit")
	public String toedit(User user){
		user=this.userService.findById(user.getId());
		request.setAttribute("users", user);
		return "/user/user_update";
	}
	
	@RequestMapping("/update")
	public String editUser(User user){
		this.userService.updateUser(user);
		return findAll();
	}
	
	@RequestMapping("/delete")
	public String delete(User user){
		this.userService.delete(user.getId());
		return findAll();
	}
	
}
