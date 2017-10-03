package com.hy.po;

import java.math.BigDecimal;

public class Accountbookanditems {
    private Integer accountbookanditemsid;

    private Integer accountbookid;

    private Integer accountitemsid;
    
    //扩展字段
    private String itemsname;
    private String accountbookcode;
    private String accountbookname;
    
    private BigDecimal expenditure;
    private int record;
    private int isproceeds;
    
    

    
    public int getIsproceeds() {
		return isproceeds;
	}

	public void setIsproceeds(int isproceeds) {
		this.isproceeds = isproceeds;
	}

	public BigDecimal getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(BigDecimal expenditure) {
		this.expenditure = expenditure;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public String getAccountbookcode() {
		return accountbookcode;
	}

	public void setAccountbookcode(String accountbookcode) {
		this.accountbookcode = accountbookcode;
	}

	public String getAccountbookname() {
		return accountbookname;
	}

	public void setAccountbookname(String accountbookname) {
		this.accountbookname = accountbookname;
	}

	public String getItemsname() {
		return itemsname;
	}

	public void setItemsname(String itemsname) {
		this.itemsname = itemsname;
	}

	public Integer getAccountbookanditemsid() {
        return accountbookanditemsid;
    }

    public void setAccountbookanditemsid(Integer accountbookanditemsid) {
        this.accountbookanditemsid = accountbookanditemsid;
    }

    public Integer getAccountbookid() {
        return accountbookid;
    }

    public void setAccountbookid(Integer accountbookid) {
        this.accountbookid = accountbookid;
    }

    public Integer getAccountitemsid() {
        return accountitemsid;
    }

    public void setAccountitemsid(Integer accountitemsid) {
        this.accountitemsid = accountitemsid;
    }
}