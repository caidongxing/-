package com.hj.dwr;

import java.util.Map;



import com.hj.entity.CustomerInfo;
import com.hj.entity.CustomerLevel;
import com.hj.entity.DictionaryTypeInfo;
import com.hj.service.CustomerInfoService;

public class AddCustomerInfoAjaxAction {
	
	private CustomerInfoService customerInfoService; //注入Service  set get方法 
	
	public CustomerInfoService getCustomerInfoService() {
		return customerInfoService;
	}
	public void setCustomerInfoService(CustomerInfoService customerInfoService) {
		this.customerInfoService = customerInfoService;
	}
	@SuppressWarnings("unchecked")
	public String saveCustomerInfo(Map info){
		
		//System.out.println(info.get("customerName"));
		//System.out.println(info.get("customerPropertiesId"));
		
		CustomerInfo customerInfo=new CustomerInfo();
			customerInfo.setCustomerName(info.get("customerName").toString());
			customerInfo.setCustomerCompanyWebsize(info.get("customerCompanyWebsize").toString());
			customerInfo.setCustomerCompanyPhone(info.get("customerCompanyPhone").toString());
			customerInfo.setRegister(info.get("register").toString());
			customerInfo.setCustomerAddress(info.get("customerAddress").toString());
			customerInfo.setCustomerProvinces(info.get("customerProvinces").toString());
			customerInfo.setCustomerCity(info.get("customerCity").toString());
			customerInfo.setCustomerCode(info.get("customerCode").toString());
			customerInfo.setBankAccount(info.get("bankAccount").toString());
			customerInfo.setNoteInformation(info.get("noteInformation").toString());
			
		CustomerLevel customerLevel=new CustomerLevel();
		    customerLevel.setLevelId(Integer.parseInt(info.get("levelId").toString()));
		    customerInfo.setCustomerLevel(customerLevel);
		
		DictionaryTypeInfo dictionaryTypeInfo1 = new DictionaryTypeInfo(); 
			dictionaryTypeInfo1.setDataId(Integer.parseInt(info.get("customerPropertiesId").toString()));
			customerInfo.setDictionaryTypeInfoByCustomerProperties(dictionaryTypeInfo1);
		
		DictionaryTypeInfo dictionaryTypeInfo2 = new DictionaryTypeInfo(); 
		    dictionaryTypeInfo2.setDataId(Integer.parseInt(info.get("customerTypeId").toString()));
			customerInfo.setDictionaryTypeInfoByCustomerType(dictionaryTypeInfo2);
			
		DictionaryTypeInfo dictionaryTypeInfo3 = new DictionaryTypeInfo(); 
		    dictionaryTypeInfo3.setDataId(Integer.parseInt(info.get("openBankId").toString()));
			customerInfo.setDictionaryTypeInfoByOpenBank(dictionaryTypeInfo3);
			
		DictionaryTypeInfo dictionaryTypeInfo4 = new DictionaryTypeInfo(); 
		    dictionaryTypeInfo4.setDataId(Integer.parseInt(info.get("customerSourceId").toString()));
			customerInfo.setDictionaryTypeInfoByCustomerSource(dictionaryTypeInfo4);
			
			//判断该公司是否存在，存在就不添加并提示该公司已经存在。
			String str="";
			if(customerInfoService.findCustomerName(info.get("customerName").toString())==null){
				customerInfoService.saveCustomerInfo(customerInfo);
				str="完成添加！";
			}else{
				str="名称存在,不能进行添加！";
			}
		
		return str;
	}
	
	
	@SuppressWarnings("unchecked")
	public String updateCustomerInfo(Map info){
		
		//System.out.println(info.get("customerName"));
		//System.out.println(info.get("customerPropertiesId"));
		
		CustomerInfo customerInfo=new CustomerInfo();
		    customerInfo.setCustomerId(Integer.parseInt(info.get("customerId").toString()));
			customerInfo.setCustomerName(info.get("customerName").toString());
			customerInfo.setCustomerCompanyWebsize(info.get("customerCompanyWebsize").toString());
			customerInfo.setCustomerCompanyPhone(info.get("customerCompanyPhone").toString());
			customerInfo.setRegister(info.get("register").toString());
			customerInfo.setCustomerAddress(info.get("customerAddress").toString());
			customerInfo.setCustomerProvinces(info.get("customerProvinces").toString());
			customerInfo.setCustomerCity(info.get("customerCity").toString());
			customerInfo.setCustomerCode(info.get("customerCode").toString());
			customerInfo.setBankAccount(info.get("bankAccount").toString());
			customerInfo.setNoteInformation(info.get("noteInformation").toString());
			
		CustomerLevel customerLevel=new CustomerLevel();
		    customerLevel.setLevelId(Integer.parseInt(info.get("levelId").toString()));
		    customerInfo.setCustomerLevel(customerLevel);
		
		DictionaryTypeInfo dictionaryTypeInfo1 = new DictionaryTypeInfo(); 
			dictionaryTypeInfo1.setDataId(Integer.parseInt(info.get("customerPropertiesId").toString()));
			customerInfo.setDictionaryTypeInfoByCustomerProperties(dictionaryTypeInfo1);
		
		DictionaryTypeInfo dictionaryTypeInfo2 = new DictionaryTypeInfo(); 
		    dictionaryTypeInfo2.setDataId(Integer.parseInt(info.get("customerTypeId").toString()));
			customerInfo.setDictionaryTypeInfoByCustomerType(dictionaryTypeInfo2);
			
		DictionaryTypeInfo dictionaryTypeInfo3 = new DictionaryTypeInfo(); 
		    dictionaryTypeInfo3.setDataId(Integer.parseInt(info.get("openBankId").toString()));
			customerInfo.setDictionaryTypeInfoByOpenBank(dictionaryTypeInfo3);
			
		DictionaryTypeInfo dictionaryTypeInfo4 = new DictionaryTypeInfo(); 
		    dictionaryTypeInfo4.setDataId(Integer.parseInt(info.get("customerSourceId").toString()));
			customerInfo.setDictionaryTypeInfoByCustomerSource(dictionaryTypeInfo4);
			
			//判断该公司是否存在，存在就不添加并提示该公司已经存在。
				customerInfoService.updateCustomerInfo(customerInfo);
				String  str="完成更新！";
		return str;
	}
	
	@SuppressWarnings("unchecked")
	public String deleteCustomerInfo(Integer customerId){
		customerInfoService.deleteCustomerInfo(customerId);
		String str="删除完成！";
	return str;
	}
	
	@SuppressWarnings("unchecked")
	public String deleteCustomerInfos(Integer[] customerIds){
		for(Integer customerInfos : customerIds){
			customerInfoService.deleteCustomerInfo(customerInfos);
		}
		String str="批量删除完成！";
	return str;
	}
	
}
