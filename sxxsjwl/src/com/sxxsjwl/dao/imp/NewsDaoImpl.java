package com.sxxsjwl.dao.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sxxsjwl.dao.BaseDao;
import com.sxxsjwl.dao.NewsDao;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.util.DBHelper;

public class NewsDaoImpl extends BaseDao implements NewsDao {
	private ResultSet rst = null;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public News getNews(String title) {
		String sql = "select n_id, n_title, n_content, n_author, n_photo_1, n_photo_2, n_photo_3, n_date, n_url "
				+ "FROM news WHERE n_title = ?";
		rst = executeQuery(sql, new String[] { title });
		try {
			if (rst.next()) {
				News news = new News(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getString(6), rst.getString(7), sdf.format(rst.getDate(8)),
						rst.getString(9));
				return news;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBHelper.release(null, rst, null);
		System.out.println("≤È—Ø ß∞‹");
		return null;
	}

	@Override
	public List<News> getAllNews() {
		List<News> newsList = new ArrayList<>();
		String sql = "select n_id, n_title, n_content, n_author, n_photo_1, n_photo_2, n_photo_3, n_date, n_url FROM news";
		rst = executeQuery(sql, null);
		try {
			while (rst.next()) {
				News news = new News(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getString(6), rst.getString(7), sdf.format(rst.getDate(8)),
						rst.getString(9));
				newsList.add(news);
			}
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
	public boolean setNews(News news) {
		String sql = "INSERT INTO news (n_title, n_content,n_date) VALUES (?, ?, ?)";
		int row = executeUpdate(sql, new Object[] { news.getN_title(), news.getN_content(), news.getN_date_date() });
		if (row > 0) {
			return true;
		} else {
			System.out.println("–¬‘ˆ ß∞‹");
			return false;
		}
	}

	@Override
	public boolean updateNews(News news) {
		if (news == null || news.getN_id() == 0) {
			System.out.println("≤Œ ˝Œ™ø’ªÚ id Œ™ø’");
			return false;
		}
		String sql = "update news set n_title=?,n_content=?,n_author=?,n_photo_1=?,n_photo_2=?,n_photo_3=?,n_date=?,n_url=? where n_id=?";
		int row = executeUpdate(sql,
				new Object[] { news.getN_title(), news.getN_content(), news.getN_author(), news.getN_photo_1(),
						news.getN_photo_2(), news.getN_photo_3(), news.getN_date_date(), news.getN_url(),
						news.getN_id() + "" });
		if (row > 0) {
			return true;
		} else {
			System.out.println("–ﬁ∏ƒ ß∞‹");
			return false;
		}
	}

	@Override
	public boolean deleteById(int id) {
		String sql = "delete from news where n_id=?";
		int row = executeUpdate(sql, new String[] { id + "" });
		if (row > 0) {
			return true;
		} else {
			System.out.println("…æ≥˝ ß∞‹");
			return false;
		}

	}

	@Override
	public News findById(int id) {
		String sql = "select n_id, n_title, n_content, n_author, n_photo_1, n_photo_2, n_photo_3, n_date, n_url from news where n_id=?";
		rst = executeQuery(sql, new String[] { id + "" });
		try {
			if (rst.next()) {
				News news = new News(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getString(6), rst.getString(7), sdf.format(rst.getDate(8)),
						rst.getString(9));
				return news;
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
