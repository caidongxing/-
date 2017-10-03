package com.gx.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gx.po.user.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> findAll();
    
    User login(@Param("username")String username, @Param("password")String password, @Param("certificatepassword")String certificatepassword);
    
    
    
}