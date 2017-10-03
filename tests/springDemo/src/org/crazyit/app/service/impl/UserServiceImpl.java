package org.crazyit.app.service.impl;

import org.crazyit.app.domain.User;
import org.crazyit.app.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service("userservice")
@Cacheable(value="users")
public class UserServiceImpl implements UserService {

	@Override
	public User getUsersByNameAndAge(String name, int age) {
		System.out.println("--正在执行findUsersByNameAndAge()查询方法--");
		return new User(name, age);
	}
	public User getAnotherUser(String name, int age)
	{
		System.out.println("--正在执行findAnotherUser()查询方法--");
		return new User(name, age);
	}
	@CacheEvict(value="users",allEntries=true)
	public void evictUser(String name,int age){
		System.out.println("---正在清除"+name+","+age+"对应的缓存======");
	}
	public void evictAll(){
		System.out.println("正在清除整个缓存");
	}

}
