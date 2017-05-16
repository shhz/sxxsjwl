package com.sxxsjwl.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/servlet/user/delete.do")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteServlet() {
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

		// 获取 biz
		UserBiz biz = ServseBiz.getUserBiz();

		// 获取当前用户的 id
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");

		// 获取当前用户的完整数据
		User u = biz.findById(id);

		// 判定权限
		boolean a = biz.isPower(u);
		if (a) {
			// 执行删除并提交数据库
			id = (int) request.getAttribute("id");
			a = biz.deleteById(id);
			if (a) {
				//删除成功
				System.out.println("用户删除成功");
			}else{
				//删除失败
				System.out.println("用户删除失败");
			}
		} else {
			// 权限不足
			System.out.println("无删除权限");
		}
	}

}
