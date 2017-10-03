package com.hj.dao;

import java.util.List;

import com.hj.entity.CustomerLevel;
@SuppressWarnings("unchecked")
public interface CustomerLevelDAO {

	public abstract void save(CustomerLevel transientInstance);

	public abstract void delete(CustomerLevel persistentInstance);

	public abstract CustomerLevel findById(java.lang.Integer id);

	public abstract List findByExample(CustomerLevel instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBusiness(Object business);

	public abstract List findByLevelName(Object levelName);

	public abstract List findAll();

	public abstract CustomerLevel merge(CustomerLevel detachedInstance);

	public abstract void attachDirty(CustomerLevel instance);

	public abstract void attachClean(CustomerLevel instance);

}