package com.sxxsjwl.servlet.user;

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
 * Servlet implementation class AddServlet
 */
@WebServlet("/servlet/user/add.do")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			// 获取 biz
			UserBiz biz = ServseBiz.getUserBiz();

			// 获取数据
			String name = (String) request.getAttribute("name");
			String pwd = (String) request.getAttribute("pwd");

			// 封装对象
			User u = new User(name, pwd);

			// 提交数据库并返还结果
			boolean a = biz.add(u);
			if (a) {
				// 跳转成功页面
				System.out.println("用户成功");
			} else {
				// 跳转失败页面
				System.out.println("用户失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
