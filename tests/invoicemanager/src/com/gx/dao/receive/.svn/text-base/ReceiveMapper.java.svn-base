package com.gx.dao.receive;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.receive.Receive;

@Repository(value="receiveMapper")
public interface ReceiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Receive record);

    int insertSelective(Receive record);

    Receive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Receive record);

    int updateByPrimaryKey(Receive record);
    
    List<Receive> findAll();
}