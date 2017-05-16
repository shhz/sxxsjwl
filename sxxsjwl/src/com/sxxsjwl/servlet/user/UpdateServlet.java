package com.sxxsjwl.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/user/update.do")
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

			// ��ȡ biz
			UserBiz biz = ServseBiz.getUserBiz();

			// ��ȡ id ������ user
			int id = (int) request.getAttribute("id");
			User u = biz.findById(id);

			// ��ȡ name ���޸�
			String name = (String) request.getAttribute("name");
			u.setU_name(name);

			// ��ȡ pwd ���޸�
			String pwd = (String) request.getAttribute("pwd");
			u.setU_pwd(pwd);

			// �ж��Ƿ����޸�Ȩ��
			if (request.getAttribute("power") != null) {
				// �޸�Ȩ��
				u.setU_power((int) request.getAttribute("power"));
			}

			// �ύ���ݿ��޸Ĳ����ؽ��
			boolean a = biz.updata(u);
			if (a) {
				// ��ת�ɹ�ҳ��
				System.out.println("�޸ĳɹ�");
			} else {
				// ��תʧ��ҳ��
				System.out.println("�޸�ʧ��");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
