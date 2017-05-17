package com.sxxsjwl.servse;

import com.sxxsjwl.dao.NewsDao;
import com.sxxsjwl.dao.UserDao;
import com.sxxsjwl.dao.imp.NewsDaoImpl;
import com.sxxsjwl.dao.imp.UserDaoImpl;

/**
 * Dao ������
 */
public class ServseDao {
	public static NewsDao getNewsDao() {
		return new NewsDaoImpl();
	}

	public static UserDao getUserDao() {
		return new UserDaoImpl();
	}
}