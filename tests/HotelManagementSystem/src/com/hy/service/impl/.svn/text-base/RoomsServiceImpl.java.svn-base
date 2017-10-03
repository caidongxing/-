package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.ClientinfoMapper;
import com.hy.dao.RoomreservationMapper;
import com.hy.dao.RoomreservationdetailMapper;
import com.hy.dao.RoomsMapper;
import com.hy.po.Clientinfo;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Rooms;
import com.hy.service.RoomsService;
import com.hy.vo.RoomsTotal;
import com.hy.vo.RoomsTotalParam;
import com.hy.vo.SurplusRooms;

@Transactional
@Service("roomsService")
public class RoomsServiceImpl extends BaseServiceImpl<Rooms> implements RoomsService {

	@Autowired
	private RoomsMapper roomsMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(roomsMapper);
	}
	@Autowired
	private RoomreservationdetailMapper roomreservationdetailMapper;
	@Autowired
	private RoomreservationMapper roomreservationMapper;
	@Autowired
	private ClientinfoMapper clientinfoMapper;
	
	@Override
	public List<Rooms> queryByParam(String roomnumber, int floorid,
			int floornumber) {
		return roomsMapper.queryByParam(roomnumber, floorid, floornumber);
	}

	@Override
	public List<Rooms> queryByStatus(int roomstatus) {
		return roomsMapper.queryByStatus(roomstatus);
	}

	@Override
	public List<RoomsTotal> queryRoomsTotal(RoomsTotalParam roomsTotalParam) {
		return roomsMapper.queryRoomsTotal(roomsTotalParam);
	}

	@Override
	public SurplusRooms findSurplusRooms(String arrivedate,
			Integer roomtypeid) {
		return roomsMapper.findSurplusRooms(arrivedate, roomtypeid);
	}

	@Override
	public List<Rooms> queryRoomsByParam(Integer starnumber, Integer endnumber,
			Integer floorid, Integer floornumber, Integer orientation,
			String characteristic) {
		return roomsMapper.queryRoomsByParam(starnumber, endnumber, floorid, floornumber, orientation, characteristic);
	}

	@Override
	public List<Rooms> queryByRoomTypeId(int roomtypeid) {
		return roomsMapper.queryByRoomTypeId(roomtypeid);
	}

	@Override
	public Rooms queryRoomsByRoomsId(Integer roomsid) {
		return roomsMapper.queryRoomsByRoomsId(roomsid);
	}

	//开房
	@Override
	public int openHouse(Roomreservation roomreservation,
			Roomreservationdetail roomreservationdetail, Clientinfo clientinfo) {
		Rooms room = new Rooms();
		room.setRoomsid(roomreservationdetail.getRoomsid());
		room.setRoomstatus(1);//设置房间状态为现住
		roomreservation.setReservationstatus(2); //设置订单状态为现住
		roomreservationdetail.setRoomstatus(2);//设置订单明细状态为现住
		
		if(roomreservationdetail.getClientinfoid() == null){
			clientinfoMapper.insertSelective(clientinfo);
			roomreservationdetail.setClientinfoid(clientinfo.getClientinfoid());
		}else{
			Clientinfo vo = clientinfoMapper.selectByPrimaryKey(roomreservationdetail.getClientinfoid());
			if(!clientinfo.getChinesename().equals(vo.getChinesename())){
				clientinfoMapper.insertSelective(clientinfo);
				roomreservationdetail.setClientinfoid(clientinfo.getClientinfoid());
			}
		}
		roomreservationMapper.insertSelective(roomreservation);
		roomreservationdetail.setRoomreservationid(roomreservation.getRoomreservationid());
		roomreservationdetailMapper.insertSelective(roomreservationdetail);
		
		
		
		return roomsMapper.updateByPrimaryKeySelective(room);
		
	}

	
}
