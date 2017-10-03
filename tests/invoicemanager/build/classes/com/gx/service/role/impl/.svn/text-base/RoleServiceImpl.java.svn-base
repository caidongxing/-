package com.gx.service.role.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.Role.RoleMapper;
import com.gx.po.Role.Role;
import com.gx.service.role.RoleService;

@Transactional
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return this.roleMapper.findAll();
	}

	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		this.roleMapper.insert(role);
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return this.roleMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		this.roleMapper.updateByPrimaryKey(role);
	}

	@Override
	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		this.roleMapper.deleteByPrimaryKey(id);
	}

}
