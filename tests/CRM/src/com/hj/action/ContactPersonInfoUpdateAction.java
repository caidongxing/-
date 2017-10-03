package com.hj.action;

import java.util.Date;

import com.hj.entity.ContactPersonInfo;
import com.hj.entity.CustomerInfo;
import com.hj.service.ContactPersonInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class ContactPersonInfoUpdateAction extends ActionSupport{

	private static final long serialVersionUID = -8162202730898435261L;
	private Integer contactId;
	private Integer customerId;
	private String contactName;
	private String contactPost;
	private String customerName;
	private String contactQQNumber;
	private Date contactBirthday;
	private String contactSex;
	private String contactMobilePhone;
	private String contactOfficePhone;
	private String contactEmail;
	private Date contactRegistDate;
	private String contactRemarks;
	
	private ContactPersonInfoService contactPersonInfoService;
	


	@Override
	public String execute() throws Exception {

		ContactPersonInfo contactPersonInfo=new ContactPersonInfo();
		CustomerInfo customerInfo =new CustomerInfo();
		customerInfo.setCustomerId(customerId);
		contactPersonInfo.setCustomerInfo(customerInfo);
		
		contactPersonInfo.setContactId(contactId);
		contactPersonInfo.setContactBirthday(contactBirthday);
		contactPersonInfo.setContactEmail(contactEmail);
		contactPersonInfo.setContactMobilePhone(contactMobilePhone);
		contactPersonInfo.setContactName(contactName);
		contactPersonInfo.setContactOfficePhone(contactOfficePhone);
		contactPersonInfo.setContactQqnumber(contactQQNumber);
		contactPersonInfo.setContactRegistDate(contactRegistDate);
		contactPersonInfo.setContactRemarks(contactRemarks);
		contactPersonInfo.setContactSex(contactSex);
		contactPersonInfo.setContactPost(contactPost);
		contactPersonInfoService.updateContactPersonInfo(contactPersonInfo);
		
		return this.SUCCESS;
	}
	

	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPost() {
		return contactPost;
	}
	public void setContactPost(String contactPost) {
		this.contactPost = contactPost;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactQQNumber() {
		return contactQQNumber;
	}
	public void setContactQQNumber(String contactQQNumber) {
		this.contactQQNumber = contactQQNumber;
	}
	public Date getContactBirthday() {
		return contactBirthday;
	}
	public void setContactBirthday(Date contactBirthday) {
		this.contactBirthday = contactBirthday;
	}
	public String getContactSex() {
		return contactSex;
	}
	public void setContactSex(String contactSex) {
		this.contactSex = contactSex;
	}
	public String getContactMobilePhone() {
		return contactMobilePhone;
	}
	public void setContactMobilePhone(String contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}
	public String getContactOfficePhone() {
		return contactOfficePhone;
	}
	public void setContactOfficePhone(String contactOfficePhone) {
		this.contactOfficePhone = contactOfficePhone;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Date getContactRegistDate() {
		return contactRegistDate;
	}
	public void setContactRegistDate(Date contactRegistDate) {
		this.contactRegistDate = contactRegistDate;
	}
	public String getContactRemarks() {
		return contactRemarks;
	}
	public void setContactRemarks(String contactRemarks) {
		this.contactRemarks = contactRemarks;
	}
	
	public ContactPersonInfoService getContactPersonInfoService() {
		return contactPersonInfoService;
	}


	public void setContactPersonInfoService(
			ContactPersonInfoService contactPersonInfoService) {
		this.contactPersonInfoService = contactPersonInfoService;
	}
	
	
	
}
