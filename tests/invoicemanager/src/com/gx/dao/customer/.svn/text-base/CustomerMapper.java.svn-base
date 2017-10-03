package com.gx.dao.customer;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.customer.Customer;

@Repository(value="customerMapper")
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    List<Customer> findAll();
}