package com.sxxsjwl.servse;

import com.sxxsjwl.dao.HotDao;
import com.sxxsjwl.dao.NewsDao;
import com.sxxsjwl.dao.UserDao;
import com.sxxsjwl.dao.imp.HotDaoImpl;
import com.sxxsjwl.dao.imp.NewsDaoImpl;
import com.sxxsjwl.dao.imp.UserDaoImpl;

/**
 * Dao π§≥ß¿‡
 */
public class ServseDao {
	public static NewsDao getNewsDao() {
		return new NewsDaoImpl();
	}

	public static UserDao getUserDao() {
		return new UserDaoImpl();
	}

	public static HotDao getHotDao() {
		return new HotDaoImpl();
	}
}
