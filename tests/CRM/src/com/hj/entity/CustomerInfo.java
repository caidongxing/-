package com.hj.entity;



/**
 * CustomerInfo entity. @author MyEclipse Persistence Tools
 */

public class CustomerInfo  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1413849854931559109L;
	private Integer customerId;
     private CustomerLevel customerLevel;
     private DictionaryTypeInfo dictionaryTypeInfoByOpenBank;
     private DictionaryTypeInfo dictionaryTypeInfoByCustomerType;
     private DictionaryTypeInfo dictionaryTypeInfoByCustomerSource;
     private DictionaryTypeInfo dictionaryTypeInfoByCustomerProperties;
     private String customerName;
     private String customerCompanyWebsize;
     private String customerCompanyPhone;
     private String register;
     private String customerAddress;
     private String customerProvinces;
     private String customerCity;
     private String customerCode;
     private String bankAccount;
     private String noteInformation;


    // Constructors

    /** default constructor */
    public CustomerInfo() {
    }

    
    /** full constructor */
    public CustomerInfo(CustomerLevel customerLevel, DictionaryTypeInfo dictionaryTypeInfoByOpenBank, DictionaryTypeInfo dictionaryTypeInfoByCustomerType, DictionaryTypeInfo dictionaryTypeInfoByCustomerSource, DictionaryTypeInfo dictionaryTypeInfoByCustomerProperties, String customerName, String customerCompanyWebsize, String customerCompanyPhone, String register, String customerAddress, String customerProvinces, String customerCity, String customerCode, String bankAccount, String noteInformation) {
        this.customerLevel = customerLevel;
        this.dictionaryTypeInfoByOpenBank = dictionaryTypeInfoByOpenBank;
        this.dictionaryTypeInfoByCustomerType = dictionaryTypeInfoByCustomerType;
        this.dictionaryTypeInfoByCustomerSource = dictionaryTypeInfoByCustomerSource;
        this.dictionaryTypeInfoByCustomerProperties = dictionaryTypeInfoByCustomerProperties;
        this.customerName = customerName;
        this.customerCompanyWebsize = customerCompanyWebsize;
        this.customerCompanyPhone = customerCompanyPhone;
        this.register = register;
        this.customerAddress = customerAddress;
        this.customerProvinces = customerProvinces;
        this.customerCity = customerCity;
        this.customerCode = customerCode;
        this.bankAccount = bankAccount;
        this.noteInformation = noteInformation;
    }

   
    // Property accessors

    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public CustomerLevel getCustomerLevel() {
        return this.customerLevel;
    }
    
    public void setCustomerLevel(CustomerLevel customerLevel) {
        this.customerLevel = customerLevel;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByOpenBank() {
        return this.dictionaryTypeInfoByOpenBank;
    }
    
    public void setDictionaryTypeInfoByOpenBank(DictionaryTypeInfo dictionaryTypeInfoByOpenBank) {
        this.dictionaryTypeInfoByOpenBank = dictionaryTypeInfoByOpenBank;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByCustomerType() {
        return this.dictionaryTypeInfoByCustomerType;
    }
    
    public void setDictionaryTypeInfoByCustomerType(DictionaryTypeInfo dictionaryTypeInfoByCustomerType) {
        this.dictionaryTypeInfoByCustomerType = dictionaryTypeInfoByCustomerType;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByCustomerSource() {
        return this.dictionaryTypeInfoByCustomerSource;
    }
    
    public void setDictionaryTypeInfoByCustomerSource(DictionaryTypeInfo dictionaryTypeInfoByCustomerSource) {
        this.dictionaryTypeInfoByCustomerSource = dictionaryTypeInfoByCustomerSource;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByCustomerProperties() {
        return this.dictionaryTypeInfoByCustomerProperties;
    }
    
    public void setDictionaryTypeInfoByCustomerProperties(DictionaryTypeInfo dictionaryTypeInfoByCustomerProperties) {
        this.dictionaryTypeInfoByCustomerProperties = dictionaryTypeInfoByCustomerProperties;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCompanyWebsize() {
        return this.customerCompanyWebsize;
    }
    
    public void setCustomerCompanyWebsize(String customerCompanyWebsize) {
        this.customerCompanyWebsize = customerCompanyWebsize;
    }

    public String getCustomerCompanyPhone() {
        return this.customerCompanyPhone;
    }
    
    public void setCustomerCompanyPhone(String customerCompanyPhone) {
        this.customerCompanyPhone = customerCompanyPhone;
    }

    public String getRegister() {
        return this.register;
    }
    
    public void setRegister(String register) {
        this.register = register;
    }

    public String getCustomerAddress() {
        return this.customerAddress;
    }
    
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerProvinces() {
        return this.customerProvinces;
    }
    
    public void setCustomerProvinces(String customerProvinces) {
        this.customerProvinces = customerProvinces;
    }

    public String getCustomerCity() {
        return this.customerCity;
    }
    
    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerCode() {
        return this.customerCode;
    }
    
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }
    
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getNoteInformation() {
        return this.noteInformation;
    }
    
    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation;
    }
   








}