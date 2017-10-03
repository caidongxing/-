package com.hy.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Account;
import com.hy.po.Accountbookanditems;
import com.hy.po.Agreementclient;
import com.hy.po.Aignbilltemplate;
import com.hy.po.Characteristic;
import com.hy.po.Clientinfo;
import com.hy.po.Creditcard;
import com.hy.po.Floor;
import com.hy.po.Membercard;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Rooms;
import com.hy.po.Roomtype;
import com.hy.po.Salesman;
import com.hy.po.Signbill;
import com.hy.po.Signbilldetail;
import com.hy.po.Team;
import com.hy.po.Templateandaccountbook;
import com.hy.service.AccountService;
import com.hy.service.AccountbookanditemsService;
import com.hy.service.AgreementclientService;
import com.hy.service.AignbilltemplateService;
import com.hy.service.CharacteristicService;
import com.hy.service.ClientinfoService;
import com.hy.service.FloorService;
import com.hy.service.OtherinfoService;
import com.hy.service.RoomreservationService;
import com.hy.service.RoomreservationdetailService;
import com.hy.service.RoomsService;
import com.hy.service.RoomtypeService;
import com.hy.service.SalesmanService;
import com.hy.service.SignbillService;
import com.hy.service.SignbilldetailService;
import com.hy.service.TeamService;
import com.hy.service.TemplateandaccountbookService;
import com.hy.util.DateUtil;
import com.hy.vo.OtherInfo;
import com.hy.vo.RoomReservationDetail;
import com.hy.vo.RoomReservationDetailParam;

@Controller
@RequestMapping("indentClientController")
public class IndentClientController extends BaseController {

	@Autowired
	private RoomreservationService roomreservationService;
	@Autowired
	private RoomreservationdetailService roomreservationdetailService;
	@Autowired
	private SalesmanService salesmanService;
	@Autowired
	private CharacteristicService characteristicService;
	@Autowired
	private AignbilltemplateService aignbilltemplateService;
	@Autowired
	private RoomtypeService roomtypeService;
	@Autowired
	private AgreementclientService agreementclientService;
	@Autowired
	private TeamService teamService;
	@Autowired
	private ClientinfoService clientinfoService;
	@Autowired
	private OtherinfoService otherinfoService;
	@Autowired
	private TemplateandaccountbookService templateandaccountbookService;
	@Autowired
	private AccountbookanditemsService accountbookanditemsService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private SignbillService signbillService;
	@Autowired
	private SignbilldetailService signbilldetailService;
	@Autowired
	private RoomsService roomsService;
	@Autowired
	private FloorService floorService;

	// 订单客人列表
	@RequestMapping("list")
	public String list(RoomReservationDetailParam detailParam,
			Page<RoomReservationDetail> page) {

		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		detailParam.setFirstResult(firstResult);
		detailParam.setPageSize(page.getPageSize());

		page = roomreservationdetailService.queryPage(detailParam, page);
		model.addAttribute("page", page);
		model.addAttribute("detailParam", detailParam);
		return "/indentclient/list";
	}

	// 客人信息视图
	@RequestMapping("clientinfoView")
	public String clientinfoView(Integer detailid, Integer roomreservationid,
			Integer clientinfoid) {

		List<Salesman> salesman = salesmanService.findAll();
		List<Characteristic> characteristic = characteristicService.findAll();
		List<Aignbilltemplate> aignbilltemplate = aignbilltemplateService
				.findAll();
		List<Roomtype> roomtype = roomtypeService.findAll();
		List<Agreementclient> agreementclient = agreementclientService
				.findAll();
		List<Team> team = teamService.findAll();
		Roomreservation roomreservation = roomreservationService
				.selectByPrimaryKey(roomreservationid);
		Roomreservationdetail detail = roomreservationdetailService
				.selectByPrimaryKey(detailid);
		OtherInfo otherinfo = otherinfoService
				.findByForeignKey(roomreservationid);
		Clientinfo clientinfo = clientinfoService
				.selectByPrimaryKey(clientinfoid);

		model.addAttribute("salesman", salesman);
		model.addAttribute("characteristic", characteristic);
		model.addAttribute("aignbilltemplate", aignbilltemplate);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("agreementclient", agreementclient);// 协议客户
		model.addAttribute("team", team);// 团会
		model.addAttribute("roomreservation", roomreservation);
		model.addAttribute("detail", detail);
		model.addAttribute("otherinfo", otherinfo);
		model.addAttribute("clientinfo", clientinfo);

		return "/indentclient/clientinfo";
	}

	// 保存客人信息
	@RequestMapping("saveClientinfo")
	public String saveClientinfo(Roomreservation roomreservation,
			Roomreservationdetail detail, OtherInfo otherinfo,
			Clientinfo clientinfo, Creditcard creditcard, Membercard membercard) {

		int count = roomreservationdetailService.saveClientinfo(
				roomreservation, detail, otherinfo, clientinfo, creditcard,
				membercard);
		if (count > 0) {
			return "redirect:/indentClientController/list.do";
		} else {
			return "/error/500";
		}
	}

	// 分配账号视图
	@RequestMapping("allotaccountView")
	public String allotaccountView(Integer detailid, Integer roomreservationid,
			Integer clientinfoid) {

		List<Aignbilltemplate> aignbilltemplate = aignbilltemplateService
				.findAll();
		List<Team> team = teamService.findAll();
		List<Roomtype> roomtype = roomtypeService.findAll();

		Roomreservation roomreservation = roomreservationService
				.selectByPrimaryKey(roomreservationid);
		Roomreservationdetail detail = roomreservationdetailService
				.selectByPrimaryKey(detailid);
		Clientinfo clientinfo = clientinfoService
				.selectByPrimaryKey(clientinfoid);

		List<Templateandaccountbook> templateandaccountbook = templateandaccountbookService
				.findByPrimaryKey(roomreservation.getSignbilltemplateid());

		model.addAttribute("roomreservation", roomreservation);
		model.addAttribute("detail", detail);
		model.addAttribute("clientinfo", clientinfo);

		model.addAttribute("aignbilltemplate", aignbilltemplate);
		model.addAttribute("team", team);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("templateandaccountbook", templateandaccountbook);

		return "/indentclient/allotaccount";
	}

	@RequestMapping("findByKey")
	public void findByKey(int[] accountbookid) {

		List<Accountbookanditems> accountbookanditems = new ArrayList<Accountbookanditems>();
		for (int i : accountbookid) {
			accountbookanditems.addAll(accountbookanditemsService.findByKey(i));
		}
		String result = JSONSerializer.toJSON(accountbookanditems).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	// 分配账号弹层
	@RequestMapping("accountView")
	public String accountView() {
		List<Account> account = accountService.findAll();
		model.addAttribute("account", account);
		return "/indentclient/accountview";
	}

	// 保存分配账号
	@RequestMapping("saveAllotAccount")
	public String saveAllotAccount(Account account,
			Roomreservationdetail detail, String jsonData) {
		int count = accountService.insertSelective(account);

		if (count > 0) {
			detail.setAccountid(account.getAccountid());
			roomreservationdetailService.updateByPrimaryKeySelective(detail);

			JSONObject json = JSONObject.fromObject(jsonData);
			for (int i = 0; i < json.size(); i++) {
				JSONObject o = (JSONObject) json.get("" + i);
				Signbill signbill = (Signbill) JSONObject.toBean(o,
						Signbill.class);
				signbill.setAccountid(account.getAccountid());
				signbillService.insertSelective(signbill);
			}
			return "redirect:/indentClientController/list.do";
		} else {
			return "/error/500";
		}

	}

	// 收取押金视图
	@RequestMapping("cashpledgeView")
	public String cashpledgeView(Integer detailid, Integer accountid) {
		Roomreservationdetail detail = roomreservationdetailService
				.selectByPrimaryKey(detailid);
		List<Signbill> signbill = signbillService.findByForeignKey(accountid);
		try {
			int day = DateUtil.daysBetween(detail.getArrivedate(),
					detail.getLeavedate());
			model.addAttribute("datenumber", day);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("detail", detail);
		model.addAttribute("signbill", signbill);
		return "/indentclient/cashpledge";
	}

	// 收押金界面下拉框选择事件
	@RequestMapping("signbillChange")
	public void signbillChange(Integer signbillid) {

		Signbill signbill = signbillService.selectByPrimaryKey(signbillid);
		List<Accountbookanditems> accountbookanditems = accountbookanditemsService
				.findByKey(signbill.getAccountbookid());

		String result = JSONSerializer.toJSON(accountbookanditems).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 收取押金
	@RequestMapping("cashpledge")
	public String cashpledge(Signbilldetail signbilldetail,
			Roomreservationdetail detail,Integer payway) {
		signbilldetail.setIscashpledge(1);//标志该条数据是收押金
		signbilldetail.setIsproceeds(1);//标志该条数据金额已收入
		try {
			if(payway == 1){
				Account account = accountService.selectByPrimaryKey(detail.getAccountid());
				//账户余额 - 消费金额
				BigDecimal Accountbalance = account.getAccountbalance().subtract(signbilldetail.getExpenditure());
				account.setAccountbalance(Accountbalance);
				accountService.updateByPrimaryKeySelective(account);
			}
			
			detail.setCashpledge(signbilldetail.getExpenditure());
			roomreservationdetailService.updateByPrimaryKeySelective(detail);
			int count = signbilldetailService.insertSelective(signbilldetail);
			if (count > 0) {
				return "redirect:/indentClientController/list.do";
			} else {
				return "/error/500";
			}
		} catch (Exception e) {
			return "/error/500";
		}
	}

	// 分配房间视图
	@RequestMapping("allotroomView")
	public String allotroomView(Integer[] ckValue) {
		List<Roomreservationdetail> detail = new ArrayList<Roomreservationdetail>();
		for (Integer id : ckValue) {
			Roomreservationdetail vo = roomreservationdetailService.findByPrimaryKey(id);
			detail.add(vo);
		}
		List<Rooms> rooms = roomsService.queryByStatus(2);//查询可租状态的房间
		List<Characteristic> characteristic = characteristicService.findAll();
		List<Floor> floor = floorService.findAll();
		model.addAttribute("rooms", rooms);
		model.addAttribute("characteristic", characteristic);
		model.addAttribute("floor", floor);
		model.addAttribute("detail", detail);
		return "/indentclient/allotroom";
		
	}

	// 分房界面查询房间
	@RequestMapping("queryRoomsByParam")
	public void queryRoomsByParam(Integer starnumber, Integer endnumber,
			Integer floorid, Integer floornumber, Integer orientation,
			String characteristic) {

		List<Rooms> rooms = roomsService.queryRoomsByParam(starnumber, endnumber, floorid,
				floornumber, orientation, characteristic);

		String result = JSONSerializer.toJSON(rooms).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	// 分房
	@RequestMapping("allotRoom")
	public String  allotRoom(Integer[] detailid,Integer[] roomsid){
		try {
			Roomreservationdetail detail = new Roomreservationdetail();
			Rooms rooms = new Rooms();
			for(int i=0;i<detailid.length;i++){
				detail.setDetailid(detailid[i]);
				detail.setRoomsid(roomsid[i]);
				rooms.setRoomsid(roomsid[i]);
				rooms.setRoomstatus(5);//设置房间状态为预订状态
				
				roomsService.updateByPrimaryKeySelective(rooms);
				roomreservationdetailService.updateByPrimaryKeySelective(detail);
			}
			return "redirect:/indentClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
	}
	
	// 取消分房
	@RequestMapping("cancelAllotRoom")
	public String cancelAllotRoom(Integer[] ckValue,Integer[] roomsid){
		try {
			Roomreservationdetail detail = new Roomreservationdetail();
			Rooms rooms = new Rooms();
			for(int i=0;i<ckValue.length;i++){
				detail.setDetailid(ckValue[i]);
				detail.setRoomsid(null);
				rooms.setRoomsid(roomsid[i]);
				rooms.setRoomstatus(2);//设置房间状态为空房
				
				roomreservationdetailService.alterByPrimaryKey(detail);
				roomsService.updateByPrimaryKeySelective(rooms);
				
			}
			return "redirect:/indentClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
		
	}
	
	// 客人入住
	@RequestMapping("Reside")
	public String Reside(Integer[] ckValue,Integer[] roomsid,String[] arrivedate){
		try {
			
			for(int i=0;i<ckValue.length;i++){
				Roomreservationdetail detail = new Roomreservationdetail();
				Rooms rooms = new Rooms();
				
				Date NowDate = DateUtil.getSysDateTime();
				Date arriveDate = DateUtil.StrToDate(arrivedate[i],DateUtil.YMD);
				if(arriveDate.getTime() > NowDate.getTime()){
					detail.setArrivedate(NowDate);
				}
				
				detail.setDetailid(ckValue[i]);
				detail.setRoomstatus(2);//设置订单房间状态为入住
				rooms.setRoomsid(roomsid[i]);
				rooms.setRoomstatus(1);//设置房间状态为现住
				
				roomreservationdetailService.updateByPrimaryKeySelective(detail);
				roomsService.updateByPrimaryKeySelective(rooms);
				
			}
			return "redirect:/indentClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
		
	}
	
	// 取消入住
	@RequestMapping("cancelReside")
	public String cancelReside(Integer[] ckValue,Integer[] roomsid){
		try {
			Roomreservationdetail detail = new Roomreservationdetail();
			Rooms rooms = new Rooms();
			for(int i=0;i<ckValue.length;i++){
				detail.setDetailid(ckValue[i]);
				//取消操作就是将订单房间状态改为预订状态
				detail.setRoomstatus(1);//设置订单房间状态为预订状态
				rooms.setRoomsid(roomsid[i]);
				rooms.setRoomstatus(5);//设置房间状态为锁房，即预订
				
				roomreservationdetailService.updateByPrimaryKeySelective(detail);
				roomsService.updateByPrimaryKeySelective(rooms);
				
			}
			return "redirect:/indentClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
		
	}
	
	//换房弹层界面
	@RequestMapping("changeRoomView")
	public String changeRoomView(Integer detailid){
		RoomReservationDetail detail = roomreservationdetailService.queryByDetailId(detailid);
		List<Roomtype> roomtype = roomtypeService.findAll();
		List<Rooms> rooms = roomsService.queryByStatus(2);//查询可租状态的房间
		
		model.addAttribute("detail", detail);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("rooms", rooms);
		return "/indentclient/changeroom";
	}
	
	//查询不同房价等级的房间信息
	@RequestMapping("queryByRoomTypeId")
	public void queryByRoomTypeId(Integer roomtypeid) {

		List<Rooms> rooms = roomsService.queryByRoomTypeId(roomtypeid);

		String result = JSONSerializer.toJSON(rooms).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//换房
	@RequestMapping("changeRoom")
	public String changeRoom(Roomreservationdetail detail,Integer oldroomsid){
		
		try {
			Rooms oldroom = new Rooms();
			oldroom.setRoomsid(oldroomsid);
			oldroom.setRoomstatus(2);//设置房间状态为空房
			
			Rooms newroom = new Rooms();
			newroom.setRoomsid(detail.getRoomsid());
			if(detail.getRoomstatus() == 1){  //判断当前客人订单状态
				newroom.setRoomstatus(5);//设置房间状态为预订
			}else{
				newroom.setRoomstatus(1);//设置房间状态为现住
			}
			
			roomreservationdetailService.changeRoom(detail, oldroom, newroom);
			
			return "redirect:/indentClientController/list.do";
			
		} catch (Exception e) {
			return "/error/500";
		}
	}

}