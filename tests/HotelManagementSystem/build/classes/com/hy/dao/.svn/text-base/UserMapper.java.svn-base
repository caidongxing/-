package com.hy.dao;

import java.io.Serializable;

import org.apache.ibatis.annotations.Param;

import com.hy.po.User;

public interface UserMapper extends BaseMapper<User, Serializable>  {
	
	User login(@Param("username") String username,@Param("password") String password);
}