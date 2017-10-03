package com.gx.dao.ticketspecification;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gx.po.ticketspecification.Ticketspecification;

@Repository(value="ticketspecificationMapper")
public interface TicketspecificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ticketspecification record);

    int insertSelective(Ticketspecification record);

    Ticketspecification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ticketspecification record);

    int updateByPrimaryKey(Ticketspecification record);
    
    List<Ticketspecification> findAll();
}