package com.sxxsjwl.dao;

import java.util.List;

import com.sxxsjwl.pojo.User;

public interface UserDao {
	/**
	 * �����û�����ȡ User ����
	 * 
	 * @param username
	 * @return
	 */
	public abstract User getUser(String username);

	/**
	 * �����ݱ��в��� User ����
	 * 
	 * @param user
	 * @return
	 */
	public abstract boolean setUser(User user);

	/**
	 * �����ݱ��ж�Ӧ id ���� User ����
	 * 
	 * @param user
	 * @return
	 */
	public abstract boolean updateUser(User user);

	/**
	 * ���ݱ��ж�Ӧ id �� User ����ɾ��
	 * 
	 * @param id
	 * @return
	 */
	public abstract boolean deleteById(int id);

	/**
	 * ���� id ��ȡ User ����
	 * 
	 * @param id
	 * @return
	 */
	public abstract User getUserById(int id);

	/**
	 * ��ȡ���� User ����
	 * 
	 * @param id
	 * @return
	 */
	public abstract List<User> getUsers();
}
