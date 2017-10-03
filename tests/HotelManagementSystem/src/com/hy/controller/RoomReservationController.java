package com.hy.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Agreementclient;
import com.hy.po.Aignbilltemplate;
import com.hy.po.Characteristic;
import com.hy.po.Clientinfo;
import com.hy.po.Creditcard;
import com.hy.po.Membercard;
import com.hy.po.Otherinfo;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Roomtype;
import com.hy.po.Salesman;
import com.hy.po.Team;
import com.hy.po.User;
import com.hy.service.AgreementclientService;
import com.hy.service.AignbilltemplateService;
import com.hy.service.CharacteristicService;
import com.hy.service.ClientinfoService;
import com.hy.service.CreditcardService;
import com.hy.service.MembercardService;
import com.hy.service.OtherinfoService;
import com.hy.service.RoomreservationService;
import com.hy.service.RoomreservationdetailService;
import com.hy.service.RoomsService;
import com.hy.service.RoomtypeService;
import com.hy.service.SalesmanService;
import com.hy.service.TeamService;
import com.hy.service.UserService;
import com.hy.util.DateUtil;
import com.hy.util.JsonDateValueProcessor;
import com.hy.vo.OtherInfo;
import com.hy.vo.RoomReservation;
import com.hy.vo.RoomReservationVo;
import com.hy.vo.RoomsTotal;
import com.hy.vo.RoomsTotalParam;
import com.hy.vo.SurplusRooms;

@Controller
@RequestMapping("roomReservationController")
public class RoomReservationController extends BaseController {

	@Autowired
	private RoomsService roomsService;
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
	private MembercardService membercardService;
	@Autowired
	private CreditcardService creditcardService;
	@Autowired
	private UserService userService;
	@Autowired
	private OtherinfoService otherinfoService;
	
	@RequestMapping("view")
	public String view() {

		List<String> datetime = new ArrayList<String>();
		
		RoomsTotalParam roomsTotalParam = new RoomsTotalParam();
		for (int i = 0; i < 7; i++) {
			Date dt = DateUtil.AddDate(new Date(), i);
			Calendar calendar = Calendar.getInstance();  
			calendar.setTime(dt);
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH) + 1;
			int date = calendar.get(Calendar.DATE);
			String week = DateUtil.getWeekOfDate(dt);
			String d = (month > 9 ? month : "0" + month) + "-"
					+ (date > 9 ? date : "0" + date) + week;
			
			String DateTime = year + "-" + (month > 9 ? month : "0" + month) + "-"
					+ (date > 9 ? date : "0" + date);
			datetime.add(d);
			
			switch (i) {
			case 0:
				roomsTotalParam.setOnedate(DateTime);
				break;
			case 1:
				roomsTotalParam.setTwodate(DateTime);
				break;	
			case 2:
				roomsTotalParam.setThreedate(DateTime);
				break;
			case 3:
				roomsTotalParam.setFourdate(DateTime);
				break;
			case 4:
				roomsTotalParam.setFivedate(DateTime);
				break;
			case 5:
				roomsTotalParam.setSixdate(DateTime);
				break;
			case 6:
				roomsTotalParam.setSevendate(DateTime);
				break;
			}
		}
		
		List<RoomsTotal> roomstotal = roomsService.queryRoomsTotal(roomsTotalParam);

		model.addAttribute("roomstotal", roomstotal);
		model.addAttribute("datetime", datetime);
		return "/roomreservation/view";
	}

	@RequestMapping("list")
	public String list(RoomReservation roomReservation,
			Page<RoomReservationVo> page) {

		int firstResult = ((page.getCurrentPage() - 1) * page.getPageSize());
		roomReservation.setFirstResult(firstResult);
		roomReservation.setPageSize(page.getPageSize());
		
		

		page = roomreservationService.queryPage(roomReservation, page);
		List<User> user = userService.findAll();
		
		model.addAttribute("page", page);
		model.addAttribute("user", user);
		model.addAttribute("roomReservation", roomReservation);
		
		return "/roomreservation/list";
	}

	@RequestMapping("addView")
	public String addView(Integer roomtypeid,String arrivedate,String tenantablenumber) {

		List<Salesman> salesman = salesmanService.findAll();
		List<Characteristic> characteristic = characteristicService.findAll();
		List<Aignbilltemplate> aignbilltemplate = aignbilltemplateService.findAll();
		List<Roomtype> roomtype = roomtypeService.findAll();
		List<Agreementclient> agreementclient = agreementclientService.findAll();
		List<Team> team = teamService.findAll();
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String reservationnumber = dateFormat.format(now);
		model.addAttribute("salesman", salesman);
		model.addAttribute("characteristic", characteristic);
		model.addAttribute("aignbilltemplate", aignbilltemplate);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("agreementclient", agreementclient);//协议客户
		model.addAttribute("team", team);//团会
		model.addAttribute("reservationnumber", reservationnumber);//预订单号
		model.addAttribute("roomtypeid", roomtypeid);//房间类型id
		model.addAttribute("arrivedate", arrivedate);//到店时间
		model.addAttribute("tenantablenumber", tenantablenumber);//可租房数
		return "/roomreservation/add";
	}

	@RequestMapping("save")
	public String save(Roomreservation roomreservation,
			Roomreservationdetail roomreservationdetail, Clientinfo clientinfo,
			Otherinfo otherinfo, Creditcard creditcard,
			Membercard membercard){
		try {
			
			 int coutn =  roomreservationService.saveRoomReservation(roomreservation, roomreservationdetail, clientinfo, otherinfo, creditcard, membercard);
			 if(coutn <= 0){
					throw new Exception("新增异常。");
			}
			 
			 selectDetail(roomreservation.getRoomreservationid());//查询预订单明细信息
			 
		     model.addAttribute("roomreservationid", roomreservation.getRoomreservationid());
			
		     return "/roomreservation/detail";
		     
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
		
	}
	
	//取消订单
	@RequestMapping("abolish")
	public String abolish(Integer roomreservationid,Integer certigierid,String reason){
		Roomreservation vo = new Roomreservation();
		vo.setRoomreservationid(roomreservationid);
		vo.setCertigierid(certigierid);
		vo.setReason(reason);
		vo.setReservationstatus(3);
		
		roomreservationService.abolishRoomReservation(vo, roomreservationid, 3);
		
		return "redirect:/roomReservationController/list.do";
	}
	
	//复制订单界面
    @RequestMapping("copyindentView")
	public String copyindentView(Integer id){
    	Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String reservationnumber = dateFormat.format(now);
		RoomReservationVo vo =  roomreservationService.findByPrimaryKey(id);
		vo.setReservationnumber(reservationnumber);
		
		List<Team> team = teamService.findAll();
		model.addAttribute("team", team);
		model.addAttribute("vo", vo);
		
		return "/roomreservation/copyindent";
    }
	
    //复制订单操作
    @RequestMapping("copyindent")
	public String copyindent(RoomReservationVo vo,Clientinfo clientinfo){
    	
    	Roomreservation roomreservation =  roomreservationService.selectByPrimaryKey(vo.getRoomreservationid());
    	roomreservation.setReservationnumber(vo.getReservationnumber());
    	roomreservation.setReservationstatus(1);//默认订单状态为预订
    	Otherinfo otherinfo = otherinfoService.selectByPrimaryKey(vo.getOtherinfoid());
    	Roomreservationdetail roomreservationdetail = new Roomreservationdetail();
    	roomreservationdetail.setArrivedate(vo.getArrivedate());
    	roomreservationdetail.setLeavedate(vo.getLeavedate());
    	roomreservationdetail.setRoomtype(2);//默认房间类型
    	roomreservationdetail.setRoomnumber(1);//默认房数
    	roomreservationdetail.setFreebed(0);
    	roomreservationdetail.setAdult(1);//默认人数
    	roomreservationdetail.setChildren(0);
    	roomreservationdetail.setRoomstatus(1);//默认房态为预订
    	int count = roomreservationService.copyIndent(roomreservation, roomreservationdetail, clientinfo, otherinfo);
    	if(count > 0){
    		return "redirect:/roomReservationController/list.do";
    	}else {
    		return "/error/500";
		}
    }
    
    //预订单修改界面
    @RequestMapping("updateView")
	public String updateView(Integer id){
    	Roomreservation roomreservation =  roomreservationService.selectByPrimaryKey(id);
    	OtherInfo otherinfo = otherinfoService.findByForeignKey(id);
    	
    	
    	
    	List<Salesman> salesman = salesmanService.findAll();
		List<Aignbilltemplate> aignbilltemplate = aignbilltemplateService.findAll();
		List<Agreementclient> agreementclient = agreementclientService.findAll();
		List<Team> team = teamService.findAll();
		
		 selectDetail(id);//查询预订单明细信息
		 model.addAttribute("roomreservation", roomreservation);
		 
		 model.addAttribute("salesman", salesman);//销售员
		 model.addAttribute("aignbilltemplate", aignbilltemplate);//签单模板
		 model.addAttribute("agreementclient", agreementclient);//协议客户
		 model.addAttribute("team", team);//团会
		 
		 model.addAttribute("otherinfo", otherinfo);//其他信息
    	
    	return "/roomreservation/update";
    }
    
    //预定明细修改界面
    @RequestMapping("detailupdateView")
	public String detailupdateView(Integer id){
    	
    	Roomreservationdetail detail = roomreservationdetailService.selectByPrimaryKey(id);
    	List<Characteristic> characteristic = characteristicService.findAll();
    	List<Roomtype> roomtype = roomtypeService.findAll();
    	
    	model.addAttribute("detail", detail);
    	model.addAttribute("roomtype", roomtype);
    	model.addAttribute("characteristic", characteristic);
    	return "/roomreservation/detailupdate";
    }
    
    //预定明细修改
    @RequestMapping("detailupdate")
	public String detailupdate(Roomreservationdetail roomreservationdetail){
    	
    	int count = roomreservationdetailService.updateByPrimaryKeySelective(roomreservationdetail);
    	if(count > 0){
    		selectDetail(roomreservationdetail.getRoomreservationid());//查询预订单明细信息
    		
    		model.addAttribute("roomreservationid", roomreservationdetail.getRoomreservationid());
		 return "/roomreservation/detail";
    	
    	}else {
    		return "/error/500";
		}
    }
    
    //预定明细删除
    @RequestMapping("detaildelete")
	public String detaildelete(Integer roomreservationid,Integer detailid){
    	
    	int count = roomreservationdetailService.deleteByPrimaryKey(detailid);
    	if(count > 0){
    		selectDetail(roomreservationid);//查询预订单明细信息
    		model.addAttribute("roomreservationid", roomreservationid);
        	return "/roomreservation/detail";
    	}else {
    		return "/error/500";
		}
    	
    }
    
    //查询预订单明细信息
    public void selectDetail(Integer id){
    	
    	 List<Roomreservationdetail> detail = roomreservationdetailService.findByForeignKey(id);
  	     Integer roomnumber = 0;
	     Integer freebed = 0;
	     Integer adult = 0;
	     Integer children = 0;
		 for(int i = 0;i < detail.size();i++){
			 roomnumber += detail.get(i).getRoomnumber();
			 freebed += detail.get(i).getFreebed();
			 adult += detail.get(i).getAdult();
			 children += detail.get(i).getChildren();
	     }
		 model.addAttribute("roomnumber", roomnumber);
		 model.addAttribute("freebed", freebed);
		 model.addAttribute("adult", adult);
		 model.addAttribute("children", children);
		 model.addAttribute("count", detail.size());
		 model.addAttribute("detail", detail);
    }
    //修改预订单
    @RequestMapping("update")
	public String update(Roomreservation roomreservation,Otherinfo otherinfo, Creditcard creditcard,
			Membercard membercard){
    	
    	int count = roomreservationService.updateRoomReservation(roomreservation, otherinfo, creditcard, membercard);
    	if(count > 0){
    		return "redirect:/roomReservationController/list.do";
    	}else {
    		return "/error/500";
		}
    	
    }
    
	@RequestMapping("findAll")
	public void findAll(String name) {
		List<Roomreservationdetail> vo = roomreservationdetailService.findAll();
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		
		String result = JSONArray.fromObject(vo,jsonConfig).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@RequestMapping("findByParam")
	public void findByParam(String name) {
	
		List<Clientinfo> vo = clientinfoService.findByParam(name);
		String result = JSONArray.fromObject(vo).toString();
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@RequestMapping("findBymembershipcardNumber")
	public void findBymembershipcardNumber(String Number) {
		List<Membercard> vo = membercardService.findByNumber(Number);
		String result = JSONArray.fromObject(vo).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	@RequestMapping("findBycreditcardnumber")
	public void findBycreditcardnumber(String Number) {
		List<Creditcard> vo = creditcardService.fiindByNumber(Number);

		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());

		String result = JSONArray.fromObject(vo, jsonConfig).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@RequestMapping("findSurplusRooms")
	public void findSurplusRooms(String arrivedate,Integer roomtypeid) {
		SurplusRooms vo = roomsService.findSurplusRooms(arrivedate, roomtypeid);

		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());

		String result = JSONArray.fromObject(vo, jsonConfig).toString();
		try {
			response.getWriter().write(result);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
