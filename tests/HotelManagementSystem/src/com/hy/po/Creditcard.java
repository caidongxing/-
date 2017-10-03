package com.hy.po;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Creditcard {
    private Integer creditcardid;

    private String creditcardnumber;

    private Integer creditcardtype;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date validitydate;

    private BigDecimal quota;

    public Integer getCreditcardid() {
        return creditcardid;
    }

    public void setCreditcardid(Integer creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber == null ? null : creditcardnumber.trim();
    }

    public Integer getCreditcardtype() {
        return creditcardtype;
    }

    public void setCreditcardtype(Integer creditcardtype) {
        this.creditcardtype = creditcardtype;
    }

    public Date getValiditydate() {
        return validitydate;
    }

    public void setValiditydate(Date validitydate) {
        this.validitydate = validitydate;
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }
}