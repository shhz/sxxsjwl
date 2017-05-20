package com.sxxsjwl.dao;

import java.sql.*;

import com.sxxsjwl.util.DBHelper;

public abstract class BaseDao {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rst;

	/**
	 * 通用增删改
	 */
	public int executeUpdate(String sql, Object[] obs) {
		conn = DBHelper.getConn();
		try {
			ps = conn.prepareStatement(sql);
			if (obs != null && obs.length > 0) {
				for (int i = 0; i < obs.length; i++) {
					ps.setObject(i + 1, obs[i]);
				}
			}

			int row = ps.executeUpdate();

			if (row > 0) {
				conn.commit();
				return row;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	/**
	 * 通用查询
	 */
	public ResultSet executeQuery(String sql, Object[] obs) {
		conn = DBHelper.getConn();
		try {
			ps = conn.prepareStatement(sql);
			if (obs != null && obs.length > 0) {
				for (int i = 0; i < obs.length; i++) {
					ps.setObject(i + 1, obs[i]);
				}
			}

			rst = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rst;
	}

}
