package com.hj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.DictionaryTypeInfoService;
import com.hj.service.DictionaryTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class DictionaryTypeInfoAction extends ActionSupport{

	private static final long serialVersionUID = 4791251200027213766L;
	
	private Integer dataTypeId;
	private DictionaryTypeService dictionaryTypeService;//注入数据字典分类Service;
	private DictionaryTypeInfoService dictionaryTypeInfoService;//注入数据字典分类信息Service;
	
	
	
	
	
	public DictionaryTypeInfoService getDictionaryTypeInfoService() {
		return dictionaryTypeInfoService;
	}
	public void setDictionaryTypeInfoService(DictionaryTypeInfoService dictionaryTypeInfoService) {
		this.dictionaryTypeInfoService = dictionaryTypeInfoService;
	}
	public DictionaryTypeService getDictionaryTypeService() {
		return dictionaryTypeService;
	}
	public void setDictionaryTypeService(DictionaryTypeService dictionaryTypeService) {
		this.dictionaryTypeService = dictionaryTypeService;
	}
	public Integer getDataTypeId() {
		return dataTypeId;
	}

	public void setDataTypeId(Integer dataTypeId) {
		this.dataTypeId = dataTypeId;
	}
	//根据数据字典id获取数据字典分类名称
      //1.首先查找id
	  //2.在通过id查找数据字典分类名称
	@SuppressWarnings("static-access")
	@Override
	public String execute() throws Exception {
		DictionaryType dictionaryType=dictionaryTypeService.findDictionaryTypeById(dataTypeId);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("DataTypeName", dictionaryType.getDataTypeName());
		
		//根据数据字典分类 获取数据字典分类信息名称	
		List<DictionaryTypeInfo> allDictionaryTypeInfo=dictionaryTypeInfoService.getAllDictionaryTypeInfo(dictionaryType);
		request.setAttribute("allDictionaryTypeInfo", allDictionaryTypeInfo);
		
		
		return this.SUCCESS;
	}
	

}
