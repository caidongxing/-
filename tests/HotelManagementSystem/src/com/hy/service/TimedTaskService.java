package com.hy.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hy.dao.AccountMapper;
import com.hy.dao.RoomreservationMapper;
import com.hy.dao.RoomreservationdetailMapper;
import com.hy.po.Account;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;

@Component
public class TimedTaskService {

	@Autowired
	private RoomreservationMapper roomreservationMapper;
	@Autowired
	private RoomreservationdetailMapper roomreservationdetailMapper;
	@Autowired
	private AccountMapper accountMapper;
	
	/**
	* 按顺序依次为
	秒（0~59）
	分钟（0~59）
	小时（0~23）
	天（月）（0~31，但是你需要考虑你月的天数）
	月（0~11）
	天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
	7.年份（1970－2099）
	
	其中每个元素可以是一个值(如6),一个连续区间(9-12),一个间隔时间(8-18/4)(/表示每隔4小时),一个列表(1,3,5),通配符。由于"月份中的日期"和"星期中的日期"这两个元素互斥的,必须要对其中一个设置?.
	0 0 10,14,16 * * ? 每天上午10点，下午2点，4点
	0 0/30 9-17 * * ?   朝九晚五工作时间内每半小时
	0 0 12 ? * WED 表示每个星期三中午12点 
	"0 0 12 * * ?" 每天中午12点触发 
	"0 15 10 ? * *" 每天上午10:15触发 
	"0 15 10 * * ?" 每天上午10:15触发 
	"0 15 10 * * ? *" 每天上午10:15触发 
	"0 15 10 * * ? 2005" 2005年的每天上午10:15触发 
	"0 * 14 * * ?" 在每天下午2点到下午2:59期间的每1分钟触发 
	"0 0/5 14 * * ?" 在每天下午2点到下午2:55期间的每5分钟触发 
	"0 0/5 14,18 * * ?" 在每天下午2点到2:55期间和下午6点到6:55期间的每5分钟触发 
	"0 0-5 14 * * ?" 在每天下午2点到下午2:05期间的每1分钟触发 
	"0 10,44 14 ? 3 WED" 每年三月的星期三的下午2:10和2:44触发 
	"0 15 10 ? * MON-FRI" 周一至周五的上午10:15触发 
	"0 15 10 15 * ?" 每月15日上午10:15触发 
	"0 15 10 L * ?" 每月最后一日的上午10:15触发 
	"0 15 10 ? * 6L" 每月的最后一个星期五上午10:15触发 
	"0 15 10 ? * 6L 2002-2005" 2002年至2005年的每月的最后一个星期五上午10:15触发 
	"0 15 10 ? * 6#3" 每月的第三个星期五上午10:15触发 
	@Scheduled(cron = "0 0 3 * * ?")//每天凌晨三点执行
	 */
	
	//该定时器定时判断订单是否失约，每天凌晨1点执行
	@Scheduled(cron = "0 0 1 * * ?")
	public void taskCheckRoomreservation(){
		
		Account account = new Account();
		
		List<Roomreservationdetail> detail = roomreservationdetailMapper.findAll();
		List<Roomreservation> roomreservation = roomreservationMapper.findAll();
		
		for (Roomreservationdetail rrd : detail) {
			if(rrd.getRoomstatus() == 1){
				if(rrd.getLeavedate().compareTo(new Date()) < 0){
					if(rrd.getAccountid() != null){
						account.setAccountid(rrd.getAccountid());
						account.setAccountstatus(1);//设置账号状态为不可用
						accountMapper.updateByPrimaryKeySelective(account);
					}
					
					rrd.setRoomstatus(5);//设置订单明细为失约状态
					roomreservationdetailMapper.updateByPrimaryKeySelective(rrd);
					
				}
			}
		}
		for (Roomreservation rt : roomreservation) {
			if(rt.getReservationstatus() == 1){
				List<Roomreservationdetail> vo = roomreservationdetailMapper.findByForeignKey(rt.getRoomreservationid());
				if(vo.size() > 0){
					int Tab = 0;//定义判断标记
					for (Roomreservationdetail dd : vo) {
						if(dd.getRoomstatus() == 5){
							Tab++;
						}
					}
					if(Tab == vo.size()){
						rt.setReservationstatus(5);//设置客房预订单的状态为失约状态
						roomreservationMapper.updateByPrimaryKeySelective(rt);
					}
				}
			}
			
		}
		
		System.out.println("判断失约定时任务开始");
	}
	
	//判断订单客人是否全部入住，从0分钟开始，每5分钟执行一次
	@Scheduled(cron = "0 0/5 * * * ?")
	public void taskCheckReside(){
		
		List<Roomreservation> roomreservation = roomreservationMapper.findAll();
		
		for (Roomreservation rt : roomreservation) {
			if(rt.getReservationstatus() == 1){
				List<Roomreservationdetail> vo = roomreservationdetailMapper.findByForeignKey(rt.getRoomreservationid());
				if(vo.size() > 0){
					int Tab = 0;//定义判断标记
					for (Roomreservationdetail dd : vo) {
						if(dd.getRoomstatus() == 2){
							Tab++;
						}
					}
					if(Tab == vo.size()){
						rt.setReservationstatus(2);//设置客房预订单的状态为现住状态
						roomreservationMapper.updateByPrimaryKeySelective(rt);
					}
				}
			}
		}
		
		System.out.println("判断现住定时任务开始");
	}
}
