package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.User;

public interface UserDao {
	/**
	 * 根据用户名获取 User 对象
	 * 
	 * @param username
	 * @return
	 */
	public abstract User getUser(String username);

	/**
	 * 向数据表中插入 User 对象
	 * 
	 * @param user
	 * @return
	 */
	public abstract boolean setUser(User user);

	/**
	 * 向数据表中对应 id 更新 User 对象
	 * 
	 * @param user
	 * @return
	 */
	public abstract boolean updateUser(User user);

	/**
	 * 数据表中对应 id 的 User 对象删除
	 * 
	 * @param id
	 * @return
	 */
	public abstract boolean deleteById(int id);

	/**
	 * 根据 id 获取 User 对象
	 * 
	 * @param id
	 * @return
	 */
	public abstract User getUserById(int id);

	/**
	 * 获取所有 User 对象
	 * 
	 * @param id
	 * @return
	 */
	public abstract List<User> getUsers();
}
