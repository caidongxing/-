package com.hj.entity;

import java.util.Date;

/**
 * ContactPersonInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class ContactPersonInfo implements java.io.Serializable {

	private static final long serialVersionUID = 6926710224343294966L;
	// Fields

	
	private Integer contactId;
	private CustomerInfo customerInfo;
	private String contactName;
	private String contactSex;
	private Date contactBirthday;
	private String contactPost;
	private String contactOfficePhone;
	private String contactMobilePhone;
	private String contactEmail;
	private Date contactRegistDate;
	private String contactQqnumber;
	private String contactRemarks;

	// Constructors

	/** default constructor */
	public ContactPersonInfo() {
	}

	/** full constructor */
	public ContactPersonInfo(CustomerInfo customerInfo, String contactName,
			String contactSex, Date contactBirthday, String contactPost,
			String contactOfficePhone, String contactMobilePhone,
			String contactEmail, Date contactRegistDate,
			String contactQqnumber, String contactRemarks) {
		this.customerInfo = customerInfo;
		this.contactName = contactName;
		this.contactSex = contactSex;
		this.contactBirthday = contactBirthday;
		this.contactPost = contactPost;
		this.contactOfficePhone = contactOfficePhone;
		this.contactMobilePhone = contactMobilePhone;
		this.contactEmail = contactEmail;
		this.contactRegistDate = contactRegistDate;
		this.contactQqnumber = contactQqnumber;
		this.contactRemarks = contactRemarks;
	}

	// Property accessors

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public CustomerInfo getCustomerInfo() {
		return this.customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactSex() {
		return this.contactSex;
	}

	public void setContactSex(String contactSex) {
		this.contactSex = contactSex;
	}

	public Date getContactBirthday() {
		return this.contactBirthday;
	}

	public void setContactBirthday(Date contactBirthday) {
		this.contactBirthday = contactBirthday;
	}

	public String getContactPost() {
		return this.contactPost;
	}

	public void setContactPost(String contactPost) {
		this.contactPost = contactPost;
	}

	public String getContactOfficePhone() {
		return this.contactOfficePhone;
	}

	public void setContactOfficePhone(String contactOfficePhone) {
		this.contactOfficePhone = contactOfficePhone;
	}

	public String getContactMobilePhone() {
		return this.contactMobilePhone;
	}

	public void setContactMobilePhone(String contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Date getContactRegistDate() {
		return this.contactRegistDate;
	}

	public void setContactRegistDate(Date contactRegistDate) {
		this.contactRegistDate = contactRegistDate;
	}

	public String getContactQqnumber() {
		return this.contactQqnumber;
	}

	public void setContactQqnumber(String contactQqnumber) {
		this.contactQqnumber = contactQqnumber;
	}

	public String getContactRemarks() {
		return this.contactRemarks;
	}

	public void setContactRemarks(String contactRemarks) {
		this.contactRemarks = contactRemarks;
	}

}