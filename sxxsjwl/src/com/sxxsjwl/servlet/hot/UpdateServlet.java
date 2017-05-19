package com.sxxsjwl.servlet.hot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/hot/update.do")
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

				// 获取数据
				String title = (String) request.getAttribute("title");
				String url = (String) request.getAttribute("url");
				String flag = (String) request.getAttribute("flag");
				String photo = (String) request.getAttribute("photo");
				String start_date = (String) request.getAttribute("start");
				String over_date = (String) request.getAttribute("over");

				// 日期格式数据特殊处理
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date d1 = sdf.parse(start_date);
				Date d2 = sdf.parse(over_date);

				// 判断数据是否为空 并封装数据
				if (title != null) {
					h.setH_title(title);
				}
				if (url != null) {
					h.setH_url(url);
				}
				if (flag != null) {
					h.setH_flg(Integer.parseInt(flag));
				}
				if (photo != null) {
					h.setH_photo(photo);
				}
				if (start_date != null) {
					h.setH_start_date(d1);
				}
				if (over_date != null) {
					h.setH_over_date(d2);
				}

				// 执行修改并提交数据库
				a = biz.updata(h);
				if (a) {
					// 修改成功
					System.out.println("活动修改成功");
				} else {
					// 修改失败
					System.out.println("活动修改失败");
				}
			} else {
				// 权限不足
				System.out.println("无修改权限");
			}

		} catch (Exception e) {
			// 其余异常
			e.printStackTrace();
		}
	}

}
