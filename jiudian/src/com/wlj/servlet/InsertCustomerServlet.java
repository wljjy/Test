package com.wlj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wlj.pojo.Customer;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class InsertCustomerServlet
 */
@WebServlet("/insertcustomer")
public class InsertCustomerServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String cname = req.getParameter("cname");
		String cage = req.getParameter("cage");
		String sex = req.getParameter("sex");
		String phone = req.getParameter("phone");
		String idNumber = req.getParameter("idNumber");
		String address = req.getParameter("address");
		Customer customer = new Customer();
		customer.setCname(cname);
		customer.setCage(cage);
		customer.setSex(sex);
		customer.setPhone(phone);
		customer.setIdNumber(idNumber);
		customer.setAddress(address);
		int insertOneCustomer = userservice.insertOneCustomer(customer);
		doPost(req, resp);
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/selectcustomer").forward(req, resp);
		}
}
