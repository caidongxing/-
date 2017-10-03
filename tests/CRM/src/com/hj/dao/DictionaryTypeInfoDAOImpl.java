package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.DictionaryTypeInfo;

/**
 	* A data access object (DAO) providing persistence and search support for DictionaryTypeInfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hj.entity.DictionaryTypeInfo
  * @author MyEclipse Persistence Tools 
 */
@SuppressWarnings("unchecked")
public class DictionaryTypeInfoDAOImpl extends HibernateDaoSupport implements DictionaryTypeInfoDAO  {
    private static final Log log = LogFactory.getLog(DictionaryTypeInfoDAOImpl.class);
	//property constants
	public static final String DATE_INFORMATION_NAME = "dateInformationName";



    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#save(com.hj.entity.DictionaryTypeInfo)
	 */
    public void save(DictionaryTypeInfo transientInstance) {
        log.debug("saving DictionaryTypeInfo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	/* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#delete(com.hj.entity.DictionaryTypeInfo)
	 */
	public void delete(DictionaryTypeInfo persistentInstance) {
        log.debug("deleting DictionaryTypeInfo instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#findById(java.lang.Integer)
	 */
    public DictionaryTypeInfo findById( java.lang.Integer id) {
        log.debug("getting DictionaryTypeInfo instance with id: " + id);
        try {
            DictionaryTypeInfo instance = (DictionaryTypeInfo) getSession()
                    .get("com.hj.entity.DictionaryTypeInfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
  
	/* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#findByExample(com.hj.entity.DictionaryTypeInfo)
	 */
	public List findByExample(DictionaryTypeInfo instance) {
        log.debug("finding DictionaryTypeInfo instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hj.entity.DictionaryTypeInfo")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding DictionaryTypeInfo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from DictionaryTypeInfo as model where model." 
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
	 * @see com.hj.dao.DictionaryTypeInfoDAO#findByDateInformationName(java.lang.Object)
	 */
	public List findByDateInformationName(Object dateInformationName
	) {
		return findByProperty(DATE_INFORMATION_NAME, dateInformationName
		);
	}
	

	/* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all DictionaryTypeInfo instances");
		try {
			String queryString = "from DictionaryTypeInfo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#merge(com.hj.entity.DictionaryTypeInfo)
	 */
    public DictionaryTypeInfo merge(DictionaryTypeInfo detachedInstance) {
        log.debug("merging DictionaryTypeInfo instance");
        try {
            DictionaryTypeInfo result = (DictionaryTypeInfo) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#attachDirty(com.hj.entity.DictionaryTypeInfo)
	 */
    public void attachDirty(DictionaryTypeInfo instance) {
        log.debug("attaching dirty DictionaryTypeInfo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeInfoDAO#attachClean(com.hj.entity.DictionaryTypeInfo)
	 */
    public void attachClean(DictionaryTypeInfo instance) {
        log.debug("attaching clean DictionaryTypeInfo instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}