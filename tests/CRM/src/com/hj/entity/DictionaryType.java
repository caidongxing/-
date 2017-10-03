package com.hj.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * DictionaryType entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings({ "unchecked", "serial" })
public class DictionaryType  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 6801787679194473513L;
	private Integer dataTypeId;
     private String dataTypeName;
     private String dataEnable;//启用
     private Set dictionaryTypeInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public DictionaryType() {
    }

    
    /** full constructor */
    public DictionaryType(String dataTypeName, Set dictionaryTypeInfos) {
        this.dataTypeName = dataTypeName;
        this.dictionaryTypeInfos = dictionaryTypeInfos;
    }

   
    // Property accessors

    public Integer getDataTypeId() {
        return this.dataTypeId;
    }
    
    public void setDataTypeId(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public String getDataTypeName() {
        return this.dataTypeName;
    }
    
    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

	public String getDataEnable() {
		return dataEnable;
	}
	public void setDataEnable(String dataEnable) {
		this.dataEnable = dataEnable;
	}

	public Set getDictionaryTypeInfos() {
        return this.dictionaryTypeInfos;
    }
   
	public void setDictionaryTypeInfos(Set dictionaryTypeInfos) {
        this.dictionaryTypeInfos = dictionaryTypeInfos;
    }
   








}