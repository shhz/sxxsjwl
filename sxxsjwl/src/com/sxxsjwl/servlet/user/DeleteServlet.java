package com.sxxsjwl.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/servlet/user/delete.do")
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
		UserBiz biz = ServseBiz.getUserBiz();

		// ��ȡ��ǰ�û��� id
		HttpSession session = request.getSession();
		int id = (int) session.getAttribute("id");

		// ��ȡ��ǰ�û�����������
		User u = biz.findById(id);

		// �ж�Ȩ��
		boolean a = biz.isPower(u);
		if (a) {
			// ִ��ɾ�����ύ���ݿ�
			id = (int) request.getAttribute("id");
			a = biz.deleteById(id);
			if (a) {
				//ɾ���ɹ�
				System.out.println("�û�ɾ���ɹ�");
			}else{
				//ɾ��ʧ��
				System.out.println("�û�ɾ��ʧ��");
			}
		} else {
			// Ȩ�޲���
			System.out.println("��ɾ��Ȩ��");
		}
	}

}
