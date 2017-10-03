package com.hj.dao;

import java.util.List;

import com.hj.entity.ComplainInfo;
import com.hj.page.Page;

public interface ComplainInfoDAO {

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#save(com.hj.entity.ComplainInfo)
	 */
	public abstract void save(ComplainInfo transientInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#delete(com.hj.entity.ComplainInfo)
	 */
	public abstract void delete(ComplainInfo persistentInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findById(java.lang.Integer)
	 */
	public abstract ComplainInfo findById(java.lang.Integer id);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByExample(com.hj.entity.ComplainInfo)
	 */
	public abstract List findByExample(ComplainInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public abstract List findByProperty(String propertyName, Object value);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainPerson(java.lang.Object)
	 */
	public abstract List findByComplainPerson(Object complainPerson);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainTheme(java.lang.Object)
	 */
	public abstract List findByComplainTheme(Object complainTheme);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainContent(java.lang.Object)
	 */
	public abstract List findByComplainContent(Object complainContent);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainHandleWay(java.lang.Object)
	 */
	public abstract List findByComplainHandleWay(Object complainHandleWay);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainRemarkInfo(java.lang.Object)
	 */
	public abstract List findByComplainRemarkInfo(Object complainRemarkInfo);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findAll()
	 */
	public abstract List findAll();

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#merge(com.hj.entity.ComplainInfo)
	 */
	public abstract ComplainInfo merge(ComplainInfo detachedInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#attachDirty(com.hj.entity.ComplainInfo)
	 */
	public abstract void attachDirty(ComplainInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#attachClean(com.hj.entity.ComplainInfo)
	 */
	public abstract void attachClean(ComplainInfo instance);

	public abstract List findAll(Page page);

	public abstract int findAllCount();

}