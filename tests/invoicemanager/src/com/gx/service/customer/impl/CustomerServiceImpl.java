package com.gx.service.customer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.customer.CustomerMapper;
import com.gx.po.customer.Customer;
import com.gx.service.customer.CustomerService;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return this.customerMapper.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.customerMapper.insert(customer);
	}

	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return this.customerMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.customerMapper.updateByPrimaryKey(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		this.customerMapper.deleteByPrimaryKey(id);
	}

}
