package com.hy.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Settleaccounts {
    private Integer settleaccountsid;

    private Integer detailid;

    private String operator;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date settleaccountstime;

    private BigDecimal payable;
    
    private Integer payway;

    private String comment;
    
    
    //扩展字段
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date arrivedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date leavedate;
    private BigDecimal realprice;
    private String roomnumber;
    private String chinesename;
    private String idnumber;

    
    
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

	public BigDecimal getRealprice() {
		return realprice;
	}

	public void setRealprice(BigDecimal realprice) {
		this.realprice = realprice;
	}

	public String getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}

	public String getChinesename() {
		return chinesename;
	}

	public void setChinesename(String chinesename) {
		this.chinesename = chinesename;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public BigDecimal getPayable() {
		return payable;
	}

	public void setPayable(BigDecimal payable) {
		this.payable = payable;
	}

	public Integer getSettleaccountsid() {
        return settleaccountsid;
    }

    public void setSettleaccountsid(Integer settleaccountsid) {
        this.settleaccountsid = settleaccountsid;
    }

    public Integer getDetailid() {
        return detailid;
    }

    public void setDetailid(Integer detailid) {
        this.detailid = detailid;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getSettleaccountstime() {
        return settleaccountstime;
    }

    public void setSettleaccountstime(Date settleaccountstime) {
        this.settleaccountstime = settleaccountstime;
    }

    public Integer getPayway() {
        return payway;
    }

    public void setPayway(Integer payway) {
        this.payway = payway;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}