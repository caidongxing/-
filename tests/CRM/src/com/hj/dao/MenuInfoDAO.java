package com.hj.dao;

import java.util.List;

import com.hj.entity.MenuInfo;

public interface MenuInfoDAO {

	public abstract void save(MenuInfo transientInstance);

	public abstract void delete(MenuInfo persistentInstance);

	public abstract MenuInfo findById(java.lang.Integer id);

	public abstract List findByExample(MenuInfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByMenuInfoName(Object menuInfoName);

	public abstract List findAll();

	public abstract MenuInfo merge(MenuInfo detachedInstance);

	public abstract void attachDirty(MenuInfo instance);

	public abstract void attachClean(MenuInfo instance);

}