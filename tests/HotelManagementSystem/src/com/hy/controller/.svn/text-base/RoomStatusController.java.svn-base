package com.hy.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONSerializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hy.page.Page;
import com.hy.po.Aignbilltemplate;
import com.hy.po.Characteristic;
import com.hy.po.Clientinfo;
import com.hy.po.Floor;
import com.hy.po.Nohireroom;
import com.hy.po.Roomreservation;
import com.hy.po.Roomreservationdetail;
import com.hy.po.Rooms;
import com.hy.po.Roomtype;
import com.hy.po.Signbilldetail;
import com.hy.service.AignbilltemplateService;
import com.hy.service.CharacteristicService;
import com.hy.service.FloorService;
import com.hy.service.NohireroomService;
import com.hy.service.RoomreservationdetailService;
import com.hy.service.RoomsService;
import com.hy.service.RoomtypeService;
import com.hy.service.SignbilldetailService;
import com.hy.vo.RoomReservationDetail;

@Controller
@RequestMapping("roomStatusController")
public class RoomStatusController extends BaseController {

	@Autowired
	private FloorService floorService;
	@Autowired
	private RoomsService roomsService;
	@Autowired
	private CharacteristicService characteristicService;
	@Autowired
	private RoomtypeService roomtypeService;
	@Autowired
	private RoomreservationdetailService roomreservationdetailService;
	@Autowired
	private SignbilldetailService signbilldetailService;
	@Autowired
	private AignbilltemplateService aignbilltemplateService;
	@Autowired
	private NohireroomService nohireroomService;
	
	@RequestMapping("list")
	public String list(){
		try {
			List<Rooms> rooms = roomsService.findAll();
			List<Floor> floors = floorService.findAll();
			model.addAttribute("rooms", rooms);
			model.addAttribute("floors", floors);
			
			return "/roomstatus/list";
		} catch (Exception e) {
			System.out.println(e);
			return "/error/500";
		}
		
	}
	
	@RequestMapping("queryByParam")
	public String queryByParam(String roomnumber,int floorid,int floornumber){
		try {
			List<Rooms> rooms = roomsService.queryByParam(roomnumber, floorid, floornumber);
			List<Floor> floors = floorService.findAll();
			
			model.addAttribute("rooms", rooms);
			model.addAttribute("floors", floors);
			
			model.addAttribute("roomnumber", roomnumber);
			model.addAttribute("floorid", floorid);
			model.addAttribute("floornumber", floornumber);
			
			return "/roomstatus/list";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
		
	}
	
	@RequestMapping("queryByStatus")
	public String queryByStatus(int roomstatus){
		try {
			List<Rooms> rooms = roomsService.queryByStatus(roomstatus);
			List<Floor> floors = floorService.findAll();
			model.addAttribute("rooms", rooms);
			model.addAttribute("floors", floors);
			
			return "/roomstatus/list";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
	}
	
	@RequestMapping("addView")
	public String addView(){
		try {
			List<Floor> floors = floorService.findAll();
			List<Characteristic> characteristics = characteristicService.findAll();
			List<Roomtype> roomtypes = roomtypeService.findAll();
			model.addAttribute("floors", floors);
			model.addAttribute("characteristics", characteristics);
			model.addAttribute("roomtypes", roomtypes);
			
			return "/roomstatus/add";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
		
	}
	
	@RequestMapping("save")
	public String save(Rooms rooms,int roomsnumber) throws Exception{
		int count = 0;
		for(int i = 1;i <= roomsnumber;i++){
			String roomnumber = rooms.getFloornumber().toString() + rooms.getFloornumber() + (i > 9 ? i : "0"+ i);
			rooms.setRoomnumber(Integer.parseInt(roomnumber));
			count = roomsService.insert(rooms);
		}
		if(count > 0){
			list();
			return "/roomstatus/list";
		}else{
			return "/error/500";
		}
	}
	
	@RequestMapping("updateView")
	public String updateView(int roomsid){
		try {
			List<Floor> floors = floorService.findAll();
			List<Characteristic> characteristics = characteristicService.findAll();
			List<Roomtype> roomtypes = roomtypeService.findAll();
			Rooms rooms = roomsService.selectByPrimaryKey(roomsid);
			
			model.addAttribute("floors", floors);
			model.addAttribute("characteristics", characteristics);
			model.addAttribute("roomtypes", roomtypes);
			model.addAttribute("rooms", rooms);
			
			return "/roomstatus/update";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
	}
	
	@RequestMapping("update")
	public String update(Rooms rooms) throws Exception{
		
		int count = roomsService.updateByPrimaryKeySelective(rooms);
		
		if(count > 0){
			list();
			return "/roomstatus/list";
		}else{
			return "/error/500";
		}
	}
	
	@RequestMapping("delete")
	public String delete(Integer roomsid) throws Exception{
		try {
			roomsService.deleteByPrimaryKey(roomsid);
			list();
			return "/roomstatus/list";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return "/error/500";
		}
		
	}
	
	@RequestMapping("selectById")
	public void selectById(Integer id) throws Exception{
		Floor floor = floorService.selectByPrimaryKey(id);
		String result = JSONSerializer.toJSON(floor).toString();
		response.getWriter().write(result);
	}
	
	//房间信息
	@RequestMapping("tenementInfoView")
	public String tenementInfoView(Integer roomsid,Integer roomstatus) throws Exception{
		try {
			RoomReservationDetail detail = roomreservationdetailService.queryByRoomsId(roomsid, roomstatus);
			Rooms rooms = roomsService.queryRoomsByRoomsId(detail.getRoomsid());
			
			//消费总金额
			BigDecimal expenditure = new BigDecimal(0.00);
			if(detail.getAccountid() != null){
				List<Signbilldetail> vo = signbilldetailService.findByAccountId(detail.getAccountid());
				
				for (Signbilldetail sd : vo) {
					expenditure = sd.getExpenditure().add(expenditure);
				}
			}
			
			model.addAttribute("detail", detail);
			model.addAttribute("rooms", rooms);
			model.addAttribute("expenditure", expenditure);
			return "/roomstatus/tenementinfo";
		} catch (Exception e) {
			e.printStackTrace();
			return "出错了！";
		}
	}
	
	//开房视图
	@RequestMapping("openHouseView")
	public String openHouseView(Integer roomsid){
		List<Aignbilltemplate> aignbilltemplate = aignbilltemplateService.findAll();
		List<Roomtype> roomtype = roomtypeService.findAll();
		Rooms rooms = roomsService.selectByPrimaryKey(roomsid);
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String reservationnumber = dateFormat.format(now);
		
		model.addAttribute("aignbilltemplate", aignbilltemplate);
		model.addAttribute("roomtype", roomtype);
		model.addAttribute("rooms", rooms);
		model.addAttribute("reservationnumber", reservationnumber);//订单编号
		return "/roomstatus/openhouse";
	}
	
	@RequestMapping("selectByRoomsId")
	public void selectByRoomsId(Integer roomsid) throws Exception{
		Rooms rooms = roomsService.selectByPrimaryKey(roomsid);
		String result = JSONSerializer.toJSON(rooms).toString();
		response.getWriter().write(result);
	}
	
	//开房
	@RequestMapping("openHouse")
	public String openHouse(Roomreservation roomreservation,
			Roomreservationdetail roomreservationdetail, Clientinfo clientinfo){
		try {
			roomsService.openHouse(roomreservation, roomreservationdetail, clientinfo);
			return "redirect:/roomStatusController/list.do";
		} catch (Exception e) {
			e.printStackTrace();
			return "/error/500";
		}
	}
	
	
	//非出租房list界面
	@RequestMapping("nohireList")
	public String nohireList(int roomstatus,Integer starnumber, Integer endnumber, Page<Nohireroom> page){
		nohirequeryPage(roomstatus,starnumber,endnumber,page);
		return "/nohireroom/list";
	}
	
	//维修房list界面
	@RequestMapping("maintainList")
	public String maintainList(int roomstatus,Integer starnumber, Integer endnumber, Page<Nohireroom> page){
		nohirequeryPage(roomstatus,starnumber,endnumber,page);
		return "/maintainroom/list";
	}
	
	public void nohirequeryPage(int roomstatus,Integer starnumber, Integer endnumber, Page<Nohireroom> page){
		page = nohireroomService.queryPage(roomstatus, starnumber, endnumber, page);
		model.addAttribute("page", page);
		model.addAttribute("starnumber", starnumber);
		model.addAttribute("endnumber", endnumber);
	}
	
	//非出租房新增界面
	@RequestMapping("nohireAddView")
	public String nohireAddView(){
		
		List<Rooms> rooms = roomsService.queryByStatus(2);//查询可租状态的房间
		model.addAttribute("rooms", rooms);
		model.addAttribute("Total", rooms.size());
		return "/nohireroom/add";
	}
	
	//非出租房新增
	@RequestMapping("nohireAdd")
	public String nohireAdd(Nohireroom nohireroom,Integer[] ckValue){
		nohireroom.setStatus(4);//设置状态为非出租
		Rooms room = new Rooms();
		for (Integer ck : ckValue) {
			nohireroom.setRoomsid(ck);
			room.setRoomsid(ck);
			room.setRoomstatus(4);//设置房间状态为非出租
			roomsService.updateByPrimaryKeySelective(room);
			nohireroomService.insertSelective(nohireroom);
		}
		return "redirect:/roomStatusController/nohireList.do?roomstatus=4";
	}
	
	//非出租房修改视图
	@RequestMapping("nohireUpdateView")
	public String nohireUpdateView(Integer nohireroomid){
		Nohireroom nohireroom = nohireroomService.findByPrimaryKey(nohireroomid);
		model.addAttribute("nohireroom", nohireroom);
		return "/nohireroom/update";
	}
	//非出租房修改
	@RequestMapping("nohireUpdate")
	public String nohireUpdate(Nohireroom nohireroom){
		Rooms room = new Rooms();
		room.setRoomsid(nohireroom.getRoomsid());
		room.setRoomstatus(nohireroom.getStatus());//设置房间状态为非出租状态
		roomsService.updateByPrimaryKeySelective(room);
		nohireroomService.updateByPrimaryKeySelective(nohireroom);
		return "redirect:/roomStatusController/nohireList.do?roomstatus=4";
	}
	
	//非出租房完成
	@RequestMapping("accomplish")
	public String accomplish(Integer[] ckValue){
		Rooms room = new Rooms();
		for (Integer ck : ckValue) {
			Nohireroom nohireroom = nohireroomService.findByPrimaryKey(ck);
			room.setRoomsid(nohireroom.getRoomsid());
			room.setRoomstatus(2);//设置房间状态为可出租状态
			nohireroom.setStatus(2);//设置状态为可出租状态
			roomsService.updateByPrimaryKeySelective(room);
			nohireroomService.updateByPrimaryKeySelective(nohireroom);
		}
		return "redirect:/roomStatusController/nohireList.do?roomstatus=4";
	}
	
	//维修租房新增界面
	@RequestMapping("maintainroomAddView")
	public String maintainroomAddView(){
		
		List<Rooms> rooms = roomsService.queryByStatus(2);//查询可租状态的房间
		model.addAttribute("rooms", rooms);
		model.addAttribute("Total", rooms.size());
		return "/maintainroom/add";
	}
	
	//维修租房新增
	@RequestMapping("maintainroomAdd")
	public String maintainroomAdd(Nohireroom nohireroom,Integer[] ckValue){
		nohireroom.setStatus(3);//设置状态为维修
		Rooms room = new Rooms();
		for (Integer ck : ckValue) {
			nohireroom.setRoomsid(ck);
			room.setRoomsid(ck);
			room.setRoomstatus(3);//设置房间状态为维修
			roomsService.updateByPrimaryKeySelective(room);
			nohireroomService.insertSelective(nohireroom);
		}
		return "redirect:/roomStatusController/maintainList.do?roomstatus=3";
	}
	
	//维修房修改视图
	@RequestMapping("maintainroomUpdateView")
	public String maintainroomUpdateView(Integer nohireroomid){
		Nohireroom nohireroom = nohireroomService.findByPrimaryKey(nohireroomid);
		model.addAttribute("nohireroom", nohireroom);
		return "/maintainroom/update";
	}
	
	//维修房修改
	@RequestMapping("maintainroomUpdate")
	public String maintainroomUpdate(Nohireroom nohireroom){
		Rooms room = new Rooms();
		room.setRoomsid(nohireroom.getRoomsid());
		room.setRoomstatus(nohireroom.getStatus());//设置房间状态为非出租状态
		roomsService.updateByPrimaryKeySelective(room);
		nohireroomService.updateByPrimaryKeySelective(nohireroom);
		return "redirect:/roomStatusController/maintainList.do?roomstatus=3";
	}
	
	//维修房完成
	@RequestMapping("maintainAccomplish")
	public String maintainAccomplish(Integer[] ckValue){
		
		Rooms room = new Rooms();
		for (Integer ck : ckValue) {
			Nohireroom nohireroom = nohireroomService.findByPrimaryKey(ck);
			room.setRoomsid(nohireroom.getRoomsid());
			room.setRoomstatus(2);//设置房间状态为可出租状态
			nohireroom.setStatus(2);//设置状态为可出租状态
			roomsService.updateByPrimaryKeySelective(room);
			nohireroomService.updateByPrimaryKeySelective(nohireroom);
		}
		return "redirect:/roomStatusController/maintainList.do?roomstatus=3";
	}
	
	
}
