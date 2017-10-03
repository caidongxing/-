package com.hj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.ComplainInfo;
import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.ComplainInfoService;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class ComplainInfoDetailAction extends ActionSupport{

	private static final long serialVersionUID = 1904856992246536282L;
	private Integer complainId;
	private ComplainInfoService complainInfoService;
	private DictionaryTypeService DictionaryTypeService;
	private DictionaryTypeInfoService dictionaryTypeInfoService;
	 
	
	public DictionaryTypeService getDictionaryTypeService() {
		return DictionaryTypeService;
	}

	public void setDictionaryTypeService(DictionaryTypeService dictionaryTypeService) {
		DictionaryTypeService = dictionaryTypeService;
	}

	public DictionaryTypeInfoService getDictionaryTypeInfoService() {
		return dictionaryTypeInfoService;
	}
	public void setDictionaryTypeInfoService(
			DictionaryTypeInfoService dictionaryTypeInfoService) {
		this.dictionaryTypeInfoService = dictionaryTypeInfoService;
	}
	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	public ComplainInfoService getComplainInfoService() {
		return complainInfoService;
	}

	public void setComplainInfoService(ComplainInfoService complainInfoService) {
		this.complainInfoService = complainInfoService;
	}

	@Override
	public String execute() throws Exception {

		ComplainInfo complainInfoIds=complainInfoService.findComplainId(complainId);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("complainInfo", complainInfoIds);
		
		//获取类型id;查找满意度
		DictionaryType dictionaryType5=DictionaryTypeService.findDictionaryTypeById(5);
		List<DictionaryTypeInfo> customerSatisfaction=dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType5);
		
		//获取类型id;查找状态
		DictionaryType dictionaryType6=DictionaryTypeService.findDictionaryTypeById(6);
		List<DictionaryTypeInfo> customerStatus=dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType6);
		
		request.setAttribute("customerSatisfaction", customerSatisfaction);//获取满意度
		request.setAttribute("customerStatus", customerStatus);            //获取状态
		
		
		return this.SUCCESS;
	}
	
	
	
	

}
