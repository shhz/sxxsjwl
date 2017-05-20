package com.sxxsjwl.servlet.message;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.MessageBiz;
import com.sxxsjwl.pojo.Message;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/message/update.do")
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
			MessageBiz biz = ServseBiz.getMessageBiz();

			// 获取公告的 id
			int id = (int) request.getAttribute("id");

			// 获取公告的完整数据
			Message n = biz.findById(id);

			// 获取数据
			String title = (String) request.getAttribute("title");
			String content = (String) request.getAttribute("content");

			// 修改时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(new Date());
			n.setM_date(date);

			// 判断数据是否为空 并封装数据
			if (title != null) {
				n.setM_title(title);
			}
			if (content != null) {
				n.setM_context(content);
			}

			// 执行修改并提交数据库
			boolean a = biz.updata(n);
			if (a) {
				// 修改成功
				System.out.println("公告修改成功");
			} else {
				// 修改失败
				System.out.println("公告修改失败");
			}

		} catch (Exception e) {
			// 其余异常
			e.printStackTrace();
		}
	}

}
