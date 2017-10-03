package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.ContactPersonInfo;
import com.hj.page.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * ContactPersonInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.hj.entity.ContactPersonInfo
 * @author MyEclipse Persistence Tools
 */

public class ContactPersonInfoDAOImpl extends HibernateDaoSupport implements ContactPersonInfoDAO{
	private static final Log log = LogFactory
			.getLog(ContactPersonInfoDAOImpl.class);
	// property constants
	public static final String CONTACT_NAME = "contactName";
	public static final String CONTACT_SEX = "contactSex";
	public static final String CONTACT_POST = "contactPost";
	public static final String CONTACT_OFFICE_PHONE = "contactOfficePhone";
	public static final String CONTACT_MOBILE_PHONE = "contactMobilePhone";
	public static final String CONTACT_EMAIL = "contactEmail";
	public static final String CONTACT_QQNUMBER = "contactQqnumber";
	public static final String CONTACT_REMARKS = "contactRemarks";

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#save(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#save(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#save(com.hj.entity.ContactPersonInfo)
	 */
	public void save(ContactPersonInfo transientInstance) {
		log.debug("saving ContactPersonInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#delete(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#delete(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#delete(com.hj.entity.ContactPersonInfo)
	 */
	public void delete(ContactPersonInfo persistentInstance) {
		log.debug("deleting ContactPersonInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findById(java.lang.Integer)
	 */
	public ContactPersonInfo findById(java.lang.Integer id) {
		log.debug("getting ContactPersonInfo instance with id: " + id);
		try {
			ContactPersonInfo instance = (ContactPersonInfo) getSession().get(
					"com.hj.entity.ContactPersonInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByExample(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByExample(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByExample(com.hj.entity.ContactPersonInfo)
	 */
	public List findByExample(ContactPersonInfo instance) {
		log.debug("finding ContactPersonInfo instance by example");
		try {
			List results = getSession().createCriteria(
					"com.hj.entity.ContactPersonInfo").add(
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
	 * @see com.hj.dao.ContactPersonInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ContactPersonInfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from ContactPersonInfo as model where model."
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
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactName(java.lang.Object)
	 */
	public List findByContactName(Object contactName) {
		return findByProperty(CONTACT_NAME, contactName);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactSex(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactSex(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactSex(java.lang.Object)
	 */
	public List findByContactSex(Object contactSex) {
		return findByProperty(CONTACT_SEX, contactSex);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactPost(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactPost(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactPost(java.lang.Object)
	 */
	public List findByContactPost(Object contactPost) {
		return findByProperty(CONTACT_POST, contactPost);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactOfficePhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactOfficePhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactOfficePhone(java.lang.Object)
	 */
	public List findByContactOfficePhone(Object contactOfficePhone) {
		return findByProperty(CONTACT_OFFICE_PHONE, contactOfficePhone);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactMobilePhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactMobilePhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactMobilePhone(java.lang.Object)
	 */
	public List findByContactMobilePhone(Object contactMobilePhone) {
		return findByProperty(CONTACT_MOBILE_PHONE, contactMobilePhone);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactEmail(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactEmail(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactEmail(java.lang.Object)
	 */
	public List findByContactEmail(Object contactEmail) {
		return findByProperty(CONTACT_EMAIL, contactEmail);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactQqnumber(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactQqnumber(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactQqnumber(java.lang.Object)
	 */
	public List findByContactQqnumber(Object contactQqnumber) {
		return findByProperty(CONTACT_QQNUMBER, contactQqnumber);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactRemarks(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactRemarks(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactRemarks(java.lang.Object)
	 */
	public List findByContactRemarks(Object contactRemarks) {
		return findByProperty(CONTACT_REMARKS, contactRemarks);
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all ContactPersonInfo instances");
		try {
			String queryString = "from ContactPersonInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#merge(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#merge(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#merge(com.hj.entity.ContactPersonInfo)
	 */
	public ContactPersonInfo merge(ContactPersonInfo detachedInstance) {
		log.debug("merging ContactPersonInfo instance");
		try {
			ContactPersonInfo result = (ContactPersonInfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachDirty(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachDirty(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachDirty(com.hj.entity.ContactPersonInfo)
	 */
	public void attachDirty(ContactPersonInfo instance) {
		log.debug("attaching dirty ContactPersonInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachClean(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachClean(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachClean(com.hj.entity.ContactPersonInfo)
	 */
	public void attachClean(ContactPersonInfo instance) {
		log.debug("attaching clean ContactPersonInfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll(com.hj.page.Page)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll(com.hj.page.Page)
	 */
	public List findAll(Page page) {
		log.debug("finding all ContactPersonInfo instances");
		try {
			String queryString = "from ContactPersonInfo";
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
	 * @see com.hj.dao.ContactPersonInfoDAO#findByPropertyCount(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByPropertyCount()
	 */
	public int findByContactPersonCount() {
		log.debug("finding all ContactPersonInfo instances");
		try {
			String queryString = "from ContactPersonInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
}