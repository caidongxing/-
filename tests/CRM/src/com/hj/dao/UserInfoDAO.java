package com.hj.dao;

import java.util.List;

import com.hj.entity.UserInfo;
import com.hj.page.Page;

public interface UserInfoDAO {

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#save(com.hj.entity.UserInfo)
	 */
	public abstract void save(UserInfo transientInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#delete(com.hj.entity.UserInfo)
	 */
	public abstract void delete(UserInfo persistentInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findById(java.lang.Integer)
	 */
	public abstract UserInfo findById(java.lang.Integer id);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByExample(com.hj.entity.UserInfo)
	 */
	public abstract List findByExample(UserInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public abstract List findByProperty(String propertyName, Object value);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserName(java.lang.Object)
	 */
	public abstract List findByUserName(Object userName);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserLoginName(java.lang.Object)
	 */
	public abstract List findByUserLoginName(Object userLoginName);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserPassWord(java.lang.Object)
	 */
	public abstract List findByUserPassWord(Object userPassWord);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserTelphone(java.lang.Object)
	 */
	public abstract List findByUserTelphone(Object userTelphone);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserEmail(java.lang.Object)
	 */
	public abstract List findByUserEmail(Object userEmail);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findAll()
	 */
	public abstract List findAll();

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#merge(com.hj.entity.UserInfo)
	 */
	public abstract UserInfo merge(UserInfo detachedInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#attachDirty(com.hj.entity.UserInfo)
	 */
	public abstract void attachDirty(UserInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#attachClean(com.hj.entity.UserInfo)
	 */
	public abstract void attachClean(UserInfo instance);

	public abstract List findAll(Page page);

	public abstract int findAllCount();

}