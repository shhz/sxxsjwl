package com.sxxsjwl.servlet.index;

import java.io.IOException;
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
 * Servlet implementation class FindMsgServlet
 */
@WebServlet("/servlet/findMsg.do")
public class FindMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindMsgServlet() {
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

		// 获取 biz
		MessageBiz biz = ServseBiz.getMessageBiz();

		// 获取数据
		String ids = (String) request.getParameter("id");
		if (ids == null) {
			// 数据错误
			response.sendRedirect("../showMessage.do");
		}
		int id = Integer.parseInt(ids);
		Message m = biz.findById(id);
		session.setAttribute("message", m);
		response.sendRedirect("../notice_cont.jsp");
	}

}
