package com.hj.dao;

import java.util.List;

import com.hj.entity.CustomerInfo;
import com.hj.page.Page;

public interface CustomerInfoDAO {

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#save(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#save(com.hj.entity.CustomerInfo)
	 */
	public abstract void save(CustomerInfo transientInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#delete(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#delete(com.hj.entity.CustomerInfo)
	 */
	public abstract void delete(CustomerInfo persistentInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findById(java.lang.Integer)
	 */
	public abstract CustomerInfo findById(java.lang.Integer id);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByExample(com.hj.entity.CustomerInfo)
	 */
	public abstract List findByExample(CustomerInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public abstract List findByProperty(String propertyName, Object value);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerName(java.lang.Object)
	 */
	public abstract List findByCustomerName(Object customerName);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyWebsize(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyWebsize(java.lang.Object)
	 */
	public abstract List findByCustomerCompanyWebsize(
			Object customerCompanyWebsize);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyPhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCompanyPhone(java.lang.Object)
	 */
	public abstract List findByCustomerCompanyPhone(Object customerCompanyPhone);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByRegister(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByRegister(java.lang.Object)
	 */
	public abstract List findByRegister(Object register);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerAddress(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerAddress(java.lang.Object)
	 */
	public abstract List findByCustomerAddress(Object customerAddress);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerProvinces(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerProvinces(java.lang.Object)
	 */
	public abstract List findByCustomerProvinces(Object customerProvinces);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCity(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCity(java.lang.Object)
	 */
	public abstract List findByCustomerCity(Object customerCity);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCode(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByCustomerCode(java.lang.Object)
	 */
	public abstract List findByCustomerCode(Object customerCode);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByBankAccount(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByBankAccount(java.lang.Object)
	 */
	public abstract List findByBankAccount(Object bankAccount);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByNoteInformation(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findByNoteInformation(java.lang.Object)
	 */
	public abstract List findByNoteInformation(Object noteInformation);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll()
	 */
	public abstract List findAll();

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#merge(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#merge(com.hj.entity.CustomerInfo)
	 */
	public abstract CustomerInfo merge(CustomerInfo detachedInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachDirty(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachDirty(com.hj.entity.CustomerInfo)
	 */
	public abstract void attachDirty(CustomerInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachClean(com.hj.entity.CustomerInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#attachClean(com.hj.entity.CustomerInfo)
	 */
	public abstract void attachClean(CustomerInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#queryAllCount()
	 */
	public abstract int queryAllCount();

	/* (non-Javadoc)
	 * @see com.hj.dao.CustomerInfoDAO#findAll(com.hj.page.Page)
	 */
	public abstract List findAll(Page page);

	public abstract List findByProperty(String propertyName, Object value,Page page);
	
	public abstract int findByPropertyCount(String propertyName, Object value);
}