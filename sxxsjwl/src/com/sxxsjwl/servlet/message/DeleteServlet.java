package com.sxxsjwl.servlet.message;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.MessageBiz;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/servlet/message/delete.do")
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

		// ��ȡ biz
		MessageBiz biz = ServseBiz.getMessageBiz();

		// ��ȡ����� id
		int id = (int) request.getAttribute("id");

		// ִ��ɾ�����ύ���ݿ�
		boolean a = biz.delete(id);
		if (a) {
			// ɾ���ɹ�
			System.out.println("����ɾ���ɹ�");
		} else {
			// ɾ��ʧ��
			System.out.println("����ɾ��ʧ��");
		}
	}

}
