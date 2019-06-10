package com.wlj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.Checkin;
import com.wlj.pojo.GuestRoom;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class DeleteCheckinServlet
 */
@WebServlet(name = "deleteCheckin", urlPatterns = { "/deleteCheckin" })
public class DeleteCheckinServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(req.getParameter("id"));
		Checkin selectOneCheckin = userservice.selectOneCheckin(id);
		String roomNumber = selectOneCheckin.getRoomNumber();
		GuestRoom room = new GuestRoom();
		room.setRoomNumber(roomNumber);
		room.setType("¿Õ·¿");
		int updateTypeByRoomNumber = userservice.updateTypeByRoomNumber(room);
		
		int deleteOneCheckin = userservice.deleteOneCheckin(id);
		doPost(req, resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/selectAllCheckin").forward(req, resp);
		}
}
