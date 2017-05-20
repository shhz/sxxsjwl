package com.sxxsjwl.servlet.hot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/servlet/hot/show.do")
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
		HotBiz biz = ServseBiz.getHotBiz();
		List<HotAct> list = biz.findAll();
		HttpSession session = request.getSession();
		if (!list.isEmpty()) {
			session.setAttribute("hotact_list", list);
		} else {
			session.setAttribute("hotact_list", new ArrayList<>());
		}
		response.sendRedirect("../../hot/list.jsp");
	}

}
