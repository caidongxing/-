package com.hj.service;

import java.util.List;

import com.hj.entity.DictionaryType;

public interface DictionaryTypeService {

	//查询所以字典分类
	public List<DictionaryType> getAllDictionaryType();
	//更新数据字典分类
	public void updateDictionaryType(DictionaryType dictionaryType);
	//根据数据字典分类Id来获得数据字典分类
	public DictionaryType findDictionaryTypeById(int DictionaryTypeId);
	
}
