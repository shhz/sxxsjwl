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
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/user/update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
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

			// 获取 id 并查找 user
			int id = (int) request.getAttribute("id");
			User u = biz.findById(id);

			// 获取 name 并修改
			String name = (String) request.getAttribute("name");
			u.setU_name(name);

			// 获取 pwd 并修改
			String pwd = (String) request.getAttribute("pwd");
			u.setU_pwd(pwd);

			// 判断是否有修改权限
			if (request.getAttribute("power") != null) {
				// 修改权限
				u.setU_power((int) request.getAttribute("power"));
			}

			// 提交数据库修改并返回结果
			boolean a = biz.updata(u);
			if (a) {
				// 跳转成功页面
				System.out.println("修改成功");
			} else {
				// 跳转失败页面
				System.out.println("修改失败");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
