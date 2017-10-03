package com.hj.entity;



/**
 * DictionaryTypeInfo entity. @author MyEclipse Persistence Tools
 */

public class DictionaryTypeInfo  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private Integer dataId;
     private DictionaryType dictionaryType;
     private String dataInformationName;
     private String dataEnable;


    // Constructors

    /** default constructor */
    public DictionaryTypeInfo() {
    }

    
    /** full constructor */
    public DictionaryTypeInfo(DictionaryType dictionaryType, String dataInformationName) {
        this.dictionaryType = dictionaryType;
        this.dataInformationName = dataInformationName;
    }

   
    // Property accessors

    public Integer getDataId() {
        return this.dataId;
    }
    
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public DictionaryType getDictionaryType() {
        return this.dictionaryType;
    }
    
    public void setDictionaryType(DictionaryType dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    public String getDataInformationName() {
        return this.dataInformationName;
    }
    
    public void setDataInformationName(String dataInformationName) {
        this.dataInformationName = dataInformationName;
    }
	public String getDataEnable() {
		return dataEnable;
	}
	public void setDataEnable(String dataEnable) {
		this.dataEnable = dataEnable;
	}
   








}