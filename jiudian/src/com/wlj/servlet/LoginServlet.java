package com.wlj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wlj.pojo.User;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet implements Runnable{
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		User selAdmin = userservice.selAdmin(user);
		//LoginServlet loginServlet = new LoginServlet();
		//loginServlet.run();
		if(selAdmin!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("selAdmin", selAdmin);
			//resp.setHeader("refresh", "3;URL=login.jsp");//这里的3,是你要确定的时间秒URL是要跳转的地址
			req.getRequestDispatcher("/wait.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("/hotel/login.jsp");
		}
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
