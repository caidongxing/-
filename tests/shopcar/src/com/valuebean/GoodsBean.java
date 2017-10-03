package com.valuebean;

public class GoodsBean {
	private int 	id;								//自动编号
	private String 	goodsViewpic;					//商品预览图
	private String 	goodsName;						//商品名称
	private float 	goodsPrice;						//商品价格
	private int 	goodsStoreNum;					//商品库存量
	private int		goodsBuyNum;					//购物车中该商品购买的数量
	private String 	goodsStocktime;					//商品上架时间
	private String 	goodsInfo;						//商品描述信息
	private String 	goodsMaker;						//商品制造商
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getGoodsViewpic() {
		return goodsViewpic;
	}
	public void setGoodsViewpic(String goodsViewpic) {
		this.goodsViewpic = goodsViewpic;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public float getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsStoreNum() {
		return goodsStoreNum;
	}
	public void setGoodsStoreNum(int goodsStoreNum) {
		this.goodsStoreNum = goodsStoreNum;
	}	
	public int getGoodsBuyNum() {
		return goodsBuyNum;
	}
	public void setGoodsBuyNum(int goodsBuyNum) {
		this.goodsBuyNum = goodsBuyNum;
	}
	public String getGoodsStocktime() {
		return goodsStocktime;
	}
	public void setGoodsStocktime(String goodsStocktime) {
		this.goodsStocktime = goodsStocktime;
	}
	public String getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(String goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	public String getGoodsMaker() {
		return goodsMaker;
	}
	public void setGoodsMaker(String goodsMaker) {
		this.goodsMaker = goodsMaker;
	}	
	public float getGoodsMoney(){
		return Math.round(goodsPrice*goodsBuyNum*100)/100f;
	}
}
