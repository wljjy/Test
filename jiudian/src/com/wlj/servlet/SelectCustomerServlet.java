package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.Customer;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class SelectCustomerServlet
 */
@WebServlet(name = "selectcustomer", urlPatterns = { "/selectcustomer" })
public class SelectCustomerServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		List<Customer> selectlist= userservice.selAll_c();
		req.setAttribute("selectlist", selectlist);
		req.getRequestDispatcher("/customer/customer.jsp").forward(req, resp);
	}
}
