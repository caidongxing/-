package com.hj.dwr;

import java.text.SimpleDateFormat;
import java.util.Map;

import com.hj.entity.ContactPersonInfo;
import com.hj.entity.CustomerInfo;
import com.hj.service.ContactPersonInfoService;

public class AddContactPersonInfoAjaxAction {
	
	private ContactPersonInfoService contactPersonInfoService; //注入Service  set get方法 
	
	public ContactPersonInfoService getContactPersonInfoService() {
		return contactPersonInfoService;
	}

	public void setContactPersonInfoService(
			ContactPersonInfoService contactPersonInfoService) {
		this.contactPersonInfoService = contactPersonInfoService;
	}
     /**
      * 添加保存联系人信息
      * **/
	@SuppressWarnings("unchecked")
	public String saveContactPersonInfo(Map info) throws Exception{
		
		ContactPersonInfo personInfo = new ContactPersonInfo();//联系个人信息
		CustomerInfo customerInfo = new CustomerInfo();        //客户信息
		customerInfo.setCustomerId(Integer.parseInt(info.get("customerId").toString()));
		personInfo.setCustomerInfo(customerInfo);
		
		personInfo.setContactName(info.get("contactName").toString());
		personInfo.setContactBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(info.get("contactBirthday").toString()));
		personInfo.setContactEmail(info.get("contactEmail").toString());
		personInfo.setContactMobilePhone(info.get("contactMobilePhone").toString());
		personInfo.setContactOfficePhone(info.get("contactOfficePhone").toString());
		personInfo.setContactPost(info.get("contactPost").toString());
	    personInfo.setContactQqnumber(info.get("contactQQNumber").toString());
		personInfo.setContactRegistDate(new SimpleDateFormat("yyyy-MM-dd").parse(info.get("contactRegistDate").toString()));
		personInfo.setContactRemarks(info.get("contactRemarks").toString());
		personInfo.setContactSex(info.get("contactSex").toString());
		contactPersonInfoService.saveContactPersonInfo(personInfo);
		String str ="添加联系人完成！";
		return str;
	}
	
	 /**
     * 修改联系人信息  用Action
     * **/
	@SuppressWarnings("unchecked")
	public String updateContactPersonInfos(Map info) throws Exception{
		
		ContactPersonInfo personInfo = new ContactPersonInfo();//联系个人信息
		CustomerInfo customerInfo = new CustomerInfo();        //客户信息
		customerInfo.setCustomerId(Integer.parseInt(info.get("customerId").toString())); //添加客户id
		personInfo.setCustomerInfo(customerInfo);
		
		personInfo.setContactId(Integer.parseInt(info.get("contactId").toString())); //添加联系人id
		
		personInfo.setContactName(info.get("contactName").toString());
		personInfo.setContactBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(info.get("contactBirthday").toString()));
		personInfo.setContactEmail(info.get("contactEmail").toString());
		personInfo.setContactMobilePhone(info.get("contactMobilePhone").toString());
		personInfo.setContactOfficePhone(info.get("contactOfficePhone").toString());
		personInfo.setContactPost(info.get("contactPost").toString());
	    personInfo.setContactQqnumber(info.get("contactQQNumber").toString());
		personInfo.setContactRegistDate(new SimpleDateFormat("yyyy-MM-dd").parse(info.get("contactRegistDate").toString()));
		personInfo.setContactRemarks(info.get("contactRemarks").toString());
		personInfo.setContactSex(info.get("contactSex").toString());
		contactPersonInfoService.updateContactPersonInfo(personInfo);
		String str ="更新联系人完成！";
		return str;
	}
	 /**
     * 查看所有联系人信息
     * **/
	public String findContactPersonInfo(Integer contactId){
		ContactPersonInfo contactPersonInfo=contactPersonInfoService.findByContactId(contactId);
		String  customerName=contactPersonInfo.getCustomerInfo().getCustomerName();
		String  contactName=contactPersonInfo.getContactName();
		String  contactSex=contactPersonInfo.getContactSex();
		String  contactBirthday=new SimpleDateFormat("yyyy-MM-dd").format(contactPersonInfo.getContactBirthday()) ;
		String  contactPost=contactPersonInfo.getContactPost();
		String  contactOfficePhone=contactPersonInfo.getContactOfficePhone();
		String  contactMobilePhone=contactPersonInfo.getContactMobilePhone();
		String  contactEmail=contactPersonInfo.getContactEmail();
		String  contactRegistDate=new SimpleDateFormat("yyyy-MM-dd").format(contactPersonInfo.getContactRegistDate());
		String  contactQQNumber=contactPersonInfo.getContactQqnumber();
		String  contactRemarks=contactPersonInfo.getContactRemarks();
		String str="<table width='100%' height='48' border='1' cellpadding='0' cellspacing='0'  bordercolor='#FFFFFF' bordercolordark='#aaaaaa'  bordercolorlight='#FFFFFF'>"
			  +"<tr style='padding:5px;'>"
			  +"<td bgcolor='#eeeeee'>姓名：</td><td>"+contactName+"</td>"
			  +"<td bgcolor='#eeeeee'>职务：</td><td> "+contactPost +" </td>"
			  +"</tr>"
			  +"<tr style='padding:5px;'>"
			  +"<td bgcolor='#eeeeee'>客户姓名：</td> <td>  "+customerName +" </td>"
			  +"<td bgcolor='#eeeeee'>Q Q：</td><td>"+contactQQNumber +"</td>"
			  +"</tr>"
			  +"<tr style='padding:5px;'> "
			  +"<td bgcolor='#eeeeee'>生日：</td><td>"+contactBirthday +"</td>"
			  +"<td bgcolor='#eeeeee'>性别：</td><td>"+contactSex +"</td>"
			  +"</tr>"
			  +"<tr style='padding:5px;'>" 
			  +"<td bgcolor='#eeeeee'>个人手机：</td> <td>"+contactMobilePhone +"</td>"
			  +"<td bgcolor='#eeeeee'>办公电话：</td> <td>"+contactOfficePhone +"</td>"
			  +"</tr>"
			  +"<tr style='padding:5px;'>"
			  +"<td bgcolor='#eeeeee'>电子邮箱：</td> <td>"+contactEmail +"</td> "
			  +"<td bgcolor='#eeeeee'>登记日期：</td> <td>"+contactRegistDate +"</td>"
			  +"</tr>"
			  +"<tr style='padding:5px;'> "
			  +"<td bgcolor='#eeeeee'>备注：</td><td colspan='3'><textarea name='contactRemarks' cols='50' rows='3'> "+contactRemarks +"</textarea></td> "
			  +"</tr>"
			  +"</table>";
		
		return str;
	}
	
	/**
     * 修改联系人信息 用DWR
     * **/
	public String updateContactPersonInfo(Integer contactId){
			ContactPersonInfo contactPersonInfo=contactPersonInfoService.findByContactId(contactId);
			Integer customerId=contactPersonInfo.getCustomerInfo().getCustomerId(); //获取客户的id
			String  customerName=contactPersonInfo.getCustomerInfo().getCustomerName();//获取客户的名称
			String  contactName=contactPersonInfo.getContactName();                    //获取联系人名称
			String  contactSex=contactPersonInfo.getContactSex();
			String  contactBirthday=new SimpleDateFormat("yyyy-MM-dd").format(contactPersonInfo.getContactBirthday()) ;
			String  contactPost=contactPersonInfo.getContactPost();
			String  contactOfficePhone=contactPersonInfo.getContactOfficePhone();
			String  contactMobilePhone=contactPersonInfo.getContactMobilePhone();
			String  contactEmail=contactPersonInfo.getContactEmail();
			String  contactRegistDate=new SimpleDateFormat("yyyy-MM-dd").format(contactPersonInfo.getContactRegistDate());
			String  contactQQNumber=contactPersonInfo.getContactQqnumber();
			String  contactRemarks=contactPersonInfo.getContactRemarks();
		  String str="<form name=\'divContactPersonInfoUpdateForm" +contactId+ "\'  method=\'post\'>"
			  +"<input type=\'hidden\' name=\'contactId\' value=\'"+contactId+"\'>"
			  +"<input type=\'hidden\' name=\'customerId\' value=\'"+customerId+"\' id=\'updatecustomerId" +contactId+ "\'>"
			  +"<table width=\'100%\' height=\'48\' border=\'1\' cellpadding=\'0\' cellspacing=\'0\'  bordercolor=\'#FFFFFF\' bordercolordark=\'#aaaaaa\'  bordercolorlight=\'#FFFFFF\'>"
			  +"<tr style=\'padding:5px;\'>"
			  +"<td bgcolor=\'#eeeeee\'>姓名：</td><td><input type=\'text\' name=\'contactName\' value=\'"+contactName+"\' ></td>"
			  +"<td bgcolor=\'#eeeeee\'>职务：</td><td><input type=\'text\' name=\'contactPost\' value=\'"+contactPost+"\' ></td>"
			  +"</tr>"
			  +"<tr style=\'padding:5px;\'>"
			  +"<td bgcolor=\'#eeeeee\'>客户姓名：</td> <td><input type=\'text\' name=\'customerName\' value=\'"+customerName+"\' id=\'updatecustomerName" +contactId+ "\' readOnly=\'readonly\'><img  src=\'image/serch.gif\' style=\'height:20;cursor:hand\' border=\'0\' onclick=\'OpenCustomer("+contactId+")\'/></td>"
			  +"<td bgcolor=\'#eeeeee\'>Q Q：</td><td><input type=\'text\' name=\'contactQQNumber\' value=\'"+contactQQNumber+"\' ></td>"
			  +"</tr>"
			  +"<tr style=\'padding:5px;\'> "
			  +"<td bgcolor=\'#eeeeee\'>生日：</td><td><input type=\'text\' name=\'contactBirthday\' value=\'"+contactBirthday+"\' id=\'contactBirthday\' readOnly=\'readonly\' onfocus=\'HS_setDate(this)\'></td>";
		  if(contactSex.equals("男")){
			  str+="<td bgcolor=\'#eeeeee\'>性别：</td><td>男<input type=\'radio\' name=\'contactSex\' value=\'男\'  checked=\'checked\'> 女<input type=\'radio\' name=\'contactSex\' value=\'女\'></td>";
		  }else{
			  str+="<td bgcolor=\'#eeeeee\'>性别：</td><td>男<input type=\'radio\' name=\'contactSex\' value=\'男\' > 女<input type=\'radio\' name=\'contactSex\' value=\'女\' checked=\'checked\'></td>";
		  }
		  str+="</tr>"
			  +"<tr style=\'padding:5px;\'>" 
			  +"<td bgcolor=\'#eeeeee\'>个人手机：</td> <td><input type=\'text\' name=\'contactMobilePhone\' value=\'"+contactMobilePhone+"\' ></td>"
			  +"<td bgcolor=\'#eeeeee\'>办公电话：</td> <td><input type=\'text\' name=\'contactOfficePhone\' value=\'"+contactOfficePhone+"\' ></td>"
			  +"</tr>"
			  +"<tr style=\'padding:5px;\'>"
			  +"<td bgcolor=\'#eeeeee\'>电子邮箱：</td> <td><input type=\'text\' name=\'contactEmail\' value=\'"+ contactEmail+"\' ></td> "
			  +"<td bgcolor=\'#eeeeee\'>登记日期：</td> <td><input type=\'text\' name=\'contactRegistDate\' value=\'"+ contactRegistDate+"\' id=\'contactRegistDate\' readOnly=\'readonly\' onfocus=\'HS_setDate(this)\'></td>"
			  +"</tr>"
			  +"<tr style=\'padding:5px;\'> "
			  +"<td bgcolor=\'#eeeeee\'>备注：</td><td colspan=\'3\'><textarea name=\'contactRemarks\' cols=\'50\' rows=\'3\'>"+contactRemarks+"</textarea></td> "
			  +"</tr>"
			  +"<tr align=\'center\'>"
			  +"<td colspan=\'4\'>  <input type=\'button\' value=\'提交\' onclick=\'updateContactPersonInfo("+contactId+")\'><input type=\'reset\' value=\'重置\'></td>"
			  +"</tr></table></form>";
		return str;
	}
	
	
	/**
     * 删除联系人信息 用DWR
     * **/
	public String deleteContactPersonInfo(Integer contactId){
		contactPersonInfoService.deleteContactPersonInfo(contactId);
		String str="删除联系人成功！";
		return str;
	}
	/**
     * 批量删除联系人信息 用DWR
     * **/
	public String deleteContactPersonInfos(Integer[] contactIds){
		for(Integer contactId:contactIds){
			contactPersonInfoService.deleteContactPersonInfo(contactId);
		}
		String str="批量删除联系人成功！";
		return str;
	}

}
