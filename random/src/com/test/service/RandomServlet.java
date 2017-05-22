package com.test.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.util.MathRandom;

/**
 * Servlet implementation class randomServlet
 */
@WebServlet("/randomServlet")
public class RandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RandomServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MathRandom random = new MathRandom();
		HttpSession session = request.getSession();
		int a = random.RandomEight();
		PrintWriter out = response.getWriter();

		List<String> list = (List<String>) session.getAttribute("randomList");
		if (list == null || list.size() == 0) {
			list = new ArrayList<>();
			list.add(a + "");
			System.out.println("new list");
		} else {
			list.add(a + "");
			System.out.println("list add " + a);
		}
		session.setAttribute("randomList", list);
		out.write(a + "");

	}

}
