package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Roomreservationdetail;
import com.hy.vo.RoomReservationDetail;
import com.hy.vo.RoomReservationDetailParam;
import com.hy.vo.SettleAccountsParam;

public interface RoomreservationdetailMapper extends BaseMapper<Roomreservationdetail, Serializable> {

	List<RoomReservationDetail> querySettleAccountsList(SettleAccountsParam params);
	
	RoomReservationDetail queryByDetailId(@Param("detailid") int detailid);
	
	RoomReservationDetail queryByRoomsId(@Param("roomsid") int roomsid,@Param("roomstatus") int roomstatus);
	
	List<RoomReservationDetail> queryPage(RoomReservationDetailParam detailParam);
	int count(RoomReservationDetailParam detailParam);
	
	List<Roomreservationdetail> findByForeignKey(@Param("roomreservationid") int id);
	
	int abolishByForeignKey(@Param("roomreservationid") int id,@Param("roomstatus") int roomstatus);
	
	Roomreservationdetail findByPrimaryKey(@Param("detailid") int detailid);
	
	int alterByPrimaryKey(Roomreservationdetail record);
}