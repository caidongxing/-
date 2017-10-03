package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.DictionaryType;

/**
 	* A data access object (DAO) providing persistence and search support for DictionaryType entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hj.entity.DictionaryType
  * @author MyEclipse Persistence Tools 
 */
@SuppressWarnings("unchecked")
public class DictionaryTypeDAOImpl extends HibernateDaoSupport implements DictionaryTypeDAO  {
    private static final Log log = LogFactory.getLog(DictionaryTypeDAOImpl.class);
	//property constants
	public static final String DATA_TYPE_NAME = "dataTypeName";



    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#save(com.hj.entity.DictionaryType)
	 */
    public void save(DictionaryType transientInstance) {
        log.debug("saving DictionaryType instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	/* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#delete(com.hj.entity.DictionaryType)
	 */
	public void delete(DictionaryType persistentInstance) {
        log.debug("deleting DictionaryType instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#findById(java.lang.Integer)
	 */
    public DictionaryType findById( java.lang.Integer id) {
        log.debug("getting DictionaryType instance with id: " + id);
        try {
            DictionaryType instance = (DictionaryType) getSession()
                    .get("com.hj.entity.DictionaryType", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#findByExample(com.hj.entity.DictionaryType)
	 */
   
	public List findByExample(DictionaryType instance) {
        log.debug("finding DictionaryType instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hj.entity.DictionaryType")
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
	 * @see com.hj.dao.DictionaryTypeDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding DictionaryType instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from DictionaryType as model where model." 
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
	 * @see com.hj.dao.DictionaryTypeDAO#findByDataTypeName(java.lang.Object)
	 */
	public List findByDataTypeName(Object dataTypeName
	) {
		return findByProperty(DATA_TYPE_NAME, dataTypeName
		);
	}
	

	/* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all DictionaryType instances");
		try {
			String queryString = "from DictionaryType";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#merge(com.hj.entity.DictionaryType)
	 */
    public DictionaryType merge(DictionaryType detachedInstance) {
        log.debug("merging DictionaryType instance");
        try {
            DictionaryType result = (DictionaryType) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#attachDirty(com.hj.entity.DictionaryType)
	 */
    public void attachDirty(DictionaryType instance) {
        log.debug("attaching dirty DictionaryType instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.DictionaryTypeDAO#attachClean(com.hj.entity.DictionaryType)
	 */
    public void attachClean(DictionaryType instance) {
        log.debug("attaching clean DictionaryType instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}