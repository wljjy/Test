package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.CheckOut;
import com.wlj.pojo.GuestRoom;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class InsertCheckOutServlet
 */
@WebServlet(name = "insertCheckOut", urlPatterns = { "/insertCheckOut" })
public class InsertCheckOutServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		String roomNumber = req.getParameter("roomNumber");
		String outtime = req.getParameter("outtime");
		List<GuestRoom> selRoomNumber = userservice.selRoomNumber(roomNumber);
		double price = selRoomNumber.get(0).getPrice();
		CheckOut checkOut = new CheckOut();
		checkOut.setName(name);
		checkOut.setRoomNumber(roomNumber);
		checkOut.setOuttime(outtime);
		checkOut.setPrice(price);
		int insertCheckOutOne = userservice.insertCheckOutOne(checkOut);
		GuestRoom room1 = new GuestRoom();
		room1.setId(selRoomNumber.get(0).getId());
		room1.setType("¿Õ·¿");
		userservice.updateTypeById(room1);
		doPost(req, resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/selectCheckOutAll").forward(req, resp);
		}
}
