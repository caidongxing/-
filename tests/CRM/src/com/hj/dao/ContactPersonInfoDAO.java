package com.hj.dao;

import java.util.List;

import com.hj.entity.ContactPersonInfo;
import com.hj.page.Page;

public interface ContactPersonInfoDAO {

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#save(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#save(com.hj.entity.ContactPersonInfo)
	 */
	public abstract void save(ContactPersonInfo transientInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#delete(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#delete(com.hj.entity.ContactPersonInfo)
	 */
	public abstract void delete(ContactPersonInfo persistentInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findById(java.lang.Integer)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findById(java.lang.Integer)
	 */
	public abstract ContactPersonInfo findById(java.lang.Integer id);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByExample(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByExample(com.hj.entity.ContactPersonInfo)
	 */
	public abstract List findByExample(ContactPersonInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public abstract List findByProperty(String propertyName, Object value);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactName(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactName(java.lang.Object)
	 */
	public abstract List findByContactName(Object contactName);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactSex(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactSex(java.lang.Object)
	 */
	public abstract List findByContactSex(Object contactSex);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactPost(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactPost(java.lang.Object)
	 */
	public abstract List findByContactPost(Object contactPost);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactOfficePhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactOfficePhone(java.lang.Object)
	 */
	public abstract List findByContactOfficePhone(Object contactOfficePhone);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactMobilePhone(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactMobilePhone(java.lang.Object)
	 */
	public abstract List findByContactMobilePhone(Object contactMobilePhone);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactEmail(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactEmail(java.lang.Object)
	 */
	public abstract List findByContactEmail(Object contactEmail);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactQqnumber(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactQqnumber(java.lang.Object)
	 */
	public abstract List findByContactQqnumber(Object contactQqnumber);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactRemarks(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByContactRemarks(java.lang.Object)
	 */
	public abstract List findByContactRemarks(Object contactRemarks);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	public abstract List findAll();

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#merge(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#merge(com.hj.entity.ContactPersonInfo)
	 */
	public abstract ContactPersonInfo merge(ContactPersonInfo detachedInstance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachDirty(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachDirty(com.hj.entity.ContactPersonInfo)
	 */
	public abstract void attachDirty(ContactPersonInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachClean(com.hj.entity.ContactPersonInfo)
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#attachClean(com.hj.entity.ContactPersonInfo)
	 */
	public abstract void attachClean(ContactPersonInfo instance);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll()
	 */
	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findAll(com.hj.page.Page)
	 */
	public abstract List findAll(Page page);

	/* (non-Javadoc)
	 * @see com.hj.dao.ContactPersonInfoDAO#findByPropertyCount(java.lang.String, java.lang.Object)
	 */
	public abstract int findByContactPersonCount();

}