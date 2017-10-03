package com.gx.po.goodsandservicestax;

import java.math.BigDecimal;

public class Goodsandservicestax {
    private Integer id;

    private String code;

    private String mergecoding;

    private String name;

    private String explains;

    private BigDecimal taxrate;

    private Integer addedtaxmanagement;

    private String addedtaxpolicy;

    private String addedtaxspecial;

    private Integer consumptiontaxadministration;

    private String consumptiontaxpolicy;

    private String specialconsumptiontax;

    private String keyword;

    private String statisticalofficecode;

    private String summaryitem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getMergecoding() {
        return mergecoding;
    }

    public void setMergecoding(String mergecoding) {
        this.mergecoding = mergecoding == null ? null : mergecoding.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains == null ? null : explains.trim();
    }

    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    public Integer getAddedtaxmanagement() {
        return addedtaxmanagement;
    }

    public void setAddedtaxmanagement(Integer addedtaxmanagement) {
        this.addedtaxmanagement = addedtaxmanagement;
    }

    public String getAddedtaxpolicy() {
        return addedtaxpolicy;
    }

    public void setAddedtaxpolicy(String addedtaxpolicy) {
        this.addedtaxpolicy = addedtaxpolicy == null ? null : addedtaxpolicy.trim();
    }

    public String getAddedtaxspecial() {
        return addedtaxspecial;
    }

    public void setAddedtaxspecial(String addedtaxspecial) {
        this.addedtaxspecial = addedtaxspecial == null ? null : addedtaxspecial.trim();
    }

    public Integer getConsumptiontaxadministration() {
        return consumptiontaxadministration;
    }

    public void setConsumptiontaxadministration(Integer consumptiontaxadministration) {
        this.consumptiontaxadministration = consumptiontaxadministration;
    }

    public String getConsumptiontaxpolicy() {
        return consumptiontaxpolicy;
    }

    public void setConsumptiontaxpolicy(String consumptiontaxpolicy) {
        this.consumptiontaxpolicy = consumptiontaxpolicy == null ? null : consumptiontaxpolicy.trim();
    }

    public String getSpecialconsumptiontax() {
        return specialconsumptiontax;
    }

    public void setSpecialconsumptiontax(String specialconsumptiontax) {
        this.specialconsumptiontax = specialconsumptiontax == null ? null : specialconsumptiontax.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getStatisticalofficecode() {
        return statisticalofficecode;
    }

    public void setStatisticalofficecode(String statisticalofficecode) {
        this.statisticalofficecode = statisticalofficecode == null ? null : statisticalofficecode.trim();
    }

    public String getSummaryitem() {
        return summaryitem;
    }

    public void setSummaryitem(String summaryitem) {
        this.summaryitem = summaryitem == null ? null : summaryitem.trim();
    }
}