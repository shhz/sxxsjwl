package com.sxxsjwl.servlet.news;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/servlet/news/add.do")
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
			NewsBiz biz = ServseBiz.getNewsBiz();

			// ��ȡ����
			String title = (String) request.getAttribute("title");
			String content = (String) request.getAttribute("content");
			String author = (String) request.getAttribute("author");
			String photo_1 = (String) request.getAttribute("photo_1");
			String photo_2 = (String) request.getAttribute("photo_2");
			String photo_3 = (String) request.getAttribute("photo_3");

			// ��װ����
			News n = new News(title, content);

			// �ж��Ƿ������ߺ�ͼƬ��Ϣ �������洢�����
			if (author != null) {
				n.setN_author(author);
			}
			if (photo_1 != null) {
				n.setN_photo_1(photo_1);
			}
			if (photo_2 != null) {
				n.setN_photo_2(photo_2);
			}
			if (photo_3 != null) {
				n.setN_photo_3(photo_3);
			}

			// �ύ���ݿⲢ�������
			boolean a = biz.add(n);
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
