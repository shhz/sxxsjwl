package com.sxxsjwl.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sxxsjwl.dao.BaseDao;
import com.sxxsjwl.dao.MessageDao;
import com.sxxsjwl.pojo.Message;
import com.sxxsjwl.util.DBHelper;

public class MessageDaoImpl extends BaseDao implements MessageDao {
	private ResultSet rst = null;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Message getMessage(String title) {
		String sql = "select m_id, m_title, m_context, m_date " + "FROM message WHERE m_title = ?";
		rst = executeQuery(sql, new String[] { title });
		try {
			if (rst.next()) {
				Message m = new Message(rst.getInt(1), rst.getString(2), rst.getString(3), sdf.format(rst.getDate(4)));
				return m;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

	@Override
	public List<Message> getAllMessage() {
		String sql = "select m_id, m_title, m_context, m_date FROM message";
		rst = executeQuery(sql, null);
		List<Message> list = new ArrayList<>();
		try {
			while (rst.next()) {
				Message m = new Message(rst.getInt(1), rst.getString(2), rst.getString(3), sdf.format(rst.getDate(4)));
				list.add(m);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

	@Override
	public boolean setMessage(Message m) {
		String sql = "INSERT INTO message (m_title, m_context, m_date) VALUES (?, ?, ?)";
		int row = 0;
		try {
			row = executeUpdate(sql, new String[] { m.getM_title(), m.getM_context(), sdf.format(m.getM_date()) });
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (row > 0) {
			return true;
		} else {
			System.out.println("–¬‘ˆ ß∞‹");
			return false;
		}
	}

	@Override
	public boolean updateMessage(Message m) {
		if (m == null || m.getM_id() == 0) {
			System.out.println("≤Œ ˝Œ™ø’ªÚ id Œ™ø’");
			return false;
		}
		String sql = "update message set m_title=?,m_context=?,m_date=? where m_id=?";
		Date date = null;
		try {
			date = sdf.parse(m.getM_date());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int row = 0;
		try {
			row = executeUpdate(sql, new Object[] { m.getM_title(), m.getM_context(), date, m.getM_id() + "" });
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (row > 0) {
			return true;
		} else {
			System.out.println("–ﬁ∏ƒ ß∞‹");
			return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
		String sql = "delete from message where m_id=?";
		int row = 0;
		try {
			row = executeUpdate(sql, new String[] { id + "" });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (row > 0) {
			return true;
		} else {
			System.out.println("…æ≥˝ ß∞‹");
			return false;
		}
	}

	@Override
	public Message findById(int id) {
		String sql = "select m_id, m_title,m_context,m_date from message where m_id=?";
		rst = executeQuery(sql, new String[] { id + "" });
		try {
			if (rst.next()) {
				Message m = new Message(rst.getInt(1), rst.getString(2), rst.getString(3), sdf.format(rst.getDate(4)));
				return m;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

}
