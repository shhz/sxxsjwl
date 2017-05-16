package com.sxxsjwl.biz;

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
	 * �����û�
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id);

}
