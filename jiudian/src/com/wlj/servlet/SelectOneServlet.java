package com.wlj.servlet;

import java.io.IOException;

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
@WebServlet(name = "selOne", urlPatterns = { "/selOne" })
public class SelectOneServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int id =Integer.parseInt( req.getParameter("id"));
		GuestRoom selOne = userservice.selOne(id);
		req.setAttribute("selOne", selOne);
		req.getRequestDispatcher("/update.jsp").forward(req, resp);
	}
}
