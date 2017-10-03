package com.hy.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Accountbookanditems;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Roomtype;
import com.hy.po.Settleaccounts;
import com.hy.po.Signbill;
import com.hy.po.Signbilldetail;
import com.hy.po.User;
import com.hy.service.AccountbookanditemsService;
import com.hy.service.RoomreservationdetailService;
import com.hy.service.RoomtypeService;
import com.hy.service.SettleaccountsService;
import com.hy.service.SignbillService;
import com.hy.service.SignbilldetailService;
import com.hy.util.DateUtil;
import com.hy.vo.RoomReservationDetail;
import com.hy.vo.SettleAccountsParam;


@Controller
@RequestMapping("settleAccountsController")
public class SettleAccountsController extends BaseController {

	@Autowired
	private RoomreservationdetailService roomreservationdetailService;
	@Autowired
	private SignbillService signbillService;
	@Autowired
	private AccountbookanditemsService accountbookanditemsService;
	@Autowired
	private SignbilldetailService signbilldetailService;
	@Autowired
	private SettleaccountsService settleaccountsService;
	@Autowired
	private RoomtypeService roomtypeService;
	
	//账务处理结算列表
	@RequestMapping("list")
	public String list(String chinesename,String idnumber,String roomnumber,
			Page<Settleaccounts> page) {
		page = settleaccountsService.queryPage(chinesename, idnumber, roomnumber, page);
		model.addAttribute("page", page);
		model.addAttribute("chinesename", chinesename);
		model.addAttribute("idnumber", idnumber);
		model.addAttribute("roomnumber", roomnumber);
		return "/settleaccounts/list";
	}
	
	//账务处理结算退房视图
	@RequestMapping("checkout")
	public String checkout(SettleAccountsParam params) {
		params.setReside(2);//设置默认查询条件
		List<RoomReservationDetail> detail = roomreservationdetailService.querySettleAccountsList(params);
		model.addAttribute("detail", detail);
		model.addAttribute("params", params);
		return "/settleaccounts/checkout";
	}
	
	//查询账本信息
	@RequestMapping("findAccountBook")
	public void findAccountBook(Integer accountid) {
		List<Signbill> vo = signbillService.findByForeignKey(accountid);
		String result = JSONArray.fromObject(vo).toString();
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	//查询账项信息
	@RequestMapping("findAccountbookitemsById")
	public void findAccountbookitemsById(Integer accountbookid,Integer signbillid) {
		 List<Accountbookanditems> vo = accountbookanditemsService.findAccountbookitemsById(accountbookid, signbillid);
		String result = JSONArray.fromObject(vo).toString();
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	//查询签单明细信息
	@RequestMapping("findSignbillDetailById")
	public void findSignbillDetailById(Integer[] signbillid) {
		
		List<Signbilldetail> signbilldetail = new ArrayList<Signbilldetail>();
		for (Integer integer : signbillid) {
			List<Signbilldetail> vo = signbilldetailService.findForeignKey(integer);
			signbilldetail.addAll(vo);
		}
		String result = JSONArray.fromObject(signbilldetail).toString();
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	//收取房租视图界面
	@RequestMapping("expenseView")
	public String expenseView(Integer detailid, Integer accountid) {
		Roomreservationdetail detail = roomreservationdetailService.selectByPrimaryKey(detailid);
		List<Signbill> signbill = signbillService.findByForeignKey(accountid);
		List<Roomtype> roomtype = roomtypeService.findAll();
		
		
		String NowDate = DateUtil.getNowDate();
		String Leavedate = DateUtil.formatDate(detail.getLeavedate(),DateUtil.YMD) ;
		
		//结账退房时间
		Date currentDate = null;
		//提前结账和超期结账都是用当前时间进行计算天数，不然就是用离店时间计算天数
		if(Leavedate.compareTo(NowDate) > 0 || Leavedate.compareTo(NowDate) < 0){
			currentDate = DateUtil.StrToDate(NowDate,DateUtil.YMD);
		}else{
			currentDate = detail.getLeavedate();
		}
		
		try {
			int day = DateUtil.daysBetween(detail.getArrivedate(),currentDate);
			//房租 = 房价 * 天数
			BigDecimal Realprice =  detail.getRealprice().multiply(new BigDecimal(day));
			model.addAttribute("Realprice", Realprice);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("accountid", accountid);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("detail", detail);
		model.addAttribute("signbill", signbill);
		model.addAttribute("currentDate", currentDate);
		return "/settleaccounts/expense";
	}
	
	//收取房租
	@RequestMapping("expense")
	public void expense(Signbilldetail signbilldetail) throws IOException {
	
			int count = signbilldetailService.insertSelective(signbilldetail);
			if( count > 0){
				response.getWriter().write("1");
			}else{
				response.getWriter().write("0");
			}
			
	}
	
	//打印
	@RequestMapping("print")
	public String print(Integer[] signbillid,Integer detailid) throws ParseException{
		
		List<Signbilldetail> signbilldetail = new ArrayList<Signbilldetail>();
		for (Integer integer : signbillid) {
			List<Signbilldetail> vo = signbilldetailService.findForeignKey(integer);
			signbilldetail.addAll(vo);
		}
		
		RoomReservationDetail detail = roomreservationdetailService.queryByDetailId(detailid);
		//住店天数
		int day = DateUtil.daysBetween(detail.getArrivedate(), detail.getLeavedate());
		//房租 = 住店天数 * 一天房价
		BigDecimal Realprice =  detail.getRealprice().multiply(new BigDecimal(day));
		
		//已收金额
		BigDecimal Proceeds  = new BigDecimal(0);
		//消费金额
		BigDecimal Expenditure = new BigDecimal(0);
		//结账金额 = 消费金额 - （押金 + 余额）
		BigDecimal Payable = Expenditure.subtract(detail.getCashpledge().add(detail.getAccountbalance()));
		for (Signbilldetail vo : signbilldetail) {
			if(vo.getIsproceeds() == 1){
				Proceeds = Proceeds.add(vo.getExpenditure());
			}else{
				Expenditure = Expenditure.add(vo.getExpenditure());
			}
			
		}
		//当前时间
		Date nowadays = new Date();
		model.addAttribute("nowadays", nowadays);
		model.addAttribute("Payable", Payable);
		model.addAttribute("Expenditure", Expenditure);
		model.addAttribute("Proceeds", Proceeds);
		model.addAttribute("Realprice", Realprice);
		model.addAttribute("day", day);
		model.addAttribute("signbilldetail", signbilldetail);
		model.addAttribute("detail", detail);
		
		return "/settleaccounts/print";
	}
	
	//结账退房
	@RequestMapping("settleaccounts")
	public String settleaccounts(Settleaccounts settleaccounts){
		settleaccounts.setSettleaccountstime(new Date());
		User user = (User) request.getSession().getAttribute("user");
		settleaccounts.setOperator(user.getUsername());
		int count = settleaccountsService.settleAccounts(settleaccounts);
		if(count > 0){
			return "redirect:/settleAccountsController/checkout.do";
		}else{
			return "/error/500";
		}
	}
}
