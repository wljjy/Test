package com.wlj.pojo;

public class Checkin {
	private int id;
	private String name;
	private String roomNumber;
	private String sex;
	private String intime;
	private String outtime;
	private String livetype;
	private String liveDay;
	private double allprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	public String getLivetype() {
		return livetype;
	}
	public void setLivetype(String livetype) {
		this.livetype = livetype;
	}
	public String getLiveDay() {
		return liveDay;
	}
	public void setLiveDay(String liveDay) {
		this.liveDay = liveDay;
	}
	public double getAllprice() {
		return allprice;
	}
	public void setAllprice(double allprice) {
		this.allprice = allprice;
	}
	@Override
	public String toString() {
		return "Checkin [id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + ", sex=" + sex + ", intime="
				+ intime + ", outtime=" + outtime + ", livetype=" + livetype + ", liveDay=" + liveDay + ", allprice="
				+ allprice + "]";
	}
}
