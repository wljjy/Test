package com.wlj.pojo;

public class GuestRoom {
	private int id;
	private String roomNumber;
	private String daxiao;
	private String leixing;
	private double price;
	private String type;
	private String beizhu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getDaxiao() {
		return daxiao;
	}
	public void setDaxiao(String daxiao) {
		this.daxiao = daxiao;
	}
	public String getLeixing() {
		return leixing;
	}
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	@Override
	public String toString() {
		return "GuestRoom [id=" + id + ", roomNumber=" + roomNumber + ", daxiao=" + daxiao + ", leixing=" + leixing
				+ ", price=" + price + ", type=" + type + ", beizhu=" + beizhu + "]";
	}
}
