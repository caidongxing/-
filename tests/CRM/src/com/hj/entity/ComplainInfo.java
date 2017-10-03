package com.hj.entity;

import java.util.Date;

/**
 * ComplainInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class ComplainInfo implements java.io.Serializable {

	// Fields

	private Integer complainId;
	private UserInfo userInfo;
	private CustomerInfo customerInfo;
	private DictionaryTypeInfo dictionaryTypeInfoByCustomerSatisfaction;
	private DictionaryTypeInfo dictionaryTypeInfoByComplainStatus;
	private String complainPerson;
	private String complainTheme;
	private String complainContent;
	private Date complainDate;
	private String complainHandleWay;
	private String complainRemarkInfo;

	// Constructors

	/** default constructor */
	public ComplainInfo() {
	}

	/** full constructor */
	public ComplainInfo(UserInfo userInfo, CustomerInfo customerInfo,
			DictionaryTypeInfo dictionaryTypeInfoByCustomerSatisfaction,
			DictionaryTypeInfo dictionaryTypeInfoByComplainStatus,
			String complainPerson, String complainTheme,
			String complainContent, Date complainDate,
			String complainHandleWay, String complainRemarkInfo) {
		this.userInfo = userInfo;
		this.customerInfo = customerInfo;
		this.dictionaryTypeInfoByCustomerSatisfaction = dictionaryTypeInfoByCustomerSatisfaction;
		this.dictionaryTypeInfoByComplainStatus = dictionaryTypeInfoByComplainStatus;
		this.complainPerson = complainPerson;
		this.complainTheme = complainTheme;
		this.complainContent = complainContent;
		this.complainDate = complainDate;
		this.complainHandleWay = complainHandleWay;
		this.complainRemarkInfo = complainRemarkInfo;
	}

	// Property accessors

	public Integer getComplainId() {
		return this.complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public CustomerInfo getCustomerInfo() {
		return this.customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public DictionaryTypeInfo getDictionaryTypeInfoByCustomerSatisfaction() {
		return this.dictionaryTypeInfoByCustomerSatisfaction;
	}

	public void setDictionaryTypeInfoByCustomerSatisfaction(
			DictionaryTypeInfo dictionaryTypeInfoByCustomerSatisfaction) {
		this.dictionaryTypeInfoByCustomerSatisfaction = dictionaryTypeInfoByCustomerSatisfaction;
	}

	public DictionaryTypeInfo getDictionaryTypeInfoByComplainStatus() {
		return this.dictionaryTypeInfoByComplainStatus;
	}

	public void setDictionaryTypeInfoByComplainStatus(
			DictionaryTypeInfo dictionaryTypeInfoByComplainStatus) {
		this.dictionaryTypeInfoByComplainStatus = dictionaryTypeInfoByComplainStatus;
	}

	public String getComplainPerson() {
		return this.complainPerson;
	}

	public void setComplainPerson(String complainPerson) {
		this.complainPerson = complainPerson;
	}

	public String getComplainTheme() {
		return this.complainTheme;
	}

	public void setComplainTheme(String complainTheme) {
		this.complainTheme = complainTheme;
	}

	public String getComplainContent() {
		return this.complainContent;
	}

	public void setComplainContent(String complainContent) {
		this.complainContent = complainContent;
	}

	public Date getComplainDate() {
		return this.complainDate;
	}

	public void setComplainDate(Date complainDate) {
		this.complainDate = complainDate;
	}

	public String getComplainHandleWay() {
		return this.complainHandleWay;
	}

	public void setComplainHandleWay(String complainHandleWay) {
		this.complainHandleWay = complainHandleWay;
	}

	public String getComplainRemarkInfo() {
		return this.complainRemarkInfo;
	}

	public void setComplainRemarkInfo(String complainRemarkInfo) {
		this.complainRemarkInfo = complainRemarkInfo;
	}

}