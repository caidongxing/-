package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.RoleInfo;
import com.hj.page.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * RoleInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hj.entity.RoleInfo
 * @author MyEclipse Persistence Tools
 */

public class RoleInfoDAOImpl extends HibernateDaoSupport implements RoleInfoDAO{
	private static final Log log = LogFactory.getLog(RoleInfoDAOImpl.class);
	// property constants
	public static final String ROLE_NAME = "roleName";

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#save(com.hj.entity.RoleInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#save(com.hj.entity.RoleInfo)
	 */
	public void save(RoleInfo transientInstance) {
		log.debug("saving RoleInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#delete(com.hj.entity.RoleInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#delete(com.hj.entity.RoleInfo)
	 */
	public void delete(RoleInfo persistentInstance) {
		log.debug("deleting RoleInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findById(java.lang.Integer)
	 */
	public RoleInfo findById(java.lang.Integer id) {
		log.debug("getting RoleInfo instance with id: " + id);
		try {
			RoleInfo instance = (RoleInfo) getSession().get(
					"com.hj.entity.RoleInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByExample(com.hj.entity.RoleInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByExample(com.hj.entity.RoleInfo)
	 */
	public List findByExample(RoleInfo instance) {
		log.debug("finding RoleInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.hj.entity.RoleInfo").add(
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
	 * @see com.hj.dao.RoleInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RoleInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RoleInfo as model where model."
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
	 * @see com.hj.dao.RoleInfoDAO#findByRoleName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findByRoleName(java.lang.Object)
	 */
	public List findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all RoleInfo instances");
		try {
			String queryString = "from RoleInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#merge(com.hj.entity.RoleInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#merge(com.hj.entity.RoleInfo)
	 */
	public RoleInfo merge(RoleInfo detachedInstance) {
		log.debug("merging RoleInfo instance");
		try {
			RoleInfo result = (RoleInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#attachDirty(com.hj.entity.RoleInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#attachDirty(com.hj.entity.RoleInfo)
	 */
	public void attachDirty(RoleInfo instance) {
		log.debug("attaching dirty RoleInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#attachClean(com.hj.entity.RoleInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#attachClean(com.hj.entity.RoleInfo)
	 */
	public void attachClean(RoleInfo instance) {
		log.debug("attaching clean RoleInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	/* (non-Javadoc)
	 * @see com.hj.dao.RoleInfoDAO#findAll()
	 */

	public List findAll(Page page) {
		log.debug("finding all RoleInfo instances");
		try {
			String queryString = "from RoleInfo";
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
	 * @see com.hj.dao.RoleInfoDAO#findAllCount()
	 */
	public int findAllCount() {
		log.debug("finding all RoleInfo instances");
		try {
			String queryString = "from RoleInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
	
}