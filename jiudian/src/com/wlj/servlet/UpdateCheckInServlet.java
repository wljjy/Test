package com.wlj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.Checkin;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UpdateCheckInServlet
 */
@WebServlet(name = "updatecheckin", urlPatterns = { "/updatecheckin" })
public class UpdateCheckInServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		String roomNumber = req.getParameter("roomNumber");
		String intime = req.getParameter("intime");
		String outtime = req.getParameter("outtime");
		String liveDay = req.getParameter("liveDay");
		String livetype = req.getParameter("livetype");
		double allprice =Double.parseDouble(req.getParameter("allprice"));
		System.out.println(id+sex+name);
		
		Checkin checkin = new Checkin();
		checkin.setId(id);
		checkin.setName(name);
		checkin.setSex(sex);
		checkin.setRoomNumber(roomNumber);
		checkin.setIntime(intime);
		checkin.setOuttime(outtime);
		checkin.setLiveDay(liveDay);
		checkin.setLivetype(livetype);
		checkin.setAllprice(allprice);
		int updateOneCheckIn = userservice.updateOneCheckIn(checkin);
		doPost(req, resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/selectAllCheckin").forward(req, resp);
		}
}
