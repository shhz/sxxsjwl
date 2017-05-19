package com.sxxsjwl.servlet.news;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/servlet/news/show.do")
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowServlet() {
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
		NewsBiz biz = ServseBiz.getNewsBiz();
		List<News> list = biz.findAll();
		HttpSession session = request.getSession();
		if (!list.isEmpty()) {
			session.setAttribute("news_list", list);
		} else {
			session.setAttribute("news_list", new ArrayList<>());
		}
		response.sendRedirect("../../news/list.jsp");
	}

}
