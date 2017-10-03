package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.ComplainInfo;
import com.hj.page.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * ComplainInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hj.entity.ComplainInfo
 * @author MyEclipse Persistence Tools
 */

public class ComplainInfoDAOImpl extends HibernateDaoSupport implements ComplainInfoDAO {
	private static final Log log = LogFactory.getLog(ComplainInfoDAOImpl.class);
	// property constants
	public static final String COMPLAIN_PERSON = "complainPerson";
	public static final String COMPLAIN_THEME = "complainTheme";
	public static final String COMPLAIN_CONTENT = "complainContent";
	public static final String COMPLAIN_HANDLE_WAY = "complainHandleWay";
	public static final String COMPLAIN_REMARK_INFO = "complainRemarkInfo";

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#save(com.hj.entity.ComplainInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#save(com.hj.entity.ComplainInfo)
	 */
	public void save(ComplainInfo transientInstance) {
		log.debug("saving ComplainInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#delete(com.hj.entity.ComplainInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#delete(com.hj.entity.ComplainInfo)
	 */
	public void delete(ComplainInfo persistentInstance) {
		log.debug("deleting ComplainInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findById(java.lang.Integer)
	 */
	public ComplainInfo findById(java.lang.Integer id) {
		log.debug("getting ComplainInfo instance with id: " + id);
		try {
			ComplainInfo instance = (ComplainInfo) getSession().get(
					"com.hj.entity.ComplainInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByExample(com.hj.entity.ComplainInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByExample(com.hj.entity.ComplainInfo)
	 */
	public List findByExample(ComplainInfo instance) {
		log.debug("finding ComplainInfo instance by example");
		try {
			List results = getSession().createCriteria(
					"com.hj.entity.ComplainInfo").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ComplainInfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ComplainInfo as model where model."
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
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainPerson(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainPerson(java.lang.Object)
	 */
	public List findByComplainPerson(Object complainPerson) {
		return findByProperty(COMPLAIN_PERSON, complainPerson);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainTheme(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainTheme(java.lang.Object)
	 */
	public List findByComplainTheme(Object complainTheme) {
		return findByProperty(COMPLAIN_THEME, complainTheme);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainContent(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainContent(java.lang.Object)
	 */
	public List findByComplainContent(Object complainContent) {
		return findByProperty(COMPLAIN_CONTENT, complainContent);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainHandleWay(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainHandleWay(java.lang.Object)
	 */
	public List findByComplainHandleWay(Object complainHandleWay) {
		return findByProperty(COMPLAIN_HANDLE_WAY, complainHandleWay);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainRemarkInfo(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findByComplainRemarkInfo(java.lang.Object)
	 */
	public List findByComplainRemarkInfo(Object complainRemarkInfo) {
		return findByProperty(COMPLAIN_REMARK_INFO, complainRemarkInfo);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all ComplainInfo instances");
		try {
			String queryString = "from ComplainInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#merge(com.hj.entity.ComplainInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#merge(com.hj.entity.ComplainInfo)
	 */
	public ComplainInfo merge(ComplainInfo detachedInstance) {
		log.debug("merging ComplainInfo instance");
		try {
			ComplainInfo result = (ComplainInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#attachDirty(com.hj.entity.ComplainInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#attachDirty(com.hj.entity.ComplainInfo)
	 */
	public void attachDirty(ComplainInfo instance) {
		log.debug("attaching dirty ComplainInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#attachClean(com.hj.entity.ComplainInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#attachClean(com.hj.entity.ComplainInfo)
	 */
	public void attachClean(ComplainInfo instance) {
		log.debug("attaching clean ComplainInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	/* (non-Javadoc)
	 * @see com.hj.dao.ComplainInfoDAO#findAll(com.hj.page.Page)
	 */
	public List findAll(Page page) {
		log.debug("finding all ComplainInfo instances");
		try {
			String queryString = "from ComplainInfo";
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
	 * @see com.hj.dao.ComplainInfoDAO#findAllCount()
	 */
	public int findAllCount() {
		log.debug("finding all ComplainInfo instances");
		try {
			String queryString = "from ComplainInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}