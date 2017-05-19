package com.sxxsjwl.servlet.hot;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sxxsjwl.biz.HotBiz;
import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseBiz;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/servlet/hot/update.do")
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
				HotBiz biz = ServseBiz.getHotBiz();

				// ��ȡ����� id
				int id = (int) request.getAttribute("id");

				// ��ȡ�������������
				HotAct h = biz.findById(id);

				// ��ȡ����
				String title = (String) request.getAttribute("title");
				String url = (String) request.getAttribute("url");
				String flag = (String) request.getAttribute("flag");
				String photo = (String) request.getAttribute("photo");
				String start_date = (String) request.getAttribute("start");
				String over_date = (String) request.getAttribute("over");

				// ���ڸ�ʽ�������⴦��
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date d1 = sdf.parse(start_date);
				Date d2 = sdf.parse(over_date);

				// �ж������Ƿ�Ϊ�� ����װ����
				if (title != null) {
					h.setH_title(title);
				}
				if (url != null) {
					h.setH_url(url);
				}
				if (flag != null) {
					h.setH_flg(Integer.parseInt(flag));
				}
				if (photo != null) {
					h.setH_photo(photo);
				}
				if (start_date != null) {
					h.setH_start_date(d1);
				}
				if (over_date != null) {
					h.setH_over_date(d2);
				}

				// ִ���޸Ĳ��ύ���ݿ�
				a = biz.updata(h);
				if (a) {
					// �޸ĳɹ�
					System.out.println("��޸ĳɹ�");
				} else {
					// �޸�ʧ��
					System.out.println("��޸�ʧ��");
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
