package com.hy.controller;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;


public abstract class BaseController{

	protected String id;
	protected String message;

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	protected ServletContext servletContext;
	protected Model model;
	
	@ModelAttribute
	public void setHttpServlet(HttpServletRequest request,HttpServletResponse response, Model model){
		this.request = request;
		this.response = response;
		this.session = request.getSession();
		this.servletContext = request.getServletContext();
		this.model = model;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
