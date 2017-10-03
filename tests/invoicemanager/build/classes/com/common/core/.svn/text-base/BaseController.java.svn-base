package com.common.core;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import sun.beans.editors.DoubleEditor;

/** 
 * @author 作者 : 刘东君
 * @date 创建时间：2016-10-19 上午10:50:20 
 * @version 1.0 
 */

public class BaseController {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String message;
	
	@InitBinder   
    public void initBinder(WebDataBinder binder) {   
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   
        dateFormat.setLenient(false);   
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true)); 
        binder.registerCustomEditor(double.class, new DoubleEditor());
    }
	
	@ModelAttribute
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
