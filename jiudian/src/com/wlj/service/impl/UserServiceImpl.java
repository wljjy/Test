package com.wlj.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wlj.pojo.CheckOut;
import com.wlj.pojo.Checkin;
import com.wlj.pojo.Customer;
import com.wlj.pojo.GuestRoom;
import com.wlj.pojo.Report;
import com.wlj.pojo.User;
import com.wlj.service.UserService;
import com.wlj.util.SqlSessionFactoryUtil;

public class UserServiceImpl implements UserService{
	//登录
	@Override
	public User selAdmin(User user) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		User selectadmin = session.selectOne("com.wlj.pojo.selAdmin", user);
		session.close();
		return selectadmin;
	}
	//查询所有客房
	@Override
	public List<GuestRoom> selAll() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> list = session.selectList("com.wlj.pojo.selAll");
		session.close();
		return list;
	}
	//删除一条客房信息
	@Override
	public int deleteOne(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOne = session.delete("com.wlj.pojo.deleteOne",id);
		session.commit();
		session.close();
		return deleteOne;
	}
	//添加一条客房信息
	@Override
	public int insertOne(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insert = session.insert("com.wlj.pojo.insertOne", room);
		session.commit();
		session.close();
		return insert;
	}
	//查询一条信息
	@Override
	public GuestRoom selOne(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		GuestRoom selectOne = session.selectOne("com.wlj.pojo.selOne",id);
		session.close();
		return selectOne;
	}
	//修改客房信息
	@Override
	public int updateOne(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int update = session.update("com.wlj.pojo.updateOne", room);
		session.commit();
		session.close();
		return update;
	}
	//根据客房号查询
	@Override
	public List<GuestRoom> selRoomNumber(String roomNumber) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> sellist = session.selectList("com.wlj.pojo.selroomNumber",roomNumber);
		session.close();
		return sellist;
	}
	//查询所有客户信息
	@Override
	public List<Customer> selAll_c() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Customer> customerlist = session.selectList("com.wlj.pojo.CustomerMapper.selAllCustomer");
		session.close();
		return customerlist;
	}
	//删除一条客户信息
	@Override
	public int deleteOneCustomer(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOnec = session.delete("com.wlj.pojo.CustomerMapper.deleteOne", id);
		session.commit();
		session.close();
		return deleteOnec;
	}
	//添加一条客户信息
	@Override
	public int insertOneCustomer(Customer customer) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insert = session.insert("com.wlj.pojo.CustomerMapper.insertOne", customer);
		session.commit();
		session.close();
		return insert;
	}
	//查询所有入住信息
	@Override
	public List<Checkin> selectAll() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Checkin> selectCheckinAll = session.selectList("com.wlj.mapper.CheckinMapper.selectAll");
		session.close();
		return selectCheckinAll;
	}
	//添加一条入住信息
	@Override
	public int insertCheckin(Checkin checkin) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insertcheckin = session.insert("com.wlj.mapper.CheckinMapper.insertOne", checkin);
		session.commit();
		session.close();
		return insertcheckin;
	}
	//根据客户姓名查询
	@Override
	public List<Customer> selectByName(String cname) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Customer> selectCustomer = session.selectList("com.wlj.pojo.CustomerMapper.selectByName",cname);
		session.close();
		return selectCustomer;
	}
	//根据房号和状态查询
	@Override
	public List<GuestRoom> selectNumberType(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> guestByNumberType = session.selectList("com.wlj.pojo.selectByNumberTypy", room);
		session.close();
		return guestByNumberType;
	}
	//根据房号修改状态
	@Override
	public int updateTypeById(GuestRoom room1) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int updateTypeById = session.update("com.wlj.pojo.updateTypeById",room1);
		session.commit();
		session.close();
		return updateTypeById;
	}
	//根据id删除一条入住信息
	@Override
	public int deleteOneCheckin(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOneCheckin = session.delete("com.wlj.mapper.CheckinMapper.deleteOneCheckin",id);
		session.commit();
		session.close();
		return deleteOneCheckin;
	}
	//查询所有退房信息
	@Override
	public List<CheckOut> selectCheckOutAll() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<CheckOut> selectCheckOutAll = session.selectList("com.wlj.mapper.CheckOutMapper.selectCheckOutAll");
		session.close();
		return selectCheckOutAll;
	}
	//添加一条退房信息
	@Override
	public int insertCheckOutOne(CheckOut checkOut) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insertOneCheckOut = session.insert("com.wlj.mapper.CheckOutMapper.insertCheckOutOne", checkOut);
		session.commit();
		session.close();
		return insertOneCheckOut;
	}
	//删除一条退房信息
	@Override
	public int deleteOneCheckOut(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOneCheckOut = session.delete("com.wlj.mapper.CheckOutMapper.deleteOneCheckOut", id);
		session.commit();
		session.close();
		return deleteOneCheckOut;
	}
	//查出所有已入住的客房信息
	@Override
	public List<GuestRoom> selectByType(String type) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> selectAllChechin = session.selectList("com.wlj.pojo.selectByType", type);
		session.close();
		return selectAllChechin;
	}
	//修改用户密码
	@Override
	public int updatePwd(User user) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int updatePwd = session.update("com.wlj.pojo.updatePwd",user);
		session.commit();
		session.close();
		return updatePwd;
	}
	//根据id查询一条入住信息
	@Override
	public Checkin selectOneCheckin(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		Checkin checkin = session.selectOne("com.wlj.mapper.CheckinMapper.selectOneCheckIn",id);
		session.close();
		return checkin;
	}
	//修改一条入住信息
	@Override
	public int updateOneCheckIn(Checkin checkin) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int update = session.update("com.wlj.mapper.CheckinMapper.updateOneCheckIn", checkin);
		session.commit();
		session.close();
		return update;
	}
	//通过roomNumber修改客房状态
	@Override
	public int updateTypeByRoomNumber(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int updateByRoomNumber = session.update("com.wlj.pojo.updateTypeByRoomNumber", room);
		session.commit();
		session.close();
		return updateByRoomNumber;
	}
	//添加一条消费信息
	@Override
	public int insertOneReport(Report report) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insert = session.insert("com.wlj.mapper.ReportMapper.insertOneReport", report);
		session.commit();
		session.close();
		return insert;
	}
	//查询所有记录
	@Override
	public List<Report> selAllReport() {
	SqlSession session = SqlSessionFactoryUtil.getSession();
	List<Report> allReport = session.selectList("com.wlj.mapper.ReportMapper.selAllReport");
	session.close();
		return allReport;
	}
	//删除一条消费记录
	@Override
	public int deleteOneReport(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOneReport = session.delete("com.wlj.mapper.ReportMapper.deleteOneReport", id);
		session.commit();
		session.close();
		return deleteOneReport;
	}
}
