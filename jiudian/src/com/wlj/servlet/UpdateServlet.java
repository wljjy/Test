package com.wlj.servlet;

import java.io.IOException;
import java.util.List;

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
@WebServlet(name = "update", urlPatterns = { "/update" })
public class UpdateServlet extends HttpServlet {
	private UserService userservice=new UserServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(req.getParameter("id"));
		String roomNumber = req.getParameter("roomNumber");
		String daxiao = req.getParameter("daxiao");
		String leixing = req.getParameter("leixing");
		double price = Double.parseDouble(req.getParameter("price"));
		String type = req.getParameter("type");
		String beizhu = req.getParameter("beizhu");
		
		List<GuestRoom> selRoomNumber = userservice.selRoomNumber(roomNumber);
		if(selRoomNumber.size()==0||(selRoomNumber.get(0).getId())==id&&selRoomNumber.size()==1){
			GuestRoom room = new GuestRoom();
			room.setId(id);
			room.setRoomNumber(roomNumber);
			room.setDaxiao(daxiao);
			room.setLeixing(leixing);
			room.setPrice(price);
			room.setType(type);
			room.setBeizhu(beizhu);
			int updateOne = userservice.updateOne(room);
			doPost(req, resp);
		}else {
			req.setAttribute("error1", "该房号已存在");
			req.getRequestDispatcher("/update.jsp").forward(req, resp);
		}
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/selroom").forward(req, resp);	
	}
}
