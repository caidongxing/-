package com.hj.service;

import java.util.List;

import com.hj.entity.RoleInfo;
import com.hj.entity.RoleRelationship;

public interface RoleRelationshipService {

	/***
	 * 保存角色信息关系
	 * */
	public void saveRoleRelationship(RoleRelationship roleRelationship);
	
	/**
	 * 查找角色关系id
	 * **/
	public List<RoleRelationship> findByRoleRelationship(RoleInfo roleInfo);
	
	/***
	 * 更新角色信息关系
	 * */
	public void updateRoleRelationship(RoleRelationship roleRelationship);
	/***
	 * 删除角色信息关系
	 * */
	public void deleteRoleRelationship(RoleRelationship roleRelationship);
}
