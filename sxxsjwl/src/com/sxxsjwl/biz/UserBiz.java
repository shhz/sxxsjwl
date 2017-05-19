package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.User;

public interface UserBiz {
	/**
	 * ��¼��֤
	 * 
	 * @param u
	 * @return
	 */
	public User login(User u);

	/**
	 * ��֤Ȩ��
	 * 
	 * @param u
	 * @return
	 */
	public boolean isPower(User u);

	/**
	 * �޸� User
	 * 
	 * @param u
	 * @return
	 */
	public boolean updata(User u);

	/**
	 * ע���û�
	 * 
	 * @param u
	 * @return
	 */
	public boolean add(User u);

	/**
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public User findById(int id);

	/**
	 * ɾ���û�
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);

	/**
	 * ��ʾ�����û�
	 * 
	 * @param id
	 * @return
	 */
	public List<User> getUsers();
}
