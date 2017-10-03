package com.hj.entity;



/**
 * CustomerLevel entity. @author MyEclipse Persistence Tools
 */

public class CustomerLevel  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -2958209462744890737L;
	private Integer levelId;
     private Double business;
     private String levelName;


    // Constructors

    /** default constructor */
    public CustomerLevel() {
    }

    
    /** full constructor */
    public CustomerLevel(Double business, String levelName) {
        this.business = business;
        this.levelName = levelName;
    }

   
    // Property accessors

    public Integer getLevelId() {
        return this.levelId;
    }
    
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Double getBusiness() {
        return this.business;
    }
    
    public void setBusiness(Double business) {
        this.business = business;
    }

    public String getLevelName() {
        return this.levelName;
    }
    
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
   








}