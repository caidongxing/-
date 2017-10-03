package com.hy.service;

import java.io.Serializable;
import java.util.List;

import com.hy.page.Page;
import com.hy.po.Clientinfo;
import com.hy.po.Creditcard;
import com.hy.po.Membercard;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Rooms;
import com.hy.vo.OtherInfo;
import com.hy.vo.RoomReservationDetail;
import com.hy.vo.RoomReservationDetailParam;
import com.hy.vo.SettleAccountsParam;

public interface RoomreservationdetailService extends BaseService<Roomreservationdetail, Serializable> {

	List<RoomReservationDetail> querySettleAccountsList(SettleAccountsParam params);
	
	RoomReservationDetail queryByDetailId(int detailid);
	
	RoomReservationDetail queryByRoomsId(int roomsid,int roomstatus);
	
	int saveClientinfo(Roomreservation roomreservation,Roomreservationdetail detail,OtherInfo otherinfo,
			Clientinfo clientinfo, Creditcard creditcard, Membercard membercard);
	
	Page<RoomReservationDetail> queryPage(RoomReservationDetailParam detailParam, Page<RoomReservationDetail> page);
	
	List<Roomreservationdetail> findByForeignKey(int id);
	
	Roomreservationdetail findByPrimaryKey(int detailid);
	
	int alterByPrimaryKey(Roomreservationdetail record);
	
	int changeRoom(Roomreservationdetail detail,Rooms oldroom,Rooms newroom);
	
}
