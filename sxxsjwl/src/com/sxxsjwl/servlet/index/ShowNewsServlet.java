package com.sxxsjwl.servlet.index;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.MessageBiz;
import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.pojo.Message;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/servlet/showNews.do")
public class ShowNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowNewsServlet() {
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

		// 获取新闻列表
		NewsBiz nbiz = ServseBiz.getNewsBiz();
		List<News> news_list = nbiz.findAll();
		if (!news_list.isEmpty()) {
			session.setAttribute("news_list", news_list);
		} else {
			session.setAttribute("news_list", new ArrayList<>());
		}

		// 获取公告列表
		MessageBiz mbiz = ServseBiz.getMessageBiz();
		List<Message> message_list = mbiz.findAll();
		if (!message_list.isEmpty()) {
			session.setAttribute("message_list", message_list);
		} else {
			session.setAttribute("message_list", new ArrayList<>());
		}

		// 跳转
		response.sendRedirect("../notice.jsp");
	}

}
