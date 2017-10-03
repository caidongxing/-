package com.hy.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.dao.AccountMapper;
import com.hy.dao.RoomreservationMapper;
import com.hy.dao.RoomreservationdetailMapper;
import com.hy.dao.RoomsMapper;
import com.hy.dao.SettleaccountsMapper;
import com.hy.page.Page;
import com.hy.po.Account;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Rooms;
import com.hy.po.Settleaccounts;
import com.hy.service.SettleaccountsService;

@Transactional
@Service("settleaccountsService")
public class SettleaccountsServiceImpl extends BaseServiceImpl<Settleaccounts> implements SettleaccountsService {

	@Autowired
	private SettleaccountsMapper settleaccountsMapper;
	//这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseDao调用，
	//而是这个userDao,调用父类BaseServiceImpl里的setBaseDao方法，将userDao设置进去
	@Autowired
	public void setBaseMapper(){
		super.setBaseMapper(settleaccountsMapper);
	}
	@Autowired
	private RoomreservationdetailMapper roomreservationdetailMapper;
	@Autowired
	private RoomreservationMapper roomreservationMapper;
	@Autowired
	private AccountMapper accountMapper;
	@Autowired
	private RoomsMapper roomsMapper;
	
	
	@Override
	public int settleAccounts(Settleaccounts settleaccounts) {
		Roomreservationdetail detail = roomreservationdetailMapper.selectByPrimaryKey(settleaccounts.getDetailid());
		List<Roomreservationdetail> detailList = roomreservationdetailMapper.findByForeignKey(detail.getRoomreservationid());
		Rooms rooms = new Rooms();
		Account account = new Account();
		int Tab = 0;//定义判断标记
		for (Roomreservationdetail vo : detailList) {
			//判断查询出来的预订单明细客房状态是否全部为离店状态
			if(vo.getRoomstatus() == 4){
				Tab++;
			}
		}
		//当标记数和预订单明细数相等时，将预订单的预订状态修改为离店状态
		if(Tab == detailList.size()){
			Roomreservation roomreservation = new Roomreservation();
			roomreservation.setRoomreservationid(detail.getRoomreservationid());
			roomreservation.setReservationstatus(4);//设置客房预订单的状态为离店状态
			roomreservationMapper.updateByPrimaryKeySelective(roomreservation);
		}
		rooms.setRoomsid(detail.getRoomsid());
		rooms.setRoomstatus(2);//设置房间状态为空房
		roomsMapper.updateByPrimaryKeySelective(rooms);
		
		account.setAccountid(detail.getAccountid());
		account.setAccountstatus(1);//设置账户状态为禁用状态
		account.setAccountbalance(new BigDecimal(0));//清空账户余额
		accountMapper.updateByPrimaryKeySelective(account);
		
		detail.setRoomstatus(4);//设置客房预订单明细房间状态为离店状态
		roomreservationdetailMapper.updateByPrimaryKeySelective(detail);
		
		return settleaccountsMapper.insertSelective(settleaccounts);
	}


	@Override
	public Page<Settleaccounts> queryPage(String chinesename, String idnumber,
			String roomnumber, Page<Settleaccounts> page) {
		
		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		List<Settleaccounts> settleaccounts = settleaccountsMapper.queryPage(chinesename, idnumber, roomnumber, firstResult, page.getPageSize());
		page.setTotal(settleaccountsMapper.count(chinesename, idnumber,roomnumber));
		page.setResult(settleaccounts);
		page.visiblePages();//计算分页显示
		return page;
	}
}
