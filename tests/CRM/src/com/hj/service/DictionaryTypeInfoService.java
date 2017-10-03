package com.hj.service;

import java.util.List;

import com.hj.entity.DictionaryType;
import com.hj.entity.DictionaryTypeInfo;

public interface DictionaryTypeInfoService {

	//查询所以数据字典分类信息
	public List<DictionaryTypeInfo> getAllDictionaryTypeInfo(DictionaryType dictionaryType);
	
	//更新数据字典信息
	public void updataDictionaryTypeInfo(DictionaryTypeInfo dictionaryTypeInfo);
	
	//查找数据字典信息Id
	public DictionaryTypeInfo findDictionaryTypeInfoId(Integer dictionaryTypeInfoId);
	
}
