package com.hy.po;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Nohireroom {
    private Integer nohireroomid;

    private Integer roomsid;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date starttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    private String reason;

    private String comment;
    
    private int status;
    
    //扩展字段
    private int roomnumber;
    

    
    
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public Integer getNohireroomid() {
        return nohireroomid;
    }

    public void setNohireroomid(Integer nohireroomid) {
        this.nohireroomid = nohireroomid;
    }

    public Integer getRoomsid() {
        return roomsid;
    }

    public void setRoomsid(Integer roomsid) {
        this.roomsid = roomsid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}