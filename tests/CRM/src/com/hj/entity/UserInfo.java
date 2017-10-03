package com.hj.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private RoleInfo roleInfo;
	private UserInfo userInfo;//上级
	private String userName;
	private String userLoginName;
	private String userPassWord;
	private String userTelphone;
	private String userEmail;
	private Set userInfos = new HashSet(0);//下级

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(RoleInfo roleInfo, UserInfo userInfo, String userName,
			String userLoginName, String userPassWord, String userTelphone,
			String userEmail, Set userInfos) {
		this.roleInfo = roleInfo;
		this.userInfo = userInfo;
		this.userName = userName;
		this.userLoginName = userLoginName;
		this.userPassWord = userPassWord;
		this.userTelphone = userTelphone;
		this.userEmail = userEmail;
		this.userInfos = userInfos;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public RoleInfo getRoleInfo() {
		return this.roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLoginName() {
		return this.userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserPassWord() {
		return this.userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public String getUserTelphone() {
		return this.userTelphone;
	}

	public void setUserTelphone(String userTelphone) {
		this.userTelphone = userTelphone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}