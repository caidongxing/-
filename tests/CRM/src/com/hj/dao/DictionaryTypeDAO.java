package com.hj.dao;

import java.util.List;

import com.hj.entity.DictionaryType;
@SuppressWarnings("unchecked")
public interface DictionaryTypeDAO {

	public abstract void save(DictionaryType transientInstance);

	public abstract void delete(DictionaryType persistentInstance);

	public abstract DictionaryType findById(java.lang.Integer id);

	
	public abstract List findByExample(DictionaryType instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByDataTypeName(Object dataTypeName);

	public abstract List findAll();

	public abstract DictionaryType merge(DictionaryType detachedInstance);

	public abstract void attachDirty(DictionaryType instance);

	public abstract void attachClean(DictionaryType instance);

}