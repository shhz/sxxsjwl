package com.sxxsjwl.biz.imp;

import java.util.List;

import com.sxxsjwl.biz.UserBiz;
import com.sxxsjwl.dao.UserDao;
import com.sxxsjwl.pojo.User;
import com.sxxsjwl.servse.ServseDao;

public class UserBizImpl implements UserBiz {
	UserDao dao = ServseDao.getUserDao();

	@Override
	public User login(User u) {
		User user = dao.getUser(u.getU_name());
		if (user == null) {
			return null;
		}
		if (u.getU_pwd().equals(user.getU_pwd())) {
			return user;
		} else {
			return null;
		}
	}

	@Override
	public boolean isPower(User u) {
		if (u.getU_id() < 1) {
			u = dao.getUser(u.getU_name());
		}
		if (u.getU_power() == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updata(User u) {
		if (u.getU_id() == 0) {
			u = dao.getUser(u.getU_name());
		}
		return dao.updateUser(u);
	}

	@Override
	public boolean add(User u) {
		return dao.setUser(u);
	}

	@Override
	public User findById(int id) {
		return dao.getUserById(id);
	}

	@Override
	public boolean deleteById(int id) {
		return dao.deleteById(id);
	}

	@Override
	public List<User> getUsers() {
		return dao.getUsers();
	}

}
