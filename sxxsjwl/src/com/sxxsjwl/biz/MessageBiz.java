package com.sxxsjwl.biz;

import java.util.List;

import com.sxxsjwl.pojo.Message;

public interface MessageBiz {
	/**
	 * ���� Message
	 * 
	 * @param m
	 * @return
	 */
	public boolean add(Message m);

	/**
	 * ɾ�� Message
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * �޸� Message
	 * 
	 * @param m
	 * @return
	 */
	public boolean updata(Message m);

	/**
	 * ���� id ���� Message
	 * 
	 * @param id
	 * @return
	 */
	public Message findById(int id);

	/**
	 * �������� Message
	 * 
	 * @return
	 */
	public List<Message> findAll();
}
