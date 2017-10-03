package com.hj.service;

import java.util.List;

import com.hj.dao.DictionaryTypeDAO;
import com.hj.entity.DictionaryType;
@SuppressWarnings("unchecked")
public class DictionaryTypeServiceImpl implements DictionaryTypeService {

	private DictionaryTypeDAO dictionaryTypeDAO;
	//查询所以字典分类
	public List<DictionaryType> getAllDictionaryType() {
		return dictionaryTypeDAO.findAll();
	}
	public DictionaryTypeDAO getDictionaryTypeDAO() {
		return dictionaryTypeDAO;
	}
	public void setDictionaryTypeDAO(DictionaryTypeDAO dictionaryTypeDAO) {
		this.dictionaryTypeDAO = dictionaryTypeDAO;
	}
	////更新数据字典分类
	public void updateDictionaryType(DictionaryType dictionaryType) {
		dictionaryTypeDAO.attachDirty(dictionaryType);
	}
	//findByProperty是获取属性的值  查找DictionaryTypeId的id 获取唯一的 所以用get（0）
	public DictionaryType findDictionaryTypeById(int DictionaryTypeId) {
		return (DictionaryType) dictionaryTypeDAO.findByProperty("dataTypeId", DictionaryTypeId).get(0);
	}
}
