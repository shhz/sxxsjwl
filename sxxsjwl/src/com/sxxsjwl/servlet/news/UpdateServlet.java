package com.sxxsjwl.servlet.news;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/news/update.do")
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
				NewsBiz biz = ServseBiz.getNewsBiz();

				// 获取公告的 id
				int id = (int) request.getAttribute("id");

				// 获取公告的完整数据
				News n = biz.findById(id);

				// 获取数据
				String title = (String) request.getAttribute("title");
				String content = (String) request.getAttribute("content");
				String author = (String) request.getAttribute("author");
				String photo_1 = (String) request.getAttribute("photo_1");
				String photo_2 = (String) request.getAttribute("photo_2");
				String photo_3 = (String) request.getAttribute("photo_3");
				String date = (String) request.getAttribute("date");
				String url = (String) request.getAttribute("url");

				// 对获取的时间进行处理
				if (!date.matches(
						"^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))")) {
					date = null;
				}

				// 判断数据是否为空 并封装数据
				if (title != null) {
					n.setN_title(title);
				}
				if (content != null) {
					n.setN_content(content);
				}
				if (author != null) {
					n.setN_author(author);
				}
				if (photo_1 != null) {
					n.setN_photo_1(photo_1);
				}
				if (photo_2 != null) {
					n.setN_photo_2(photo_2);
				}
				if (photo_3 != null) {
					n.setN_photo_3(photo_3);
				}
				if (url != null) {
					n.setN_url(url);
				}
				if (date != null) {
					n.setN_date(date);
				}

				// 执行修改并提交数据库
				a = biz.updata(n);
				if (a) {
					// 修改成功
					System.out.println("新闻修改成功");
				} else {
					// 修改失败
					System.out.println("新闻修改失败");
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
