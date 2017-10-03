package com.hj.service;

import java.util.List;

import com.hj.dao.RoleRelationshipDAO;
import com.hj.entity.RoleInfo;
import com.hj.entity.RoleRelationship;
@SuppressWarnings("unchecked")
public class RoleRelationshipServiceImpl implements RoleRelationshipService {

	private RoleRelationshipDAO roleRelationshipDAO;
	
	

	public void saveRoleRelationship(RoleRelationship roleRelationship) {
		roleRelationshipDAO.save(roleRelationship);
	}
	public List<RoleRelationship> findByRoleRelationship(RoleInfo roleInfo) {
		return roleRelationshipDAO.findByProperty("roleInfo", roleInfo);
	}
	
	public void updateRoleRelationship(RoleRelationship roleRelationship) {
		roleRelationshipDAO.attachDirty(roleRelationship);
	}
	public void deleteRoleRelationship(RoleRelationship roleRelationship) {
		roleRelationshipDAO.delete(roleRelationship);
	}
	
	
	
	
	
	
	public RoleRelationshipDAO getRoleRelationshipDAO() {
		return roleRelationshipDAO;
	}
	public void setRoleRelationshipDAO(RoleRelationshipDAO roleRelationshipDAO) {
		this.roleRelationshipDAO = roleRelationshipDAO;
	}
	

}
