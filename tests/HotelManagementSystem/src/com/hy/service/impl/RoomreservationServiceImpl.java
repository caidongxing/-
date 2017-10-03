package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.ClientinfoMapper;
import com.hy.dao.CreditcardMapper;
import com.hy.dao.MembercardMapper;
import com.hy.dao.OtherinfoMapper;
import com.hy.dao.RoomreservationMapper;
import com.hy.dao.RoomreservationdetailMapper;
import com.hy.page.Page;
import com.hy.po.Clientinfo;
import com.hy.po.Creditcard;
import com.hy.po.Membercard;
import com.hy.po.Otherinfo;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.service.RoomreservationService;
import com.hy.vo.RoomReservation;
import com.hy.vo.RoomReservationVo;

@Transactional
@Service("roomreservationService")
public class RoomreservationServiceImpl extends BaseServiceImpl<Roomreservation> implements RoomreservationService {

	@Autowired
	private RoomreservationMapper roomreservationMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(roomreservationMapper);
	}
	@Autowired
	private CreditcardMapper creditcardMapper;
	@Autowired
	private MembercardMapper membercardMapper;
	@Autowired
	private OtherinfoMapper otherinfoMapper;
	@Autowired
	private ClientinfoMapper clientinfoMapper;
	@Autowired
	private RoomreservationdetailMapper roomreservationdetailMapper;
	
	
	@Override
	public Page<RoomReservationVo> queryPage(RoomReservation roomReservation,
			Page<RoomReservationVo> page) {
		
		List<RoomReservationVo> roomreservation = roomreservationMapper.queryPage(roomReservation);
		page.setTotal(roomreservationMapper.count(roomReservation));
		page.setResult(roomreservation);
		page.visiblePages();//计算分页显示
		return page;
	}
	@Override
	public int saveRoomReservation(Roomreservation roomreservation,
			Roomreservationdetail roomreservationdetail, Clientinfo clientinfo,
			Otherinfo otherinfo, Creditcard creditcard, Membercard membercard){
		
		if(roomreservation.getRoomreservationid() == null){
			roomreservationMapper.insertSelective(roomreservation);
			if(creditcard.getCreditcardid() == null){
				creditcardMapper.insertSelective(creditcard);
				otherinfo.setCreditcardid(creditcard.getCreditcardid());
			}
			if(membercard.getMembercardid() == null){
				membercardMapper.insertSelective(membercard);
				otherinfo.setMembercardid(membercard.getMembercardid());
			}
			
			otherinfo.setRoomreservationid(roomreservation.getRoomreservationid());
			otherinfoMapper.insertSelective(otherinfo);
			
		}
		if(clientinfo.getClientinfoid() == null){
			clientinfoMapper.insertSelective(clientinfo);
			
		}
		roomreservationdetail.setClientinfoid(clientinfo.getClientinfoid());
		roomreservationdetail.setRoomreservationid(roomreservation.getRoomreservationid());
		int count = roomreservationdetailMapper.insertSelective(roomreservationdetail);
		
		return count;
	}
	//取消订单
	@Override
	public int abolishRoomReservation(Roomreservation roomreservation,
			int roomreservationid, int roomstatus) {
		roomreservationdetailMapper.abolishByForeignKey(roomreservationid, roomstatus);
		int count = roomreservationMapper.updateByPrimaryKeySelective(roomreservation);
		return count;
	}
	@Override
	public RoomReservationVo findByPrimaryKey(int roomreservationid) {
		return roomreservationMapper.findByPrimaryKey(roomreservationid);
	}
	@Override
	public int copyIndent(Roomreservation roomreservation,
			Roomreservationdetail roomreservationdetail, Clientinfo clientinfo,
			Otherinfo otherinfo) {
		roomreservationMapper.insertSelective(roomreservation);
		otherinfo.setRoomreservationid(roomreservation.getRoomreservationid());
		otherinfoMapper.insertSelective(otherinfo);
		clientinfoMapper.insertSelective(clientinfo);
		roomreservationdetail.setClientinfoid(clientinfo.getClientinfoid());
		roomreservationdetail.setRoomreservationid(roomreservation.getRoomreservationid());
		int count = roomreservationdetailMapper.insertSelective(roomreservationdetail);
		return count;
	}
	@Override
	public int updateRoomReservation(Roomreservation roomreservation,
			Otherinfo otherinfo, Creditcard creditcard, Membercard membercard) {
		
		roomreservationMapper.updateByPrimaryKeySelective(roomreservation);
		if(otherinfo.getCreditcardid() == null && creditcard.getCreditcardnumber() != ""){
			creditcardMapper.insertSelective(creditcard);
			otherinfo.setCreditcardid(creditcard.getCreditcardid());
		}
		if(otherinfo.getMembercardid() == null && membercard.getMembercardnumber() != ""){
			membercardMapper.insertSelective(membercard);
			otherinfo.setMembercardid(membercard.getMembercardid());
		}
		int count = 0;
		if(otherinfo.getOtherinfoid() == null){
			count = otherinfoMapper.insertSelective(otherinfo);
		}else {
			count = otherinfoMapper.updateByPrimaryKeySelective(otherinfo);
		}
		 
		return count;
	}
	
	
}
