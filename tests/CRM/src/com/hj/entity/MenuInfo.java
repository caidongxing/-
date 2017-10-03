package com.hj.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MenuInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class MenuInfo implements java.io.Serializable {

	// Fields

	private Integer menuInfoId;
	private String menuInfoName;
	private Set roleRelationships = new HashSet(0);

	// Constructors

	/** default constructor */
	public MenuInfo() {
	}

	/** full constructor */
	public MenuInfo(String menuInfoName, Set roleRelationships) {
		this.menuInfoName = menuInfoName;
		this.roleRelationships = roleRelationships;
	}

	// Property accessors

	public Integer getMenuInfoId() {
		return this.menuInfoId;
	}

	public void setMenuInfoId(Integer menuInfoId) {
		this.menuInfoId = menuInfoId;
	}

	public String getMenuInfoName() {
		return this.menuInfoName;
	}

	public void setMenuInfoName(String menuInfoName) {
		this.menuInfoName = menuInfoName;
	}

	public Set getRoleRelationships() {
		return this.roleRelationships;
	}

	public void setRoleRelationships(Set roleRelationships) {
		this.roleRelationships = roleRelationships;
	}

}