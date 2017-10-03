package com.hy.service;

import java.io.Serializable;
import java.util.List;

import com.hy.page.Page;
import com.hy.po.Accountbook;

public interface AccountbookService extends BaseService<Accountbook, Serializable> {

	List<Accountbook> findByStatus();
	public Page<Accountbook> queryPage(String name, Page<Accountbook> page);
}
