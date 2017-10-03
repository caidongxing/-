package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.CustomerLevel;

/**
 	* A data access object (DAO) providing persistence and search support for CustomerLevel entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hj.entity.CustomerLevel
  * @author MyEclipse Persistence Tools 
 */
@SuppressWarnings("unchecked")
public class CustomerLevelDAOImpl extends HibernateDaoSupport implements CustomerLevelDAO  {
    private static final Log log = LogFactory.getLog(CustomerLevelDAOImpl.class);
	//property constants
	public static final String BUSINESS = "business";
	public static final String LEVEL_NAME = "levelName";



    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#save(com.hj.entity.CustomerLevel)
	 */
    public void save(CustomerLevel transientInstance) {
        log.debug("saving CustomerLevel instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#delete(com.hj.entity.CustomerLevel)
	 */
	public void delete(CustomerLevel persistentInstance) {
        log.debug("deleting CustomerLevel instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#findById(java.lang.Integer)
	 */
    public CustomerLevel findById( java.lang.Integer id) {
        log.debug("getting CustomerLevel instance with id: " + id);
        try {
            CustomerLevel instance = (CustomerLevel) getSession()
                    .get("com.hj.entity.CustomerLevel", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#findByExample(com.hj.entity.CustomerLevel)
	 */
    
	public List findByExample(CustomerLevel instance) {
        log.debug("finding CustomerLevel instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hj.entity.CustomerLevel")
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
	 * @see com.hj.dao.CustomerLevelDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding CustomerLevel instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CustomerLevel as model where model." 
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
	 * @see com.hj.dao.CustomerLevelDAO#findByBusiness(java.lang.Object)
	 */
	public List findByBusiness(Object business
	) {
		return findByProperty(BUSINESS, business
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#findByLevelName(java.lang.Object)
	 */
	public List findByLevelName(Object levelName
	) {
		return findByProperty(LEVEL_NAME, levelName
		);
	}
	

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all CustomerLevel instances");
		try {
			String queryString = "from CustomerLevel";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#merge(com.hj.entity.CustomerLevel)
	 */
    public CustomerLevel merge(CustomerLevel detachedInstance) {
        log.debug("merging CustomerLevel instance");
        try {
            CustomerLevel result = (CustomerLevel) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#attachDirty(com.hj.entity.CustomerLevel)
	 */
    public void attachDirty(CustomerLevel instance) {
        log.debug("attaching dirty CustomerLevel instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerLevelDAO#attachClean(com.hj.entity.CustomerLevel)
	 */
    public void attachClean(CustomerLevel instance) {
        log.debug("attaching clean CustomerLevel instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}