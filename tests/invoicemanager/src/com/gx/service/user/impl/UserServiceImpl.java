package com.gx.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.user.UserMapper;
import com.gx.po.user.User;
import com.gx.service.user.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String username, String password, String certificatepassword) {
		// TODO Auto-generated method stub
		return this.userMapper.login(username, password, certificatepassword);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userMapper.findAll();
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.userMapper.insert(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userMapper.updateByPrimaryKey(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		this.userMapper.deleteByPrimaryKey(id);
	}

	
	
}
