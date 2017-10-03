package com.valuebean;

import java.util.ArrayList;
import java.util.List;

public class ShopcarBean {
	private int 	id;							//´æ´¢×Ô¶¯±àºÅ
	private String 	shopcarId;					//´æ´¢¹ºÎï³µ±àºÅ
	private List	shopcarBuyGoodss;			//´æ´¢¹ºÂòµÄÉÌÆ·
	
	public ShopcarBean(){
		shopcarBuyGoodss=new ArrayList();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopcarId() {
		return shopcarId;
	}
	public void setShopcarId(String shopcarId) {
		this.shopcarId = shopcarId;
	}	
	public List getShopcarBuyGoodss() {
		return shopcarBuyGoodss;
	}
	public void setShopcarBuyGoodss(GoodsBean goodssingle) {
		shopcarBuyGoodss.add(goodssingle);
	}		
}
