package com.hj.service;

import java.util.List;

import com.hj.dao.UserInfoDAO;
import com.hj.entity.UserInfo;
import com.hj.page.Page;
import com.hj.page.PageUtil;
import com.hj.page.Result;
@SuppressWarnings("unchecked")
public class UserInfoServiceImpl implements UserInfoService {

	private UserInfoDAO userInfoDAO;

	public UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}

	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}

	
	public List<UserInfo> findUserLoginName(String userLoginName) {
		return userInfoDAO.findByUserLoginName(userLoginName);
	}

	public void saveUserInfo(UserInfo userInfo) {
		userInfoDAO.save(userInfo);
	}

	public Result findAllUser(Page page) {
		page=PageUtil.createPage(page, userInfoDAO.findAllCount());
		Result result=new Result();
		result.setPage(page);
		result.setList(userInfoDAO.findAll(page));
		return result;
	}

	public UserInfo findUserId(Integer userId) {
		return userInfoDAO.findById(userId);
	}

	public void updateUserInfo(UserInfo userInfo) {
		userInfoDAO.attachDirty(userInfo);
	}

	public void deleteUserId(Integer userId) {
		UserInfo userInfoId=this.findUserId(userId);//用this 因为前面有个查找id的方法 所以用this就表示引用上面的对象
		userInfoDAO.delete(userInfoId);	
	}

	
}
