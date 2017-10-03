package com.hj.dao;

import java.util.List;

import com.hj.entity.RoleRelationship;

public interface RoleRelationshipDAO {

	public abstract void save(RoleRelationship transientInstance);

	public abstract void delete(RoleRelationship persistentInstance);

	public abstract RoleRelationship findById(java.lang.Integer id);

	public abstract List findByExample(RoleRelationship instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByAccess(Object access);

	public abstract List findAll();

	public abstract RoleRelationship merge(RoleRelationship detachedInstance);

	public abstract void attachDirty(RoleRelationship instance);

	public abstract void attachClean(RoleRelationship instance);

}