package com.sxxsjwl.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sxxsjwl.dao.BaseDao;
import com.sxxsjwl.dao.NewsDao;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.util.DBHelper;

public class NewsDaoImpl extends BaseDao implements NewsDao {
	private ResultSet rst = null;

	@Override
	public News getNews(String title) {
		String sql = "select n_id, n_title, n_content, n_author, n_photo_1, n_photo_2, n_photo_3 "
				+ "FROM news WHERE u_name = ?";
		rst = executeQuery(sql, new String[] { title });
		try {
			if (rst.next()) {
				News news = new News(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getString(6), rst.getString(7));
				return news;
			}
			DBHelper.release(null, rst, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("²éÑ¯Ê§°Ü");
		return null;
	}

	@Override
	public List<News> getAllNews() {
		List<News> newsList = new ArrayList<>();
		String sql = "select n_id, n_title, n_content, n_author, n_photo_1, n_photo_2, n_photo_3 FROM news";
		rst = executeQuery(sql, null);
		try {
			if (rst.next()) {
				News news = new News(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getString(6), rst.getString(7));
				newsList.add(news);
			}
			DBHelper.release(null, rst, null);
			return newsList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("²éÑ¯Ê§°Ü");
		return newsList;
	}

	@Override
	public boolean setNews(News news) {
		String sql = "INSERT INTO news (n_title, n_content, n_author, n_photo_1, n_photo_2, n_photo_3) VALUES (?, ?)";
		int row = executeUpdate(sql, new String[] { news.getN_title(), news.getN_content(), news.getN_author(),
				news.getN_photo_1(), news.getN_photo_2(), news.getN_photo_3() });
		if (row > 0) {
			return true;
		} else {
			System.out.println("ÐÂÔöÊ§°Ü");
			return false;
		}
	}

	@Override
	public boolean updateNews(News news) {
		if (news == null || news.getN_id() == 0) {
			System.out.println("²ÎÊýÎª¿Õ»ò id Îª¿Õ");
			return false;
		}
		String sql = "update news set n_title=?,n_content=?,n_author=?,n_photo_1=?,n_photo_2=?,n_photo_3=? where n_id=?";
		int row = executeUpdate(sql, new String[] { news.getN_title(), news.getN_content(), news.getN_author(),
				news.getN_photo_1(), news.getN_photo_2(), news.getN_photo_3(), news.getN_id() + "" });
		if (row > 0) {
			return true;
		} else {
			System.out.println("ÐÞ¸ÄÊ§°Ü");
			return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
		String sql = "delete from news where u_id=?";
		int row = executeUpdate(sql, new String[] { id + "" });
		if (row > 0) {
			return true;
		} else {
			System.out.println("É¾³ýÊ§°Ü");
			return false;
		}

	}

}
