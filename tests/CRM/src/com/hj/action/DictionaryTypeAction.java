package com.hj.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.DictionaryType;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("unused")
public class DictionaryTypeAction extends ActionSupport{
	private static final long serialVersionUID = 861616337705872767L;
	private DictionaryTypeService dictionaryTypeService;
	
	public void setDictionaryTypeService(DictionaryTypeService dictionaryTypeService) {
		this.dictionaryTypeService = dictionaryTypeService;
	}
	public String execute() throws Exception {
		List<DictionaryType> allDictionaryType=dictionaryTypeService.getAllDictionaryType();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("allDictionaryType", allDictionaryType);
		return "success";
	}
	
}
