package com.sxxsjwl.servlet.message;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.MessageBiz;
import com.sxxsjwl.pojo.Message;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/servlet/message/add.do")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
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

			// ��ȡ����
			String title = (String) request.getAttribute("title");
			String content = (String) request.getAttribute("content");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(new Date());

			// ��װ����
			Message m = new Message(title, content, date);

			// �ύ���ݿⲢ�������
			boolean a = biz.add(m);
			if (a) {
				// ��ת�ɹ�ҳ��
				System.out.println("���������ɹ�");
			} else {
				// ��תʧ��ҳ��
				System.out.println("��������ʧ��");
			}
		} catch (Exception e) {
			// �����쳣
			e.printStackTrace();
		}
	}

}