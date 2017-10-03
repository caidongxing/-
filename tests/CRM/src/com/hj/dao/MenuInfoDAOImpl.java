package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.MenuInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * MenuInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.hj.entity.MenuInfo
 * @author MyEclipse Persistence Tools
 */

public class MenuInfoDAOImpl extends HibernateDaoSupport implements MenuInfoDAO {
	private static final Log log = LogFactory.getLog(MenuInfoDAOImpl.class);
	// property constants
	public static final String MENU_INFO_NAME = "menuInfoName";

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#save(com.hj.entity.MenuInfo)
	 */
	public void save(MenuInfo transientInstance) {
		log.debug("saving MenuInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#delete(com.hj.entity.MenuInfo)
	 */
	public void delete(MenuInfo persistentInstance) {
		log.debug("deleting MenuInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#findById(java.lang.Integer)
	 */
	public MenuInfo findById(java.lang.Integer id) {
		log.debug("getting MenuInfo instance with id: " + id);
		try {
			MenuInfo instance = (MenuInfo) getSession().get(
					"com.hj.entity.MenuInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#findByExample(com.hj.entity.MenuInfo)
	 */
	public List findByExample(MenuInfo instance) {
		log.debug("finding MenuInfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.hj.entity.MenuInfo").add(
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
	 * @see com.hj.dao.MenuInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MenuInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MenuInfo as model where model."
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
	 * @see com.hj.dao.MenuInfoDAO#findByMenuInfoName(java.lang.Object)
	 */
	public List findByMenuInfoName(Object menuInfoName) {
		return findByProperty(MENU_INFO_NAME, menuInfoName);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all MenuInfo instances");
		try {
			String queryString = "from MenuInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#merge(com.hj.entity.MenuInfo)
	 */
	public MenuInfo merge(MenuInfo detachedInstance) {
		log.debug("merging MenuInfo instance");
		try {
			MenuInfo result = (MenuInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#attachDirty(com.hj.entity.MenuInfo)
	 */
	public void attachDirty(MenuInfo instance) {
		log.debug("attaching dirty MenuInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.MenuInfoDAO#attachClean(com.hj.entity.MenuInfo)
	 */
	public void attachClean(MenuInfo instance) {
		log.debug("attaching clean MenuInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}