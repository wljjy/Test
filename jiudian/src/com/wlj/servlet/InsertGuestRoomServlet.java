package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.GuestRoom;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet(name = "insert", urlPatterns = { "/insert" })
public class InsertGuestRoomServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String roomNumber = req.getParameter("roomNumber");
		String daxiao = req.getParameter("daxiao");
		String leixing = req.getParameter("leixing");
		double price = Double.parseDouble(req.getParameter("price"));
		String beizhu = req.getParameter("beizhu");
		
		List<GuestRoom> selRoomNumber = userservice.selRoomNumber(roomNumber);
		if(selRoomNumber.size()==0)
		{
			GuestRoom room = new GuestRoom();
			room.setRoomNumber(roomNumber);
			room.setDaxiao(daxiao);
			room.setLeixing(leixing);
			room.setPrice(price);
			room.setType("空房");
			room.setBeizhu(beizhu);
			int insertOne = userservice.insertOne(room);
			doPost(req, resp);
		}else {
			req.setAttribute("error", "该房号已存在");
			req.getRequestDispatcher("/insert.jsp").forward(req, resp);
		}
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/selroom").forward(req, resp);
		}
}
