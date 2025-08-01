package jp.co.internous.ecsite.model.dmain;

import java.sql.Timestamp;

public class MstGoods {
//	mennber
	private int id;
	
	private String goodsName;
	
	private int price;
//	時間はこの型名
	private Timestamp createdAt;
	
	private Timestamp updatedAt;
	
//	method
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Timestamp getCratedAt() {
		return createdAt;
	
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
