package com.sxxsjwl.servlet.hot;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/servlet/hot/delete.do")
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

		// 获取 session
		HttpSession session = request.getSession();

		// 获取登录用户
		User u = (User) session.getAttribute("user");
		UserBiz biz1 = ServseBiz.getUserBiz();

		// 判定权限
		boolean a = biz1.isPower(u);
		if (a) {

			// 获取 biz
			HotBiz biz = ServseBiz.getHotBiz();

			// 获取公告的 id
			int id = (int) request.getAttribute("id");

			// 获取公告的完整数据
			HotAct h = biz.findById(id);

			// 执行删除并提交数据库
			a = biz.delete(h);
			if (a) {
				// 删除成功
				System.out.println("活动删除成功");
			} else {
				// 删除失败
				System.out.println("活动删除失败");
			}
		} else {
			// 权限不足
			System.out.println("无删除权限");
		}
	}

}
