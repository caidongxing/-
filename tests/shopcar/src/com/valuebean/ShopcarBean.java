package com.valuebean;

import java.util.ArrayList;
import java.util.List;

public class ShopcarBean {
	private int 	id;							//�洢�Զ����
	private String 	shopcarId;					//�洢���ﳵ���
	private List	shopcarBuyGoodss;			//�洢�������Ʒ
	
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
