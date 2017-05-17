package com.sxxsjwl.servlet.news;

import java.io.IOException;
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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/servlet/news/delete.do")
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

		// ��ȡ session
		HttpSession session = request.getSession();

		// ��ȡ��¼�û�
		User u = (User) session.getAttribute("user");
		UserBiz biz1 = ServseBiz.getUserBiz();

		// �ж�Ȩ��
		boolean a = biz1.isPower(u);
		if (a) {

			// ��ȡ biz
			NewsBiz biz = ServseBiz.getNewsBiz();

			// ��ȡ����� id
			int id = (int) request.getAttribute("id");

			// ��ȡ�������������
			News n = biz.findById(id);

			// ִ��ɾ�����ύ���ݿ�
			a = biz.delete(n);
			if (a) {
				// ɾ���ɹ�
				System.out.println("����ɾ���ɹ�");
			} else {
				// ɾ��ʧ��
				System.out.println("����ɾ��ʧ��");
			}
		} else {
			// Ȩ�޲���
			System.out.println("��ɾ��Ȩ��");
		}
	}

}
