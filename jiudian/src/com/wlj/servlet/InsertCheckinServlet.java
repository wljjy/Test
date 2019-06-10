package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.Checkin;
import com.wlj.pojo.Customer;
import com.wlj.pojo.GuestRoom;
import com.wlj.pojo.Report;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class InsertCheckinServlet
 */
@WebServlet(name = "insertCheckin", urlPatterns = { "/insertCheckin" })
public class InsertCheckinServlet extends HttpServlet {
	private UserService userservice = new UserServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String cname = req.getParameter("name");
		String sex = req.getParameter("sex");
		String roomNumber = req.getParameter("roomNumber");
		String intime = req.getParameter("intime");
		String outtime = req.getParameter("outtime");
		String liveDay = req.getParameter("liveDay");
		String livetype = req.getParameter("livetype");
		List<Customer> selectByName = userservice.selectByName(cname);

		if (selectByName.size() > 0) {
			GuestRoom room = new GuestRoom();
			room.setRoomNumber(roomNumber);
			room.setType("空房");
			List<GuestRoom> selectNumberType = userservice.selectNumberType(room);
			if (selectNumberType.size() > 0) {
				Checkin checkin = new Checkin();
				checkin.setName(cname);
				checkin.setSex(sex);
				checkin.setRoomNumber(roomNumber);
				checkin.setIntime(intime);
				checkin.setOuttime(outtime);
				checkin.setLiveDay(liveDay);
				checkin.setLivetype(livetype);
				double price = selectNumberType.get(0).getPrice();
				double allprice=Integer.parseInt(liveDay)*price;
				checkin.setAllprice(allprice);
				int insertCheckin = userservice.insertCheckin(checkin);
				
				String age = selectByName.get(0).getCage();
				String address = selectByName.get(0).getAddress();
				Report report = new Report();
				report.setName(cname);
				report.setAge(age);
				report.setSex(sex);
				report.setRoomNumber(roomNumber);
				report.setIntime(intime);
				report.setOuttime(outtime);
				report.setAllprice(allprice);
				report.setAddress(address);
				int insertOneReport = userservice.insertOneReport(report);
				System.out.println(insertOneReport);
				
				GuestRoom room1 = new GuestRoom();
				room1.setType("已入住");
				int id = selectNumberType.get(0).getId();
				room1.setId(id);
				int updateTypeById = userservice.updateTypeById(room1);
				doPost(req, resp);
			} else {
				req.setAttribute("errorcheckin", "该客房不可入住");
				req.getRequestDispatcher("/checkin/insert.jsp").forward(req, resp);
			}
		} else {
			req.setAttribute("errorCustomername", "客户姓名不存在");
			req.getRequestDispatcher("/checkin/insert.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/selectAllCheckin").forward(req, resp);
	}
}
