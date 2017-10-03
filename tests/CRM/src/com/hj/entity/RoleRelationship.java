package com.hj.entity;

/**
 * RoleRelationship entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class RoleRelationship implements java.io.Serializable {

	// Fields

	private Integer roleRelationshipId;
	private MenuInfo menuInfo;
	private RoleInfo roleInfo;
	private Integer access;

	// Constructors

	/** default constructor */
	public RoleRelationship() {
	}

	/** full constructor */
	public RoleRelationship(MenuInfo menuInfo, RoleInfo roleInfo, Integer access) {
		this.menuInfo = menuInfo;
		this.roleInfo = roleInfo;
		this.access = access;
	}

	// Property accessors

	public Integer getRoleRelationshipId() {
		return this.roleRelationshipId;
	}

	public void setRoleRelationshipId(Integer roleRelationshipId) {
		this.roleRelationshipId = roleRelationshipId;
	}

	public MenuInfo getMenuInfo() {
		return this.menuInfo;
	}

	public void setMenuInfo(MenuInfo menuInfo) {
		this.menuInfo = menuInfo;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public Integer getAccess() {
		return this.access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

}