package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.RoleRelationship;

/**
 * A data access object (DAO) providing persistence and search support for
 * RoleRelationship entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hj.entity.RoleRelationship
 * @author MyEclipse Persistence Tools
 */

public class RoleRelationshipDAOImpl extends HibernateDaoSupport implements RoleRelationshipDAO {
	private static final Log log = LogFactory.getLog(RoleRelationshipDAOImpl.class);
	// property constants
	public static final String ACCESS = "access";

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#save(com.hj.entity.RoleRelationship)
	 */
	public void save(RoleRelationship transientInstance) {
		log.debug("saving RoleRelationship instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#delete(com.hj.entity.RoleRelationship)
	 */
	public void delete(RoleRelationship persistentInstance) {
		log.debug("deleting RoleRelationship instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#findById(java.lang.Integer)
	 */
	public RoleRelationship findById(java.lang.Integer id) {
		log.debug("getting RoleRelationship instance with id: " + id);
		try {
			RoleRelationship instance = (RoleRelationship) getSession().get(
					"com.hj.entity.RoleRelationship", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#findByExample(com.hj.entity.RoleRelationship)
	 */
	public List findByExample(RoleRelationship instance) {
		log.debug("finding RoleRelationship instance by example");
		try {
			List results = getSession().createCriteria(
					"com.hj.entity.RoleRelationship").add(
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
	 * @see com.hj.dao.RoleRelationshipDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RoleRelationship instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from RoleRelationship as model where model."
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
	 * @see com.hj.dao.RoleRelationshipDAO#findByAccess(java.lang.Object)
	 */
	public List findByAccess(Object access) {
		return findByProperty(ACCESS, access);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all RoleRelationship instances");
		try {
			String queryString = "from RoleRelationship";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#merge(com.hj.entity.RoleRelationship)
	 */
	public RoleRelationship merge(RoleRelationship detachedInstance) {
		log.debug("merging RoleRelationship instance");
		try {
			RoleRelationship result = (RoleRelationship) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#attachDirty(com.hj.entity.RoleRelationship)
	 */
	public void attachDirty(RoleRelationship instance) {
		log.debug("attaching dirty RoleRelationship instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.RoleRelationshipDAO#attachClean(com.hj.entity.RoleRelationship)
	 */
	public void attachClean(RoleRelationship instance) {
		log.debug("attaching clean RoleRelationship instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}