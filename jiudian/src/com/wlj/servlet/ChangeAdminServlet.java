package com.wlj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.prism.impl.Disposer.Target;
import com.wlj.pojo.User;
import com.wlj.service.UserService;
import com.wlj.service.impl.UserServiceImpl;

/**
 * Servlet implementation class ChangeAdminServlet
 */
@WebServlet(name = "change", urlPatterns = { "/change" })
public class ChangeAdminServlet extends HttpServlet {
	private UserService userservice = new UserServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String pwdOld = req.getParameter("pwdOld");
		String pwdNew = req.getParameter("pwdNew");
		String pwdNewq = req.getParameter("pwdNewq");
		HttpSession session= req.getSession();
		User selAdmin = (User) session.getAttribute("selAdmin");
		System.out.println(selAdmin);
		String password = selAdmin.getPassword();
		int id = selAdmin.getId();
		User user = new User();
		if (password.equals(pwdOld)) {
			if (pwdNew.equals(pwdNewq)) {
				user.setId(id);
				user.setPassword(pwdNew);
				int updatePwd = userservice.updatePwd(user);
				if (updatePwd > 0) {
					session.removeAttribute("selAdmin");
					req.setAttribute("login","ÇëÖØÐÂµÇÂ¼");
					resp.sendRedirect("/hotel/login.jsp");
				} else {
					resp.sendRedirect("/hotel/changeAdmin/change.jsp");
				}
			}else {
				resp.sendRedirect("/hotel/changeAdmin/change.jsp");
			}
		} else {
			resp.sendRedirect("/hotel/changeAdmin/change.jsp");
		}
	}
}
