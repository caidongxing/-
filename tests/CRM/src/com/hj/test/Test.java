package com.hj.test;

import com.hj.dao.DictionaryTypeDAO;
import com.hj.dao.DictionaryTypeDAOImpl;
import com.hj.entity.DictionaryType;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DictionaryTypeDAO dao =new DictionaryTypeDAOImpl();
		DictionaryType lx=dao.findById(2);
		System.out.println(lx.getDataTypeName());

	}

}
