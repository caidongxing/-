package com.hy.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hy.po.Rooms;
import com.hy.vo.RoomsTotal;
import com.hy.vo.RoomsTotalParam;
import com.hy.vo.SurplusRooms;

public interface RoomsMapper extends BaseMapper<Rooms, Serializable> {

	Rooms queryRoomsByRoomsId(@Param("roomsid") Integer roomsid);
	
	SurplusRooms findSurplusRooms(@Param("arrivedate") String arrivedate,
			@Param("roomtypeid") Integer roomtypeid);

	List<RoomsTotal> queryRoomsTotal(RoomsTotalParam roomsTotalParam);

	List<Rooms> queryByParam(@Param("roomnumber") String roomnumber,
			@Param("floorid") int floorid, @Param("floornumber") int floornumber);

	List<Rooms> queryByStatus(@Param("roomstatus") int roomstatus);
	
	List<Rooms> queryByRoomTypeId(@Param("roomtypeid") int roomtypeid);

	List<Rooms> queryRoomsByParam(@Param("starnumber") Integer starnumber,
			@Param("endnumber") Integer endnumber, @Param("floorid") Integer floorid,
			@Param("floornumber") Integer floornumber,
			@Param("orientation") Integer orientation,
			@Param("characteristic") String characteristic);
}