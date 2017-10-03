package com.hj.util;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;



public class BaseAction implements RequestAware, SessionAware,ApplicationAware,ServletRequestAware,ServletContextAware{

	
	public Map<String,Object> request;
	public Map<String,Object> session;
	public Map<String,Object> application;
	public HttpServletRequest httpRequest;
	public HttpSession httpSession;
	public ServletContext  httpApplication;
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	public void setApplication(Map<String, Object> applicaction) {
		this.application=applicaction;
	}
	public void setServletRequest(HttpServletRequest httpRequest) {
		this.httpRequest=httpRequest;
		httpSession=httpRequest.getSession();
	}
	public void setServletContext(ServletContext httpApplication) {
		this.httpApplication=httpApplication;
	}


	
}
