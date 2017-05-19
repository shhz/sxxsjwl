package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.User;

public interface UserBiz {
	/**
	 * 登录验证
	 * 
	 * @param u
	 * @return
	 */
	public User login(User u);

	/**
	 * 验证权限
	 * 
	 * @param u
	 * @return
	 */
	public boolean isPower(User u);

	/**
	 * 修改 User
	 * 
	 * @param u
	 * @return
	 */
	public boolean updata(User u);

	/**
	 * 注册用户
	 * 
	 * @param u
	 * @return
	 */
	public boolean add(User u);

	/**
	 * 查找用户
	 * 
	 * @param id
	 * @return
	 */
	public User findById(int id);

	/**
	 * 删除用户
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);

	/**
	 * 显示所有用户
	 * 
	 * @param id
	 * @return
	 */
	public List<User> getUsers();
}
