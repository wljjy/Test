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
 * Servlet implementation class SelectCheckOutAll
 */
@WebServlet(name = "selectCheckOutAll", urlPatterns = { "/selectCheckOutAll" })
public class SelectCheckOutAllServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//查询所有退房信息
		List<CheckOut> selectCheckOutAll = userservice.selectCheckOutAll();
		req.setAttribute("selectCheckOutAll", selectCheckOutAll);
		req.getRequestDispatcher("/checkout/checkout.jsp").forward(req, resp);
	}
}
