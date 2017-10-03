package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import com.hy.po.Roomreservation;
import com.hy.vo.RoomReservation;
import com.hy.vo.RoomReservationVo;

public interface RoomreservationMapper extends BaseMapper<Roomreservation, Serializable> {
	
	RoomReservationVo findByPrimaryKey(int roomreservationid);
	public List<RoomReservationVo> queryPage(RoomReservation roomReservation);
	public int count(RoomReservation roomReservation);
}