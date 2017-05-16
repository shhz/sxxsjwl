package com.sxxsjwl.util;

import java.sql.*;

public class DBHelper {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/hxllc_web";
	public static final String USERNAME = "hxllc_web";
	public static final String PASSWORD = "li@1234";

	// 获取数据库连接
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	// 关闭数据库连接
	public static void release(Connection connection, ResultSet rs, Statement statement) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// public static void main(String[] args) {
	// Connection conn = getConn();
	// System.out.println(conn);
	// }

}
