package com.hy.service;

import java.io.Serializable;

import com.hy.page.Page;
import com.hy.po.Clientinfo;
import com.hy.po.Creditcard;
import com.hy.po.Membercard;
import com.hy.po.Otherinfo;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.vo.RoomReservation;
import com.hy.vo.RoomReservationVo;

public interface RoomreservationService extends BaseService<Roomreservation, Serializable> {

	//通过id查询预订信息
	RoomReservationVo findByPrimaryKey(int roomreservationid);
	
	Page<RoomReservationVo> queryPage(RoomReservation roomReservation, Page<RoomReservationVo> page);
	
	//保存预订单
	int saveRoomReservation(Roomreservation roomreservation, Roomreservationdetail roomreservationdetail, Clientinfo clientinfo,Otherinfo otherinfo, Creditcard creditcard,Membercard membercard);
	
	//取消订单
	int abolishRoomReservation(Roomreservation roomreservation,int roomreservationid,int roomstatus);
	
	//复制订单
	int copyIndent(Roomreservation roomreservation, Roomreservationdetail roomreservationdetail, Clientinfo clientinfo,Otherinfo otherinfo);
	
	//修改预订单
	int updateRoomReservation(Roomreservation roomreservation,Otherinfo otherinfo, Creditcard creditcard,
			Membercard membercard);
}
