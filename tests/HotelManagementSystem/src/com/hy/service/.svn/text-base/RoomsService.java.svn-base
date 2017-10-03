package com.hy.service;

import java.io.Serializable;
import java.util.List;

import com.hy.po.Clientinfo;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Rooms;
import com.hy.vo.RoomsTotal;
import com.hy.vo.RoomsTotalParam;
import com.hy.vo.SurplusRooms;

public interface RoomsService extends BaseService<Rooms, Serializable> {

	int openHouse(Roomreservation roomreservation,Roomreservationdetail roomreservationdetail, Clientinfo clientinfo);
	
	Rooms queryRoomsByRoomsId(Integer roomsid);
			
	SurplusRooms findSurplusRooms(String arrivedate,Integer roomtypeid);
	
	List<RoomsTotal> queryRoomsTotal(RoomsTotalParam roomsTotalParam);
	
	public List<Rooms> queryByParam(String roomnumber,int floorid,int floornumber);
	public List<Rooms> queryByStatus(int roomstatus);
	public List<Rooms> queryByRoomTypeId(int roomtypeid);
	
	List<Rooms> queryRoomsByParam(Integer starnumber, Integer endnumber,
			Integer floorid, Integer floornumber, Integer orientation, String characteristic);
}
