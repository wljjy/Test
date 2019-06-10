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
	//��¼
	@Override
	public User selAdmin(User user) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		User selectadmin = session.selectOne("com.wlj.pojo.selAdmin", user);
		session.close();
		return selectadmin;
	}
	//��ѯ���пͷ�
	@Override
	public List<GuestRoom> selAll() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> list = session.selectList("com.wlj.pojo.selAll");
		session.close();
		return list;
	}
	//ɾ��һ���ͷ���Ϣ
	@Override
	public int deleteOne(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOne = session.delete("com.wlj.pojo.deleteOne",id);
		session.commit();
		session.close();
		return deleteOne;
	}
	//���һ���ͷ���Ϣ
	@Override
	public int insertOne(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insert = session.insert("com.wlj.pojo.insertOne", room);
		session.commit();
		session.close();
		return insert;
	}
	//��ѯһ����Ϣ
	@Override
	public GuestRoom selOne(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		GuestRoom selectOne = session.selectOne("com.wlj.pojo.selOne",id);
		session.close();
		return selectOne;
	}
	//�޸Ŀͷ���Ϣ
	@Override
	public int updateOne(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int update = session.update("com.wlj.pojo.updateOne", room);
		session.commit();
		session.close();
		return update;
	}
	//���ݿͷ��Ų�ѯ
	@Override
	public List<GuestRoom> selRoomNumber(String roomNumber) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> sellist = session.selectList("com.wlj.pojo.selroomNumber",roomNumber);
		session.close();
		return sellist;
	}
	//��ѯ���пͻ���Ϣ
	@Override
	public List<Customer> selAll_c() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Customer> customerlist = session.selectList("com.wlj.pojo.CustomerMapper.selAllCustomer");
		session.close();
		return customerlist;
	}
	//ɾ��һ���ͻ���Ϣ
	@Override
	public int deleteOneCustomer(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOnec = session.delete("com.wlj.pojo.CustomerMapper.deleteOne", id);
		session.commit();
		session.close();
		return deleteOnec;
	}
	//���һ���ͻ���Ϣ
	@Override
	public int insertOneCustomer(Customer customer) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insert = session.insert("com.wlj.pojo.CustomerMapper.insertOne", customer);
		session.commit();
		session.close();
		return insert;
	}
	//��ѯ������ס��Ϣ
	@Override
	public List<Checkin> selectAll() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Checkin> selectCheckinAll = session.selectList("com.wlj.mapper.CheckinMapper.selectAll");
		session.close();
		return selectCheckinAll;
	}
	//���һ����ס��Ϣ
	@Override
	public int insertCheckin(Checkin checkin) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insertcheckin = session.insert("com.wlj.mapper.CheckinMapper.insertOne", checkin);
		session.commit();
		session.close();
		return insertcheckin;
	}
	//���ݿͻ�������ѯ
	@Override
	public List<Customer> selectByName(String cname) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<Customer> selectCustomer = session.selectList("com.wlj.pojo.CustomerMapper.selectByName",cname);
		session.close();
		return selectCustomer;
	}
	//���ݷ��ź�״̬��ѯ
	@Override
	public List<GuestRoom> selectNumberType(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> guestByNumberType = session.selectList("com.wlj.pojo.selectByNumberTypy", room);
		session.close();
		return guestByNumberType;
	}
	//���ݷ����޸�״̬
	@Override
	public int updateTypeById(GuestRoom room1) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int updateTypeById = session.update("com.wlj.pojo.updateTypeById",room1);
		session.commit();
		session.close();
		return updateTypeById;
	}
	//����idɾ��һ����ס��Ϣ
	@Override
	public int deleteOneCheckin(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOneCheckin = session.delete("com.wlj.mapper.CheckinMapper.deleteOneCheckin",id);
		session.commit();
		session.close();
		return deleteOneCheckin;
	}
	//��ѯ�����˷���Ϣ
	@Override
	public List<CheckOut> selectCheckOutAll() {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<CheckOut> selectCheckOutAll = session.selectList("com.wlj.mapper.CheckOutMapper.selectCheckOutAll");
		session.close();
		return selectCheckOutAll;
	}
	//���һ���˷���Ϣ
	@Override
	public int insertCheckOutOne(CheckOut checkOut) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insertOneCheckOut = session.insert("com.wlj.mapper.CheckOutMapper.insertCheckOutOne", checkOut);
		session.commit();
		session.close();
		return insertOneCheckOut;
	}
	//ɾ��һ���˷���Ϣ
	@Override
	public int deleteOneCheckOut(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOneCheckOut = session.delete("com.wlj.mapper.CheckOutMapper.deleteOneCheckOut", id);
		session.commit();
		session.close();
		return deleteOneCheckOut;
	}
	//�����������ס�Ŀͷ���Ϣ
	@Override
	public List<GuestRoom> selectByType(String type) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		List<GuestRoom> selectAllChechin = session.selectList("com.wlj.pojo.selectByType", type);
		session.close();
		return selectAllChechin;
	}
	//�޸��û�����
	@Override
	public int updatePwd(User user) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int updatePwd = session.update("com.wlj.pojo.updatePwd",user);
		session.commit();
		session.close();
		return updatePwd;
	}
	//����id��ѯһ����ס��Ϣ
	@Override
	public Checkin selectOneCheckin(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		Checkin checkin = session.selectOne("com.wlj.mapper.CheckinMapper.selectOneCheckIn",id);
		session.close();
		return checkin;
	}
	//�޸�һ����ס��Ϣ
	@Override
	public int updateOneCheckIn(Checkin checkin) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int update = session.update("com.wlj.mapper.CheckinMapper.updateOneCheckIn", checkin);
		session.commit();
		session.close();
		return update;
	}
	//ͨ��roomNumber�޸Ŀͷ�״̬
	@Override
	public int updateTypeByRoomNumber(GuestRoom room) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int updateByRoomNumber = session.update("com.wlj.pojo.updateTypeByRoomNumber", room);
		session.commit();
		session.close();
		return updateByRoomNumber;
	}
	//���һ��������Ϣ
	@Override
	public int insertOneReport(Report report) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int insert = session.insert("com.wlj.mapper.ReportMapper.insertOneReport", report);
		session.commit();
		session.close();
		return insert;
	}
	//��ѯ���м�¼
	@Override
	public List<Report> selAllReport() {
	SqlSession session = SqlSessionFactoryUtil.getSession();
	List<Report> allReport = session.selectList("com.wlj.mapper.ReportMapper.selAllReport");
	session.close();
		return allReport;
	}
	//ɾ��һ�����Ѽ�¼
	@Override
	public int deleteOneReport(int id) {
		SqlSession session = SqlSessionFactoryUtil.getSession();
		int deleteOneReport = session.delete("com.wlj.mapper.ReportMapper.deleteOneReport", id);
		session.commit();
		session.close();
		return deleteOneReport;
	}
}
