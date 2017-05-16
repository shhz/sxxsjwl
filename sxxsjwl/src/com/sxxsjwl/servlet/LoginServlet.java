package com.sxxsjwl.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/servlet/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		System.out.println("name:" + name + " pwd:" + pwd);

		UserBiz biz = ServseBiz.getUserBiz();
		User u = new User(name, pwd);
		u = biz.login(u);
		System.out.println(u);
		if (u != null && u.getU_id() != 0) {
			response.sendRedirect("../index.jsp");
		} else {
			response.sendRedirect("../login.jsp");
		}
	}

}
