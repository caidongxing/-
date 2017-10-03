package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.UserInfo;
import com.hj.page.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hj.entity.UserInfo
 * @author MyEclipse Persistence Tools
 */

public class UserInfoDAOImpl extends HibernateDaoSupport implements UserInfoDAO{
	private static final Log log = LogFactory.getLog(UserInfoDAOImpl.class);
	// property constants
	public static final String USER_NAME = "userName";
	public static final String USER_LOGIN_NAME = "userLoginName";
	public static final String USER_PASS_WORD = "userPassWord";
	public static final String USER_TELPHONE = "userTelphone";
	public static final String USER_EMAIL = "userEmail";

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#save(com.hj.entity.UserInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#save(com.hj.entity.UserInfo)
	 */
	public void save(UserInfo transientInstance) {
		log.debug("saving UserInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#delete(com.hj.entity.UserInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#delete(com.hj.entity.UserInfo)
	 */
	public void delete(UserInfo persistentInstance) {
		log.debug("deleting UserInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findById(java.lang.Integer)
	 */
	public UserInfo findById(java.lang.Integer id) {
		log.debug("getting UserInfo instance with id: " + id);
		try {
			UserInfo instance = (UserInfo) getSession().get(
					"com.hj.entity.UserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByExample(com.hj.entity.UserInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByExample(com.hj.entity.UserInfo)
	 */
	public List findByExample(UserInfo instance) {
		log.debug("finding UserInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.hj.entity.UserInfo").add(
							Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserName(java.lang.Object)
	 */
	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserLoginName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserLoginName(java.lang.Object)
	 */
	public List findByUserLoginName(Object userLoginName) {
		return findByProperty(USER_LOGIN_NAME, userLoginName);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserPassWord(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserPassWord(java.lang.Object)
	 */
	public List findByUserPassWord(Object userPassWord) {
		return findByProperty(USER_PASS_WORD, userPassWord);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserTelphone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserTelphone(java.lang.Object)
	 */
	public List findByUserTelphone(Object userTelphone) {
		return findByProperty(USER_TELPHONE, userTelphone);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserEmail(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findByUserEmail(java.lang.Object)
	 */
	public List findByUserEmail(Object userEmail) {
		return findByProperty(USER_EMAIL, userEmail);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all UserInfo instances");
		try {
			String queryString = "from UserInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#merge(com.hj.entity.UserInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#merge(com.hj.entity.UserInfo)
	 */
	public UserInfo merge(UserInfo detachedInstance) {
		log.debug("merging UserInfo instance");
		try {
			UserInfo result = (UserInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#attachDirty(com.hj.entity.UserInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#attachDirty(com.hj.entity.UserInfo)
	 */
	public void attachDirty(UserInfo instance) {
		log.debug("attaching dirty UserInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#attachClean(com.hj.entity.UserInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#attachClean(com.hj.entity.UserInfo)
	 */
	public void attachClean(UserInfo instance) {
		log.debug("attaching clean UserInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findAll(com.hj.page.Page)
	 */
	public List findAll(Page page) {
		log.debug("finding all UserInfo instances");
		try {
			String queryString = "from UserInfo";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	/* (non-Javadoc)
	 * @see com.hj.dao.UserInfoDAO#findAllCount()
	 */
	public int findAllCount() {
		log.debug("finding all UserInfo instances");
		try {
			String queryString = "from UserInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	
}