package com.hj.service;

import java.util.List;

import com.hj.dao.DictionaryTypeInfoDAO;
import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;

public class DictionaryTypeInfoServiceImpl implements DictionaryTypeInfoService { 

	private DictionaryTypeInfoDAO dictionaryTypeInfoDAO;
	public DictionaryTypeInfoDAO getDictionaryTypeInfoDAO() {
		return dictionaryTypeInfoDAO;
	}
	public void setDictionaryTypeInfoDAO(DictionaryTypeInfoDAO dictionaryTypeInfoDAO) {
		this.dictionaryTypeInfoDAO = dictionaryTypeInfoDAO;
	}
	@SuppressWarnings("unchecked")
	public List<DictionaryTypeInfo> getAllDictionaryTypeInfo(DictionaryType dictionaryType) {
		return dictionaryTypeInfoDAO.findByProperty("dictionaryType", dictionaryType);
	}
	public void updataDictionaryTypeInfo(DictionaryTypeInfo dictionaryTypeInfo) {
		dictionaryTypeInfoDAO.attachDirty(dictionaryTypeInfo);
		
	}
	public DictionaryTypeInfo findDictionaryTypeInfoId(
			Integer dictionaryTypeInfoId) {
		return dictionaryTypeInfoDAO.findById(dictionaryTypeInfoId);
	}
}
