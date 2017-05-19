package com.sxxsjwl.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sxxsjwl.dao.BaseDao;
import com.sxxsjwl.dao.HotDao;
import com.sxxsjwl.pojo.HotAct;
import com.sxxsjwl.util.DBHelper;

public class HotDaoImpl extends BaseDao implements HotDao {
	private ResultSet rst = null;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public HotAct getHot(String title) {
		String sql = "select h_id, h_title, h_url, h_flag, h_start_date, h_over_data "
				+ "FROM hotact WHERE h_title = ?";
		rst = executeQuery(sql, new String[] { title });
		try {
			if (rst.next()) {
				HotAct hot = new HotAct(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4),
						rst.getString(5), rst.getDate(6), rst.getDate(7));
				return hot;
			}
			DBHelper.release(null, rst, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

	@Override
	public List<HotAct> getAllHot() {
		List<HotAct> newsList = new ArrayList<>();
		String sql = "select h_id, h_title, h_url, h_flag, h_start_date, h_over_data FROM hotact";
		rst = executeQuery(sql, null);
		try {
			if (rst.next()) {
				HotAct hot = new HotAct(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4),
						rst.getString(5), rst.getDate(6), rst.getDate(7));
				newsList.add(hot);
			}
			DBHelper.release(null, rst, null);
			return newsList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return newsList;
	}

	@Override
	public boolean setHot(HotAct h) {
		String sql = "INSERT INTO hotact (h_title, h_url, h_photo ,h_start_date, h_over_data) VALUES (?, ?, ?)";
		int row = executeUpdate(sql,
				new Object[] { h.getH_title(), h.getH_url(), h.getH_photo(), h.getH_start_date(), h.getH_over_date() });
		if (row > 0) {
			return true;
		} else {
			System.out.println("–¬‘ˆ ß∞‹");
			return false;
		}
	}

	@Override
	public boolean updateHot(HotAct h) {
		if (h == null || h.getH_id() == 0) {
			System.out.println("≤Œ ˝Œ™ø’ªÚ id Œ™ø’");
			return false;
		}
		String sql = "update hotact set h_title=?,h_url=?,h_flag=?,h_photo=?,h_start_date=?,h_over_data=? where h_id=?";
		String start_date = sdf.format(h.getH_start_date());
		String over_date = sdf.format(h.getH_over_date());
		int row = executeUpdate(sql, new String[] { h.getH_id() + "", h.getH_title(), h.getH_url(),
				h.getH_flag() + "" + h.getH_photo(), start_date, over_date });
		if (row > 0) {
			return true;
		} else {
			System.out.println("–ﬁ∏ƒ ß∞‹");
			return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
		String sql = "delete from hotact where h_id=?";
		int row = executeUpdate(sql, new String[] { id + "" });
		if (row > 0) {
			return true;
		} else {
			System.out.println("…æ≥˝ ß∞‹");
			return false;
		}

	}

	@Override
	public HotAct findById(int id) {
		String sql = "select h_title,h_url,h_flag,h_photo,h_start_date,h_over_data from hotact where h_id=?";
		rst = executeQuery(sql, new String[] { id + "" });
		try {
			if (rst.next()) {
				HotAct hot = new HotAct(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4),
						rst.getString(5), rst.getDate(6), rst.getDate(7));
				return hot;
			}
			DBHelper.release(null, rst, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

	@Override
	public HotAct findByTitle(String title) {
		String sql = "select h_id,h_title,h_url,h_flag,h_photo,h_start_date,h_over_data from hotact where h_title=?";
		rst = executeQuery(sql, new String[] { title + "" });
		try {
			if (rst.next()) {
				HotAct hot = new HotAct(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4),
						rst.getString(5), rst.getDate(6), rst.getDate(7));
				return hot;
			}
			DBHelper.release(null, rst, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

}
