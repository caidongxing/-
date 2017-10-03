package com.hj.dao;

import java.util.List;

import com.hj.entity.DictionaryTypeInfo;
@SuppressWarnings("unchecked")
public interface DictionaryTypeInfoDAO {

	public abstract void save(DictionaryTypeInfo transientInstance);

	public abstract void delete(DictionaryTypeInfo persistentInstance);

	public abstract DictionaryTypeInfo findById(java.lang.Integer id);

	public abstract List findByExample(DictionaryTypeInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByDateInformationName(Object dateInformationName);

	public abstract List findAll();

	public abstract DictionaryTypeInfo merge(DictionaryTypeInfo detachedInstance);

	public abstract void attachDirty(DictionaryTypeInfo instance);

	public abstract void attachClean(DictionaryTypeInfo instance);

}