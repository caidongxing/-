package com.hj.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * RoleInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class RoleInfo implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private Set roleRelationships = new HashSet(0);

	// Constructors

	/** default constructor */
	public RoleInfo() {
	}

	/** full constructor */
	public RoleInfo(String roleName, Set roleRelationships) {
		this.roleName = roleName;
		this.roleRelationships = roleRelationships;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set getRoleRelationships() {
		return this.roleRelationships;
	}

	public void setRoleRelationships(Set roleRelationships) {
		this.roleRelationships = roleRelationships;
	}

}