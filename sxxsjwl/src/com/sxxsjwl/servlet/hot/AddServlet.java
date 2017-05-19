package com.sxxsjwl.servlet.hot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/servlet/hot/add.do")
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
			HotBiz biz = ServseBiz.getHotBiz();

			// ��ȡ����
			String title = (String) request.getAttribute("title");
			String url = (String) request.getAttribute("url");
			String photo = (String) request.getAttribute("photo");
			String start_date = (String) request.getAttribute("start");
			String over_date = (String) request.getAttribute("over");

			// ���ڸ�ʽ�������⴦��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d1 = sdf.parse(start_date);
			Date d2 = sdf.parse(over_date);

			// ��װ����
			HotAct h = new HotAct(title, url, photo, d1, d2);

			// �ύ���ݿⲢ�������
			boolean a = biz.add(h);
			if (a) {
				// ��ת�ɹ�ҳ��
				System.out.println("������ɹ�");
			} else {
				// ��תʧ��ҳ��
				System.out.println("�����ʧ��");
			}
		} catch (Exception e) {
			// �����쳣
			e.printStackTrace();
		}
	}

}
