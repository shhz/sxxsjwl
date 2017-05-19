package com.sxxsjwl.biz.imp;

import java.util.List;

import com.sxxsjwl.biz.NewsBiz;
import com.sxxsjwl.dao.NewsDao;
import com.sxxsjwl.pojo.News;
import com.sxxsjwl.servse.ServseDao;

public class NewsBizImpl implements NewsBiz {
	NewsDao dao = ServseDao.getNewsDao();

	@Override
	public boolean add(News n) {
		if (n.getN_author() != null || n.getN_photo_1() != null || n.getN_photo_2() != null
				|| n.getN_photo_3() != null) {
			dao.setNews(n);
			n = dao.findByTitle(n.getN_title());
			return dao.updateNews(n);
		}
		return dao.setNews(n);
	}

	@Override
	public boolean delete(News n) {
		if (n != null && n.getN_id() != 0) {
			return dao.deleteById(n.getN_id());
		} else {
			return false;
		}
	}

	@Override
	public boolean updata(News n) {
		if (n != null) {
			return dao.updateNews(n);
		}
		return false;
	}

	@Override
	public News findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<News> findAll() {
		return dao.getAllNews();
	}

}
