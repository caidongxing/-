package com.hj.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hj.entity.CustomerInfo;
import com.hj.page.Page;

/**
 	* A data access object (DAO) providing persistence and search support for CustomerInfo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.hj.entity.CustomerInfo
  * @author MyEclipse Persistence Tools 
 */
@SuppressWarnings("unchecked")
public class CustomerInfoDAOImpl extends HibernateDaoSupport implements CustomerInfoDAO {
    private static final Log log = LogFactory.getLog(CustomerInfoDAOImpl.class);
	//property constants
	public static final String CUSTOMER_NAME = "customerName";
	public static final String CUSTOMER_COMPANY_WEBSIZE = "customerCompanyWebsize";
	public static final String CUSTOMER_COMPANY_PHONE = "customerCompanyPhone";
	public static final String REGISTER = "register";
	public static final String CUSTOMER_ADDRESS = "customerAddress";
	public static final String CUSTOMER_PROVINCES = "customerProvinces";
	public static final String CUSTOMER_CITY = "customerCity";
	public static final String CUSTOMER_CODE = "customerCode";
	public static final String BANK_ACCOUNT = "bankAccount";
	public static final String NOTE_INFORMATION = "noteInformation";



    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#save(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#save(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#save(com.hj.entity.CustomerInfo)
	 */
    public void save(CustomerInfo transientInstance) {
        log.debug("saving CustomerInfo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#delete(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#delete(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#delete(com.hj.entity.CustomerInfo)
	 */
	public void delete(CustomerInfo persistentInstance) {
        log.debug("deleting CustomerInfo instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findById(java.lang.Integer)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findById(java.lang.Integer)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findById(java.lang.Integer)
	 */
    public CustomerInfo findById( java.lang.Integer id) {
        log.debug("getting CustomerInfo instance with id: " + id);
        try {
            CustomerInfo instance = (CustomerInfo) getSession()
                    .get("com.hj.entity.CustomerInfo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByExample(com.hj.entity.CustomerInfo)
	 */
  
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByExample(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByExample(com.hj.entity.CustomerInfo)
	 */
	public List findByExample(CustomerInfo instance) {
        log.debug("finding CustomerInfo instance by example");
        try {
            List results = getSession()
                    .createCriteria("com.hj.entity.CustomerInfo")
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
	 * @see com.hj.dao.CustomerInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding CustomerInfo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from CustomerInfo as model where model." 
         						+ propertyName + " like ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, "%" + value + "%");
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerName(java.lang.Object)
	 */
	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyWebsize(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyWebsize(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyWebsize(java.lang.Object)
	 */
	public List findByCustomerCompanyWebsize(Object customerCompanyWebsize) {
		return findByProperty(CUSTOMER_COMPANY_WEBSIZE, customerCompanyWebsize
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyPhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyPhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyPhone(java.lang.Object)
	 */
	public List findByCustomerCompanyPhone(Object customerCompanyPhone) {
		return findByProperty(CUSTOMER_COMPANY_PHONE, customerCompanyPhone
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByRegister(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByRegister(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByRegister(java.lang.Object)
	 */
	public List findByRegister(Object register) {
		return findByProperty(REGISTER, register
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerAddress(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerAddress(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerAddress(java.lang.Object)
	 */
	public List findByCustomerAddress(Object customerAddress) {
		return findByProperty(CUSTOMER_ADDRESS, customerAddress
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerProvinces(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerProvinces(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerProvinces(java.lang.Object)
	 */
	public List findByCustomerProvinces(Object customerProvinces) {
		return findByProperty(CUSTOMER_PROVINCES, customerProvinces
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCity(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCity(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCity(java.lang.Object)
	 */
	public List findByCustomerCity(Object customerCity) {
		return findByProperty(CUSTOMER_CITY, customerCity
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCode(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCode(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCode(java.lang.Object)
	 */
	public List findByCustomerCode(Object customerCode
	) {
		return findByProperty(CUSTOMER_CODE, customerCode
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByBankAccount(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByBankAccount(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByBankAccount(java.lang.Object)
	 */
	public List findByBankAccount(Object bankAccount
	) {
		return findByProperty(BANK_ACCOUNT, bankAccount
		);
	}
	
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByNoteInformation(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByNoteInformation(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByNoteInformation(java.lang.Object)
	 */
	public List findByNoteInformation(Object noteInformation
	) {
		return findByProperty(NOTE_INFORMATION, noteInformation
		);
	}
	

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all CustomerInfo instances");
		try {
			String queryString = "from CustomerInfo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#merge(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#merge(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#merge(com.hj.entity.CustomerInfo)
	 */
    public CustomerInfo merge(CustomerInfo detachedInstance) {
        log.debug("merging CustomerInfo instance");
        try {
            CustomerInfo result = (CustomerInfo) getSession().merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachDirty(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachDirty(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachDirty(com.hj.entity.CustomerInfo)
	 */
    public void attachDirty(CustomerInfo instance) {
        log.debug("attaching dirty CustomerInfo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachClean(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachClean(com.hj.entity.CustomerInfo)
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachClean(com.hj.entity.CustomerInfo)
	 */
    public void attachClean(CustomerInfo instance) {
        log.debug("attaching clean CustomerInfo instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#queryAllCount()
	 */
    /* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#queryAllCount()
	 */
    public int queryAllCount(){
    	log.debug("finding all CustomerInfo count");
		try {
			String queryString = "from CustomerInfo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
    }
    
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll(com.hj.page.Page)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll(com.hj.page.Page)
	 */
	public List findAll(Page page) {
		log.debug("finding all CustomerInfo instances");
		try {
			String queryString = "from CustomerInfo";
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
	 * @see com.hj.dao.CustomerInfoDAO#findByProperty(java.lang.String, java.lang.Object, com.hj.page.Page)
	 */
	public List findByProperty(String propertyName, Object value,Page page) {
	      log.debug("finding CustomerInfo instance with property: " + propertyName
	            + ", value: " + value);
	      try {
	         String queryString = "from CustomerInfo as model where model." 
	         						+ propertyName + " like ?";
	         Query queryObject = getSession().createQuery(queryString);
			 queryObject.setParameter(0, "%" + value + "%");
			 queryObject.setFirstResult(page.getBeginIndex());
			 queryObject.setMaxResults(page.getEveryPage());
			 return queryObject.list();
	      } catch (RuntimeException re) {
	         log.error("find by property name failed", re);
	         throw re;
	      }
		}
	public int findByPropertyCount(String propertyName, Object value) {
	      log.debug("finding CustomerInfo instance with property: " + propertyName
	            + ", value: " + value);
	      try {
	         String queryString = "from CustomerInfo as model where model." 
	         						+ propertyName + " like ?";
	         Query queryObject = getSession().createQuery(queryString);
			 queryObject.setParameter(0, "%" + value + "%");
			 return queryObject.list().size();
	      } catch (RuntimeException re) {
	         log.error("find by property name failed", re);
	         throw re;
	      }
		}
	
	
	
	
	
}