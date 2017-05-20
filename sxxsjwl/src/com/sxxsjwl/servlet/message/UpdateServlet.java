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

			// ��ȡ biz
			MessageBiz biz = ServseBiz.getMessageBiz();

			// ��ȡ����� id
			int id = (int) request.getAttribute("id");

			// ��ȡ�������������
			Message n = biz.findById(id);

			// ��ȡ����
			String title = (String) request.getAttribute("title");
			String content = (String) request.getAttribute("content");

			// �޸�ʱ��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(new Date());
			n.setM_date(date);

			// �ж������Ƿ�Ϊ�� ����װ����
			if (title != null) {
				n.setM_title(title);
			}
			if (content != null) {
				n.setM_context(content);
			}

			// ִ���޸Ĳ��ύ���ݿ�
			boolean a = biz.updata(n);
			if (a) {
				// �޸ĳɹ�
				System.out.println("�����޸ĳɹ�");
			} else {
				// �޸�ʧ��
				System.out.println("�����޸�ʧ��");
			}

		} catch (Exception e) {
			// �����쳣
			e.printStackTrace();
		}
	}

}
