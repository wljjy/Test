package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.Report;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class SelectAllBillServlet
 */
@WebServlet(name = "allbill", urlPatterns = { "/allbill" })
public class SelectAllBillServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		List<Report> selAllReport = userservice.selAllReport();
		req.setAttribute("selAllReport", selAllReport);
		req.getRequestDispatcher("/allbill/allbill.jsp").forward(req, resp);
	}
}
