package com.wlj.service;

import java.util.List;

import com.wlj.pojo.CheckOut;
import com.wlj.pojo.Checkin;
import com.wlj.pojo.Customer;
import com.wlj.pojo.GuestRoom;
import com.wlj.pojo.Report;
import com.wlj.pojo.User;

public interface UserService {
	//登录
	public User selAdmin(User user);
	//查询所有客房
	public List<GuestRoom> selAll();
	//删除一条客房信息
	public int deleteOne(int id);
	//添加一条客房信息
	public int insertOne(GuestRoom room);
	//查询一条信息
	public GuestRoom selOne(int id); 
	//修改一条信息
	public int updateOne(GuestRoom room);
	//查询所有客户信息
	public List<Customer> selAll_c();
	//删除一条客户信息
	public int deleteOneCustomer(int id);
	//添加一条客户信息
	public int insertOneCustomer(Customer customer);
	//根据客房号查询
	public List<GuestRoom> selRoomNumber(String roomNumber);
	//查询如入住信息
	public List<Checkin> selectAll();
	//添加入住信息
	public int insertCheckin(Checkin checkin);
	//根据客户姓名查询
	public List<Customer> selectByName(String cname);
	//根据客房号和状态类型查询
	public List<GuestRoom> selectNumberType(GuestRoom room);
	//根据入住信息的房号id修改客房状态
	public int updateTypeById(GuestRoom room1);
	//删除一条入住信息
	public int deleteOneCheckin(int id);
	//查询所有退房信息
	public List<CheckOut> selectCheckOutAll();
	//添加一条退房信息
	public int insertCheckOutOne(CheckOut checkOut);
	//删除一条退房信息
	public int deleteOneCheckOut(int id);
	//查出所有状态为已入住的客房信息
	public List<GuestRoom> selectByType(String type);
	//修改密码
	public int updatePwd(User user);
	//根据id查询一条入住信息
	public Checkin selectOneCheckin(int id);
	//修改一条入住信息
	public int updateOneCheckIn(Checkin checkin);
	//通过roomNumber修改客房状态
	public int updateTypeByRoomNumber(GuestRoom room);
	//添加一条消费记录
	public int insertOneReport(Report report);
	//查询所有消费记录
	public List<Report> selAllReport();
	//删除一条消费信息
	public int deleteOneReport(int id);
}
