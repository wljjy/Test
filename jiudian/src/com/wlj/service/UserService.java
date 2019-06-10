package com.wlj.service;

import java.util.List;

import com.wlj.pojo.CheckOut;
import com.wlj.pojo.Checkin;
import com.wlj.pojo.Customer;
import com.wlj.pojo.GuestRoom;
import com.wlj.pojo.Report;
import com.wlj.pojo.User;

public interface UserService {
	//��¼
	public User selAdmin(User user);
	//��ѯ���пͷ�
	public List<GuestRoom> selAll();
	//ɾ��һ���ͷ���Ϣ
	public int deleteOne(int id);
	//���һ���ͷ���Ϣ
	public int insertOne(GuestRoom room);
	//��ѯһ����Ϣ
	public GuestRoom selOne(int id); 
	//�޸�һ����Ϣ
	public int updateOne(GuestRoom room);
	//��ѯ���пͻ���Ϣ
	public List<Customer> selAll_c();
	//ɾ��һ���ͻ���Ϣ
	public int deleteOneCustomer(int id);
	//���һ���ͻ���Ϣ
	public int insertOneCustomer(Customer customer);
	//���ݿͷ��Ų�ѯ
	public List<GuestRoom> selRoomNumber(String roomNumber);
	//��ѯ����ס��Ϣ
	public List<Checkin> selectAll();
	//�����ס��Ϣ
	public int insertCheckin(Checkin checkin);
	//���ݿͻ�������ѯ
	public List<Customer> selectByName(String cname);
	//���ݿͷ��ź�״̬���Ͳ�ѯ
	public List<GuestRoom> selectNumberType(GuestRoom room);
	//������ס��Ϣ�ķ���id�޸Ŀͷ�״̬
	public int updateTypeById(GuestRoom room1);
	//ɾ��һ����ס��Ϣ
	public int deleteOneCheckin(int id);
	//��ѯ�����˷���Ϣ
	public List<CheckOut> selectCheckOutAll();
	//���һ���˷���Ϣ
	public int insertCheckOutOne(CheckOut checkOut);
	//ɾ��һ���˷���Ϣ
	public int deleteOneCheckOut(int id);
	//�������״̬Ϊ����ס�Ŀͷ���Ϣ
	public List<GuestRoom> selectByType(String type);
	//�޸�����
	public int updatePwd(User user);
	//����id��ѯһ����ס��Ϣ
	public Checkin selectOneCheckin(int id);
	//�޸�һ����ס��Ϣ
	public int updateOneCheckIn(Checkin checkin);
	//ͨ��roomNumber�޸Ŀͷ�״̬
	public int updateTypeByRoomNumber(GuestRoom room);
	//���һ�����Ѽ�¼
	public int insertOneReport(Report report);
	//��ѯ�������Ѽ�¼
	public List<Report> selAllReport();
	//ɾ��һ��������Ϣ
	public int deleteOneReport(int id);
}
