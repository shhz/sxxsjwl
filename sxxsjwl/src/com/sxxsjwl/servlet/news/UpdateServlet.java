package com.sxxsjwl.servlet.news;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/news/update.do")
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

				// ��ȡ����
				String title = (String) request.getAttribute("title");
				String content = (String) request.getAttribute("content");
				String author = (String) request.getAttribute("author");
				String photo_1 = (String) request.getAttribute("photo_1");
				String photo_2 = (String) request.getAttribute("photo_2");
				String photo_3 = (String) request.getAttribute("photo_3");
				String date = (String) request.getAttribute("date");
				String url = (String) request.getAttribute("url");

				// �Ի�ȡ��ʱ����д���
				if (!date.matches(
						"^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))")) {
					date = null;
				}

				// �ж������Ƿ�Ϊ�� ����װ����
				if (title != null) {
					n.setN_title(title);
				}
				if (content != null) {
					n.setN_content(content);
				}
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
				if (url != null) {
					n.setN_url(url);
				}
				if (date != null) {
					n.setN_date(date);
				}

				// ִ���޸Ĳ��ύ���ݿ�
				a = biz.updata(n);
				if (a) {
					// �޸ĳɹ�
					System.out.println("�����޸ĳɹ�");
				} else {
					// �޸�ʧ��
					System.out.println("�����޸�ʧ��");
				}
			} else {
				// Ȩ�޲���
				System.out.println("���޸�Ȩ��");
			}

		} catch (Exception e) {
			// �����쳣
			e.printStackTrace();
		}
	}

}
