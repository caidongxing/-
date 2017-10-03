package com.hy.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Account;
import com.hy.po.Agreementclient;
import com.hy.po.Aignbilltemplate;
import com.hy.po.Characteristic;
import com.hy.po.Clientinfo;
import com.hy.po.Creditcard;
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
import com.hy.service.AgreementclientService;
import com.hy.service.AignbilltemplateService;
import com.hy.service.CharacteristicService;
import com.hy.service.ClientinfoService;
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
@RequestMapping("resideClientController")
public class ResideClientController extends BaseController {

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
	private RoomsService roomsService;
	@Autowired
	private SignbillService signbillService;
	@Autowired
	private SignbilldetailService signbilldetailService;
	@Autowired
	private TemplateandaccountbookService templateandaccountbookService;
	@Autowired
	private AccountService accountService;

	// 住店客人列表
	@RequestMapping("list")
	public String list(RoomReservationDetailParam detailParam,
			Page<RoomReservationDetail> page) {

		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		detailParam.setFirstResult(firstResult);
		detailParam.setPageSize(page.getPageSize());
		detailParam.setRoomstatus(2);// 设置默认查询状态，现住状态查询数据

		page = roomreservationdetailService.queryPage(detailParam, page);
		model.addAttribute("page", page);
		model.addAttribute("detailParam", detailParam);

		return "/resideclient/list";
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

		return "/resideclient/clientinfo";
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
			return "redirect:/resideClientController/list.do";
		} else {
			return "/error/500";
		}
	}

	// 换房弹层界面
	@RequestMapping("changeRoomView")
	public String changeRoomView(Integer detailid) {
		RoomReservationDetail detail = roomreservationdetailService
				.queryByDetailId(detailid);
		List<Roomtype> roomtype = roomtypeService.findAll();
		List<Rooms> rooms = roomsService.queryByStatus(2);// 查询可租状态的房间

		model.addAttribute("detail", detail);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("rooms", rooms);
		return "/resideclient/changeroom";
	}

	// 换房
	@RequestMapping("changeRoom")
	public String changeRoom(Roomreservationdetail detail, Integer oldroomsid) {

		try {
			Rooms oldroom = new Rooms();
			oldroom.setRoomsid(oldroomsid);
			oldroom.setRoomstatus(2);// 设置房间状态为空房

			Rooms newroom = new Rooms();
			newroom.setRoomsid(detail.getRoomsid());
			if (detail.getRoomstatus() == 1) { // 判断当前客人订单状态
				newroom.setRoomstatus(5);// 设置房间状态为预订
			} else {
				newroom.setRoomstatus(1);// 设置房间状态为现住
			}

			roomreservationdetailService.changeRoom(detail, oldroom, newroom);

			return "redirect:/resideClientController/list.do";

		} catch (Exception e) {
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

		return "/resideclient/allotaccount";
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
			return "redirect:/resideClientController/list.do";
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
		return "/resideclient/cashpledge";
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
				return "redirect:/resideClientController/list.do";
			} else {
				return "/error/500";
			}
		} catch (Exception e) {
			return "/error/500";
		}
	}

	// 延住视图
	@RequestMapping("extendedStayView")
	public String extendedStayView(Integer detailid) {
		RoomReservationDetail detail = roomreservationdetailService
				.queryByDetailId(detailid);
		// 延住新离店日期默认在旧离店日期上加一天
		Date newleavedate = DateUtil.AddDate(detail.getLeavedate(), 1);
		model.addAttribute("newleavedate", newleavedate);
		model.addAttribute("detail", detail);
		return "/resideclient/extendedstay";
	}

	// 单一延住
	@RequestMapping("extendedStay")
	public String extendedStay(Roomreservationdetail detail) {
		try {
			roomreservationdetailService.updateByPrimaryKeySelective(detail);
			return "redirect:/resideClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
	}

	// 多人延住
	@RequestMapping("manyExtendedStay")
	public String manyExtendedStay(Integer[] ckValue) {
		try {

			for (Integer id : ckValue) {
				Roomreservationdetail detail = roomreservationdetailService
						.selectByPrimaryKey(id);
				// 延住新离店日期默认在旧离店日期上加一天
				Date newleavedate = DateUtil.AddDate(detail.getLeavedate(), 1);
				detail.setDetailid(id);
				detail.setLeavedate(newleavedate);
				roomreservationdetailService
						.updateByPrimaryKeySelective(detail);
			}
			return "redirect:/resideClientController/list.do";
		} catch (Exception e) {
			e.printStackTrace();
			return "/error/500";
		}
	}

	// 调价视图
	@RequestMapping("adjustPriceView")
	public String adjustPriceView(Integer detailid) {
		RoomReservationDetail detail = roomreservationdetailService
				.queryByDetailId(detailid);
		model.addAttribute("detail", detail);
		return "/resideclient/adjustprice";
	}

	// 单一调价
	@RequestMapping("adjustPrice")
	public String adjustPrice(Roomreservationdetail detail) {
		try {
			roomreservationdetailService.updateByPrimaryKeySelective(detail);
			return "redirect:/resideClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
	}

	// 批量调价
	@RequestMapping("manyAdjustPrice")
	public String manyAdjustPrice(Integer[] ckValue, BigDecimal floatMoney,
			BigDecimal floatRatio) {
		try {
			for (Integer id : ckValue) {
				Roomreservationdetail detail = roomreservationdetailService
						.selectByPrimaryKey(id);

				if (floatMoney != null && floatRatio != null) {
					// 加减计算调价
					Double d = Math.ceil(detail.getRealprice().add(floatMoney)
							.doubleValue());
					detail.setRealprice(new BigDecimal(d));
				} else if (floatMoney != null) {
					// 加减计算调价
					Double d = Math.ceil(detail.getRealprice().add(floatMoney)
							.doubleValue());
					detail.setRealprice(new BigDecimal(d));
				} else {
					// 比例计算调价
					// 计算后的浮动比例：（100 - 浮动比例）/ 100 = 小数
					BigDecimal Ratio = (new BigDecimal(100)
							.subtract(floatRatio)).divide(new BigDecimal(100));
					// 原房价 * 计算后的浮动比例 = 新房价
					Double d = Math.ceil(detail.getRealprice().multiply(Ratio)
							.doubleValue());
					detail.setRealprice(new BigDecimal(d));
				}
				detail.setDetailid(id);
				roomreservationdetailService
						.updateByPrimaryKeySelective(detail);
			}
			return "redirect:/resideClientController/list.do";
		} catch (Exception e) {
			e.printStackTrace();
			return "/error/500";
		}
	}
	
	//消费挂账视图
	@RequestMapping("expenseView")
	public String expenseView(Integer detailid, Integer accountid) {
		Roomreservationdetail detail = roomreservationdetailService.selectByPrimaryKey(detailid);
		List<Signbill> signbill = signbillService.findByForeignKey(accountid);
		model.addAttribute("detail", detail);
		model.addAttribute("signbill", signbill);
		return "/resideclient/expense";
	}
	
	//消费挂账
	@RequestMapping("expense")
	public String expense(Signbilldetail signbilldetail) {
		try {
			signbilldetailService.insertSelective(signbilldetail);
		    return "redirect:/resideClientController/list.do";
		} catch (Exception e) {
			return "/error/500";
		}
	}
	
}
