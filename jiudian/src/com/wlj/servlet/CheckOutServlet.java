package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class CheckOutServlet
 */
@WebServlet(name = "checkout", urlPatterns = { "/checkout" })
public class CheckOutServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		List<GuestRoom> selectByType = userservice.selectByType("ÒÑÈë×¡");
		req.setAttribute("selectByType",selectByType);
		List<Checkin> selectAll = userservice.selectAll();
		req.setAttribute("selectAll", selectAll);
		req.getRequestDispatcher("/checkout/insert.jsp").forward(req, resp);
	}
}
