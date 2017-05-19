package com.sxxsjwl.servlet.hot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/servlet/hot/add.do")
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
			HotBiz biz = ServseBiz.getHotBiz();

			// 获取数据
			String title = (String) request.getAttribute("title");
			String url = (String) request.getAttribute("url");
			String photo = (String) request.getAttribute("photo");
			String start_date = (String) request.getAttribute("start");
			String over_date = (String) request.getAttribute("over");

			// 日期格式数据特殊处理
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(over_date);

			// 封装对象
			HotAct h = new HotAct(title, url, photo, d1, d2);

			// 提交数据库并返还结果
			boolean a = biz.add(h);
			if (a) {
				// 跳转成功页面
				System.out.println("活动新增成功");
			} else {
				// 跳转失败页面
				System.out.println("活动新增失败");
			}
		} catch (Exception e) {
			// 其余异常
			e.printStackTrace();
		}
	}

}
