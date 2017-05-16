package com.sxxsjwl.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sxxsjwl.dao.BaseDao;
import com.sxxsjwl.dao.UserDao;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.util.DBHelper;

public class UserDaoImpl extends BaseDao implements UserDao {
	private ResultSet rst = null;

	@Override
	public User getUser(String username) {
		String sql = "SELECT u_id, u_name, u_pwd, u_power " + "FROM user WHERE u_name = ?";
		rst = executeQuery(sql, new String[] { username });
		try {
			if (rst.next()) {
				User user = new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4));
				return user;
			}
			DBHelper.release(null, rst, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("²éÑ¯Ê§°Ü");
		DBHelper.release(null, rst, null);
		return null;
	}

	@Override
	public boolean setUser(User user) {
		String sql = "INSERT INTO user (u_name, u_pwd) VALUES (?, ?)";
		int row = executeUpdate(sql, new String[] { user.getU_name(), user.getU_pwd() });
		if (row > 0) {
			return true;
		} else {
			System.out.println("ÐÂÔöÊ§°Ü");
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		if (user == null || user.getU_id() == 0) {
			System.out.println("²ÎÊýÎª¿Õ»ò id Îª¿Õ");
			return false;
		}

		String sql = "update user set u_name=?,u_pwd=?,u_power=? where u_id=?";
		int row = executeUpdate(sql,
				new String[] { user.getU_name(), user.getU_pwd(), user.getU_power() + "", user.getU_id() + "" });
		if (row > 0) {
			return true;
		} else {
			System.out.println("ÐÞ¸ÄÊ§°Ü");
			return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
		String sql = "delete from user where u_id=?";
		int row = executeUpdate(sql, new String[] { id + "" });

		if (row > 0) {
			return true;
		} else {
			System.out.println("É¾³ýÊ§°Ü");
			return false;
		}

	}

	@Override
	public User getUserById(int id) {
		String sql = "SELECT u_id, u_name, u_pwd, u_power " + "FROM user WHERE u_id = ?";
		rst = executeQuery(sql, new String[] { id + "" });
		try {
			if (rst.next()) {
				User user = new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getInt(4));
				DBHelper.release(null, rst, null);
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("²éÑ¯Ê§°Ü");
		DBHelper.release(null, rst, null);
		return null;
	}

}
