package com.hj.dao;

import java.util.List;

import com.hj.entity.RoleInfo;
import com.hj.page.Page;

public interface RoleInfoDAO {

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#save(com.hj.entity.RoleInfo)
	 */
	public abstract void save(RoleInfo transientInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#delete(com.hj.entity.RoleInfo)
	 */
	public abstract void delete(RoleInfo persistentInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findById(java.lang.Integer)
	 */
	public abstract RoleInfo findById(java.lang.Integer id);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByExample(com.hj.entity.RoleInfo)
	 */
	public abstract List findByExample(RoleInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public abstract List findByProperty(String propertyName, Object value);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByRoleName(java.lang.Object)
	 */
	public abstract List findByRoleName(Object roleName);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findAll()
	 */
	public abstract List findAll();

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#merge(com.hj.entity.RoleInfo)
	 */
	public abstract RoleInfo merge(RoleInfo detachedInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#attachDirty(com.hj.entity.RoleInfo)
	 */
	public abstract void attachDirty(RoleInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#attachClean(com.hj.entity.RoleInfo)
	 */
	public abstract void attachClean(RoleInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findAll()
	 */
	public abstract List findAll(Page page);

	public abstract int findAllCount();

}