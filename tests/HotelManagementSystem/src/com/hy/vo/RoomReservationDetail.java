package com.hy.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class RoomReservationDetail{
 
	private Integer detailid;

    private Integer reservationtype;

    private String choosehouseclaim;

    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date arrivedate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date leavedate;

    private Integer packageid;

    private Integer roomtype;

    private Integer tenantablenumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date obligateroomdate;

    private Integer roompricecodeid;

    private BigDecimal realprice;

    private BigDecimal standardprice;

    private Integer currencytype;

    private Integer roomnumber;

    private Integer freebed;

    private Integer adult;

    private Integer children;

    private String comment;

    private Integer roomreservationid;

    private Integer accountid;

    private Integer payway;

    private BigDecimal cashpledge;

    private Integer mainroomid;

    private Integer roomstatus;

    private Integer roomsid;

    private Integer clientinfoid;

    
    //扩展字段
    private String reservationnumber;
    private String teamname;
    private String agreementclientname;
    private String roommark;
    private String chinesename;
    private BigDecimal accountbalance;
    private String roomtypename;
    private Integer sex;
    private String idnumber;
    
    
    
	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getRoomtypename() {
		return roomtypename;
	}

	public void setRoomtypename(String roomtypename) {
		this.roomtypename = roomtypename;
	}

	public BigDecimal getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(BigDecimal accountbalance) {
		this.accountbalance = accountbalance;
	}

	public String getReservationnumber() {
		return reservationnumber;
	}

	public void setReservationnumber(String reservationnumber) {
		this.reservationnumber = reservationnumber;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getAgreementclientname() {
		return agreementclientname;
	}

	public void setAgreementclientname(String agreementclientname) {
		this.agreementclientname = agreementclientname;
	}

	public String getRoommark() {
		return roommark;
	}

	public void setRoommark(String roommark) {
		this.roommark = roommark;
	}

	public String getChinesename() {
		return chinesename;
	}

	public void setChinesename(String chinesename) {
		this.chinesename = chinesename;
	}

	public Integer getDetailid() {
		return detailid;
	}

	public void setDetailid(Integer detailid) {
		this.detailid = detailid;
	}

	public Integer getReservationtype() {
		return reservationtype;
	}

	public void setReservationtype(Integer reservationtype) {
		this.reservationtype = reservationtype;
	}

	public String getChoosehouseclaim() {
		return choosehouseclaim;
	}

	public void setChoosehouseclaim(String choosehouseclaim) {
		this.choosehouseclaim = choosehouseclaim;
	}

	public Date getArrivedate() {
		return arrivedate;
	}

	public void setArrivedate(Date arrivedate) {
		this.arrivedate = arrivedate;
	}

	public Date getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}

	public Integer getPackageid() {
		return packageid;
	}

	public void setPackageid(Integer packageid) {
		this.packageid = packageid;
	}

	public Integer getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(Integer roomtype) {
		this.roomtype = roomtype;
	}

	public Integer getTenantablenumber() {
		return tenantablenumber;
	}

	public void setTenantablenumber(Integer tenantablenumber) {
		this.tenantablenumber = tenantablenumber;
	}

	public Date getObligateroomdate() {
		return obligateroomdate;
	}

	public void setObligateroomdate(Date obligateroomdate) {
		this.obligateroomdate = obligateroomdate;
	}

	public Integer getRoompricecodeid() {
		return roompricecodeid;
	}

	public void setRoompricecodeid(Integer roompricecodeid) {
		this.roompricecodeid = roompricecodeid;
	}

	public BigDecimal getRealprice() {
		return realprice;
	}

	public void setRealprice(BigDecimal realprice) {
		this.realprice = realprice;
	}

	public BigDecimal getStandardprice() {
		return standardprice;
	}

	public void setStandardprice(BigDecimal standardprice) {
		this.standardprice = standardprice;
	}

	public Integer getCurrencytype() {
		return currencytype;
	}

	public void setCurrencytype(Integer currencytype) {
		this.currencytype = currencytype;
	}

	public Integer getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(Integer roomnumber) {
		this.roomnumber = roomnumber;
	}

	public Integer getFreebed() {
		return freebed;
	}

	public void setFreebed(Integer freebed) {
		this.freebed = freebed;
	}

	public Integer getAdult() {
		return adult;
	}

	public void setAdult(Integer adult) {
		this.adult = adult;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getRoomreservationid() {
		return roomreservationid;
	}

	public void setRoomreservationid(Integer roomreservationid) {
		this.roomreservationid = roomreservationid;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getPayway() {
		return payway;
	}

	public void setPayway(Integer payway) {
		this.payway = payway;
	}

	public BigDecimal getCashpledge() {
		return cashpledge;
	}

	public void setCashpledge(BigDecimal cashpledge) {
		this.cashpledge = cashpledge;
	}

	public Integer getMainroomid() {
		return mainroomid;
	}

	public void setMainroomid(Integer mainroomid) {
		this.mainroomid = mainroomid;
	}

	public Integer getRoomstatus() {
		return roomstatus;
	}

	public void setRoomstatus(Integer roomstatus) {
		this.roomstatus = roomstatus;
	}

	public Integer getRoomsid() {
		return roomsid;
	}

	public void setRoomsid(Integer roomsid) {
		this.roomsid = roomsid;
	}

	public Integer getClientinfoid() {
		return clientinfoid;
	}

	public void setClientinfoid(Integer clientinfoid) {
		this.clientinfoid = clientinfoid;
	}
    
    
    
	
}